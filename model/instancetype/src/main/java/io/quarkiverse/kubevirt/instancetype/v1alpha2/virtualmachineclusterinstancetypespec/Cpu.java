package io.quarkiverse.kubevirt.instancetype.v1alpha2.virtualmachineclusterinstancetypespec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "dedicatedCPUPlacement", "guest", "isolateEmulatorThread", "model",
    "numa", "realtime" })
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@lombok.ToString()
@lombok.EqualsAndHashCode()
@io.sundr.builder.annotations.Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectMeta.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectReference.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.LabelSelector.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Container.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.EnvVar.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ContainerPort.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Volume.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.VolumeMount.class)
})
public class Cpu implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * DedicatedCPUPlacement requests the scheduler to place the VirtualMachineInstance on a node with enough dedicated pCPUs
   * and pin the vCPUs to it.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dedicatedCPUPlacement")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("DedicatedCPUPlacement requests the scheduler to place the VirtualMachineInstance on a node with enough dedicated pCPUs and pin the vCPUs to it.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Boolean dedicatedCPUPlacement;

  public Boolean getDedicatedCPUPlacement() {
    return dedicatedCPUPlacement;
  }

  public void setDedicatedCPUPlacement(Boolean dedicatedCPUPlacement) {
    this.dedicatedCPUPlacement = dedicatedCPUPlacement;
  }

  /**
   * Required number of vCPUs to expose to the guest.
   * The resulting CPU topology being derived from the optional PreferredCPUTopology attribute of CPUPreferences that itself
   * defaults to PreferCores.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("guest")
  @io.fabric8.generator.annotation.Required()
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Required number of vCPUs to expose to the guest. \n The resulting CPU topology being derived from the optional PreferredCPUTopology attribute of CPUPreferences that itself defaults to PreferCores.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Integer guest;

  public Integer getGuest() {
    return guest;
  }

  public void setGuest(Integer guest) {
    this.guest = guest;
  }

  /**
   * IsolateEmulatorThread requests one more dedicated pCPU to be allocated for the VMI to place the emulator thread on it.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("isolateEmulatorThread")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("IsolateEmulatorThread requests one more dedicated pCPU to be allocated for the VMI to place the emulator thread on it.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Boolean isolateEmulatorThread;

  public Boolean getIsolateEmulatorThread() {
    return isolateEmulatorThread;
  }

  public void setIsolateEmulatorThread(Boolean isolateEmulatorThread) {
    this.isolateEmulatorThread = isolateEmulatorThread;
  }

  /**
   * Model specifies the CPU model inside the VMI. List of available models
   * https://github.com/libvirt/libvirt/tree/master/src/cpu_map. It is possible to specify special cases like
   * "host-passthrough" to get the same CPU as the node and "host-model" to get CPU closest to the node one. Defaults to
   * host-model.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("model")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Model specifies the CPU model inside the VMI. List of available models https://github.com/libvirt/libvirt/tree/master/src/cpu_map. It is possible to specify special cases like \"host-passthrough\" to get the same CPU as the node and \"host-model\" to get CPU closest to the node one. Defaults to host-model.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String model;

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  /**
   * NUMA allows specifying settings for the guest NUMA topology
   */
  @com.fasterxml.jackson.annotation.JsonProperty("numa")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("NUMA allows specifying settings for the guest NUMA topology")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.instancetype.v1alpha2.virtualmachineclusterinstancetypespec.cpu.Numa numa;

  public io.quarkiverse.kubevirt.instancetype.v1alpha2.virtualmachineclusterinstancetypespec.cpu.Numa getNuma() {
    return numa;
  }

  public void setNuma(io.quarkiverse.kubevirt.instancetype.v1alpha2.virtualmachineclusterinstancetypespec.cpu.Numa numa) {
    this.numa = numa;
  }

  /**
   * Realtime instructs the virt-launcher to tune the VMI for lower latency, optional for real time workloads
   */
  @com.fasterxml.jackson.annotation.JsonProperty("realtime")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Realtime instructs the virt-launcher to tune the VMI for lower latency, optional for real time workloads")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.instancetype.v1alpha2.virtualmachineclusterinstancetypespec.cpu.Realtime realtime;

  public io.quarkiverse.kubevirt.instancetype.v1alpha2.virtualmachineclusterinstancetypespec.cpu.Realtime getRealtime() {
    return realtime;
  }

  public void setRealtime(
      io.quarkiverse.kubevirt.instancetype.v1alpha2.virtualmachineclusterinstancetypespec.cpu.Realtime realtime) {
    this.realtime = realtime;
  }
}
