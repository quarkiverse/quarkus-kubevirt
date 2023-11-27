package io.quarkiverse.kubevirt.snapshot.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "conditions", "creationTime", "error", "indications", "phase",
        "readyToUse", "snapshotVolumes", "sourceUID", "virtualMachineSnapshotContentName" })
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
public class VirtualMachineSnapshotStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotstatus.Conditions> conditions;

    public java.util.List<io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotstatus.Conditions> getConditions() {
        return conditions;
    }

    public void setConditions(
            java.util.List<io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotstatus.Conditions> conditions) {
        this.conditions = conditions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("creationTime")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private java.time.ZonedDateTime creationTime;

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssVV")
    public java.time.ZonedDateTime getCreationTime() {
        return creationTime;
    }

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss[XXX][VV]")
    public void setCreationTime(java.time.ZonedDateTime creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * Error is the last error encountered during the snapshot/restore
     */
    @com.fasterxml.jackson.annotation.JsonProperty("error")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Error is the last error encountered during the snapshot/restore")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotstatus.Error error;

    public io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotstatus.Error getError() {
        return error;
    }

    public void setError(io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotstatus.Error error) {
        this.error = error;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("indications")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> indications;

    public java.util.List<String> getIndications() {
        return indications;
    }

    public void setIndications(java.util.List<String> indications) {
        this.indications = indications;
    }

    /**
     * VirtualMachineSnapshotPhase is the current phase of the VirtualMachineSnapshot
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("VirtualMachineSnapshotPhase is the current phase of the VirtualMachineSnapshot")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("readyToUse")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean readyToUse;

    public Boolean getReadyToUse() {
        return readyToUse;
    }

    public void setReadyToUse(Boolean readyToUse) {
        this.readyToUse = readyToUse;
    }

    /**
     * SnapshotVolumesLists includes the list of volumes which were included in the snapshot and volumes which were excluded
     * from the snapshot
     */
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotVolumes")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SnapshotVolumesLists includes the list of volumes which were included in the snapshot and volumes which were excluded from the snapshot")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotstatus.SnapshotVolumes snapshotVolumes;

    public io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotstatus.SnapshotVolumes getSnapshotVolumes() {
        return snapshotVolumes;
    }

    public void setSnapshotVolumes(
            io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotstatus.SnapshotVolumes snapshotVolumes) {
        this.snapshotVolumes = snapshotVolumes;
    }

    /**
     * UID is a type that holds unique ID values, including UUIDs. Because we don't ONLY use UUIDs, this is an alias to string.
     * Being a type captures intent and helps make sure that UIDs and names do not get conflated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceUID")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("UID is a type that holds unique ID values, including UUIDs.  Because we don't ONLY use UUIDs, this is an alias to string.  Being a type captures intent and helps make sure that UIDs and names do not get conflated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String sourceUID;

    public String getSourceUID() {
        return sourceUID;
    }

    public void setSourceUID(String sourceUID) {
        this.sourceUID = sourceUID;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("virtualMachineSnapshotContentName")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String virtualMachineSnapshotContentName;

    public String getVirtualMachineSnapshotContentName() {
        return virtualMachineSnapshotContentName;
    }

    public void setVirtualMachineSnapshotContentName(String virtualMachineSnapshotContentName) {
        this.virtualMachineSnapshotContentName = virtualMachineSnapshotContentName;
    }
}
