package io.quarkus.kubevirt.hco.v1beta1.hyperconvergedspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "global", "storageClass" })
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
public class FilesystemOverhead implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Global is how much space of a Filesystem volume should be reserved for overhead. This value is used unless overridden by
     * a more specific value (per storageClass)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("global")
    @io.fabric8.generator.annotation.Pattern("^(0(?:\\.\\d{1,3})?|1)$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Global is how much space of a Filesystem volume should be reserved for overhead. This value is used unless overridden by a more specific value (per storageClass)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String global;

    public String getGlobal() {
        return global;
    }

    public void setGlobal(String global) {
        this.global = global;
    }

    /**
     * StorageClass specifies how much space of a Filesystem volume should be reserved for safety. The keys are the storageClass
     * and the values are the overhead. This value overrides the global value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storageClass")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("StorageClass specifies how much space of a Filesystem volume should be reserved for safety. The keys are the storageClass and the values are the overhead. This value overrides the global value")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> storageClass;

    public java.util.Map<java.lang.String, String> getStorageClass() {
        return storageClass;
    }

    public void setStorageClass(java.util.Map<java.lang.String, String> storageClass) {
        this.storageClass = storageClass;
    }
}
