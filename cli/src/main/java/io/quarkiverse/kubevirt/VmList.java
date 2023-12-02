package io.quarkiverse.kubevirt;

import java.util.List;

import io.quarkiverse.kubevirt.common.Table;
import io.quarkiverse.kubevirt.utils.Tables;
import io.quarkiverse.kubevirt.v1.VirtualMachine;
import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "list", sortOptions = false, mixinStandardHelpOptions = false, header = "List virtual machines")
public class VmList extends AbstractVmCommand {

    @Override
    public Integer call() {
        try {
            List<VirtualMachine> virtualMachines = existingVirtualMachines();
            if (!virtualMachines.isEmpty()) {
                Table<VirtualMachine> table = Tables.forVirtualMachines(virtualMachines);
                table.print();

            } else if (namespace != null && !namespace.isEmpty()) {
                output.info("No virtual machines found in namespace " + namespace);
            } else {
                output.info("No virtual machines found");
            }
            return CommandLine.ExitCode.OK;
        } catch (Exception e) {
            e.printStackTrace();
            return CommandLine.ExitCode.SOFTWARE;
        }
    }
}
