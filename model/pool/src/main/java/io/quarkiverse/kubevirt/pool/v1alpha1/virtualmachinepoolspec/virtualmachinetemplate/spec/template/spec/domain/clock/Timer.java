package io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.domain.clock;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "hpet", "hyperv", "kvm", "pit", "rtc" })
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
public class Timer implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * HPET (High Precision Event Timer) - multiple timers with periodic interrupts.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("hpet")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("HPET (High Precision Event Timer) - multiple timers with periodic interrupts.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.domain.clock.timer.Hpet hpet;

  public io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.domain.clock.timer.Hpet getHpet() {
    return hpet;
  }

  public void setHpet(
      io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.domain.clock.timer.Hpet hpet) {
    this.hpet = hpet;
  }

  /**
   * Hyperv (Hypervclock) - lets guests read the host’s wall clock time (paravirtualized). For windows guests.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("hyperv")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Hyperv (Hypervclock) - lets guests read the host’s wall clock time (paravirtualized). For windows guests.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.domain.clock.timer.Hyperv hyperv;

  public io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.domain.clock.timer.Hyperv getHyperv() {
    return hyperv;
  }

  public void setHyperv(
      io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.domain.clock.timer.Hyperv hyperv) {
    this.hyperv = hyperv;
  }

  /**
   * KVM (KVM clock) - lets guests read the host’s wall clock time (paravirtualized). For linux guests.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("kvm")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("KVM \t(KVM clock) - lets guests read the host’s wall clock time (paravirtualized). For linux guests.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.domain.clock.timer.Kvm kvm;

  public io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.domain.clock.timer.Kvm getKvm() {
    return kvm;
  }

  public void setKvm(
      io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.domain.clock.timer.Kvm kvm) {
    this.kvm = kvm;
  }

  /**
   * PIT (Programmable Interval Timer) - a timer with periodic interrupts.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("pit")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PIT (Programmable Interval Timer) - a timer with periodic interrupts.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.domain.clock.timer.Pit pit;

  public io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.domain.clock.timer.Pit getPit() {
    return pit;
  }

  public void setPit(
      io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.domain.clock.timer.Pit pit) {
    this.pit = pit;
  }

  /**
   * RTC (Real Time Clock) - a continuously running timer with periodic interrupts.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("rtc")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("RTC (Real Time Clock) - a continuously running timer with periodic interrupts.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.domain.clock.timer.Rtc rtc;

  public io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.domain.clock.timer.Rtc getRtc() {
    return rtc;
  }

  public void setRtc(
      io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.domain.clock.timer.Rtc rtc) {
    this.rtc = rtc;
  }
}
