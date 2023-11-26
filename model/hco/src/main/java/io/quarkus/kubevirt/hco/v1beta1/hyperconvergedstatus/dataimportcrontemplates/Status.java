package io.quarkus.kubevirt.hco.v1beta1.hyperconvergedstatus.dataimportcrontemplates;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "commonTemplate", "modified" })
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
     * CommonTemplate indicates whether this is a common template (true), or a custom one (false)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("commonTemplate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CommonTemplate indicates whether this is a common template (true), or a custom one (false)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean commonTemplate;

    public Boolean getCommonTemplate() {
        return commonTemplate;
    }

    public void setCommonTemplate(Boolean commonTemplate) {
        this.commonTemplate = commonTemplate;
    }

    /**
     * Modified indicates if a common template was customized. Always false for custom templates.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modified")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Modified indicates if a common template was customized. Always false for custom templates.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean modified;

    public Boolean getModified() {
        return modified;
    }

    public void setModified(Boolean modified) {
        this.modified = modified;
    }
}
