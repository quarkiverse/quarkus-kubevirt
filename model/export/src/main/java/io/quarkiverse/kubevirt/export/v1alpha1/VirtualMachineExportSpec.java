package io.quarkiverse.kubevirt.export.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "source", "tokenSecretRef", "ttlDuration" })
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
public class VirtualMachineExportSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * TypedLocalObjectReference contains enough information to let you locate the typed referenced object inside the same
     * namespace.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TypedLocalObjectReference contains enough information to let you locate the typed referenced object inside the same namespace.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.export.v1alpha1.virtualmachineexportspec.Source source;

    public io.quarkiverse.kubevirt.export.v1alpha1.virtualmachineexportspec.Source getSource() {
        return source;
    }

    public void setSource(io.quarkiverse.kubevirt.export.v1alpha1.virtualmachineexportspec.Source source) {
        this.source = source;
    }

    /**
     * TokenSecretRef is the name of the custom-defined secret that contains the token used by the export server pod
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tokenSecretRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TokenSecretRef is the name of the custom-defined secret that contains the token used by the export server pod")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String tokenSecretRef;

    public String getTokenSecretRef() {
        return tokenSecretRef;
    }

    public void setTokenSecretRef(String tokenSecretRef) {
        this.tokenSecretRef = tokenSecretRef;
    }

    /**
     * ttlDuration limits the lifetime of an export If this field is set, after this duration has passed from counting from
     * CreationTimestamp, the export is eligible to be automatically deleted. If this field is omitted, a reasonable default is
     * applied.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ttlDuration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ttlDuration limits the lifetime of an export If this field is set, after this duration has passed from counting from CreationTimestamp, the export is eligible to be automatically deleted. If this field is omitted, a reasonable default is applied.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String ttlDuration;

    public String getTtlDuration() {
        return ttlDuration;
    }

    public void setTtlDuration(String ttlDuration) {
        this.ttlDuration = ttlDuration;
    }
}
