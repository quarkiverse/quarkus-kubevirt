package io.quarkiverse.kubevirt.hostpathprovisioner.v1beta1.hostpathprovisionerstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "claimStatuses", "currentReady", "desiredReady", "name", "phase" })
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
public class StoragePoolStatuses implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The status of all the claims.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("claimStatuses")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The status of all the claims.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.hostpathprovisioner.v1beta1.hostpathprovisionerstatus.storagepoolstatuses.ClaimStatuses> claimStatuses;

    public java.util.List<io.quarkiverse.kubevirt.hostpathprovisioner.v1beta1.hostpathprovisionerstatus.storagepoolstatuses.ClaimStatuses> getClaimStatuses() {
        return claimStatuses;
    }

    public void setClaimStatuses(
            java.util.List<io.quarkiverse.kubevirt.hostpathprovisioner.v1beta1.hostpathprovisionerstatus.storagepoolstatuses.ClaimStatuses> claimStatuses) {
        this.claimStatuses = claimStatuses;
    }

    /**
     * CurrentReady is the number of currently ready replicasets.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("currentReady")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CurrentReady is the number of currently ready replicasets.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long currentReady;

    public Long getCurrentReady() {
        return currentReady;
    }

    public void setCurrentReady(Long currentReady) {
        this.currentReady = currentReady;
    }

    /**
     * DesiredReady is the number of desired ready replicasets.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("desiredReady")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DesiredReady is the number of desired ready replicasets.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long desiredReady;

    public Long getDesiredReady() {
        return desiredReady;
    }

    public void setDesiredReady(Long desiredReady) {
        this.desiredReady = desiredReady;
    }

    /**
     * Name is the name of the storage pool
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name is the name of the storage pool")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * StoragePoolPhase indicates which phase the storage pool is in.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("StoragePoolPhase indicates which phase the storage pool is in.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }
}
