package io.quarkiverse.kubevirt;

import java.util.concurrent.Callable;

import jakarta.inject.Inject;

import io.quarkiverse.kubevirt.common.OutputOptionMixin;
import io.quarkus.picocli.runtime.annotations.TopCommand;
import picocli.CommandLine;
import picocli.CommandLine.Command;

@TopCommand
@Command(name = "kubevirt", sortOptions = false, mixinStandardHelpOptions = false, header = "OpenShift VM CLI", subcommands = {
        VmCreate.class,
        VmDelete.class,
        VmList.class,
        VmUsePodman.class })
public class KubevirtCommand implements Callable<Integer> {

    static {
        System.setProperty("picocli.endofoptions.description", "End of command line options.");
    }

    @Inject
    CommandLine.IFactory factory;

    @CommandLine.Mixin(name = "output")
    OutputOptionMixin output;

    @CommandLine.Spec
    protected CommandLine.Model.CommandSpec spec;

    @Override
    public Integer call() {
        CommandLine schemaCommand = spec.subcommands().get("list");
        return schemaCommand.execute();
    }

    public OutputOptionMixin getOutput() {
        return output;
    }

    public CommandLine.Model.CommandSpec getSpec() {
        return spec;
    }
}
