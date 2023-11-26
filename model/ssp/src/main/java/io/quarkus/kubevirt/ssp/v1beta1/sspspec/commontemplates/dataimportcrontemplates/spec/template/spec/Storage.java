package io.quarkus.kubevirt.ssp.v1beta1.sspspec.commontemplates.dataimportcrontemplates.spec.template.spec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "accessModes", "dataSource", "resources", "selector", "storageClassName",
        "volumeMode", "volumeName" })
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
public class Storage implements io.fabric8.kubernetes.api.model.KubernetesResource {

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
     * This field can be used to specify either: * An existing VolumeSnapshot object (snapshot.storage.k8s.io/VolumeSnapshot) *
     * An existing PVC (PersistentVolumeClaim) * An existing custom resource that implements data population (Alpha) In order to
     * use custom resource types that implement data population, the AnyVolumeDataSource feature gate must be enabled. If the
     * provisioner or an external controller can support the specified data source, it will create a new volume based on the
     * contents of the specified data source.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataSource")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("This field can be used to specify either: * An existing VolumeSnapshot object (snapshot.storage.k8s.io/VolumeSnapshot) * An existing PVC (PersistentVolumeClaim) * An existing custom resource that implements data population (Alpha) In order to use custom resource types that implement data population, the AnyVolumeDataSource feature gate must be enabled. If the provisioner or an external controller can support the specified data source, it will create a new volume based on the contents of the specified data source.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.ssp.v1beta1.sspspec.commontemplates.dataimportcrontemplates.spec.template.spec.storage.DataSource dataSource;

    public io.quarkus.kubevirt.ssp.v1beta1.sspspec.commontemplates.dataimportcrontemplates.spec.template.spec.storage.DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(
            io.quarkus.kubevirt.ssp.v1beta1.sspspec.commontemplates.dataimportcrontemplates.spec.template.spec.storage.DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * Resources represents the minimum resources the volume should have. More info:
     * https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Resources represents the minimum resources the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.ssp.v1beta1.sspspec.commontemplates.dataimportcrontemplates.spec.template.spec.storage.Resources resources;

    public io.quarkus.kubevirt.ssp.v1beta1.sspspec.commontemplates.dataimportcrontemplates.spec.template.spec.storage.Resources getResources() {
        return resources;
    }

    public void setResources(
            io.quarkus.kubevirt.ssp.v1beta1.sspspec.commontemplates.dataimportcrontemplates.spec.template.spec.storage.Resources resources) {
        this.resources = resources;
    }

    /**
     * A label query over volumes to consider for binding.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("selector")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A label query over volumes to consider for binding.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.ssp.v1beta1.sspspec.commontemplates.dataimportcrontemplates.spec.template.spec.storage.Selector selector;

    public io.quarkus.kubevirt.ssp.v1beta1.sspspec.commontemplates.dataimportcrontemplates.spec.template.spec.storage.Selector getSelector() {
        return selector;
    }

    public void setSelector(
            io.quarkus.kubevirt.ssp.v1beta1.sspspec.commontemplates.dataimportcrontemplates.spec.template.spec.storage.Selector selector) {
        this.selector = selector;
    }

    /**
     * Name of the StorageClass required by the claim. More info:
     * https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storageClassName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String storageClassName;

    public String getStorageClassName() {
        return storageClassName;
    }

    public void setStorageClassName(String storageClassName) {
        this.storageClassName = storageClassName;
    }

    /**
     * volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in
     * claim spec.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeMode")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String volumeMode;

    public String getVolumeMode() {
        return volumeMode;
    }

    public void setVolumeMode(String volumeMode) {
        this.volumeMode = volumeMode;
    }

    /**
     * VolumeName is the binding reference to the PersistentVolume backing this claim.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("VolumeName is the binding reference to the PersistentVolume backing this claim.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String volumeName;

    public String getVolumeName() {
        return volumeName;
    }

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }
}
