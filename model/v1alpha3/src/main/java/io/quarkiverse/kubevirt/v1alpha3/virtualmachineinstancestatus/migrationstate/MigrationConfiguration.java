package io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancestatus.migrationstate;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "allowAutoConverge", "allowPostCopy", "bandwidthPerMigration",
    "completionTimeoutPerGiB", "disableTLS", "network", "nodeDrainTaintKey", "parallelMigrationsPerCluster",
    "parallelOutboundMigrationsPerNode", "progressTimeout", "unsafeMigrationOverride" })
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
public class MigrationConfiguration implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * AllowAutoConverge allows the platform to compromise performance/availability of VMIs to guarantee successful VMI live
   * migrations. Defaults to false
   */
  @com.fasterxml.jackson.annotation.JsonProperty("allowAutoConverge")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("AllowAutoConverge allows the platform to compromise performance/availability of VMIs to guarantee successful VMI live migrations. Defaults to false")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Boolean allowAutoConverge;

  public Boolean getAllowAutoConverge() {
    return allowAutoConverge;
  }

  public void setAllowAutoConverge(Boolean allowAutoConverge) {
    this.allowAutoConverge = allowAutoConverge;
  }

  /**
   * AllowPostCopy enables post-copy live migrations. Such migrations allow even the busiest VMIs to successfully
   * live-migrate. However, events like a network failure can cause a VMI crash. If set to true, migrations will still start
   * in pre-copy, but switch to post-copy when CompletionTimeoutPerGiB triggers. Defaults to false
   */
  @com.fasterxml.jackson.annotation.JsonProperty("allowPostCopy")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("AllowPostCopy enables post-copy live migrations. Such migrations allow even the busiest VMIs to successfully live-migrate. However, events like a network failure can cause a VMI crash. If set to true, migrations will still start in pre-copy, but switch to post-copy when CompletionTimeoutPerGiB triggers. Defaults to false")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Boolean allowPostCopy;

  public Boolean getAllowPostCopy() {
    return allowPostCopy;
  }

  public void setAllowPostCopy(Boolean allowPostCopy) {
    this.allowPostCopy = allowPostCopy;
  }

  /**
   * BandwidthPerMigration limits the amount of network bandwith live migrations are allowed to use. The value is in quantity
   * per second. Defaults to 0 (no limit)
   */
  @com.fasterxml.jackson.annotation.JsonProperty("bandwidthPerMigration")
  @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("BandwidthPerMigration limits the amount of network bandwith live migrations are allowed to use. The value is in quantity per second. Defaults to 0 (no limit)")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.fabric8.kubernetes.api.model.IntOrString bandwidthPerMigration;

  public io.fabric8.kubernetes.api.model.IntOrString getBandwidthPerMigration() {
    return bandwidthPerMigration;
  }

  public void setBandwidthPerMigration(io.fabric8.kubernetes.api.model.IntOrString bandwidthPerMigration) {
    this.bandwidthPerMigration = bandwidthPerMigration;
  }

  /**
   * CompletionTimeoutPerGiB is the maximum number of seconds per GiB a migration is allowed to take. If a live-migration
   * takes longer to migrate than this value multiplied by the size of the VMI, the migration will be cancelled, unless
   * AllowPostCopy is true. Defaults to 800
   */
  @com.fasterxml.jackson.annotation.JsonProperty("completionTimeoutPerGiB")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("CompletionTimeoutPerGiB is the maximum number of seconds per GiB a migration is allowed to take. If a live-migration takes longer to migrate than this value multiplied by the size of the VMI, the migration will be cancelled, unless AllowPostCopy is true. Defaults to 800")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Long completionTimeoutPerGiB;

  public Long getCompletionTimeoutPerGiB() {
    return completionTimeoutPerGiB;
  }

  public void setCompletionTimeoutPerGiB(Long completionTimeoutPerGiB) {
    this.completionTimeoutPerGiB = completionTimeoutPerGiB;
  }

  /**
   * When set to true, DisableTLS will disable the additional layer of live migration encryption provided by KubeVirt. This is
   * usually a bad idea. Defaults to false
   */
  @com.fasterxml.jackson.annotation.JsonProperty("disableTLS")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("When set to true, DisableTLS will disable the additional layer of live migration encryption provided by KubeVirt. This is usually a bad idea. Defaults to false")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Boolean disableTLS;

  public Boolean getDisableTLS() {
    return disableTLS;
  }

  public void setDisableTLS(Boolean disableTLS) {
    this.disableTLS = disableTLS;
  }

  /**
   * Network is the name of the CNI network to use for live migrations. By default, migrations go through the pod network.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("network")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Network is the name of the CNI network to use for live migrations. By default, migrations go through the pod network.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String network;

  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }

  /**
   * NodeDrainTaintKey defines the taint key that indicates a node should be drained. Note: this option relies on the
   * deprecated node taint feature. Default: kubevirt.io/drain
   */
  @com.fasterxml.jackson.annotation.JsonProperty("nodeDrainTaintKey")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("NodeDrainTaintKey defines the taint key that indicates a node should be drained. Note: this option relies on the deprecated node taint feature. Default: kubevirt.io/drain")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String nodeDrainTaintKey;

  public String getNodeDrainTaintKey() {
    return nodeDrainTaintKey;
  }

  public void setNodeDrainTaintKey(String nodeDrainTaintKey) {
    this.nodeDrainTaintKey = nodeDrainTaintKey;
  }

  /**
   * ParallelMigrationsPerCluster is the total number of concurrent live migrations allowed cluster-wide. Defaults to 5
   */
  @com.fasterxml.jackson.annotation.JsonProperty("parallelMigrationsPerCluster")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("ParallelMigrationsPerCluster is the total number of concurrent live migrations allowed cluster-wide. Defaults to 5")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Integer parallelMigrationsPerCluster;

  public Integer getParallelMigrationsPerCluster() {
    return parallelMigrationsPerCluster;
  }

  public void setParallelMigrationsPerCluster(Integer parallelMigrationsPerCluster) {
    this.parallelMigrationsPerCluster = parallelMigrationsPerCluster;
  }

  /**
   * ParallelOutboundMigrationsPerNode is the maximum number of concurrent outgoing live migrations allowed per node. Defaults
   * to 2
   */
  @com.fasterxml.jackson.annotation.JsonProperty("parallelOutboundMigrationsPerNode")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("ParallelOutboundMigrationsPerNode is the maximum number of concurrent outgoing live migrations allowed per node. Defaults to 2")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Integer parallelOutboundMigrationsPerNode;

  public Integer getParallelOutboundMigrationsPerNode() {
    return parallelOutboundMigrationsPerNode;
  }

  public void setParallelOutboundMigrationsPerNode(Integer parallelOutboundMigrationsPerNode) {
    this.parallelOutboundMigrationsPerNode = parallelOutboundMigrationsPerNode;
  }

  /**
   * ProgressTimeout is the maximum number of seconds a live migration is allowed to make no progress. Hitting this timeout
   * means a migration transferred 0 data for that many seconds. The migration is then considered stuck and therefore
   * cancelled. Defaults to 150
   */
  @com.fasterxml.jackson.annotation.JsonProperty("progressTimeout")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("ProgressTimeout is the maximum number of seconds a live migration is allowed to make no progress. Hitting this timeout means a migration transferred 0 data for that many seconds. The migration is then considered stuck and therefore cancelled. Defaults to 150")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Long progressTimeout;

  public Long getProgressTimeout() {
    return progressTimeout;
  }

  public void setProgressTimeout(Long progressTimeout) {
    this.progressTimeout = progressTimeout;
  }

  /**
   * UnsafeMigrationOverride allows live migrations to occur even if the compatibility check indicates the migration will be
   * unsafe to the guest. Defaults to false
   */
  @com.fasterxml.jackson.annotation.JsonProperty("unsafeMigrationOverride")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("UnsafeMigrationOverride allows live migrations to occur even if the compatibility check indicates the migration will be unsafe to the guest. Defaults to false")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Boolean unsafeMigrationOverride;

  public Boolean getUnsafeMigrationOverride() {
    return unsafeMigrationOverride;
  }

  public void setUnsafeMigrationOverride(Boolean unsafeMigrationOverride) {
    this.unsafeMigrationOverride = unsafeMigrationOverride;
  }
}
