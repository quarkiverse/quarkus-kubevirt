package io.quarkiverse.kubevirt.cdi.v1beta1.dataimportcronspec.template.spec.source;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "certConfigMap", "diskId", "secretRef", "url" })
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
public class Imageio implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * CertConfigMap provides a reference to the CA cert
   */
  @com.fasterxml.jackson.annotation.JsonProperty("certConfigMap")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("CertConfigMap provides a reference to the CA cert")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String certConfigMap;

  public String getCertConfigMap() {
    return certConfigMap;
  }

  public void setCertConfigMap(String certConfigMap) {
    this.certConfigMap = certConfigMap;
  }

  /**
   * DiskID provides id of a disk to be imported
   */
  @com.fasterxml.jackson.annotation.JsonProperty("diskId")
  @io.fabric8.generator.annotation.Required()
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("DiskID provides id of a disk to be imported")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String diskId;

  public String getDiskId() {
    return diskId;
  }

  public void setDiskId(String diskId) {
    this.diskId = diskId;
  }

  /**
   * SecretRef provides the secret reference needed to access the ovirt-engine
   */
  @com.fasterxml.jackson.annotation.JsonProperty("secretRef")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("SecretRef provides the secret reference needed to access the ovirt-engine")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String secretRef;

  public String getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(String secretRef) {
    this.secretRef = secretRef;
  }

  /**
   * URL is the URL of the ovirt-engine
   */
  @com.fasterxml.jackson.annotation.JsonProperty("url")
  @io.fabric8.generator.annotation.Required()
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("URL is the URL of the ovirt-engine")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String url;

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
