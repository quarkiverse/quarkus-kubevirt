package io.quarkiverse.kubevirt;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import io.quarkiverse.kubevirt.common.OutputOptionMixin;
import io.quarkiverse.kubevirt.common.Table;
import io.quarkiverse.kubevirt.utils.Clients;
import io.quarkiverse.kubevirt.utils.Tables;
import io.quarkiverse.kubevirt.v1.VirtualMachine;
import picocli.CommandLine;
import picocli.CommandLine.Mixin;
import picocli.CommandLine.Model.CommandSpec;
import picocli.CommandLine.Spec;

public abstract class AbstractVmCommand implements Callable<Integer> {

    protected static final List<VirtualMachine> VMS = new ArrayList<>();
    protected static final Table<VirtualMachine> TABLE = Tables.forVirtualMachines(VMS);

    @Mixin
    protected OutputOptionMixin output;

    @Spec
    protected CommandSpec spec;

    @CommandLine.Option(names = { "-w", "--wait-until-ready" }, description = "Wait until ready")
    protected boolean waitUntilReady;

    @CommandLine.Option(names = { "-n", "--namespace" }, description = "The name namespace to use")
    protected String namespace;

    @CommandLine.Option(names = { "-h", "--help" }, usageHelp = true, description = "Display this help message")
    protected boolean help;

    public boolean shouldWaitUntilReady() {
        return waitUntilReady;
    }

    public List<VirtualMachine> existingVirtualMachines() {
        return namespace != null && !namespace.isEmpty()
                ? Clients.kubevirt().v1().virtualmachines().inNamespace(namespace).list().getItems()
                : Clients.kubevirt().v1().virtualmachines().list().getItems();
    }
}
