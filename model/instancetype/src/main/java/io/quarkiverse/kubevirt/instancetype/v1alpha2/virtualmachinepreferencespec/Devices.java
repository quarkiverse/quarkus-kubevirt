package io.quarkiverse.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "preferredAutoattachGraphicsDevice", "preferredAutoattachInputDevice",
    "preferredAutoattachMemBalloon", "preferredAutoattachPodInterface", "preferredAutoattachSerialConsole",
    "preferredBlockMultiQueue", "preferredCdromBus", "preferredDisableHotplug", "preferredDiskBlockSize",
    "preferredDiskBus", "preferredDiskCache", "preferredDiskDedicatedIoThread", "preferredDiskIO", "preferredInputBus",
    "preferredInputType", "preferredInterfaceModel", "preferredLunBus", "preferredNetworkInterfaceMultiQueue",
    "preferredRng", "preferredSoundModel", "preferredTPM", "preferredUseVirtioTransitional", "preferredVirtualGPUOptions" })
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
   * PreferredAutoattachGraphicsDevice optionally defines the preferred value of AutoattachGraphicsDevice
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preferredAutoattachGraphicsDevice")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredAutoattachGraphicsDevice optionally defines the preferred value of AutoattachGraphicsDevice")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Boolean preferredAutoattachGraphicsDevice;

  public Boolean getPreferredAutoattachGraphicsDevice() {
    return preferredAutoattachGraphicsDevice;
  }

  public void setPreferredAutoattachGraphicsDevice(Boolean preferredAutoattachGraphicsDevice) {
    this.preferredAutoattachGraphicsDevice = preferredAutoattachGraphicsDevice;
  }

  /**
   * PreferredAutoattachInputDevice optionally defines the preferred value of AutoattachInputDevice
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preferredAutoattachInputDevice")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredAutoattachInputDevice optionally defines the preferred value of AutoattachInputDevice")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Boolean preferredAutoattachInputDevice;

  public Boolean getPreferredAutoattachInputDevice() {
    return preferredAutoattachInputDevice;
  }

  public void setPreferredAutoattachInputDevice(Boolean preferredAutoattachInputDevice) {
    this.preferredAutoattachInputDevice = preferredAutoattachInputDevice;
  }

  /**
   * PreferredAutoattachMemBalloon optionally defines the preferred value of AutoattachMemBalloon
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preferredAutoattachMemBalloon")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredAutoattachMemBalloon optionally defines the preferred value of AutoattachMemBalloon")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Boolean preferredAutoattachMemBalloon;

  public Boolean getPreferredAutoattachMemBalloon() {
    return preferredAutoattachMemBalloon;
  }

  public void setPreferredAutoattachMemBalloon(Boolean preferredAutoattachMemBalloon) {
    this.preferredAutoattachMemBalloon = preferredAutoattachMemBalloon;
  }

  /**
   * PreferredAutoattachPodInterface optionally defines the preferred value of AutoattachPodInterface
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preferredAutoattachPodInterface")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredAutoattachPodInterface optionally defines the preferred value of AutoattachPodInterface")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Boolean preferredAutoattachPodInterface;

  public Boolean getPreferredAutoattachPodInterface() {
    return preferredAutoattachPodInterface;
  }

  public void setPreferredAutoattachPodInterface(Boolean preferredAutoattachPodInterface) {
    this.preferredAutoattachPodInterface = preferredAutoattachPodInterface;
  }

  /**
   * PreferredAutoattachSerialConsole optionally defines the preferred value of AutoattachSerialConsole
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preferredAutoattachSerialConsole")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredAutoattachSerialConsole optionally defines the preferred value of AutoattachSerialConsole")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Boolean preferredAutoattachSerialConsole;

  public Boolean getPreferredAutoattachSerialConsole() {
    return preferredAutoattachSerialConsole;
  }

  public void setPreferredAutoattachSerialConsole(Boolean preferredAutoattachSerialConsole) {
    this.preferredAutoattachSerialConsole = preferredAutoattachSerialConsole;
  }

  /**
   * PreferredBlockMultiQueue optionally enables the vhost multiqueue feature for virtio disks.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preferredBlockMultiQueue")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredBlockMultiQueue optionally enables the vhost multiqueue feature for virtio disks.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Boolean preferredBlockMultiQueue;

  public Boolean getPreferredBlockMultiQueue() {
    return preferredBlockMultiQueue;
  }

  public void setPreferredBlockMultiQueue(Boolean preferredBlockMultiQueue) {
    this.preferredBlockMultiQueue = preferredBlockMultiQueue;
  }

  /**
   * PreferredCdromBus optionally defines the preferred bus for Cdrom Disk devices.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preferredCdromBus")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredCdromBus optionally defines the preferred bus for Cdrom Disk devices.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String preferredCdromBus;

  public String getPreferredCdromBus() {
    return preferredCdromBus;
  }

  public void setPreferredCdromBus(String preferredCdromBus) {
    this.preferredCdromBus = preferredCdromBus;
  }

  /**
   * PreferredDisableHotplug optionally defines the preferred value of DisableHotplug
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preferredDisableHotplug")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredDisableHotplug optionally defines the preferred value of DisableHotplug")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Boolean preferredDisableHotplug;

  public Boolean getPreferredDisableHotplug() {
    return preferredDisableHotplug;
  }

  public void setPreferredDisableHotplug(Boolean preferredDisableHotplug) {
    this.preferredDisableHotplug = preferredDisableHotplug;
  }

  /**
   * PreferredBlockSize optionally defines the block size of Disk devices.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preferredDiskBlockSize")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredBlockSize optionally defines the block size of Disk devices.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.devices.PreferredDiskBlockSize preferredDiskBlockSize;

  public io.quarkiverse.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.devices.PreferredDiskBlockSize getPreferredDiskBlockSize() {
    return preferredDiskBlockSize;
  }

  public void setPreferredDiskBlockSize(
      io.quarkiverse.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.devices.PreferredDiskBlockSize preferredDiskBlockSize) {
    this.preferredDiskBlockSize = preferredDiskBlockSize;
  }

  /**
   * PreferredDiskBus optionally defines the preferred bus for Disk Disk devices.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preferredDiskBus")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredDiskBus optionally defines the preferred bus for Disk Disk devices.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String preferredDiskBus;

  public String getPreferredDiskBus() {
    return preferredDiskBus;
  }

  public void setPreferredDiskBus(String preferredDiskBus) {
    this.preferredDiskBus = preferredDiskBus;
  }

  /**
   * PreferredCache optionally defines the DriverCache to be used by Disk devices.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preferredDiskCache")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredCache optionally defines the DriverCache to be used by Disk devices.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String preferredDiskCache;

  public String getPreferredDiskCache() {
    return preferredDiskCache;
  }

  public void setPreferredDiskCache(String preferredDiskCache) {
    this.preferredDiskCache = preferredDiskCache;
  }

  /**
   * PreferredDedicatedIoThread optionally enables dedicated IO threads for Disk devices.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preferredDiskDedicatedIoThread")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredDedicatedIoThread optionally enables dedicated IO threads for Disk devices.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Boolean preferredDiskDedicatedIoThread;

  public Boolean getPreferredDiskDedicatedIoThread() {
    return preferredDiskDedicatedIoThread;
  }

  public void setPreferredDiskDedicatedIoThread(Boolean preferredDiskDedicatedIoThread) {
    this.preferredDiskDedicatedIoThread = preferredDiskDedicatedIoThread;
  }

  /**
   * PreferredIo optionally defines the QEMU disk IO mode to be used by Disk devices.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preferredDiskIO")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredIo optionally defines the QEMU disk IO mode to be used by Disk devices.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String preferredDiskIO;

  public String getPreferredDiskIO() {
    return preferredDiskIO;
  }

  public void setPreferredDiskIO(String preferredDiskIO) {
    this.preferredDiskIO = preferredDiskIO;
  }

  /**
   * PreferredInputBus optionally defines the preferred bus for Input devices.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preferredInputBus")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredInputBus optionally defines the preferred bus for Input devices.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String preferredInputBus;

  public String getPreferredInputBus() {
    return preferredInputBus;
  }

  public void setPreferredInputBus(String preferredInputBus) {
    this.preferredInputBus = preferredInputBus;
  }

  /**
   * PreferredInputType optionally defines the preferred type for Input devices.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preferredInputType")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredInputType optionally defines the preferred type for Input devices.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String preferredInputType;

  public String getPreferredInputType() {
    return preferredInputType;
  }

  public void setPreferredInputType(String preferredInputType) {
    this.preferredInputType = preferredInputType;
  }

  /**
   * PreferredInterfaceModel optionally defines the preferred model to be used by Interface devices.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preferredInterfaceModel")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredInterfaceModel optionally defines the preferred model to be used by Interface devices.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String preferredInterfaceModel;

  public String getPreferredInterfaceModel() {
    return preferredInterfaceModel;
  }

  public void setPreferredInterfaceModel(String preferredInterfaceModel) {
    this.preferredInterfaceModel = preferredInterfaceModel;
  }

  /**
   * PreferredLunBus optionally defines the preferred bus for Lun Disk devices.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preferredLunBus")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredLunBus optionally defines the preferred bus for Lun Disk devices.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String preferredLunBus;

  public String getPreferredLunBus() {
    return preferredLunBus;
  }

  public void setPreferredLunBus(String preferredLunBus) {
    this.preferredLunBus = preferredLunBus;
  }

  /**
   * PreferredNetworkInterfaceMultiQueue optionally enables the vhost multiqueue feature for virtio interfaces.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preferredNetworkInterfaceMultiQueue")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredNetworkInterfaceMultiQueue optionally enables the vhost multiqueue feature for virtio interfaces.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Boolean preferredNetworkInterfaceMultiQueue;

  public Boolean getPreferredNetworkInterfaceMultiQueue() {
    return preferredNetworkInterfaceMultiQueue;
  }

  public void setPreferredNetworkInterfaceMultiQueue(Boolean preferredNetworkInterfaceMultiQueue) {
    this.preferredNetworkInterfaceMultiQueue = preferredNetworkInterfaceMultiQueue;
  }

  /**
   * PreferredRng optionally defines the preferred rng device to be used.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preferredRng")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredRng optionally defines the preferred rng device to be used.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.devices.PreferredRng preferredRng;

  public io.quarkiverse.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.devices.PreferredRng getPreferredRng() {
    return preferredRng;
  }

  public void setPreferredRng(
      io.quarkiverse.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.devices.PreferredRng preferredRng) {
    this.preferredRng = preferredRng;
  }

  /**
   * PreferredSoundModel optionally defines the preferred model for Sound devices.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preferredSoundModel")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredSoundModel optionally defines the preferred model for Sound devices.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String preferredSoundModel;

  public String getPreferredSoundModel() {
    return preferredSoundModel;
  }

  public void setPreferredSoundModel(String preferredSoundModel) {
    this.preferredSoundModel = preferredSoundModel;
  }

  /**
   * PreferredTPM optionally defines the preferred TPM device to be used.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preferredTPM")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredTPM optionally defines the preferred TPM device to be used.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.devices.PreferredTPM preferredTPM;

  public io.quarkiverse.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.devices.PreferredTPM getPreferredTPM() {
    return preferredTPM;
  }

  public void setPreferredTPM(
      io.quarkiverse.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.devices.PreferredTPM preferredTPM) {
    this.preferredTPM = preferredTPM;
  }

  /**
   * PreferredUseVirtioTransitional optionally defines the preferred value of UseVirtioTransitional
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preferredUseVirtioTransitional")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredUseVirtioTransitional optionally defines the preferred value of UseVirtioTransitional")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Boolean preferredUseVirtioTransitional;

  public Boolean getPreferredUseVirtioTransitional() {
    return preferredUseVirtioTransitional;
  }

  public void setPreferredUseVirtioTransitional(Boolean preferredUseVirtioTransitional) {
    this.preferredUseVirtioTransitional = preferredUseVirtioTransitional;
  }

  /**
   * PreferredVirtualGPUOptions optionally defines the preferred value of VirtualGPUOptions
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preferredVirtualGPUOptions")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredVirtualGPUOptions optionally defines the preferred value of VirtualGPUOptions")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.devices.PreferredVirtualGPUOptions preferredVirtualGPUOptions;

  public io.quarkiverse.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.devices.PreferredVirtualGPUOptions getPreferredVirtualGPUOptions() {
    return preferredVirtualGPUOptions;
  }

  public void setPreferredVirtualGPUOptions(
      io.quarkiverse.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.devices.PreferredVirtualGPUOptions preferredVirtualGPUOptions) {
    this.preferredVirtualGPUOptions = preferredVirtualGPUOptions;
  }
}
