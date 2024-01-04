package io.quarkiverse.kubevirt.utils;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import io.quarkiverse.kubevirt.common.Table;
import io.quarkiverse.kubevirt.v1.VirtualMachine;
import io.quarkiverse.kubevirt.v1.VirtualMachineInstance;
import io.quarkiverse.kubevirt.v1.VirtualMachineInstanceStatus;
import io.quarkiverse.kubevirt.v1.virtualmachineinstancestatus.Interfaces;

public final class Tables {
  private Tables() {
    //Utility
  }

  private static final List<String> VM_HEADERS = List.of("Name", "Namespace", "Ready", "IPs");
  private static final List<Function<VirtualMachine, String>> VM_MAPPERS = List.of(
      t -> t.getMetadata().getName(),
      t -> t.getMetadata().getNamespace(),
      t -> t.getStatus() != null && t.getStatus().getReady() != null && t.getStatus().getReady() ? " * " : "  ",
      t -> getVirtualMachineIps(t));

  public static Table<VirtualMachine> forVirtualMachines(List<VirtualMachine> virtualMachines) {
    return new Table<>(VM_HEADERS, VM_MAPPERS, virtualMachines);
  }

  /**
   * Get the Virtual Machine IPs.
   *
   * @param vm the Virtual Machine
   * @return the Virtual Machine IPs or an empty string if status/interfaces are not present
   */
  private static String getVirtualMachineIps(VirtualMachine vm) {
    VirtualMachineInstance vmInstance = Clients.kubevirt().v1().virtualmachineinstances()
        .inNamespace(vm.getMetadata().getNamespace())
        .withName(vm.getMetadata().getName()).get();

    if (vmInstance == null) {
      return "";
    }

    VirtualMachineInstanceStatus status = vmInstance.getStatus();
    if (status == null) {
      return "";
    }

    List<Interfaces> interfaces = status.getInterfaces();
    if (interfaces == null || interfaces.isEmpty()) {
      return "";
    }
    return interfaces.stream().flatMap(i -> i.getIpAddresses().stream()).collect(Collectors.joining(", "));
  }
}
