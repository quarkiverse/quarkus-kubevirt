package io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.apiconfiguration;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "rateLimiter" })
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
public class RestClient implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * RateLimiter allows selecting and configuring different rate limiters for the k8s client.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rateLimiter")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RateLimiter allows selecting and configuring different rate limiters for the k8s client.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.apiconfiguration.restclient.RateLimiter rateLimiter;

    public io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.apiconfiguration.restclient.RateLimiter getRateLimiter() {
        return rateLimiter;
    }

    public void setRateLimiter(
            io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.configuration.apiconfiguration.restclient.RateLimiter rateLimiter) {
        this.rateLimiter = rateLimiter;
    }
}
