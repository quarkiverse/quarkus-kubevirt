package io.quarkiverse.kubevirt.v1.virtualmachineinstancestatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "abortRequested", "abortStatus", "completed", "endTimestamp", "failed",
        "migrationConfiguration", "migrationPolicyName", "migrationUid", "mode", "sourceNode", "startTimestamp",
        "targetAttachmentPodUID", "targetCPUSet", "targetDirectMigrationNodePorts", "targetNode", "targetNodeAddress",
        "targetNodeDomainDetected", "targetNodeTopology", "targetPod" })
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
public class MigrationState implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Indicates that the migration has been requested to abort
     */
    @com.fasterxml.jackson.annotation.JsonProperty("abortRequested")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Indicates that the migration has been requested to abort")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean abortRequested;

    public Boolean getAbortRequested() {
        return abortRequested;
    }

    public void setAbortRequested(Boolean abortRequested) {
        this.abortRequested = abortRequested;
    }

    /**
     * Indicates the final status of the live migration abortion
     */
    @com.fasterxml.jackson.annotation.JsonProperty("abortStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Indicates the final status of the live migration abortion")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String abortStatus;

    public String getAbortStatus() {
        return abortStatus;
    }

    public void setAbortStatus(String abortStatus) {
        this.abortStatus = abortStatus;
    }

    /**
     * Indicates the migration completed
     */
    @com.fasterxml.jackson.annotation.JsonProperty("completed")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Indicates the migration completed")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean completed;

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    /**
     * The time the migration action ended
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endTimestamp")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The time the migration action ended")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private java.time.ZonedDateTime endTimestamp;

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssVV")
    public java.time.ZonedDateTime getEndTimestamp() {
        return endTimestamp;
    }

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss[XXX][VV]")
    public void setEndTimestamp(java.time.ZonedDateTime endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    /**
     * Indicates that the migration failed
     */
    @com.fasterxml.jackson.annotation.JsonProperty("failed")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Indicates that the migration failed")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean failed;

    public Boolean getFailed() {
        return failed;
    }

    public void setFailed(Boolean failed) {
        this.failed = failed;
    }

    /**
     * Migration configurations to apply
     */
    @com.fasterxml.jackson.annotation.JsonProperty("migrationConfiguration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Migration configurations to apply")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1.virtualmachineinstancestatus.migrationstate.MigrationConfiguration migrationConfiguration;

    public io.quarkiverse.kubevirt.v1.virtualmachineinstancestatus.migrationstate.MigrationConfiguration getMigrationConfiguration() {
        return migrationConfiguration;
    }

    public void setMigrationConfiguration(
            io.quarkiverse.kubevirt.v1.virtualmachineinstancestatus.migrationstate.MigrationConfiguration migrationConfiguration) {
        this.migrationConfiguration = migrationConfiguration;
    }

    /**
     * Name of the migration policy. If string is empty, no policy is matched
     */
    @com.fasterxml.jackson.annotation.JsonProperty("migrationPolicyName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the migration policy. If string is empty, no policy is matched")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String migrationPolicyName;

    public String getMigrationPolicyName() {
        return migrationPolicyName;
    }

    public void setMigrationPolicyName(String migrationPolicyName) {
        this.migrationPolicyName = migrationPolicyName;
    }

    /**
     * The VirtualMachineInstanceMigration object associated with this migration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("migrationUid")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The VirtualMachineInstanceMigration object associated with this migration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String migrationUid;

    public String getMigrationUid() {
        return migrationUid;
    }

    public void setMigrationUid(String migrationUid) {
        this.migrationUid = migrationUid;
    }

    /**
     * Lets us know if the vmi is currently running pre or post copy migration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Lets us know if the vmi is currently running pre or post copy migration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String mode;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * The source node that the VMI originated on
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceNode")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The source node that the VMI originated on")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String sourceNode;

    public String getSourceNode() {
        return sourceNode;
    }

    public void setSourceNode(String sourceNode) {
        this.sourceNode = sourceNode;
    }

    /**
     * The time the migration action began
     */
    @com.fasterxml.jackson.annotation.JsonProperty("startTimestamp")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The time the migration action began")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private java.time.ZonedDateTime startTimestamp;

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssVV")
    public java.time.ZonedDateTime getStartTimestamp() {
        return startTimestamp;
    }

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss[XXX][VV]")
    public void setStartTimestamp(java.time.ZonedDateTime startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    /**
     * The UID of the target attachment pod for hotplug volumes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetAttachmentPodUID")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The UID of the target attachment pod for hotplug volumes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String targetAttachmentPodUID;

    public String getTargetAttachmentPodUID() {
        return targetAttachmentPodUID;
    }

    public void setTargetAttachmentPodUID(String targetAttachmentPodUID) {
        this.targetAttachmentPodUID = targetAttachmentPodUID;
    }

    /**
     * If the VMI requires dedicated CPUs, this field will hold the dedicated CPU set on the target node
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetCPUSet")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If the VMI requires dedicated CPUs, this field will hold the dedicated CPU set on the target node")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<Long> targetCPUSet;

    public java.util.List<Long> getTargetCPUSet() {
        return targetCPUSet;
    }

    public void setTargetCPUSet(java.util.List<Long> targetCPUSet) {
        this.targetCPUSet = targetCPUSet;
    }

    /**
     * The list of ports opened for live migration on the destination node
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetDirectMigrationNodePorts")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The list of ports opened for live migration on the destination node")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, Long> targetDirectMigrationNodePorts;

    public java.util.Map<java.lang.String, Long> getTargetDirectMigrationNodePorts() {
        return targetDirectMigrationNodePorts;
    }

    public void setTargetDirectMigrationNodePorts(java.util.Map<java.lang.String, Long> targetDirectMigrationNodePorts) {
        this.targetDirectMigrationNodePorts = targetDirectMigrationNodePorts;
    }

    /**
     * The target node that the VMI is moving to
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetNode")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The target node that the VMI is moving to")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String targetNode;

    public String getTargetNode() {
        return targetNode;
    }

    public void setTargetNode(String targetNode) {
        this.targetNode = targetNode;
    }

    /**
     * The address of the target node to use for the migration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetNodeAddress")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The address of the target node to use for the migration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String targetNodeAddress;

    public String getTargetNodeAddress() {
        return targetNodeAddress;
    }

    public void setTargetNodeAddress(String targetNodeAddress) {
        this.targetNodeAddress = targetNodeAddress;
    }

    /**
     * The Target Node has seen the Domain Start Event
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetNodeDomainDetected")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The Target Node has seen the Domain Start Event")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean targetNodeDomainDetected;

    public Boolean getTargetNodeDomainDetected() {
        return targetNodeDomainDetected;
    }

    public void setTargetNodeDomainDetected(Boolean targetNodeDomainDetected) {
        this.targetNodeDomainDetected = targetNodeDomainDetected;
    }

    /**
     * If the VMI requires dedicated CPUs, this field will hold the numa topology on the target node
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetNodeTopology")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If the VMI requires dedicated CPUs, this field will hold the numa topology on the target node")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String targetNodeTopology;

    public String getTargetNodeTopology() {
        return targetNodeTopology;
    }

    public void setTargetNodeTopology(String targetNodeTopology) {
        this.targetNodeTopology = targetNodeTopology;
    }

    /**
     * The target pod that the VMI is moving to
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetPod")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The target pod that the VMI is moving to")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String targetPod;

    public String getTargetPod() {
        return targetPod;
    }

    public void setTargetPod(String targetPod) {
        this.targetPod = targetPod;
    }
}
