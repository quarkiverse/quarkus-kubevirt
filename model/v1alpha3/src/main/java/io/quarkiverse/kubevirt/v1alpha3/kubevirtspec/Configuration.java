package io.quarkiverse.kubevirt.v1alpha3.kubevirtspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "additionalGuestMemoryOverheadRatio", "apiConfiguration",
    "controllerConfiguration", "cpuModel", "cpuRequest", "defaultRuntimeClass", "developerConfiguration",
    "emulatedMachines", "evictionStrategy", "handlerConfiguration", "imagePullPolicy", "machineType",
    "mediatedDevicesConfiguration", "memBalloonStatsPeriod", "migrations", "minCPUModel", "network", "obsoleteCPUModels",
    "ovmfPath", "permittedHostDevices", "seccompConfiguration", "selinuxLauncherType", "smbios",
    "supportedGuestAgentVersions", "tlsConfiguration", "virtualMachineInstancesPerNode", "webhookConfiguration" })
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
public class Configuration implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * AdditionalGuestMemoryOverheadRatio can be used to increase the virtualization infrastructure overhead. This is useful,
   * since the calculation of this overhead is not accurate and cannot be entirely known in advance. The ratio that is being
   * set determines by which factor to increase the overhead calculated by Kubevirt. A higher ratio means that the VMs would
   * be less compromised by node pressures, but would mean that fewer VMs could be scheduled to a node. If not set, the
   * default is 1.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("additionalGuestMemoryOverheadRatio")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("AdditionalGuestMemoryOverheadRatio can be used to increase the virtualization infrastructure overhead. This is useful, since the calculation of this overhead is not accurate and cannot be entirely known in advance. The ratio that is being set determines by which factor to increase the overhead calculated by Kubevirt. A higher ratio means that the VMs would be less compromised by node pressures, but would mean that fewer VMs could be scheduled to a node. If not set, the default is 1.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String additionalGuestMemoryOverheadRatio;

  public String getAdditionalGuestMemoryOverheadRatio() {
    return additionalGuestMemoryOverheadRatio;
  }

  public void setAdditionalGuestMemoryOverheadRatio(String additionalGuestMemoryOverheadRatio) {
    this.additionalGuestMemoryOverheadRatio = additionalGuestMemoryOverheadRatio;
  }

  /**
   * ReloadableComponentConfiguration holds all generic k8s configuration options which can be reloaded by components without
   * requiring a restart.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("apiConfiguration")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("ReloadableComponentConfiguration holds all generic k8s configuration options which can be reloaded by components without requiring a restart.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.ApiConfiguration apiConfiguration;

  public io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.ApiConfiguration getApiConfiguration() {
    return apiConfiguration;
  }

  public void setApiConfiguration(
      io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.ApiConfiguration apiConfiguration) {
    this.apiConfiguration = apiConfiguration;
  }

  /**
   * ReloadableComponentConfiguration holds all generic k8s configuration options which can be reloaded by components without
   * requiring a restart.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("controllerConfiguration")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("ReloadableComponentConfiguration holds all generic k8s configuration options which can be reloaded by components without requiring a restart.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.ControllerConfiguration controllerConfiguration;

  public io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.ControllerConfiguration getControllerConfiguration() {
    return controllerConfiguration;
  }

  public void setControllerConfiguration(
      io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.ControllerConfiguration controllerConfiguration) {
    this.controllerConfiguration = controllerConfiguration;
  }

  @com.fasterxml.jackson.annotation.JsonProperty("cpuModel")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String cpuModel;

  public String getCpuModel() {
    return cpuModel;
  }

  public void setCpuModel(String cpuModel) {
    this.cpuModel = cpuModel;
  }

  @com.fasterxml.jackson.annotation.JsonProperty("cpuRequest")
  @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.fabric8.kubernetes.api.model.IntOrString cpuRequest;

  public io.fabric8.kubernetes.api.model.IntOrString getCpuRequest() {
    return cpuRequest;
  }

  public void setCpuRequest(io.fabric8.kubernetes.api.model.IntOrString cpuRequest) {
    this.cpuRequest = cpuRequest;
  }

  @com.fasterxml.jackson.annotation.JsonProperty("defaultRuntimeClass")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String defaultRuntimeClass;

  public String getDefaultRuntimeClass() {
    return defaultRuntimeClass;
  }

  public void setDefaultRuntimeClass(String defaultRuntimeClass) {
    this.defaultRuntimeClass = defaultRuntimeClass;
  }

  /**
   * DeveloperConfiguration holds developer options
   */
  @com.fasterxml.jackson.annotation.JsonProperty("developerConfiguration")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("DeveloperConfiguration holds developer options")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.DeveloperConfiguration developerConfiguration;

  public io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.DeveloperConfiguration getDeveloperConfiguration() {
    return developerConfiguration;
  }

  public void setDeveloperConfiguration(
      io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.DeveloperConfiguration developerConfiguration) {
    this.developerConfiguration = developerConfiguration;
  }

  @com.fasterxml.jackson.annotation.JsonProperty("emulatedMachines")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private java.util.List<String> emulatedMachines;

  public java.util.List<String> getEmulatedMachines() {
    return emulatedMachines;
  }

  public void setEmulatedMachines(java.util.List<String> emulatedMachines) {
    this.emulatedMachines = emulatedMachines;
  }

  /**
   * EvictionStrategy defines at the cluster level if the VirtualMachineInstance should be migrated instead of shut-off in
   * case of a node drain. If the VirtualMachineInstance specific field is set it overrides the cluster level one.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("evictionStrategy")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("EvictionStrategy defines at the cluster level if the VirtualMachineInstance should be migrated instead of shut-off in case of a node drain. If the VirtualMachineInstance specific field is set it overrides the cluster level one.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String evictionStrategy;

  public String getEvictionStrategy() {
    return evictionStrategy;
  }

  public void setEvictionStrategy(String evictionStrategy) {
    this.evictionStrategy = evictionStrategy;
  }

  /**
   * ReloadableComponentConfiguration holds all generic k8s configuration options which can be reloaded by components without
   * requiring a restart.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("handlerConfiguration")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("ReloadableComponentConfiguration holds all generic k8s configuration options which can be reloaded by components without requiring a restart.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.HandlerConfiguration handlerConfiguration;

  public io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.HandlerConfiguration getHandlerConfiguration() {
    return handlerConfiguration;
  }

  public void setHandlerConfiguration(
      io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.HandlerConfiguration handlerConfiguration) {
    this.handlerConfiguration = handlerConfiguration;
  }

  /**
   * PullPolicy describes a policy for if/when to pull a container image
   */
  @com.fasterxml.jackson.annotation.JsonProperty("imagePullPolicy")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PullPolicy describes a policy for if/when to pull a container image")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String imagePullPolicy;

  public String getImagePullPolicy() {
    return imagePullPolicy;
  }

  public void setImagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
  }

  @com.fasterxml.jackson.annotation.JsonProperty("machineType")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String machineType;

  public String getMachineType() {
    return machineType;
  }

  public void setMachineType(String machineType) {
    this.machineType = machineType;
  }

  /**
   * MediatedDevicesConfiguration holds information about MDEV types to be defined, if available
   */
  @com.fasterxml.jackson.annotation.JsonProperty("mediatedDevicesConfiguration")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("MediatedDevicesConfiguration holds information about MDEV types to be defined, if available")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.MediatedDevicesConfiguration mediatedDevicesConfiguration;

  public io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.MediatedDevicesConfiguration getMediatedDevicesConfiguration() {
    return mediatedDevicesConfiguration;
  }

  public void setMediatedDevicesConfiguration(
      io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.MediatedDevicesConfiguration mediatedDevicesConfiguration) {
    this.mediatedDevicesConfiguration = mediatedDevicesConfiguration;
  }

  @com.fasterxml.jackson.annotation.JsonProperty("memBalloonStatsPeriod")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Integer memBalloonStatsPeriod;

  public Integer getMemBalloonStatsPeriod() {
    return memBalloonStatsPeriod;
  }

  public void setMemBalloonStatsPeriod(Integer memBalloonStatsPeriod) {
    this.memBalloonStatsPeriod = memBalloonStatsPeriod;
  }

  /**
   * MigrationConfiguration holds migration options. Can be overridden for specific groups of VMs though migration policies.
   * Visit https://kubevirt.io/user-guide/operations/migration_policies/ for more information.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("migrations")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("MigrationConfiguration holds migration options. Can be overridden for specific groups of VMs though migration policies. Visit https://kubevirt.io/user-guide/operations/migration_policies/ for more information.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.Migrations migrations;

  public io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.Migrations getMigrations() {
    return migrations;
  }

  public void setMigrations(io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.Migrations migrations) {
    this.migrations = migrations;
  }

  @com.fasterxml.jackson.annotation.JsonProperty("minCPUModel")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String minCPUModel;

  public String getMinCPUModel() {
    return minCPUModel;
  }

  public void setMinCPUModel(String minCPUModel) {
    this.minCPUModel = minCPUModel;
  }

  /**
   * NetworkConfiguration holds network options
   */
  @com.fasterxml.jackson.annotation.JsonProperty("network")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("NetworkConfiguration holds network options")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.Network network;

  public io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.Network getNetwork() {
    return network;
  }

  public void setNetwork(io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.Network network) {
    this.network = network;
  }

  @com.fasterxml.jackson.annotation.JsonProperty("obsoleteCPUModels")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private java.util.Map<java.lang.String, Boolean> obsoleteCPUModels;

  public java.util.Map<java.lang.String, Boolean> getObsoleteCPUModels() {
    return obsoleteCPUModels;
  }

  public void setObsoleteCPUModels(java.util.Map<java.lang.String, Boolean> obsoleteCPUModels) {
    this.obsoleteCPUModels = obsoleteCPUModels;
  }

  @com.fasterxml.jackson.annotation.JsonProperty("ovmfPath")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String ovmfPath;

  public String getOvmfPath() {
    return ovmfPath;
  }

  public void setOvmfPath(String ovmfPath) {
    this.ovmfPath = ovmfPath;
  }

  /**
   * PermittedHostDevices holds information about devices allowed for passthrough
   */
  @com.fasterxml.jackson.annotation.JsonProperty("permittedHostDevices")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PermittedHostDevices holds information about devices allowed for passthrough")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.PermittedHostDevices permittedHostDevices;

  public io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.PermittedHostDevices getPermittedHostDevices() {
    return permittedHostDevices;
  }

  public void setPermittedHostDevices(
      io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.PermittedHostDevices permittedHostDevices) {
    this.permittedHostDevices = permittedHostDevices;
  }

  /**
   * SeccompConfiguration holds Seccomp configuration for Kubevirt components
   */
  @com.fasterxml.jackson.annotation.JsonProperty("seccompConfiguration")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("SeccompConfiguration holds Seccomp configuration for Kubevirt components")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.SeccompConfiguration seccompConfiguration;

  public io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.SeccompConfiguration getSeccompConfiguration() {
    return seccompConfiguration;
  }

  public void setSeccompConfiguration(
      io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.SeccompConfiguration seccompConfiguration) {
    this.seccompConfiguration = seccompConfiguration;
  }

  @com.fasterxml.jackson.annotation.JsonProperty("selinuxLauncherType")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String selinuxLauncherType;

  public String getSelinuxLauncherType() {
    return selinuxLauncherType;
  }

  public void setSelinuxLauncherType(String selinuxLauncherType) {
    this.selinuxLauncherType = selinuxLauncherType;
  }

  @com.fasterxml.jackson.annotation.JsonProperty("smbios")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.Smbios smbios;

  public io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.Smbios getSmbios() {
    return smbios;
  }

  public void setSmbios(io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.Smbios smbios) {
    this.smbios = smbios;
  }

  /**
   * deprecated
   */
  @com.fasterxml.jackson.annotation.JsonProperty("supportedGuestAgentVersions")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("deprecated")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private java.util.List<String> supportedGuestAgentVersions;

  public java.util.List<String> getSupportedGuestAgentVersions() {
    return supportedGuestAgentVersions;
  }

  public void setSupportedGuestAgentVersions(java.util.List<String> supportedGuestAgentVersions) {
    this.supportedGuestAgentVersions = supportedGuestAgentVersions;
  }

  /**
   * TLSConfiguration holds TLS options
   */
  @com.fasterxml.jackson.annotation.JsonProperty("tlsConfiguration")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("TLSConfiguration holds TLS options")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.TlsConfiguration tlsConfiguration;

  public io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.TlsConfiguration getTlsConfiguration() {
    return tlsConfiguration;
  }

  public void setTlsConfiguration(
      io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.TlsConfiguration tlsConfiguration) {
    this.tlsConfiguration = tlsConfiguration;
  }

  @com.fasterxml.jackson.annotation.JsonProperty("virtualMachineInstancesPerNode")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Long virtualMachineInstancesPerNode;

  public Long getVirtualMachineInstancesPerNode() {
    return virtualMachineInstancesPerNode;
  }

  public void setVirtualMachineInstancesPerNode(Long virtualMachineInstancesPerNode) {
    this.virtualMachineInstancesPerNode = virtualMachineInstancesPerNode;
  }

  /**
   * ReloadableComponentConfiguration holds all generic k8s configuration options which can be reloaded by components without
   * requiring a restart.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("webhookConfiguration")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("ReloadableComponentConfiguration holds all generic k8s configuration options which can be reloaded by components without requiring a restart.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.WebhookConfiguration webhookConfiguration;

  public io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.WebhookConfiguration getWebhookConfiguration() {
    return webhookConfiguration;
  }

  public void setWebhookConfiguration(
      io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.WebhookConfiguration webhookConfiguration) {
    this.webhookConfiguration = webhookConfiguration;
  }
}
