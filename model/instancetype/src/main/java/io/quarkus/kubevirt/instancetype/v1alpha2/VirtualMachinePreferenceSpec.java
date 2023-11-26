package io.quarkus.kubevirt.instancetype.v1alpha2;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "clock", "cpu", "devices", "features", "firmware", "machine", "volumes" })
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
public class VirtualMachinePreferenceSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Clock optionally defines preferences associated with the Clock attribute of a VirtualMachineInstance DomainSpec
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clock")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Clock optionally defines preferences associated with the Clock attribute of a VirtualMachineInstance DomainSpec")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.Clock clock;

    public io.quarkus.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.Clock getClock() {
        return clock;
    }

    public void setClock(io.quarkus.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.Clock clock) {
        this.clock = clock;
    }

    /**
     * CPU optionally defines preferences associated with the CPU attribute of a VirtualMachineInstance DomainSpec
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cpu")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CPU optionally defines preferences associated with the CPU attribute of a VirtualMachineInstance DomainSpec")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.Cpu cpu;

    public io.quarkus.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.Cpu getCpu() {
        return cpu;
    }

    public void setCpu(io.quarkus.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.Cpu cpu) {
        this.cpu = cpu;
    }

    /**
     * Devices optionally defines preferences associated with the Devices attribute of a VirtualMachineInstance DomainSpec
     */
    @com.fasterxml.jackson.annotation.JsonProperty("devices")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Devices optionally defines preferences associated with the Devices attribute of a VirtualMachineInstance DomainSpec")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.Devices devices;

    public io.quarkus.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.Devices getDevices() {
        return devices;
    }

    public void setDevices(io.quarkus.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.Devices devices) {
        this.devices = devices;
    }

    /**
     * Features optionally defines preferences associated with the Features attribute of a VirtualMachineInstance DomainSpec
     */
    @com.fasterxml.jackson.annotation.JsonProperty("features")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Features optionally defines preferences associated with the Features attribute of a VirtualMachineInstance DomainSpec")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.Features features;

    public io.quarkus.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.Features getFeatures() {
        return features;
    }

    public void setFeatures(io.quarkus.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.Features features) {
        this.features = features;
    }

    /**
     * Firmware optionally defines preferences associated with the Firmware attribute of a VirtualMachineInstance DomainSpec
     */
    @com.fasterxml.jackson.annotation.JsonProperty("firmware")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Firmware optionally defines preferences associated with the Firmware attribute of a VirtualMachineInstance DomainSpec")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.Firmware firmware;

    public io.quarkus.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.Firmware getFirmware() {
        return firmware;
    }

    public void setFirmware(io.quarkus.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.Firmware firmware) {
        this.firmware = firmware;
    }

    /**
     * Machine optionally defines preferences associated with the Machine attribute of a VirtualMachineInstance DomainSpec
     */
    @com.fasterxml.jackson.annotation.JsonProperty("machine")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Machine optionally defines preferences associated with the Machine attribute of a VirtualMachineInstance DomainSpec")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.Machine machine;

    public io.quarkus.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.Machine getMachine() {
        return machine;
    }

    public void setMachine(io.quarkus.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.Machine machine) {
        this.machine = machine;
    }

    /**
     * Volumes optionally defines preferences associated with the Volumes attribute of a VirtualMachineInstace DomainSpec
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumes")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Volumes optionally defines preferences associated with the Volumes attribute of a VirtualMachineInstace DomainSpec")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.Volumes volumes;

    public io.quarkus.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.Volumes getVolumes() {
        return volumes;
    }

    public void setVolumes(io.quarkus.kubevirt.instancetype.v1alpha2.virtualmachinepreferencespec.Volumes volumes) {
        this.volumes = volumes;
    }
}
