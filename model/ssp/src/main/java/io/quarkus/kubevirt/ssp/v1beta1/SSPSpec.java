package io.quarkus.kubevirt.ssp.v1beta1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "commonInstancetypes", "commonTemplates", "nodeLabeller",
        "templateValidator", "tlsSecurityProfile" })
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
public class SSPSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * CommonInstancetypes is the configuration of the common-instancetypes operand
     */
    @com.fasterxml.jackson.annotation.JsonProperty("commonInstancetypes")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CommonInstancetypes is the configuration of the common-instancetypes operand")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.ssp.v1beta1.sspspec.CommonInstancetypes commonInstancetypes;

    public io.quarkus.kubevirt.ssp.v1beta1.sspspec.CommonInstancetypes getCommonInstancetypes() {
        return commonInstancetypes;
    }

    public void setCommonInstancetypes(io.quarkus.kubevirt.ssp.v1beta1.sspspec.CommonInstancetypes commonInstancetypes) {
        this.commonInstancetypes = commonInstancetypes;
    }

    /**
     * CommonTemplates is the configuration of the common templates operand
     */
    @com.fasterxml.jackson.annotation.JsonProperty("commonTemplates")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CommonTemplates is the configuration of the common templates operand")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.ssp.v1beta1.sspspec.CommonTemplates commonTemplates;

    public io.quarkus.kubevirt.ssp.v1beta1.sspspec.CommonTemplates getCommonTemplates() {
        return commonTemplates;
    }

    public void setCommonTemplates(io.quarkus.kubevirt.ssp.v1beta1.sspspec.CommonTemplates commonTemplates) {
        this.commonTemplates = commonTemplates;
    }

    /**
     * NodeLabeller is configuration of the node-labeller operand
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeLabeller")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("NodeLabeller is configuration of the node-labeller operand")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.ssp.v1beta1.sspspec.NodeLabeller nodeLabeller;

    public io.quarkus.kubevirt.ssp.v1beta1.sspspec.NodeLabeller getNodeLabeller() {
        return nodeLabeller;
    }

    public void setNodeLabeller(io.quarkus.kubevirt.ssp.v1beta1.sspspec.NodeLabeller nodeLabeller) {
        this.nodeLabeller = nodeLabeller;
    }

    /**
     * TemplateValidator is configuration of the template validator operand
     */
    @com.fasterxml.jackson.annotation.JsonProperty("templateValidator")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TemplateValidator is configuration of the template validator operand")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.ssp.v1beta1.sspspec.TemplateValidator templateValidator;

    public io.quarkus.kubevirt.ssp.v1beta1.sspspec.TemplateValidator getTemplateValidator() {
        return templateValidator;
    }

    public void setTemplateValidator(io.quarkus.kubevirt.ssp.v1beta1.sspspec.TemplateValidator templateValidator) {
        this.templateValidator = templateValidator;
    }

    /**
     * TLSSecurityProfile is a configuration for the TLS.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsSecurityProfile")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TLSSecurityProfile is a configuration for the TLS.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.ssp.v1beta1.sspspec.TlsSecurityProfile tlsSecurityProfile;

    public io.quarkus.kubevirt.ssp.v1beta1.sspspec.TlsSecurityProfile getTlsSecurityProfile() {
        return tlsSecurityProfile;
    }

    public void setTlsSecurityProfile(io.quarkus.kubevirt.ssp.v1beta1.sspspec.TlsSecurityProfile tlsSecurityProfile) {
        this.tlsSecurityProfile = tlsSecurityProfile;
    }
}
