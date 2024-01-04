package io.quarkiverse.kubevirt.export.v1alpha1.virtualmachineexportstatus.links;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "cert", "manifests", "volumes" })
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
public class Internal implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * Cert is the public CA certificate base64 encoded
   */
  @com.fasterxml.jackson.annotation.JsonProperty("cert")
  @io.fabric8.generator.annotation.Required()
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Cert is the public CA certificate base64 encoded")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String cert;

  public String getCert() {
    return cert;
  }

  public void setCert(String cert) {
    this.cert = cert;
  }

  /**
   * Manifests is a list of available manifests for the export
   */
  @com.fasterxml.jackson.annotation.JsonProperty("manifests")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Manifests is a list of available manifests for the export")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private java.util.List<io.quarkiverse.kubevirt.export.v1alpha1.virtualmachineexportstatus.links.internal.Manifests> manifests;

  public java.util.List<io.quarkiverse.kubevirt.export.v1alpha1.virtualmachineexportstatus.links.internal.Manifests> getManifests() {
    return manifests;
  }

  public void setManifests(
      java.util.List<io.quarkiverse.kubevirt.export.v1alpha1.virtualmachineexportstatus.links.internal.Manifests> manifests) {
    this.manifests = manifests;
  }

  /**
   * Volumes is a list of available volumes to export
   */
  @com.fasterxml.jackson.annotation.JsonProperty("volumes")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Volumes is a list of available volumes to export")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private java.util.List<io.quarkiverse.kubevirt.export.v1alpha1.virtualmachineexportstatus.links.internal.Volumes> volumes;

  public java.util.List<io.quarkiverse.kubevirt.export.v1alpha1.virtualmachineexportstatus.links.internal.Volumes> getVolumes() {
    return volumes;
  }

  public void setVolumes(
      java.util.List<io.quarkiverse.kubevirt.export.v1alpha1.virtualmachineexportstatus.links.internal.Volumes> volumes) {
    this.volumes = volumes;
  }
}
