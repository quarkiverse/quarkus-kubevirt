package io.quarkus.kubevirt.ssp.v1beta1.sspspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "dataImportCronTemplates", "namespace" })
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
public class CommonTemplates implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * DataImportCronTemplates defines a list of DataImportCrons managed by the SSP Operator. This is intended for images used
     * by CommonTemplates.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataImportCronTemplates")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DataImportCronTemplates defines a list of DataImportCrons managed by the SSP Operator. This is intended for images used by CommonTemplates.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkus.kubevirt.ssp.v1beta1.sspspec.commontemplates.DataImportCronTemplates> dataImportCronTemplates;

    public java.util.List<io.quarkus.kubevirt.ssp.v1beta1.sspspec.commontemplates.DataImportCronTemplates> getDataImportCronTemplates() {
        return dataImportCronTemplates;
    }

    public void setDataImportCronTemplates(
            java.util.List<io.quarkus.kubevirt.ssp.v1beta1.sspspec.commontemplates.DataImportCronTemplates> dataImportCronTemplates) {
        this.dataImportCronTemplates = dataImportCronTemplates;
    }

    /**
     * Namespace is the k8s namespace where CommonTemplates should be installed
     */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    @io.fabric8.generator.annotation.Required()
    @io.fabric8.generator.annotation.Pattern("^[a-z0-9]([-a-z0-9]*[a-z0-9])?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Namespace is the k8s namespace where CommonTemplates should be installed")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String namespace;

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
}
