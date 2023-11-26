package io.quarkus.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.spec.template.spec.domain.devices.disks;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "bus", "readonly", "tray" })
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
public class Cdrom implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Bus indicates the type of disk device to emulate. supported values: virtio, sata, scsi.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Bus indicates the type of disk device to emulate. supported values: virtio, sata, scsi.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String bus;

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    /**
     * ReadOnly. Defaults to true.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readonly")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ReadOnly. Defaults to true.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean readonly;

    public Boolean getReadonly() {
        return readonly;
    }

    public void setReadonly(Boolean readonly) {
        this.readonly = readonly;
    }

    /**
     * Tray indicates if the tray of the device is open or closed. Allowed values are "open" and "closed". Defaults to closed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tray")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Tray indicates if the tray of the device is open or closed. Allowed values are \"open\" and \"closed\". Defaults to closed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String tray;

    public String getTray() {
        return tray;
    }

    public void setTray(String tray) {
        this.tray = tray;
    }
}
