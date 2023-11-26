package io.quarkus.kubevirt.v1.virtualmachineinstancestatus.volumestatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "accessModes", "capacity", "filesystemOverhead", "preallocated",
        "requests", "volumeMode" })
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
public class PersistentVolumeClaimInfo implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * AccessModes contains the desired access modes the volume should have. More info:
     * https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accessModes")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AccessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> accessModes;

    public java.util.List<String> getAccessModes() {
        return accessModes;
    }

    public void setAccessModes(java.util.List<String> accessModes) {
        this.accessModes = accessModes;
    }

    /**
     * Capacity represents the capacity set on the corresponding PVC status
     */
    @com.fasterxml.jackson.annotation.JsonProperty("capacity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Capacity represents the capacity set on the corresponding PVC status")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, io.fabric8.kubernetes.api.model.IntOrString> capacity;

    public java.util.Map<java.lang.String, io.fabric8.kubernetes.api.model.IntOrString> getCapacity() {
        return capacity;
    }

    public void setCapacity(java.util.Map<java.lang.String, io.fabric8.kubernetes.api.model.IntOrString> capacity) {
        this.capacity = capacity;
    }

    /**
     * Percentage of filesystem's size to be reserved when resizing the PVC
     */
    @com.fasterxml.jackson.annotation.JsonProperty("filesystemOverhead")
    @io.fabric8.generator.annotation.Pattern("^(0(?:\\.\\d{1,3})?|1)$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Percentage of filesystem's size to be reserved when resizing the PVC")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String filesystemOverhead;

    public String getFilesystemOverhead() {
        return filesystemOverhead;
    }

    public void setFilesystemOverhead(String filesystemOverhead) {
        this.filesystemOverhead = filesystemOverhead;
    }

    /**
     * Preallocated indicates if the PVC's storage is preallocated or not
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preallocated")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Preallocated indicates if the PVC's storage is preallocated or not")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean preallocated;

    public Boolean getPreallocated() {
        return preallocated;
    }

    public void setPreallocated(Boolean preallocated) {
        this.preallocated = preallocated;
    }

    /**
     * Requests represents the resources requested by the corresponding PVC spec
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requests")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Requests represents the resources requested by the corresponding PVC spec")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, io.fabric8.kubernetes.api.model.IntOrString> requests;

    public java.util.Map<java.lang.String, io.fabric8.kubernetes.api.model.IntOrString> getRequests() {
        return requests;
    }

    public void setRequests(java.util.Map<java.lang.String, io.fabric8.kubernetes.api.model.IntOrString> requests) {
        this.requests = requests;
    }

    /**
     * VolumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in
     * claim spec.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeMode")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("VolumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String volumeMode;

    public String getVolumeMode() {
        return volumeMode;
    }

    public void setVolumeMode(String volumeMode) {
        this.volumeMode = volumeMode;
    }
}
