package io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "creationTime", "error", "readyToUse", "volumeSnapshotName" })
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
public class VolumeSnapshotStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

  @com.fasterxml.jackson.annotation.JsonProperty("creationTime")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
  @io.fabric8.generator.annotation.Nullable()
  private java.time.ZonedDateTime creationTime;

  @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssVV")
  public java.time.ZonedDateTime getCreationTime() {
    return creationTime;
  }

  @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss[XXX][VV]")
  public void setCreationTime(java.time.ZonedDateTime creationTime) {
    this.creationTime = creationTime;
  }

  /**
   * Error is the last error encountered during the snapshot/restore
   */
  @com.fasterxml.jackson.annotation.JsonProperty("error")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Error is the last error encountered during the snapshot/restore")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentstatus.volumesnapshotstatus.Error error;

  public io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentstatus.volumesnapshotstatus.Error getError() {
    return error;
  }

  public void setError(
      io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentstatus.volumesnapshotstatus.Error error) {
    this.error = error;
  }

  @com.fasterxml.jackson.annotation.JsonProperty("readyToUse")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Boolean readyToUse;

  public Boolean getReadyToUse() {
    return readyToUse;
  }

  public void setReadyToUse(Boolean readyToUse) {
    this.readyToUse = readyToUse;
  }

  @com.fasterxml.jackson.annotation.JsonProperty("volumeSnapshotName")
  @io.fabric8.generator.annotation.Required()
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String volumeSnapshotName;

  public String getVolumeSnapshotName() {
    return volumeSnapshotName;
  }

  public void setVolumeSnapshotName(String volumeSnapshotName) {
    this.volumeSnapshotName = volumeSnapshotName;
  }
}
