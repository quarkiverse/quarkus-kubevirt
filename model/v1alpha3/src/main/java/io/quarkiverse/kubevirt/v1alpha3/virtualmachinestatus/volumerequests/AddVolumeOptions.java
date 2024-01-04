package io.quarkiverse.kubevirt.v1alpha3.virtualmachinestatus.volumerequests;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "disk", "dryRun", "name", "volumeSource" })
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
public class AddVolumeOptions implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * Disk represents the hotplug disk that will be plugged into the running VMI
   */
  @com.fasterxml.jackson.annotation.JsonProperty("disk")
  @io.fabric8.generator.annotation.Required()
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Disk represents the hotplug disk that will be plugged into the running VMI")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1alpha3.virtualmachinestatus.volumerequests.addvolumeoptions.Disk disk;

  public io.quarkiverse.kubevirt.v1alpha3.virtualmachinestatus.volumerequests.addvolumeoptions.Disk getDisk() {
    return disk;
  }

  public void setDisk(io.quarkiverse.kubevirt.v1alpha3.virtualmachinestatus.volumerequests.addvolumeoptions.Disk disk) {
    this.disk = disk;
  }

  /**
   * When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will
   * result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be
   * processed
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dryRun")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private java.util.List<String> dryRun;

  public java.util.List<String> getDryRun() {
    return dryRun;
  }

  public void setDryRun(java.util.List<String> dryRun) {
    this.dryRun = dryRun;
  }

  /**
   * Name represents the name that will be used to map the disk to the corresponding volume. This overrides any name set
   * inside the Disk struct itself.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @io.fabric8.generator.annotation.Required()
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name represents the name that will be used to map the disk to the corresponding volume. This overrides any name set inside the Disk struct itself.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * VolumeSource represents the source of the volume to map to the disk.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("volumeSource")
  @io.fabric8.generator.annotation.Required()
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("VolumeSource represents the source of the volume to map to the disk.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1alpha3.virtualmachinestatus.volumerequests.addvolumeoptions.VolumeSource volumeSource;

  public io.quarkiverse.kubevirt.v1alpha3.virtualmachinestatus.volumerequests.addvolumeoptions.VolumeSource getVolumeSource() {
    return volumeSource;
  }

  public void setVolumeSource(
      io.quarkiverse.kubevirt.v1alpha3.virtualmachinestatus.volumerequests.addvolumeoptions.VolumeSource volumeSource) {
    this.volumeSource = volumeSource;
  }
}
