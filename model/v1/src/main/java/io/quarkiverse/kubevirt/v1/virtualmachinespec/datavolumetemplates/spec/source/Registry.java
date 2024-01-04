package io.quarkiverse.kubevirt.v1.virtualmachinespec.datavolumetemplates.spec.source;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "certConfigMap", "imageStream", "pullMethod", "secretRef", "url" })
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
public class Registry implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * CertConfigMap provides a reference to the Registry certs
   */
  @com.fasterxml.jackson.annotation.JsonProperty("certConfigMap")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("CertConfigMap provides a reference to the Registry certs")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String certConfigMap;

  public String getCertConfigMap() {
    return certConfigMap;
  }

  public void setCertConfigMap(String certConfigMap) {
    this.certConfigMap = certConfigMap;
  }

  /**
   * ImageStream is the name of image stream for import
   */
  @com.fasterxml.jackson.annotation.JsonProperty("imageStream")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("ImageStream is the name of image stream for import")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String imageStream;

  public String getImageStream() {
    return imageStream;
  }

  public void setImageStream(String imageStream) {
    this.imageStream = imageStream;
  }

  /**
   * PullMethod can be either "pod" (default import), or "node" (node docker cache based import)
   */
  @com.fasterxml.jackson.annotation.JsonProperty("pullMethod")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PullMethod can be either \"pod\" (default import), or \"node\" (node docker cache based import)")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String pullMethod;

  public String getPullMethod() {
    return pullMethod;
  }

  public void setPullMethod(String pullMethod) {
    this.pullMethod = pullMethod;
  }

  /**
   * SecretRef provides the secret reference needed to access the Registry source
   */
  @com.fasterxml.jackson.annotation.JsonProperty("secretRef")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("SecretRef provides the secret reference needed to access the Registry source")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String secretRef;

  public String getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(String secretRef) {
    this.secretRef = secretRef;
  }

  /**
   * URL is the url of the registry source (starting with the scheme: docker, oci-archive)
   */
  @com.fasterxml.jackson.annotation.JsonProperty("url")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("URL is the url of the registry source (starting with the scheme: docker, oci-archive)")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String url;

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @com.fasterxml.jackson.annotation.JsonIgnore()
  private java.util.Map<String, Object> additionalProperties = new java.util.HashMap<>();

  @com.fasterxml.jackson.annotation.JsonAnyGetter()
  public java.util.Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  @com.fasterxml.jackson.annotation.JsonAnySetter()
  public void setAdditionalProperties(java.util.Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  @com.fasterxml.jackson.annotation.JsonAnySetter()
  public void setAdditionalProperty(java.lang.String key, java.lang.Object value) {
    this.additionalProperties.put(key, value);
  }
}
