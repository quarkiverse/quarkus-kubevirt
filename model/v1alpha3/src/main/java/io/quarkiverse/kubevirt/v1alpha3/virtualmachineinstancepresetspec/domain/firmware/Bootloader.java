package io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.firmware;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "bios", "efi" })
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
public class Bootloader implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * If set (default), BIOS will be used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bios")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If set (default), BIOS will be used.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.firmware.bootloader.Bios bios;

    public io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.firmware.bootloader.Bios getBios() {
        return bios;
    }

    public void setBios(
            io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.firmware.bootloader.Bios bios) {
        this.bios = bios;
    }

    /**
     * If set, EFI will be used instead of BIOS.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("efi")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If set, EFI will be used instead of BIOS.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.firmware.bootloader.Efi efi;

    public io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.firmware.bootloader.Efi getEfi() {
        return efi;
    }

    public void setEfi(io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancepresetspec.domain.firmware.bootloader.Efi efi) {
        this.efi = efi;
    }
}
