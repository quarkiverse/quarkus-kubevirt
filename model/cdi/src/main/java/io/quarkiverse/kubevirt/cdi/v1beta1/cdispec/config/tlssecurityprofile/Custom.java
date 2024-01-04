package io.quarkiverse.kubevirt.cdi.v1beta1.cdispec.config.tlssecurityprofile;

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
public class Custom implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * ciphers is used to specify the cipher algorithms that are negotiated during the TLS handshake. Operators may remove
   * entries their operands do not support. For example, to use DES-CBC3-SHA (yaml):
   * ciphers: - DES-CBC3-SHA
   */
  @com.fasterxml.jackson.annotation.JsonProperty("ciphers")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("ciphers is used to specify the cipher algorithms that are negotiated during the TLS handshake.  Operators may remove entries their operands do not support.  For example, to use DES-CBC3-SHA  (yaml): \n ciphers: - DES-CBC3-SHA")
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
   * minTLSVersion is used to specify the minimal version of the TLS protocol that is negotiated during the TLS handshake. For
   * example, to use TLS versions 1.1, 1.2 and 1.3 (yaml):
   * minTLSVersion: TLSv1.1
   * NOTE: currently the highest minTLSVersion allowed is VersionTLS12
   */
  @com.fasterxml.jackson.annotation.JsonProperty("minTLSVersion")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("minTLSVersion is used to specify the minimal version of the TLS protocol that is negotiated during the TLS handshake. For example, to use TLS versions 1.1, 1.2 and 1.3 (yaml): \n minTLSVersion: TLSv1.1 \n NOTE: currently the highest minTLSVersion allowed is VersionTLS12")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private MinTLSVersion minTLSVersion;

  public MinTLSVersion getMinTLSVersion() {
    return minTLSVersion;
  }

  public void setMinTLSVersion(MinTLSVersion minTLSVersion) {
    this.minTLSVersion = minTLSVersion;
  }
}
