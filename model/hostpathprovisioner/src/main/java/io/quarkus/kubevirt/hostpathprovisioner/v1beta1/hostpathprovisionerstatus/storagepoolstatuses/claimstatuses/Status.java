package io.quarkus.kubevirt.hostpathprovisioner.v1beta1.hostpathprovisionerstatus.storagepoolstatuses.claimstatuses;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "accessModes", "allocatedResources", "capacity", "conditions", "phase",
        "resizeStatus" })
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
public class Status implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * accessModes contains the actual access modes the volume backing the PVC has. More info:
     * https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accessModes")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("accessModes contains the actual access modes the volume backing the PVC has. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> accessModes;

    public java.util.List<String> getAccessModes() {
        return accessModes;
    }

    public void setAccessModes(java.util.List<String> accessModes) {
        this.accessModes = accessModes;
    }

    /**
     * allocatedResources is the storage resource within AllocatedResources tracks the capacity allocated to a PVC. It may be
     * larger than the actual capacity when a volume expansion operation is requested. For storage quota, the larger value from
     * allocatedResources and PVC.spec.resources is used. If allocatedResources is not set, PVC.spec.resources alone is used for
     * quota calculation. If a volume expansion capacity request is lowered, allocatedResources is only lowered if there are no
     * expansion operations in progress and if the actual volume capacity is equal or lower than the requested capacity. This is
     * an alpha field and requires enabling RecoverVolumeExpansionFailure feature.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allocatedResources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("allocatedResources is the storage resource within AllocatedResources tracks the capacity allocated to a PVC. It may be larger than the actual capacity when a volume expansion operation is requested. For storage quota, the larger value from allocatedResources and PVC.spec.resources is used. If allocatedResources is not set, PVC.spec.resources alone is used for quota calculation. If a volume expansion capacity request is lowered, allocatedResources is only lowered if there are no expansion operations in progress and if the actual volume capacity is equal or lower than the requested capacity. This is an alpha field and requires enabling RecoverVolumeExpansionFailure feature.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, io.fabric8.kubernetes.api.model.IntOrString> allocatedResources;

    public java.util.Map<java.lang.String, io.fabric8.kubernetes.api.model.IntOrString> getAllocatedResources() {
        return allocatedResources;
    }

    public void setAllocatedResources(
            java.util.Map<java.lang.String, io.fabric8.kubernetes.api.model.IntOrString> allocatedResources) {
        this.allocatedResources = allocatedResources;
    }

    /**
     * capacity represents the actual resources of the underlying volume.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("capacity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("capacity represents the actual resources of the underlying volume.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, io.fabric8.kubernetes.api.model.IntOrString> capacity;

    public java.util.Map<java.lang.String, io.fabric8.kubernetes.api.model.IntOrString> getCapacity() {
        return capacity;
    }

    public void setCapacity(java.util.Map<java.lang.String, io.fabric8.kubernetes.api.model.IntOrString> capacity) {
        this.capacity = capacity;
    }

    /**
     * conditions is the current Condition of persistent volume claim. If underlying persistent volume is being resized then the
     * Condition will be set to 'ResizeStarted'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("conditions is the current Condition of persistent volume claim. If underlying persistent volume is being resized then the Condition will be set to 'ResizeStarted'.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkus.kubevirt.hostpathprovisioner.v1beta1.hostpathprovisionerstatus.storagepoolstatuses.claimstatuses.status.Conditions> conditions;

    public java.util.List<io.quarkus.kubevirt.hostpathprovisioner.v1beta1.hostpathprovisionerstatus.storagepoolstatuses.claimstatuses.status.Conditions> getConditions() {
        return conditions;
    }

    public void setConditions(
            java.util.List<io.quarkus.kubevirt.hostpathprovisioner.v1beta1.hostpathprovisionerstatus.storagepoolstatuses.claimstatuses.status.Conditions> conditions) {
        this.conditions = conditions;
    }

    /**
     * phase represents the current phase of PersistentVolumeClaim.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("phase represents the current phase of PersistentVolumeClaim.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * resizeStatus stores status of resize operation. ResizeStatus is not set by default but when expansion is complete
     * resizeStatus is set to empty string by resize controller or kubelet. This is an alpha field and requires enabling
     * RecoverVolumeExpansionFailure feature.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resizeStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("resizeStatus stores status of resize operation. ResizeStatus is not set by default but when expansion is complete resizeStatus is set to empty string by resize controller or kubelet. This is an alpha field and requires enabling RecoverVolumeExpansionFailure feature.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String resizeStatus;

    public String getResizeStatus() {
        return resizeStatus;
    }

    public void setResizeStatus(String resizeStatus) {
        this.resizeStatus = resizeStatus;
    }
}
