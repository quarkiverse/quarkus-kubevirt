package io.quarkus.kubevirt.hco.v1beta1.hyperconvergedspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "allowAutoConverge", "allowPostCopy", "bandwidthPerMigration",
        "completionTimeoutPerGiB", "network", "parallelMigrationsPerCluster", "parallelOutboundMigrationsPerNode",
        "progressTimeout" })
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
public class LiveMigrationConfig implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * AllowAutoConverge allows the platform to compromise performance/availability of VMIs to guarantee successful VMI live
     * migrations. Defaults to false
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowAutoConverge")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AllowAutoConverge allows the platform to compromise performance/availability of VMIs to guarantee successful VMI live migrations. Defaults to false")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean allowAutoConverge = false;

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
    private Boolean allowPostCopy = false;

    public Boolean getAllowPostCopy() {
        return allowPostCopy;
    }

    public void setAllowPostCopy(Boolean allowPostCopy) {
        this.allowPostCopy = allowPostCopy;
    }

    /**
     * Bandwidth limit of each migration, in MiB/s.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bandwidthPerMigration")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Bandwidth limit of each migration, in MiB/s.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String bandwidthPerMigration;

    public String getBandwidthPerMigration() {
        return bandwidthPerMigration;
    }

    public void setBandwidthPerMigration(String bandwidthPerMigration) {
        this.bandwidthPerMigration = bandwidthPerMigration;
    }

    /**
     * The migration will be canceled if it has not completed in this time, in seconds per GiB of memory. For example, a virtual
     * machine instance with 6GiB memory will timeout if it has not completed migration in 4800 seconds. If the Migration Method
     * is BlockMigration, the size of the migrating disks is included in the calculation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("completionTimeoutPerGiB")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The migration will be canceled if it has not completed in this time, in seconds per GiB of memory. For example, a virtual machine instance with 6GiB memory will timeout if it has not completed migration in 4800 seconds. If the Migration Method is BlockMigration, the size of the migrating disks is included in the calculation.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long completionTimeoutPerGiB = 800L;

    public Long getCompletionTimeoutPerGiB() {
        return completionTimeoutPerGiB;
    }

    public void setCompletionTimeoutPerGiB(Long completionTimeoutPerGiB) {
        this.completionTimeoutPerGiB = completionTimeoutPerGiB;
    }

    /**
     * The migrations will be performed over a dedicated multus network to minimize disruption to tenant workloads due to
     * network saturation when VM live migrations are triggered.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("network")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The migrations will be performed over a dedicated multus network to minimize disruption to tenant workloads due to network saturation when VM live migrations are triggered.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String network;

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    /**
     * Number of migrations running in parallel in the cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parallelMigrationsPerCluster")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Number of migrations running in parallel in the cluster.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer parallelMigrationsPerCluster = 5;

    public Integer getParallelMigrationsPerCluster() {
        return parallelMigrationsPerCluster;
    }

    public void setParallelMigrationsPerCluster(Integer parallelMigrationsPerCluster) {
        this.parallelMigrationsPerCluster = parallelMigrationsPerCluster;
    }

    /**
     * Maximum number of outbound migrations per node.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parallelOutboundMigrationsPerNode")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Maximum number of outbound migrations per node.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer parallelOutboundMigrationsPerNode = 2;

    public Integer getParallelOutboundMigrationsPerNode() {
        return parallelOutboundMigrationsPerNode;
    }

    public void setParallelOutboundMigrationsPerNode(Integer parallelOutboundMigrationsPerNode) {
        this.parallelOutboundMigrationsPerNode = parallelOutboundMigrationsPerNode;
    }

    /**
     * The migration will be canceled if memory copy fails to make progress in this time, in seconds.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("progressTimeout")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The migration will be canceled if memory copy fails to make progress in this time, in seconds.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long progressTimeout = 150L;

    public Long getProgressTimeout() {
        return progressTimeout;
    }

    public void setProgressTimeout(Long progressTimeout) {
        this.progressTimeout = progressTimeout;
    }
}
