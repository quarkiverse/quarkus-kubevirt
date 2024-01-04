package io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "evmcs", "frequencies", "ipi", "reenlightenment", "relaxed", "reset",
    "runtime", "spinlocks", "synic", "synictimer", "tlbflush", "vapic", "vendorid", "vpindex" })
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
public class Hyperv implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * EVMCS Speeds up L2 vmexits, but disables other virtualization features. Requires vapic. Defaults to the machine type
   * setting.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("evmcs")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("EVMCS Speeds up L2 vmexits, but disables other virtualization features. Requires vapic. Defaults to the machine type setting.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Evmcs evmcs;

  public io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Evmcs getEvmcs() {
    return evmcs;
  }

  public void setEvmcs(io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Evmcs evmcs) {
    this.evmcs = evmcs;
  }

  /**
   * Frequencies improves the TSC clock source handling for Hyper-V on KVM. Defaults to the machine type setting.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("frequencies")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Frequencies improves the TSC clock source handling for Hyper-V on KVM. Defaults to the machine type setting.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Frequencies frequencies;

  public io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Frequencies getFrequencies() {
    return frequencies;
  }

  public void setFrequencies(
      io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Frequencies frequencies) {
    this.frequencies = frequencies;
  }

  /**
   * IPI improves performances in overcommited environments. Requires vpindex. Defaults to the machine type setting.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("ipi")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("IPI improves performances in overcommited environments. Requires vpindex. Defaults to the machine type setting.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Ipi ipi;

  public io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Ipi getIpi() {
    return ipi;
  }

  public void setIpi(io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Ipi ipi) {
    this.ipi = ipi;
  }

  /**
   * Reenlightenment enables the notifications on TSC frequency changes. Defaults to the machine type setting.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reenlightenment")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Reenlightenment enables the notifications on TSC frequency changes. Defaults to the machine type setting.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Reenlightenment reenlightenment;

  public io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Reenlightenment getReenlightenment() {
    return reenlightenment;
  }

  public void setReenlightenment(
      io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Reenlightenment reenlightenment) {
    this.reenlightenment = reenlightenment;
  }

  /**
   * Relaxed instructs the guest OS to disable watchdog timeouts. Defaults to the machine type setting.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("relaxed")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Relaxed instructs the guest OS to disable watchdog timeouts. Defaults to the machine type setting.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Relaxed relaxed;

  public io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Relaxed getRelaxed() {
    return relaxed;
  }

  public void setRelaxed(io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Relaxed relaxed) {
    this.relaxed = relaxed;
  }

  /**
   * Reset enables Hyperv reboot/reset for the vmi. Requires synic. Defaults to the machine type setting.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reset")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Reset enables Hyperv reboot/reset for the vmi. Requires synic. Defaults to the machine type setting.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Reset reset;

  public io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Reset getReset() {
    return reset;
  }

  public void setReset(io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Reset reset) {
    this.reset = reset;
  }

  /**
   * Runtime improves the time accounting to improve scheduling in the guest. Defaults to the machine type setting.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("runtime")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Runtime improves the time accounting to improve scheduling in the guest. Defaults to the machine type setting.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Runtime runtime;

  public io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Runtime getRuntime() {
    return runtime;
  }

  public void setRuntime(io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Runtime runtime) {
    this.runtime = runtime;
  }

  /**
   * Spinlocks allows to configure the spinlock retry attempts.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("spinlocks")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Spinlocks allows to configure the spinlock retry attempts.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Spinlocks spinlocks;

  public io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Spinlocks getSpinlocks() {
    return spinlocks;
  }

  public void setSpinlocks(io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Spinlocks spinlocks) {
    this.spinlocks = spinlocks;
  }

  /**
   * SyNIC enables the Synthetic Interrupt Controller. Defaults to the machine type setting.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("synic")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("SyNIC enables the Synthetic Interrupt Controller. Defaults to the machine type setting.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Synic synic;

  public io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Synic getSynic() {
    return synic;
  }

  public void setSynic(io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Synic synic) {
    this.synic = synic;
  }

  /**
   * SyNICTimer enables Synthetic Interrupt Controller Timers, reducing CPU load. Defaults to the machine type setting.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("synictimer")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("SyNICTimer enables Synthetic Interrupt Controller Timers, reducing CPU load. Defaults to the machine type setting.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Synictimer synictimer;

  public io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Synictimer getSynictimer() {
    return synictimer;
  }

  public void setSynictimer(
      io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Synictimer synictimer) {
    this.synictimer = synictimer;
  }

  /**
   * TLBFlush improves performances in overcommited environments. Requires vpindex. Defaults to the machine type setting.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("tlbflush")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("TLBFlush improves performances in overcommited environments. Requires vpindex. Defaults to the machine type setting.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Tlbflush tlbflush;

  public io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Tlbflush getTlbflush() {
    return tlbflush;
  }

  public void setTlbflush(io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Tlbflush tlbflush) {
    this.tlbflush = tlbflush;
  }

  /**
   * VAPIC improves the paravirtualized handling of interrupts. Defaults to the machine type setting.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("vapic")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("VAPIC improves the paravirtualized handling of interrupts. Defaults to the machine type setting.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Vapic vapic;

  public io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Vapic getVapic() {
    return vapic;
  }

  public void setVapic(io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Vapic vapic) {
    this.vapic = vapic;
  }

  /**
   * VendorID allows setting the hypervisor vendor id. Defaults to the machine type setting.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("vendorid")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("VendorID allows setting the hypervisor vendor id. Defaults to the machine type setting.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Vendorid vendorid;

  public io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Vendorid getVendorid() {
    return vendorid;
  }

  public void setVendorid(io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Vendorid vendorid) {
    this.vendorid = vendorid;
  }

  /**
   * VPIndex enables the Virtual Processor Index to help windows identifying virtual processors. Defaults to the machine type
   * setting.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("vpindex")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("VPIndex enables the Virtual Processor Index to help windows identifying virtual processors. Defaults to the machine type setting.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Vpindex vpindex;

  public io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Vpindex getVpindex() {
    return vpindex;
  }

  public void setVpindex(io.quarkiverse.kubevirt.v1.virtualmachineinstancespec.domain.features.hyperv.Vpindex vpindex) {
    this.vpindex = vpindex;
  }

  @com.fasterxml.jackson.annotation.JsonIgnore()
  private java.util.Map<String, Object> additionalProperties = new java.util.HashMap<>();

  @com.fasterxml.jackson.annotation.JsonAnyGetter()
  public java.util.Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  @com.fasterxml.jackson.annotation.JsonAnySetter()
  public void setAdditionalProperties(java.util.Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  @com.fasterxml.jackson.annotation.JsonAnySetter()
  public void setAdditionalProperty(java.lang.String key, java.lang.Object value) {
    this.additionalProperties.put(key, value);
  }
}
