package io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "acpi", "apic", "hyperv", "kvm", "pvspinlock", "smm" })
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
public class Features implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * ACPI enables/disables ACPI inside the guest. Defaults to enabled.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("acpi")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ACPI enables/disables ACPI inside the guest. Defaults to enabled.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.features.Acpi acpi;

    public io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.features.Acpi getAcpi() {
        return acpi;
    }

    public void setAcpi(
            io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.features.Acpi acpi) {
        this.acpi = acpi;
    }

    /**
     * Defaults to the machine type setting.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("apic")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Defaults to the machine type setting.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.features.Apic apic;

    public io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.features.Apic getApic() {
        return apic;
    }

    public void setApic(
            io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.features.Apic apic) {
        this.apic = apic;
    }

    /**
     * Defaults to the machine type setting.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hyperv")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Defaults to the machine type setting.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.features.Hyperv hyperv;

    public io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.features.Hyperv getHyperv() {
        return hyperv;
    }

    public void setHyperv(
            io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.features.Hyperv hyperv) {
        this.hyperv = hyperv;
    }

    /**
     * Configure how KVM presence is exposed to the guest.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kvm")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configure how KVM presence is exposed to the guest.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.features.Kvm kvm;

    public io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.features.Kvm getKvm() {
        return kvm;
    }

    public void setKvm(io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.features.Kvm kvm) {
        this.kvm = kvm;
    }

    /**
     * Notify the guest that the host supports paravirtual spinlocks. For older kernels this feature should be explicitly
     * disabled.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pvspinlock")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Notify the guest that the host supports paravirtual spinlocks. For older kernels this feature should be explicitly disabled.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.features.Pvspinlock pvspinlock;

    public io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.features.Pvspinlock getPvspinlock() {
        return pvspinlock;
    }

    public void setPvspinlock(
            io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.features.Pvspinlock pvspinlock) {
        this.pvspinlock = pvspinlock;
    }

    /**
     * SMM enables/disables System Management Mode. TSEG not yet implemented.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("smm")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SMM enables/disables System Management Mode. TSEG not yet implemented.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.features.Smm smm;

    public io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.features.Smm getSmm() {
        return smm;
    }

    public void setSmm(io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.features.Smm smm) {
        this.smm = smm;
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
