package io.quarkiverse.kubevirt.v1alpha3.virtualmachinespec.datavolumetemplates.spec.source;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "backingFile", "initImageURL", "secretRef", "thumbprint", "url", "uuid" })
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
public class Vddk implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * BackingFile is the path to the virtual hard disk to migrate from vCenter/ESXi
   */
  @com.fasterxml.jackson.annotation.JsonProperty("backingFile")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("BackingFile is the path to the virtual hard disk to migrate from vCenter/ESXi")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String backingFile;

  public String getBackingFile() {
    return backingFile;
  }

  public void setBackingFile(String backingFile) {
    this.backingFile = backingFile;
  }

  /**
   * InitImageURL is an optional URL to an image containing an extracted VDDK library, overrides v2v-vmware config map
   */
  @com.fasterxml.jackson.annotation.JsonProperty("initImageURL")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("InitImageURL is an optional URL to an image containing an extracted VDDK library, overrides v2v-vmware config map")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String initImageURL;

  public String getInitImageURL() {
    return initImageURL;
  }

  public void setInitImageURL(String initImageURL) {
    this.initImageURL = initImageURL;
  }

  /**
   * SecretRef provides a reference to a secret containing the username and password needed to access the vCenter or ESXi host
   */
  @com.fasterxml.jackson.annotation.JsonProperty("secretRef")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("SecretRef provides a reference to a secret containing the username and password needed to access the vCenter or ESXi host")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String secretRef;

  public String getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(String secretRef) {
    this.secretRef = secretRef;
  }

  /**
   * Thumbprint is the certificate thumbprint of the vCenter or ESXi host
   */
  @com.fasterxml.jackson.annotation.JsonProperty("thumbprint")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Thumbprint is the certificate thumbprint of the vCenter or ESXi host")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String thumbprint;

  public String getThumbprint() {
    return thumbprint;
  }

  public void setThumbprint(String thumbprint) {
    this.thumbprint = thumbprint;
  }

  /**
   * URL is the URL of the vCenter or ESXi host with the VM to migrate
   */
  @com.fasterxml.jackson.annotation.JsonProperty("url")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("URL is the URL of the vCenter or ESXi host with the VM to migrate")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String url;

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * UUID is the UUID of the virtual machine that the backing file is attached to in vCenter/ESXi
   */
  @com.fasterxml.jackson.annotation.JsonProperty("uuid")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("UUID is the UUID of the virtual machine that the backing file is attached to in vCenter/ESXi")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String uuid;

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }
}
