package io.quarkus.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.domain.devices.disks;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "bus", "pciAddress", "readonly" })
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
public class Disk implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Bus indicates the type of disk device to emulate. supported values: virtio, sata, scsi, usb.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Bus indicates the type of disk device to emulate. supported values: virtio, sata, scsi, usb.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String bus;

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    /**
     * If specified, the virtual disk will be placed on the guests pci address with the specified PCI address. For example:
     * 0000:81:01.10
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pciAddress")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If specified, the virtual disk will be placed on the guests pci address with the specified PCI address. For example: 0000:81:01.10")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String pciAddress;

    public String getPciAddress() {
        return pciAddress;
    }

    public void setPciAddress(String pciAddress) {
        this.pciAddress = pciAddress;
    }

    /**
     * ReadOnly. Defaults to false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readonly")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ReadOnly. Defaults to false.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean readonly;

    public Boolean getReadonly() {
        return readonly;
    }

    public void setReadonly(Boolean readonly) {
        this.readonly = readonly;
    }
}
