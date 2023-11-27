package io.quarkiverse.kubevirt;

import java.util.concurrent.Callable;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Model.CommandSpec;
import picocli.CommandLine.Spec;

@Command(name = "create", subcommands = { VmCreatePodman.class,
        VmCreateFromFile.class }, sortOptions = false, mixinStandardHelpOptions = false, header = "Create VMs")
public class VmCreate implements Callable<Integer> {

    @Spec
    protected CommandSpec spec;

    @CommandLine.Option(names = { "-h", "--help" }, usageHelp = true, description = "Display this help message.")
    public boolean help;

    @Override
    public Integer call() {
        return CommandLine.ExitCode.OK;
    }
}
