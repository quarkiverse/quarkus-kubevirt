package io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.volumebackups;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "metadata", "spec" })
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
public class PersistentVolumeClaim implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Standard object's metadata. More info:
     * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.volumebackups.persistentvolumeclaim.Metadata metadata;

    public io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.volumebackups.persistentvolumeclaim.Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(
            io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.volumebackups.persistentvolumeclaim.Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * Spec defines the desired characteristics of a volume requested by a pod author. More info:
     * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
     */
    @com.fasterxml.jackson.annotation.JsonProperty("spec")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Spec defines the desired characteristics of a volume requested by a pod author. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.volumebackups.persistentvolumeclaim.Spec spec;

    public io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.volumebackups.persistentvolumeclaim.Spec getSpec() {
        return spec;
    }

    public void setSpec(
            io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.volumebackups.persistentvolumeclaim.Spec spec) {
        this.spec = spec;
    }
}
