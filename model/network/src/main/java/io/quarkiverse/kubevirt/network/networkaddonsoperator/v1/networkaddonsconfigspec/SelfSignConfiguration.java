package io.quarkiverse.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "caOverlapInterval", "caRotateInterval", "certOverlapInterval",
        "certRotateInterval" })
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
public class SelfSignConfiguration implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * CAOverlapInterval defines the duration where expired CA certificate can overlap with new one, in order to allow fluent CA
     * rotation transitioning
     */
    @com.fasterxml.jackson.annotation.JsonProperty("caOverlapInterval")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CAOverlapInterval defines the duration where expired CA certificate can overlap with new one, in order to allow fluent CA rotation transitioning")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String caOverlapInterval;

    public String getCaOverlapInterval() {
        return caOverlapInterval;
    }

    public void setCaOverlapInterval(String caOverlapInterval) {
        this.caOverlapInterval = caOverlapInterval;
    }

    /**
     * CARotateInterval defines duration for CA expiration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("caRotateInterval")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CARotateInterval defines duration for CA expiration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String caRotateInterval;

    public String getCaRotateInterval() {
        return caRotateInterval;
    }

    public void setCaRotateInterval(String caRotateInterval) {
        this.caRotateInterval = caRotateInterval;
    }

    /**
     * CertOverlapInterval defines the duration where expired service certificate can overlap with new one, in order to allow
     * fluent service rotation transitioning
     */
    @com.fasterxml.jackson.annotation.JsonProperty("certOverlapInterval")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CertOverlapInterval defines the duration where expired service certificate can overlap with new one, in order to allow fluent service rotation transitioning")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String certOverlapInterval;

    public String getCertOverlapInterval() {
        return certOverlapInterval;
    }

    public void setCertOverlapInterval(String certOverlapInterval) {
        this.certOverlapInterval = certOverlapInterval;
    }

    /**
     * CertRotateInterval defines duration for of service certificate expiration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("certRotateInterval")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CertRotateInterval defines duration for of service certificate expiration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String certRotateInterval;

    public String getCertRotateInterval() {
        return certRotateInterval;
    }

    public void setCertRotateInterval(String certRotateInterval) {
        this.certRotateInterval = certRotateInterval;
    }
}
