package io.quarkiverse.kubevirt.v1.kubevirtspec.configuration;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "ciphers", "minTLSVersion" })
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
public class TlsConfiguration implements io.fabric8.kubernetes.api.model.KubernetesResource {

  @com.fasterxml.jackson.annotation.JsonProperty("ciphers")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private java.util.List<String> ciphers;

  public java.util.List<String> getCiphers() {
    return ciphers;
  }

  public void setCiphers(java.util.List<String> ciphers) {
    this.ciphers = ciphers;
  }

  public enum MinTLSVersion {

    @com.fasterxml.jackson.annotation.JsonProperty("VersionTLS10")
    VERSIONTLS10("VersionTLS10"), @com.fasterxml.jackson.annotation.JsonProperty("VersionTLS11")
    VERSIONTLS11("VersionTLS11"), @com.fasterxml.jackson.annotation.JsonProperty("VersionTLS12")
    VERSIONTLS12("VersionTLS12"), @com.fasterxml.jackson.annotation.JsonProperty("VersionTLS13")
    VERSIONTLS13("VersionTLS13");

    java.lang.String value;

    MinTLSVersion(java.lang.String value) {
      this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue()
    public java.lang.String getValue() {
      return value;
    }
  }

  /**
   * MinTLSVersion is a way to specify the minimum protocol version that is acceptable for TLS connections. Protocol versions
   * are based on the following most common TLS configurations:
   * https://ssl-config.mozilla.org/
   * Note that SSLv3.0 is not a supported protocol version due to well known vulnerabilities such as POODLE:
   * https://en.wikipedia.org/wiki/POODLE
   */
  @com.fasterxml.jackson.annotation.JsonProperty("minTLSVersion")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("MinTLSVersion is a way to specify the minimum protocol version that is acceptable for TLS connections. Protocol versions are based on the following most common TLS configurations: \n   https://ssl-config.mozilla.org/ \n Note that SSLv3.0 is not a supported protocol version due to well known vulnerabilities such as POODLE: https://en.wikipedia.org/wiki/POODLE")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private MinTLSVersion minTLSVersion;

  public MinTLSVersion getMinTLSVersion() {
    return minTLSVersion;
  }

  public void setMinTLSVersion(MinTLSVersion minTLSVersion) {
    this.minTLSVersion = minTLSVersion;
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
