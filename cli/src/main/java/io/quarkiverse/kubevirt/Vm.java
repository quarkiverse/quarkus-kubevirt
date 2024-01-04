package io.quarkiverse.kubevirt;

import java.util.concurrent.Callable;

import io.quarkiverse.kubevirt.common.HelpOption;
import io.quarkiverse.kubevirt.common.OutputOptionMixin;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Mixin;
import picocli.CommandLine.ParseResult;
import picocli.CommandLine.Spec;

@Command(name = "vm", sortOptions = false, mixinStandardHelpOptions = false, header = "Vm", subcommands = {
    VmCreate.class,
    VmDelete.class,
    VmList.class,
    VmUsePodman.class }, headerHeading = "%n", commandListHeading = "%nCommands:%n", synopsisHeading = "%nUsage: ", optionListHeading = "%nOptions:%n")
public class Vm implements Callable<Integer> {

  @Mixin(name = "output")
  protected OutputOptionMixin output;

  @Mixin
  protected HelpOption helpOption;

  @Spec
  protected CommandLine.Model.CommandSpec spec;

  @Override
  public Integer call() throws Exception {
    ParseResult result = spec.commandLine().getParseResult();
    CommandLine listCommand = spec.subcommands().get("list");
    return listCommand.execute(result.originalArgs().stream().filter(x -> !"vm".equals(x)).toArray(String[]::new));
  }
}
