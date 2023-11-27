package io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "bootloader", "kernelBoot", "serial", "uuid" })
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
public class Firmware implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Settings to control the bootloader that is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bootloader")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Settings to control the bootloader that is used.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.firmware.Bootloader bootloader;

    public io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.firmware.Bootloader getBootloader() {
        return bootloader;
    }

    public void setBootloader(
            io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.firmware.Bootloader bootloader) {
        this.bootloader = bootloader;
    }

    /**
     * Settings to set the kernel for booting.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kernelBoot")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Settings to set the kernel for booting.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.firmware.KernelBoot kernelBoot;

    public io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.firmware.KernelBoot getKernelBoot() {
        return kernelBoot;
    }

    public void setKernelBoot(
            io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.firmware.KernelBoot kernelBoot) {
        this.kernelBoot = kernelBoot;
    }

    /**
     * The system-serial-number in SMBIOS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serial")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The system-serial-number in SMBIOS")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String serial;

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    /**
     * UUID reported by the vmi bios. Defaults to a random generated uid.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("uuid")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("UUID reported by the vmi bios. Defaults to a random generated uid.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String uuid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
