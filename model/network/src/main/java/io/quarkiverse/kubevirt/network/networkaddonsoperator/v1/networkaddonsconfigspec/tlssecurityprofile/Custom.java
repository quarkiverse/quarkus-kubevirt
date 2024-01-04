package io.quarkiverse.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.tlssecurityprofile;

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

  public enum Ciphers {

    @com.fasterxml.jackson.annotation.JsonProperty("TLS_AES_128_GCM_SHA256")
    TLS_AES_128_GCM_SHA256("TLS_AES_128_GCM_SHA256"), @com.fasterxml.jackson.annotation.JsonProperty("TLS_AES_256_GCM_SHA384")
    TLS_AES_256_GCM_SHA384(
        "TLS_AES_256_GCM_SHA384"), @com.fasterxml.jackson.annotation.JsonProperty("TLS_CHACHA20_POLY1305_SHA256")
    TLS_CHACHA20_POLY1305_SHA256(
        "TLS_CHACHA20_POLY1305_SHA256"), @com.fasterxml.jackson.annotation.JsonProperty("ECDHE-ECDSA-AES128-GCM-SHA256")
    ECDHEECDSAAES128GCMSHA256(
        "ECDHE-ECDSA-AES128-GCM-SHA256"), @com.fasterxml.jackson.annotation.JsonProperty("ECDHE-RSA-AES128-GCM-SHA256")
    ECDHERSAAES128GCMSHA256(
        "ECDHE-RSA-AES128-GCM-SHA256"), @com.fasterxml.jackson.annotation.JsonProperty("ECDHE-ECDSA-AES256-GCM-SHA384")
    ECDHEECDSAAES256GCMSHA384(
        "ECDHE-ECDSA-AES256-GCM-SHA384"), @com.fasterxml.jackson.annotation.JsonProperty("ECDHE-RSA-AES256-GCM-SHA384")
    ECDHERSAAES256GCMSHA384(
        "ECDHE-RSA-AES256-GCM-SHA384"), @com.fasterxml.jackson.annotation.JsonProperty("ECDHE-ECDSA-CHACHA20-POLY1305")
    ECDHEECDSACHACHA20POLY1305(
        "ECDHE-ECDSA-CHACHA20-POLY1305"), @com.fasterxml.jackson.annotation.JsonProperty("ECDHE-RSA-CHACHA20-POLY1305")
    ECDHERSACHACHA20POLY1305(
        "ECDHE-RSA-CHACHA20-POLY1305"), @com.fasterxml.jackson.annotation.JsonProperty("DHE-RSA-AES128-GCM-SHA256")
    DHERSAAES128GCMSHA256(
        "DHE-RSA-AES128-GCM-SHA256"), @com.fasterxml.jackson.annotation.JsonProperty("DHE-RSA-AES256-GCM-SHA384")
    DHERSAAES256GCMSHA384(
        "DHE-RSA-AES256-GCM-SHA384"), @com.fasterxml.jackson.annotation.JsonProperty("DHE-RSA-CHACHA20-POLY1305")
    DHERSACHACHA20POLY1305(
        "DHE-RSA-CHACHA20-POLY1305"), @com.fasterxml.jackson.annotation.JsonProperty("ECDHE-ECDSA-AES128-SHA256")
    ECDHEECDSAAES128SHA256(
        "ECDHE-ECDSA-AES128-SHA256"), @com.fasterxml.jackson.annotation.JsonProperty("ECDHE-RSA-AES128-SHA256")
    ECDHERSAAES128SHA256("ECDHE-RSA-AES128-SHA256"), @com.fasterxml.jackson.annotation.JsonProperty("ECDHE-ECDSA-AES128-SHA")
    ECDHEECDSAAES128SHA("ECDHE-ECDSA-AES128-SHA"), @com.fasterxml.jackson.annotation.JsonProperty("ECDHE-RSA-AES128-SHA")
    ECDHERSAAES128SHA("ECDHE-RSA-AES128-SHA"), @com.fasterxml.jackson.annotation.JsonProperty("ECDHE-ECDSA-AES256-SHA384")
    ECDHEECDSAAES256SHA384(
        "ECDHE-ECDSA-AES256-SHA384"), @com.fasterxml.jackson.annotation.JsonProperty("ECDHE-RSA-AES256-SHA384")
    ECDHERSAAES256SHA384("ECDHE-RSA-AES256-SHA384"), @com.fasterxml.jackson.annotation.JsonProperty("ECDHE-ECDSA-AES256-SHA")
    ECDHEECDSAAES256SHA("ECDHE-ECDSA-AES256-SHA"), @com.fasterxml.jackson.annotation.JsonProperty("ECDHE-RSA-AES256-SHA")
    ECDHERSAAES256SHA("ECDHE-RSA-AES256-SHA"), @com.fasterxml.jackson.annotation.JsonProperty("DHE-RSA-AES128-SHA256")
    DHERSAAES128SHA256("DHE-RSA-AES128-SHA256"), @com.fasterxml.jackson.annotation.JsonProperty("DHE-RSA-AES256-SHA256")
    DHERSAAES256SHA256("DHE-RSA-AES256-SHA256"), @com.fasterxml.jackson.annotation.JsonProperty("AES128-GCM-SHA256")
    AES128GCMSHA256("AES128-GCM-SHA256"), @com.fasterxml.jackson.annotation.JsonProperty("AES256-GCM-SHA384")
    AES256GCMSHA384("AES256-GCM-SHA384"), @com.fasterxml.jackson.annotation.JsonProperty("AES128-SHA256")
    AES128SHA256("AES128-SHA256"), @com.fasterxml.jackson.annotation.JsonProperty("AES256-SHA256")
    AES256SHA256("AES256-SHA256"), @com.fasterxml.jackson.annotation.JsonProperty("AES128-SHA")
    AES128SHA("AES128-SHA"), @com.fasterxml.jackson.annotation.JsonProperty("AES256-SHA")
    AES256SHA("AES256-SHA"), @com.fasterxml.jackson.annotation.JsonProperty("DES-CBC3-SHA")
    DESCBC3SHA("DES-CBC3-SHA");

    java.lang.String value;

    Ciphers(java.lang.String value) {
      this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue()
    public java.lang.String getValue() {
      return value;
    }
  }

  /**
   * ciphers is used to specify the cipher algorithms that are negotiated during the TLS handshake. Operators may remove
   * entries their operands do not support. For example, to use DES-CBC3-SHA (yaml):
   * ciphers: - DES-CBC3-SHA
   */
  @com.fasterxml.jackson.annotation.JsonProperty("ciphers")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("ciphers is used to specify the cipher algorithms that are negotiated during the TLS handshake.  Operators may remove entries their operands do not support.  For example, to use DES-CBC3-SHA  (yaml):\n   ciphers:     - DES-CBC3-SHA")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private java.util.List<Ciphers> ciphers;

  public java.util.List<Ciphers> getCiphers() {
    return ciphers;
  }

  public void setCiphers(java.util.List<Ciphers> ciphers) {
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
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("minTLSVersion is used to specify the minimal version of the TLS protocol that is negotiated during the TLS handshake. For example, to use TLS versions 1.1, 1.2 and 1.3 (yaml):\n   minTLSVersion: TLSv1.1\n NOTE: currently the highest minTLSVersion allowed is VersionTLS12")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private MinTLSVersion minTLSVersion;

  public MinTLSVersion getMinTLSVersion() {
    return minTLSVersion;
  }

  public void setMinTLSVersion(MinTLSVersion minTLSVersion) {
    this.minTLSVersion = minTLSVersion;
  }
}
