package io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.certificaterotatestrategy;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "ca", "caOverlapInterval", "caRotateInterval", "certRotateInterval",
    "server" })
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
public class SelfSigned implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * CA configuration CA certs are kept in the CA bundle as long as they are valid
   */
  @com.fasterxml.jackson.annotation.JsonProperty("ca")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("CA configuration CA certs are kept in the CA bundle as long as they are valid")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.certificaterotatestrategy.selfsigned.Ca ca;

  public io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.certificaterotatestrategy.selfsigned.Ca getCa() {
    return ca;
  }

  public void setCa(io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.certificaterotatestrategy.selfsigned.Ca ca) {
    this.ca = ca;
  }

  /**
   * Deprecated. Use CA.Duration and CA.RenewBefore instead
   */
  @com.fasterxml.jackson.annotation.JsonProperty("caOverlapInterval")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Deprecated. Use CA.Duration and CA.RenewBefore instead")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String caOverlapInterval;

  public String getCaOverlapInterval() {
    return caOverlapInterval;
  }

  public void setCaOverlapInterval(String caOverlapInterval) {
    this.caOverlapInterval = caOverlapInterval;
  }

  /**
   * Deprecated. Use CA.Duration instead
   */
  @com.fasterxml.jackson.annotation.JsonProperty("caRotateInterval")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Deprecated. Use CA.Duration instead")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String caRotateInterval;

  public String getCaRotateInterval() {
    return caRotateInterval;
  }

  public void setCaRotateInterval(String caRotateInterval) {
    this.caRotateInterval = caRotateInterval;
  }

  /**
   * Deprecated. Use Server.Duration instead
   */
  @com.fasterxml.jackson.annotation.JsonProperty("certRotateInterval")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Deprecated. Use Server.Duration instead")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String certRotateInterval;

  public String getCertRotateInterval() {
    return certRotateInterval;
  }

  public void setCertRotateInterval(String certRotateInterval) {
    this.certRotateInterval = certRotateInterval;
  }

  /**
   * Server configuration Certs are rotated and discarded
   */
  @com.fasterxml.jackson.annotation.JsonProperty("server")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Server configuration Certs are rotated and discarded")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.certificaterotatestrategy.selfsigned.Server server;

  public io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.certificaterotatestrategy.selfsigned.Server getServer() {
    return server;
  }

  public void setServer(io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.certificaterotatestrategy.selfsigned.Server server) {
    this.server = server;
  }
}
