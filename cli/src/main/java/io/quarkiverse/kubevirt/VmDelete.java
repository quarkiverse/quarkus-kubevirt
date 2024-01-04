package io.quarkiverse.kubevirt;

import java.util.List;

import io.quarkiverse.kubevirt.utils.Clients;
import io.quarkiverse.kubevirt.v1.VirtualMachine;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name = "delete", sortOptions = false, mixinStandardHelpOptions = false, header = "Delete virtual machines")
public class VmDelete extends AbstractVmCommand {

  @Parameters(index = "0", description = "The virutal machine name")
  public String name;

  @Override
  public Integer call() {
    try {
      List<VirtualMachine> virtualMachines = existingVirtualMachines();
      if (virtualMachines.stream().anyMatch(vm -> vm.getMetadata().getName().equals(name))) {
        output.info("Deleting virtual machine " + name);
        Clients.kubevirt().v1().virtualmachines().withName(name).delete();
      } else if (namespace != null && !namespace.isEmpty()) {
        output.info("No matching virtual machine found in namespace " + namespace);
      } else {
        output.info("No matching virtual machines found");
      }
      return CommandLine.ExitCode.OK;
    } catch (Exception e) {
      e.printStackTrace();
      return CommandLine.ExitCode.SOFTWARE;
    }
  }

}
