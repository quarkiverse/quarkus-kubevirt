package io.quarkus.kubevirt.hco.v1beta1.hyperconvergedspec.dataimportcrontemplates.spec.template.spec.source;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "certConfigMap", "extraHeaders", "secretExtraHeaders", "secretRef",
        "url" })
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
public class Http implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * CertConfigMap is a configmap reference, containing a Certificate Authority(CA) public key, and a base64 encoded pem
     * certificate
     */
    @com.fasterxml.jackson.annotation.JsonProperty("certConfigMap")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CertConfigMap is a configmap reference, containing a Certificate Authority(CA) public key, and a base64 encoded pem certificate")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String certConfigMap;

    public String getCertConfigMap() {
        return certConfigMap;
    }

    public void setCertConfigMap(String certConfigMap) {
        this.certConfigMap = certConfigMap;
    }

    /**
     * ExtraHeaders is a list of strings containing extra headers to include with HTTP transfer requests
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extraHeaders")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ExtraHeaders is a list of strings containing extra headers to include with HTTP transfer requests")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> extraHeaders;

    public java.util.List<String> getExtraHeaders() {
        return extraHeaders;
    }

    public void setExtraHeaders(java.util.List<String> extraHeaders) {
        this.extraHeaders = extraHeaders;
    }

    /**
     * SecretExtraHeaders is a list of Secret references, each containing an extra HTTP header that may include sensitive
     * information
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretExtraHeaders")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SecretExtraHeaders is a list of Secret references, each containing an extra HTTP header that may include sensitive information")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> secretExtraHeaders;

    public java.util.List<String> getSecretExtraHeaders() {
        return secretExtraHeaders;
    }

    public void setSecretExtraHeaders(java.util.List<String> secretExtraHeaders) {
        this.secretExtraHeaders = secretExtraHeaders;
    }

    /**
     * SecretRef A Secret reference, the secret should contain accessKeyId (user name) base64 encoded, and secretKey (password)
     * also base64 encoded
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SecretRef A Secret reference, the secret should contain accessKeyId (user name) base64 encoded, and secretKey (password) also base64 encoded")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String secretRef;

    public String getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(String secretRef) {
        this.secretRef = secretRef;
    }

    /**
     * URL is the URL of the http(s) endpoint
     */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("URL is the URL of the http(s) endpoint")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
