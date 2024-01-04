package io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.status;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "addVolumeOptions", "removeVolumeOptions" })
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
public class VolumeRequests implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * AddVolumeOptions when set indicates a volume should be added. The details within this field specify how to add the volume
   */
  @com.fasterxml.jackson.annotation.JsonProperty("addVolumeOptions")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("AddVolumeOptions when set indicates a volume should be added. The details within this field specify how to add the volume")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.status.volumerequests.AddVolumeOptions addVolumeOptions;

  public io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.status.volumerequests.AddVolumeOptions getAddVolumeOptions() {
    return addVolumeOptions;
  }

  public void setAddVolumeOptions(
      io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.status.volumerequests.AddVolumeOptions addVolumeOptions) {
    this.addVolumeOptions = addVolumeOptions;
  }

  /**
   * RemoveVolumeOptions when set indicates a volume should be removed. The details within this field specify how to add the
   * volume
   */
  @com.fasterxml.jackson.annotation.JsonProperty("removeVolumeOptions")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("RemoveVolumeOptions when set indicates a volume should be removed. The details within this field specify how to add the volume")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.status.volumerequests.RemoveVolumeOptions removeVolumeOptions;

  public io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.status.volumerequests.RemoveVolumeOptions getRemoveVolumeOptions() {
    return removeVolumeOptions;
  }

  public void setRemoveVolumeOptions(
      io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.status.volumerequests.RemoveVolumeOptions removeVolumeOptions) {
    this.removeVolumeOptions = removeVolumeOptions;
  }
}
