package io.quarkiverse.kubevirt.v1.kubevirtspec.configuration;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "cpuAllocationRatio", "diskVerification", "featureGates", "logVerbosity",
    "memoryOvercommit", "minimumClusterTSCFrequency", "minimumReservePVCBytes", "nodeSelectors",
    "pvcTolerateLessSpaceUpToPercent", "useEmulation" })
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
public class DeveloperConfiguration implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * For each requested virtual CPU, CPUAllocationRatio defines how much physical CPU to request per VMI from the hosting
   * node. The value is in fraction of a CPU thread (or core on non-hyperthreaded nodes). For example, a value of 1 means 1
   * physical CPU thread per VMI CPU thread. A value of 100 would be 1% of a physical thread allocated for each requested VMI
   * thread. This option has no effect on VMIs that request dedicated CPUs. More information at:
   * https://kubevirt.io/user-guide/operations/node_overcommit/#node-cpu-allocation-ratio Defaults to 10
   */
  @com.fasterxml.jackson.annotation.JsonProperty("cpuAllocationRatio")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("For each requested virtual CPU, CPUAllocationRatio defines how much physical CPU to request per VMI from the hosting node. The value is in fraction of a CPU thread (or core on non-hyperthreaded nodes). For example, a value of 1 means 1 physical CPU thread per VMI CPU thread. A value of 100 would be 1% of a physical thread allocated for each requested VMI thread. This option has no effect on VMIs that request dedicated CPUs. More information at: https://kubevirt.io/user-guide/operations/node_overcommit/#node-cpu-allocation-ratio Defaults to 10")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Long cpuAllocationRatio;

  public Long getCpuAllocationRatio() {
    return cpuAllocationRatio;
  }

  public void setCpuAllocationRatio(Long cpuAllocationRatio) {
    this.cpuAllocationRatio = cpuAllocationRatio;
  }

  /**
   * DiskVerification holds container disks verification limits
   */
  @com.fasterxml.jackson.annotation.JsonProperty("diskVerification")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("DiskVerification holds container disks verification limits")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1.kubevirtspec.configuration.developerconfiguration.DiskVerification diskVerification;

  public io.quarkiverse.kubevirt.v1.kubevirtspec.configuration.developerconfiguration.DiskVerification getDiskVerification() {
    return diskVerification;
  }

  public void setDiskVerification(
      io.quarkiverse.kubevirt.v1.kubevirtspec.configuration.developerconfiguration.DiskVerification diskVerification) {
    this.diskVerification = diskVerification;
  }

  /**
   * FeatureGates is the list of experimental features to enable. Defaults to none
   */
  @com.fasterxml.jackson.annotation.JsonProperty("featureGates")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("FeatureGates is the list of experimental features to enable. Defaults to none")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private java.util.List<String> featureGates;

  public java.util.List<String> getFeatureGates() {
    return featureGates;
  }

  public void setFeatureGates(java.util.List<String> featureGates) {
    this.featureGates = featureGates;
  }

  /**
   * LogVerbosity sets log verbosity level of various components
   */
  @com.fasterxml.jackson.annotation.JsonProperty("logVerbosity")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("LogVerbosity sets log verbosity level of  various components")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1.kubevirtspec.configuration.developerconfiguration.LogVerbosity logVerbosity;

  public io.quarkiverse.kubevirt.v1.kubevirtspec.configuration.developerconfiguration.LogVerbosity getLogVerbosity() {
    return logVerbosity;
  }

  public void setLogVerbosity(
      io.quarkiverse.kubevirt.v1.kubevirtspec.configuration.developerconfiguration.LogVerbosity logVerbosity) {
    this.logVerbosity = logVerbosity;
  }

  /**
   * MemoryOvercommit is the percentage of memory we want to give VMIs compared to the amount given to its parent pod
   * (virt-launcher). For example, a value of 102 means the VMI will "see" 2% more memory than its parent pod. Values under
   * 100 are effectively "undercommits". Overcommits can lead to memory exhaustion, which in turn can lead to crashes. Use
   * carefully. Defaults to 100
   */
  @com.fasterxml.jackson.annotation.JsonProperty("memoryOvercommit")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("MemoryOvercommit is the percentage of memory we want to give VMIs compared to the amount given to its parent pod (virt-launcher). For example, a value of 102 means the VMI will \"see\" 2% more memory than its parent pod. Values under 100 are effectively \"undercommits\". Overcommits can lead to memory exhaustion, which in turn can lead to crashes. Use carefully. Defaults to 100")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Long memoryOvercommit;

  public Long getMemoryOvercommit() {
    return memoryOvercommit;
  }

  public void setMemoryOvercommit(Long memoryOvercommit) {
    this.memoryOvercommit = memoryOvercommit;
  }

  /**
   * Allow overriding the automatically determined minimum TSC frequency of the cluster and fixate the minimum to this
   * frequency.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("minimumClusterTSCFrequency")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow overriding the automatically determined minimum TSC frequency of the cluster and fixate the minimum to this frequency.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Long minimumClusterTSCFrequency;

  public Long getMinimumClusterTSCFrequency() {
    return minimumClusterTSCFrequency;
  }

  public void setMinimumClusterTSCFrequency(Long minimumClusterTSCFrequency) {
    this.minimumClusterTSCFrequency = minimumClusterTSCFrequency;
  }

  /**
   * MinimumReservePVCBytes is the amount of space, in bytes, to leave unused on disks. Defaults to 131072 (128KiB)
   */
  @com.fasterxml.jackson.annotation.JsonProperty("minimumReservePVCBytes")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("MinimumReservePVCBytes is the amount of space, in bytes, to leave unused on disks. Defaults to 131072 (128KiB)")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Long minimumReservePVCBytes;

  public Long getMinimumReservePVCBytes() {
    return minimumReservePVCBytes;
  }

  public void setMinimumReservePVCBytes(Long minimumReservePVCBytes) {
    this.minimumReservePVCBytes = minimumReservePVCBytes;
  }

  /**
   * NodeSelectors allows restricting VMI creation to nodes that match a set of labels. Defaults to none
   */
  @com.fasterxml.jackson.annotation.JsonProperty("nodeSelectors")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("NodeSelectors allows restricting VMI creation to nodes that match a set of labels. Defaults to none")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private java.util.Map<java.lang.String, String> nodeSelectors;

  public java.util.Map<java.lang.String, String> getNodeSelectors() {
    return nodeSelectors;
  }

  public void setNodeSelectors(java.util.Map<java.lang.String, String> nodeSelectors) {
    this.nodeSelectors = nodeSelectors;
  }

  /**
   * LessPVCSpaceToleration determines how much smaller, in percentage, disk PVCs are allowed to be compared to the requested
   * size (to account for various overheads). Defaults to 10
   */
  @com.fasterxml.jackson.annotation.JsonProperty("pvcTolerateLessSpaceUpToPercent")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("LessPVCSpaceToleration determines how much smaller, in percentage, disk PVCs are allowed to be compared to the requested size (to account for various overheads). Defaults to 10")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Long pvcTolerateLessSpaceUpToPercent;

  public Long getPvcTolerateLessSpaceUpToPercent() {
    return pvcTolerateLessSpaceUpToPercent;
  }

  public void setPvcTolerateLessSpaceUpToPercent(Long pvcTolerateLessSpaceUpToPercent) {
    this.pvcTolerateLessSpaceUpToPercent = pvcTolerateLessSpaceUpToPercent;
  }

  /**
   * UseEmulation can be set to true to allow fallback to software emulation in case hardware-assisted emulation is not
   * available. Defaults to false
   */
  @com.fasterxml.jackson.annotation.JsonProperty("useEmulation")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("UseEmulation can be set to true to allow fallback to software emulation in case hardware-assisted emulation is not available. Defaults to false")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Boolean useEmulation;

  public Boolean getUseEmulation() {
    return useEmulation;
  }

  public void setUseEmulation(Boolean useEmulation) {
    this.useEmulation = useEmulation;
  }

  @com.fasterxml.jackson.annotation.JsonIgnore()
  private java.util.Map<String, Object> additionalProperties = new java.util.HashMap<>();

  @com.fasterxml.jackson.annotation.JsonAnyGetter()
  public java.util.Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  @com.fasterxml.jackson.annotation.JsonAnySetter()
  public void setAdditionalProperties(java.util.Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  @com.fasterxml.jackson.annotation.JsonAnySetter()
  public void setAdditionalProperty(java.lang.String key, java.lang.Object value) {
    this.additionalProperties.put(key, value);
  }
}
