package io.quarkiverse.kubevirt.v1alpha3.kubevirtspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "flags", "patches" })
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
public class CustomizeComponents implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Configure the value used for deployment and daemonset resources
     */
    @com.fasterxml.jackson.annotation.JsonProperty("flags")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configure the value used for deployment and daemonset resources")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.customizecomponents.Flags flags;

    public io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.customizecomponents.Flags getFlags() {
        return flags;
    }

    public void setFlags(io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.customizecomponents.Flags flags) {
        this.flags = flags;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("patches")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.customizecomponents.Patches> patches;

    public java.util.List<io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.customizecomponents.Patches> getPatches() {
        return patches;
    }

    public void setPatches(java.util.List<io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.customizecomponents.Patches> patches) {
        this.patches = patches;
    }
}
