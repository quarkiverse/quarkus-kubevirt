package io.quarkiverse.kubevirt.cdi.v1beta1.storageprofilespec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "accessModes", "volumeMode" })
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
public class ClaimPropertySets implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * AccessModes contains the desired access modes the volume should have. More info:
   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
   */
  @com.fasterxml.jackson.annotation.JsonProperty("accessModes")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("AccessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private java.util.List<String> accessModes;

  public java.util.List<String> getAccessModes() {
    return accessModes;
  }

  public void setAccessModes(java.util.List<String> accessModes) {
    this.accessModes = accessModes;
  }

  /**
   * VolumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in
   * claim spec.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("volumeMode")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("VolumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String volumeMode;

  public String getVolumeMode() {
    return volumeMode;
  }

  public void setVolumeMode(String volumeMode) {
    this.volumeMode = volumeMode;
  }
}
