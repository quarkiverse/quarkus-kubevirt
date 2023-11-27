package io.quarkiverse.kubevirt;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;

import io.fabric8.kubernetes.api.model.HasMetadata;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientBuilder;
import io.quarkiverse.kubevirt.common.OutputOptionMixin;
import io.quarkiverse.kubevirt.common.Table;
import io.quarkiverse.kubevirt.v1.VirtualMachine;
import picocli.CommandLine;
import picocli.CommandLine.Mixin;
import picocli.CommandLine.Model.CommandSpec;
import picocli.CommandLine.Spec;

public abstract class AbstractVmCreate implements Callable<Integer> {

    public static final List<VirtualMachine> VMS = new ArrayList<>();
    public static final List<Function<VirtualMachine, String>> MAPPERS = List.of(
            t -> t.getMetadata().getName(),
            t -> t.getMetadata().getNamespace(),
            t -> t.getStatus() != null && t.getStatus().getReady() != null && t.getStatus().getReady() ? " * " : "  ");

    public static final Table<VirtualMachine> TABLE = new Table<>(List.of("Name", "Namespace", "Ready"), MAPPERS, VMS);

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

    @Override
    public Integer call() {
        if (replaceExisting) {
            deleteExistingVirtualMachines();
        }

        try (InputStream is = getInputStream()) {
            KubernetesClient kubernetesClient = new KubernetesClientBuilder().build();

            List<VirtualMachine> existingVms = existingVirtualMachines();
            if (existingVms.size() > 0) {
                output.info("Failed to create VMs. The following VMs already exist.");
                VMS.addAll(existingVms);
                TABLE.print();
                output.info("Please cosnider using --replace-existing");
                return CommandLine.ExitCode.SOFTWARE;
            }

            List<HasMetadata> createdResources = kubernetesClient.load(is).create();
            final List<VirtualMachine> createdVms = createdResources.stream().filter(i -> i instanceof VirtualMachine)
                    .map(VirtualMachine.class::cast).collect(Collectors.toList());
            VMS.addAll(createdVms);

            output.info("Created VMs:");
            TABLE.print();
            if (waitUntilReady) {
                kubernetesClient.resourceList(createdVms).waitUntilCondition(
                        vm -> vm instanceof VirtualMachine &&
                                ((VirtualMachine) vm).getStatus() != null &&
                                ((VirtualMachine) vm).getStatus().getReady() != null &&
                                ((VirtualMachine) vm).getStatus().getReady(),
                        5L, TimeUnit.MINUTES);
                VMS.clear();
                VMS.addAll(kubernetesClient.resourceList(createdVms).get().stream()
                        .filter(i -> i instanceof VirtualMachine).map(VirtualMachine.class::cast).collect(Collectors.toList()));
                TABLE.refresh();
            }
            return CommandLine.ExitCode.OK;
        } catch (Exception e) {
            e.printStackTrace();
            return CommandLine.ExitCode.SOFTWARE;
        }
    }

    public List<VirtualMachine> existingVirtualMachines() {
        try (InputStream is = getInputStream()) {
            KubernetesClient kubernetesClient = new KubernetesClientBuilder().build();
            return kubernetesClient.load(is).get().stream().filter(i -> i instanceof VirtualMachine)
                    .map(VirtualMachine.class::cast).collect(Collectors.toList());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteExistingVirtualMachines() {
        try (InputStream is = getInputStream()) {
            KubernetesClient kubernetesClient = new KubernetesClientBuilder().build();
            List<HasMetadata> existingResources = kubernetesClient.load(is).get();
            final List<VirtualMachine> existingVms = existingResources.stream().filter(i -> i instanceof VirtualMachine)
                    .map(VirtualMachine.class::cast).collect(Collectors.toList());
            for (VirtualMachine vm : existingVms) {
                kubernetesClient.resource(vm).delete();
            }
            for (VirtualMachine terminating : existingVms) {
                kubernetesClient.resource(terminating).waitUntilCondition(vm -> vm == null, 1L, TimeUnit.MINUTES);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
