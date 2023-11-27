package io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "ca", "server" })
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
public class CertConfig implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * CA configuration - CA certs are kept in the CA bundle as long as they are valid
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ca")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CA configuration - CA certs are kept in the CA bundle as long as they are valid")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.certconfig.Ca ca = io.fabric8.kubernetes.client.utils.Serialization
            .unmarshal("{\"duration\":\"48h0m0s\",\"renewBefore\":\"24h0m0s\"}",
                    io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.certconfig.Ca.class);

    public io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.certconfig.Ca getCa() {
        return ca;
    }

    public void setCa(io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.certconfig.Ca ca) {
        this.ca = ca;
    }

    /**
     * Server configuration - Certs are rotated and discarded
     */
    @com.fasterxml.jackson.annotation.JsonProperty("server")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Server configuration - Certs are rotated and discarded")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.certconfig.Server server = io.fabric8.kubernetes.client.utils.Serialization
            .unmarshal("{\"duration\":\"24h0m0s\",\"renewBefore\":\"12h0m0s\"}",
                    io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.certconfig.Server.class);

    public io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.certconfig.Server getServer() {
        return server;
    }

    public void setServer(io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.certconfig.Server server) {
        this.server = server;
    }
}
