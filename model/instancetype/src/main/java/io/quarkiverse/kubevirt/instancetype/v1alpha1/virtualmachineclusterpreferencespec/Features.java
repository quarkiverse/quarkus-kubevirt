package io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterpreferencespec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "preferredAcpi", "preferredApic", "preferredHyperv", "preferredKvm",
        "preferredPvspinlock", "preferredSmm" })
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
     * PreferredAcpi optionally enables the ACPI feature
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preferredAcpi")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredAcpi optionally enables the ACPI feature")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterpreferencespec.features.PreferredAcpi preferredAcpi;

    public io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterpreferencespec.features.PreferredAcpi getPreferredAcpi() {
        return preferredAcpi;
    }

    public void setPreferredAcpi(
            io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterpreferencespec.features.PreferredAcpi preferredAcpi) {
        this.preferredAcpi = preferredAcpi;
    }

    /**
     * PreferredApic optionally enables and configures the APIC feature
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preferredApic")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredApic optionally enables and configures the APIC feature")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterpreferencespec.features.PreferredApic preferredApic;

    public io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterpreferencespec.features.PreferredApic getPreferredApic() {
        return preferredApic;
    }

    public void setPreferredApic(
            io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterpreferencespec.features.PreferredApic preferredApic) {
        this.preferredApic = preferredApic;
    }

    /**
     * PreferredHyperv optionally enables and configures HyperV features
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preferredHyperv")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredHyperv optionally enables and configures HyperV features")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterpreferencespec.features.PreferredHyperv preferredHyperv;

    public io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterpreferencespec.features.PreferredHyperv getPreferredHyperv() {
        return preferredHyperv;
    }

    public void setPreferredHyperv(
            io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterpreferencespec.features.PreferredHyperv preferredHyperv) {
        this.preferredHyperv = preferredHyperv;
    }

    /**
     * PreferredKvm optionally enables and configures KVM features
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preferredKvm")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredKvm optionally enables and configures KVM features")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterpreferencespec.features.PreferredKvm preferredKvm;

    public io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterpreferencespec.features.PreferredKvm getPreferredKvm() {
        return preferredKvm;
    }

    public void setPreferredKvm(
            io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterpreferencespec.features.PreferredKvm preferredKvm) {
        this.preferredKvm = preferredKvm;
    }

    /**
     * PreferredPvspinlock optionally enables the Pvspinlock feature
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preferredPvspinlock")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredPvspinlock optionally enables the Pvspinlock feature")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterpreferencespec.features.PreferredPvspinlock preferredPvspinlock;

    public io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterpreferencespec.features.PreferredPvspinlock getPreferredPvspinlock() {
        return preferredPvspinlock;
    }

    public void setPreferredPvspinlock(
            io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterpreferencespec.features.PreferredPvspinlock preferredPvspinlock) {
        this.preferredPvspinlock = preferredPvspinlock;
    }

    /**
     * PreferredSmm optionally enables the SMM feature
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preferredSmm")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredSmm optionally enables the SMM feature")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterpreferencespec.features.PreferredSmm preferredSmm;

    public io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterpreferencespec.features.PreferredSmm getPreferredSmm() {
        return preferredSmm;
    }

    public void setPreferredSmm(
            io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterpreferencespec.features.PreferredSmm preferredSmm) {
        this.preferredSmm = preferredSmm;
    }
}
