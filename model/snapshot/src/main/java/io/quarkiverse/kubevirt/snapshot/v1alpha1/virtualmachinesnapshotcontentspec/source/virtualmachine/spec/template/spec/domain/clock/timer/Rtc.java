package io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.spec.template.spec.domain.clock.timer;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "present", "tickPolicy", "track" })
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
public class Rtc implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * Enabled set to false makes sure that the machine type or a preset can't add the timer. Defaults to true.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("present")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enabled set to false makes sure that the machine type or a preset can't add the timer. Defaults to true.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Boolean present;

  public Boolean getPresent() {
    return present;
  }

  public void setPresent(Boolean present) {
    this.present = present;
  }

  /**
   * TickPolicy determines what happens when QEMU misses a deadline for injecting a tick to the guest. One of "delay",
   * "catchup".
   */
  @com.fasterxml.jackson.annotation.JsonProperty("tickPolicy")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("TickPolicy determines what happens when QEMU misses a deadline for injecting a tick to the guest. One of \"delay\", \"catchup\".")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String tickPolicy;

  public String getTickPolicy() {
    return tickPolicy;
  }

  public void setTickPolicy(String tickPolicy) {
    this.tickPolicy = tickPolicy;
  }

  /**
   * Track the guest or the wall clock.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("track")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Track the guest or the wall clock.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String track;

  public String getTrack() {
    return track;
  }

  public void setTrack(String track) {
    this.track = track;
  }
}
