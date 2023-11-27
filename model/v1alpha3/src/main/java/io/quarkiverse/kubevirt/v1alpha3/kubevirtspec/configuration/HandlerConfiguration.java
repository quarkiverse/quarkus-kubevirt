package io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "restClient" })
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
public class HandlerConfiguration implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * RestClient can be used to tune certain aspects of the k8s client in use.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("restClient")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RestClient can be used to tune certain aspects of the k8s client in use.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.handlerconfiguration.RestClient restClient;

    public io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.handlerconfiguration.RestClient getRestClient() {
        return restClient;
    }

    public void setRestClient(
            io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.handlerconfiguration.RestClient restClient) {
        this.restClient = restClient;
    }
}
