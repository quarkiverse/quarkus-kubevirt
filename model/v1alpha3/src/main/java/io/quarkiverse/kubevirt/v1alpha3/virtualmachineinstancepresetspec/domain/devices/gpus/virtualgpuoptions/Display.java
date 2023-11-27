package io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.gpus.virtualgpuoptions;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "enabled", "ramFB" })
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
public class Display implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Enabled determines if a display addapter backed by a vGPU should be enabled or disabled on the guest. Defaults to true.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enabled determines if a display addapter backed by a vGPU should be enabled or disabled on the guest. Defaults to true.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Enables a boot framebuffer, until the guest OS loads a real GPU driver Defaults to true.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ramFB")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enables a boot framebuffer, until the guest OS loads a real GPU driver Defaults to true.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.gpus.virtualgpuoptions.display.RamFB ramFB;

    public io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.gpus.virtualgpuoptions.display.RamFB getRamFB() {
        return ramFB;
    }

    public void setRamFB(
            io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.devices.gpus.virtualgpuoptions.display.RamFB ramFB) {
        this.ramFB = ramFB;
    }
}
