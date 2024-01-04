package io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "autoattachGraphicsDevice", "autoattachInputDevice",
    "autoattachMemBalloon", "autoattachPodInterface", "autoattachSerialConsole", "autoattachVSOCK", "blockMultiQueue",
    "clientPassthrough", "disableHotplug", "disks", "filesystems", "gpus", "hostDevices", "inputs", "interfaces",
    "networkInterfaceMultiqueue", "rng", "sound", "tpm", "useVirtioTransitional", "watchdog" })
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
public class Devices implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * Whether to attach the default graphics device or not. VNC will not be available if set to false. Defaults to true.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("autoattachGraphicsDevice")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Whether to attach the default graphics device or not. VNC will not be available if set to false. Defaults to true.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Boolean autoattachGraphicsDevice;

  public Boolean getAutoattachGraphicsDevice() {
    return autoattachGraphicsDevice;
  }

  public void setAutoattachGraphicsDevice(Boolean autoattachGraphicsDevice) {
    this.autoattachGraphicsDevice = autoattachGraphicsDevice;
  }

  /**
   * Whether to attach an Input Device. Defaults to false.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("autoattachInputDevice")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Whether to attach an Input Device. Defaults to false.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Boolean autoattachInputDevice;

  public Boolean getAutoattachInputDevice() {
    return autoattachInputDevice;
  }

  public void setAutoattachInputDevice(Boolean autoattachInputDevice) {
    this.autoattachInputDevice = autoattachInputDevice;
  }

  /**
   * Whether to attach the Memory balloon device with default period. Period can be adjusted in virt-config. Defaults to true.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("autoattachMemBalloon")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Whether to attach the Memory balloon device with default period. Period can be adjusted in virt-config. Defaults to true.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Boolean autoattachMemBalloon;

  public Boolean getAutoattachMemBalloon() {
    return autoattachMemBalloon;
  }

  public void setAutoattachMemBalloon(Boolean autoattachMemBalloon) {
    this.autoattachMemBalloon = autoattachMemBalloon;
  }

  /**
   * Whether to attach a pod network interface. Defaults to true.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("autoattachPodInterface")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Whether to attach a pod network interface. Defaults to true.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Boolean autoattachPodInterface;

  public Boolean getAutoattachPodInterface() {
    return autoattachPodInterface;
  }

  public void setAutoattachPodInterface(Boolean autoattachPodInterface) {
    this.autoattachPodInterface = autoattachPodInterface;
  }

  /**
   * Whether to attach the default serial console or not. Serial console access will not be available if set to false.
   * Defaults to true.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("autoattachSerialConsole")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Whether to attach the default serial console or not. Serial console access will not be available if set to false. Defaults to true.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Boolean autoattachSerialConsole;

  public Boolean getAutoattachSerialConsole() {
    return autoattachSerialConsole;
  }

  public void setAutoattachSerialConsole(Boolean autoattachSerialConsole) {
    this.autoattachSerialConsole = autoattachSerialConsole;
  }

  /**
   * Whether to attach the VSOCK CID to the VM or not. VSOCK access will be available if set to true. Defaults to false.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("autoattachVSOCK")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Whether to attach the VSOCK CID to the VM or not. VSOCK access will be available if set to true. Defaults to false.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Boolean autoattachVSOCK;

  public Boolean getAutoattachVSOCK() {
    return autoattachVSOCK;
  }

  public void setAutoattachVSOCK(Boolean autoattachVSOCK) {
    this.autoattachVSOCK = autoattachVSOCK;
  }

  /**
   * Whether or not to enable virtio multi-queue for block devices. Defaults to false.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("blockMultiQueue")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Whether or not to enable virtio multi-queue for block devices. Defaults to false.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Boolean blockMultiQueue;

  public Boolean getBlockMultiQueue() {
    return blockMultiQueue;
  }

  public void setBlockMultiQueue(Boolean blockMultiQueue) {
    this.blockMultiQueue = blockMultiQueue;
  }

  /**
   * To configure and access client devices such as redirecting USB
   */
  @com.fasterxml.jackson.annotation.JsonProperty("clientPassthrough")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("To configure and access client devices such as redirecting USB")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.ClientPassthrough clientPassthrough;

  public io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.ClientPassthrough getClientPassthrough() {
    return clientPassthrough;
  }

  public void setClientPassthrough(
      io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.ClientPassthrough clientPassthrough) {
    this.clientPassthrough = clientPassthrough;
  }

  /**
   * DisableHotplug disabled the ability to hotplug disks.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("disableHotplug")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("DisableHotplug disabled the ability to hotplug disks.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Boolean disableHotplug;

  public Boolean getDisableHotplug() {
    return disableHotplug;
  }

  public void setDisableHotplug(Boolean disableHotplug) {
    this.disableHotplug = disableHotplug;
  }

  /**
   * Disks describes disks, cdroms and luns which are connected to the vmi.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("disks")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Disks describes disks, cdroms and luns which are connected to the vmi.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.Disks> disks;

  public java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.Disks> getDisks() {
    return disks;
  }

  public void setDisks(
      java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.Disks> disks) {
    this.disks = disks;
  }

  /**
   * Filesystems describes filesystem which is connected to the vmi.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("filesystems")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Filesystems describes filesystem which is connected to the vmi.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.Filesystems> filesystems;

  public java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.Filesystems> getFilesystems() {
    return filesystems;
  }

  public void setFilesystems(
      java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.Filesystems> filesystems) {
    this.filesystems = filesystems;
  }

  /**
   * Whether to attach a GPU device to the vmi.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("gpus")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Whether to attach a GPU device to the vmi.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.Gpus> gpus;

  public java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.Gpus> getGpus() {
    return gpus;
  }

  public void setGpus(
      java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.Gpus> gpus) {
    this.gpus = gpus;
  }

  /**
   * Whether to attach a host device to the vmi.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("hostDevices")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Whether to attach a host device to the vmi.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.HostDevices> hostDevices;

  public java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.HostDevices> getHostDevices() {
    return hostDevices;
  }

  public void setHostDevices(
      java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.HostDevices> hostDevices) {
    this.hostDevices = hostDevices;
  }

  /**
   * Inputs describe input devices
   */
  @com.fasterxml.jackson.annotation.JsonProperty("inputs")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Inputs describe input devices")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.Inputs> inputs;

  public java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.Inputs> getInputs() {
    return inputs;
  }

  public void setInputs(
      java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.Inputs> inputs) {
    this.inputs = inputs;
  }

  /**
   * Interfaces describe network interfaces which are added to the vmi.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("interfaces")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Interfaces describe network interfaces which are added to the vmi.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.Interfaces> interfaces;

  public java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.Interfaces> getInterfaces() {
    return interfaces;
  }

  public void setInterfaces(
      java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.Interfaces> interfaces) {
    this.interfaces = interfaces;
  }

  /**
   * If specified, virtual network interfaces configured with a virtio bus will also enable the vhost multiqueue feature for
   * network devices. The number of queues created depends on additional factors of the VirtualMachineInstance, like the
   * number of guest CPUs.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("networkInterfaceMultiqueue")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("If specified, virtual network interfaces configured with a virtio bus will also enable the vhost multiqueue feature for network devices. The number of queues created depends on additional factors of the VirtualMachineInstance, like the number of guest CPUs.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Boolean networkInterfaceMultiqueue;

  public Boolean getNetworkInterfaceMultiqueue() {
    return networkInterfaceMultiqueue;
  }

  public void setNetworkInterfaceMultiqueue(Boolean networkInterfaceMultiqueue) {
    this.networkInterfaceMultiqueue = networkInterfaceMultiqueue;
  }

  /**
   * Whether to have random number generator from host
   */
  @com.fasterxml.jackson.annotation.JsonProperty("rng")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Whether to have random number generator from host")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.Rng rng;

  public io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.Rng getRng() {
    return rng;
  }

  public void setRng(io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.Rng rng) {
    this.rng = rng;
  }

  /**
   * Whether to emulate a sound device.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sound")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Whether to emulate a sound device.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.Sound sound;

  public io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.Sound getSound() {
    return sound;
  }

  public void setSound(io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.Sound sound) {
    this.sound = sound;
  }

  /**
   * Whether to emulate a TPM device.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("tpm")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Whether to emulate a TPM device.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.Tpm tpm;

  public io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.Tpm getTpm() {
    return tpm;
  }

  public void setTpm(io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.Tpm tpm) {
    this.tpm = tpm;
  }

  /**
   * Fall back to legacy virtio 0.9 support if virtio bus is selected on devices. This is helpful for old machines like
   * CentOS6 or RHEL6 which do not understand virtio_non_transitional (virtio 1.0).
   */
  @com.fasterxml.jackson.annotation.JsonProperty("useVirtioTransitional")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Fall back to legacy virtio 0.9 support if virtio bus is selected on devices. This is helpful for old machines like CentOS6 or RHEL6 which do not understand virtio_non_transitional (virtio 1.0).")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Boolean useVirtioTransitional;

  public Boolean getUseVirtioTransitional() {
    return useVirtioTransitional;
  }

  public void setUseVirtioTransitional(Boolean useVirtioTransitional) {
    this.useVirtioTransitional = useVirtioTransitional;
  }

  /**
   * Watchdog describes a watchdog device which can be added to the vmi.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("watchdog")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Watchdog describes a watchdog device which can be added to the vmi.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.Watchdog watchdog;

  public io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.Watchdog getWatchdog() {
    return watchdog;
  }

  public void setWatchdog(
      io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.Watchdog watchdog) {
    this.watchdog = watchdog;
  }
}
