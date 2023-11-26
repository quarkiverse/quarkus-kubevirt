package io.quarkus.kubevirt.cdi.v1beta1.cdispec;

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
     * CA configuration CA certs are kept in the CA bundle as long as they are valid
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ca")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CA configuration CA certs are kept in the CA bundle as long as they are valid")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.cdi.v1beta1.cdispec.certconfig.Ca ca;

    public io.quarkus.kubevirt.cdi.v1beta1.cdispec.certconfig.Ca getCa() {
        return ca;
    }

    public void setCa(io.quarkus.kubevirt.cdi.v1beta1.cdispec.certconfig.Ca ca) {
        this.ca = ca;
    }

    /**
     * Server configuration Certs are rotated and discarded
     */
    @com.fasterxml.jackson.annotation.JsonProperty("server")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Server configuration Certs are rotated and discarded")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.cdi.v1beta1.cdispec.certconfig.Server server;

    public io.quarkus.kubevirt.cdi.v1beta1.cdispec.certconfig.Server getServer() {
        return server;
    }

    public void setServer(io.quarkus.kubevirt.cdi.v1beta1.cdispec.certconfig.Server server) {
        this.server = server;
    }
}
