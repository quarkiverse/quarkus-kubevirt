package io.quarkiverse.kubevirt.v1.virtualmachineinstancestatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "hotplugVolume", "memoryDumpVolume", "message", "name",
        "persistentVolumeClaimInfo", "phase", "reason", "size", "target" })
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
public class VolumeStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * If the volume is hotplug, this will contain the hotplug status.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hotplugVolume")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If the volume is hotplug, this will contain the hotplug status.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1.virtualmachineinstancestatus.volumestatus.HotplugVolume hotplugVolume;

    public io.quarkiverse.kubevirt.v1.virtualmachineinstancestatus.volumestatus.HotplugVolume getHotplugVolume() {
        return hotplugVolume;
    }

    public void setHotplugVolume(
            io.quarkiverse.kubevirt.v1.virtualmachineinstancestatus.volumestatus.HotplugVolume hotplugVolume) {
        this.hotplugVolume = hotplugVolume;
    }

    /**
     * If the volume is memorydump volume, this will contain the memorydump info.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryDumpVolume")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If the volume is memorydump volume, this will contain the memorydump info.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1.virtualmachineinstancestatus.volumestatus.MemoryDumpVolume memoryDumpVolume;

    public io.quarkiverse.kubevirt.v1.virtualmachineinstancestatus.volumestatus.MemoryDumpVolume getMemoryDumpVolume() {
        return memoryDumpVolume;
    }

    public void setMemoryDumpVolume(
            io.quarkiverse.kubevirt.v1.virtualmachineinstancestatus.volumestatus.MemoryDumpVolume memoryDumpVolume) {
        this.memoryDumpVolume = memoryDumpVolume;
    }

    /**
     * Message is a detailed message about the current hotplug volume phase
     */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Message is a detailed message about the current hotplug volume phase")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Name is the name of the volume
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name is the name of the volume")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * PersistentVolumeClaimInfo is information about the PVC that handler requires during start flow
     */
    @com.fasterxml.jackson.annotation.JsonProperty("persistentVolumeClaimInfo")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PersistentVolumeClaimInfo is information about the PVC that handler requires during start flow")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1.virtualmachineinstancestatus.volumestatus.PersistentVolumeClaimInfo persistentVolumeClaimInfo;

    public io.quarkiverse.kubevirt.v1.virtualmachineinstancestatus.volumestatus.PersistentVolumeClaimInfo getPersistentVolumeClaimInfo() {
        return persistentVolumeClaimInfo;
    }

    public void setPersistentVolumeClaimInfo(
            io.quarkiverse.kubevirt.v1.virtualmachineinstancestatus.volumestatus.PersistentVolumeClaimInfo persistentVolumeClaimInfo) {
        this.persistentVolumeClaimInfo = persistentVolumeClaimInfo;
    }

    /**
     * Phase is the phase
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Phase is the phase")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * Reason is a brief description of why we are in the current hotplug volume phase
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Reason is a brief description of why we are in the current hotplug volume phase")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String reason;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Represents the size of the volume
     */
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Represents the size of the volume")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long size;

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * Target is the target name used when adding the volume to the VM, eg: vda
     */
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Target is the target name used when adding the volume to the VM, eg: vda")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String target;

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
