package io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachinepreferencespec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "preferredClockOffset", "preferredTimer" })
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
public class Clock implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * ClockOffset allows specifying the UTC offset or the timezone of the guest clock.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preferredClockOffset")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ClockOffset allows specifying the UTC offset or the timezone of the guest clock.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachinepreferencespec.clock.PreferredClockOffset preferredClockOffset;

    public io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachinepreferencespec.clock.PreferredClockOffset getPreferredClockOffset() {
        return preferredClockOffset;
    }

    public void setPreferredClockOffset(
            io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachinepreferencespec.clock.PreferredClockOffset preferredClockOffset) {
        this.preferredClockOffset = preferredClockOffset;
    }

    /**
     * Timer specifies whih timers are attached to the vmi.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preferredTimer")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Timer specifies whih timers are attached to the vmi.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachinepreferencespec.clock.PreferredTimer preferredTimer;

    public io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachinepreferencespec.clock.PreferredTimer getPreferredTimer() {
        return preferredTimer;
    }

    public void setPreferredTimer(
            io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachinepreferencespec.clock.PreferredTimer preferredTimer) {
        this.preferredTimer = preferredTimer;
    }
}
