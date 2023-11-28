package io.quarkiverse.kubevirt;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import io.fabric8.kubernetes.api.model.HasMetadata;
import io.quarkiverse.kubevirt.common.OutputOptionMixin;
import io.quarkiverse.kubevirt.common.Table;
import io.quarkiverse.kubevirt.utils.Clients;
import io.quarkiverse.kubevirt.utils.Tables;
import io.quarkiverse.kubevirt.v1.VirtualMachine;
import picocli.CommandLine;
import picocli.CommandLine.Mixin;
import picocli.CommandLine.Model.CommandSpec;
import picocli.CommandLine.Spec;

public abstract class AbstractVmCreate implements Callable<Integer> {

    public static final List<VirtualMachine> VMS = new ArrayList<>();
    public static final Table<VirtualMachine> TABLE = Tables.forVirtualMachines(VMS);

    @Mixin
    protected OutputOptionMixin output;

    @Spec
    protected CommandSpec spec;

    @CommandLine.Option(names = { "-w", "--wait-until-ready" }, description = "Wait until ready.")
    protected boolean waitUntilReady;

    @CommandLine.Option(names = { "-r", "--replace-existing" }, description = "Replace existing matching VMs.")
    protected boolean replaceExisting;

    @CommandLine.Option(names = { "-h", "--help" }, usageHelp = true, description = "Display this help message.")
    protected boolean help;

    public abstract InputStream getInputStream();

    public void onCreated(List<VirtualMachine> virtualMachines) {
    }

    public void onReady(List<VirtualMachine> virtualMachines) {
    }

    @Override
    public Integer call() {
        if (replaceExisting) {
            deleteExistingVirtualMachines();
        }

        try (InputStream is = getInputStream()) {
            List<VirtualMachine> existingVms = existingVirtualMachines();
            if (existingVms.size() > 0) {
                output.info("Failed to create VMs. The following VMs already exist.");
                VMS.addAll(existingVms);
                TABLE.print();
                output.info("Please cosnider using --replace-existing");
                return CommandLine.ExitCode.SOFTWARE;
            }

            List<HasMetadata> createdResources = Clients.kubernetes().load(is).create();
            final List<VirtualMachine> createdVms = createdResources.stream().filter(i -> i instanceof VirtualMachine)
                    .map(VirtualMachine.class::cast).collect(Collectors.toList());
            onCreated(createdVms);
            VMS.addAll(createdVms);

            output.info("Created VMs:");
            TABLE.print();
            if (waitUntilReady) {
                Clients.kubernetes().resourceList(createdVms).waitUntilCondition(
                        vm -> vm instanceof VirtualMachine &&
                                ((VirtualMachine) vm).getStatus() != null &&
                                ((VirtualMachine) vm).getStatus().getReady() != null &&
                                ((VirtualMachine) vm).getStatus().getReady(),
                        5L, TimeUnit.MINUTES);
                List<VirtualMachine> readyVms = Clients.kubernetes().resourceList(createdVms).get().stream()
                        .filter(i -> i instanceof VirtualMachine).map(VirtualMachine.class::cast).collect(Collectors.toList());
                VMS.clear();
                VMS.addAll(readyVms);
                TABLE.refresh();
                onReady(readyVms);
            }
            return CommandLine.ExitCode.OK;
        } catch (Exception e) {
            e.printStackTrace();
            return CommandLine.ExitCode.SOFTWARE;
        }
    }

    public List<VirtualMachine> existingVirtualMachines() {
        try (InputStream is = getInputStream()) {
            return Clients.kubernetes().load(is).get().stream().filter(i -> i instanceof VirtualMachine)
                    .map(VirtualMachine.class::cast).collect(Collectors.toList());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteExistingVirtualMachines() {
        try (InputStream is = getInputStream()) {
            List<HasMetadata> existingResources = Clients.kubernetes().load(is).get();
            final List<VirtualMachine> existingVms = existingResources.stream().filter(i -> i instanceof VirtualMachine)
                    .map(VirtualMachine.class::cast).collect(Collectors.toList());
            for (VirtualMachine vm : existingVms) {
                Clients.kubernetes().resource(vm).delete();
            }
            for (VirtualMachine terminating : existingVms) {
                Clients.kubernetes().resource(terminating).waitUntilCondition(vm -> vm == null, 1L, TimeUnit.MINUTES);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
