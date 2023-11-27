package io.quarkiverse.kubevirt.v1.virtualmachinestatus.volumerequests.addvolumeoptions;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "dataVolume", "persistentVolumeClaim" })
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
public class VolumeSource implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * DataVolume represents the dynamic creation a PVC for this volume as well as the process of populating that PVC with a
     * disk image.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataVolume")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DataVolume represents the dynamic creation a PVC for this volume as well as the process of populating that PVC with a disk image.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1.virtualmachinestatus.volumerequests.addvolumeoptions.volumesource.DataVolume dataVolume;

    public io.quarkiverse.kubevirt.v1.virtualmachinestatus.volumerequests.addvolumeoptions.volumesource.DataVolume getDataVolume() {
        return dataVolume;
    }

    public void setDataVolume(
            io.quarkiverse.kubevirt.v1.virtualmachinestatus.volumerequests.addvolumeoptions.volumesource.DataVolume dataVolume) {
        this.dataVolume = dataVolume;
    }

    /**
     * PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. Directly
     * attached to the vmi via qemu. More info:
     * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
     */
    @com.fasterxml.jackson.annotation.JsonProperty("persistentVolumeClaim")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. Directly attached to the vmi via qemu. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1.virtualmachinestatus.volumerequests.addvolumeoptions.volumesource.PersistentVolumeClaim persistentVolumeClaim;

    public io.quarkiverse.kubevirt.v1.virtualmachinestatus.volumerequests.addvolumeoptions.volumesource.PersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(
            io.quarkiverse.kubevirt.v1.virtualmachinestatus.volumerequests.addvolumeoptions.volumesource.PersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }
}
