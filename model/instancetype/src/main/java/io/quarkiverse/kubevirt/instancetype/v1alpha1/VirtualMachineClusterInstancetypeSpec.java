package io.quarkiverse.kubevirt.instancetype.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "cpu", "gpus", "hostDevices", "ioThreadsPolicy", "launchSecurity",
        "memory" })
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
public class VirtualMachineClusterInstancetypeSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Required CPU related attributes of the instancetype.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cpu")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Required CPU related attributes of the instancetype.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterinstancetypespec.Cpu cpu;

    public io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterinstancetypespec.Cpu getCpu() {
        return cpu;
    }

    public void setCpu(io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterinstancetypespec.Cpu cpu) {
        this.cpu = cpu;
    }

    /**
     * Optionally defines any GPU devices associated with the instancetype.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gpus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Optionally defines any GPU devices associated with the instancetype.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterinstancetypespec.Gpus> gpus;

    public java.util.List<io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterinstancetypespec.Gpus> getGpus() {
        return gpus;
    }

    public void setGpus(
            java.util.List<io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterinstancetypespec.Gpus> gpus) {
        this.gpus = gpus;
    }

    /**
     * Optionally defines any HostDevices associated with the instancetype.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostDevices")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Optionally defines any HostDevices associated with the instancetype.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterinstancetypespec.HostDevices> hostDevices;

    public java.util.List<io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterinstancetypespec.HostDevices> getHostDevices() {
        return hostDevices;
    }

    public void setHostDevices(
            java.util.List<io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterinstancetypespec.HostDevices> hostDevices) {
        this.hostDevices = hostDevices;
    }

    /**
     * Optionally defines the IOThreadsPolicy to be used by the instancetype.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ioThreadsPolicy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Optionally defines the IOThreadsPolicy to be used by the instancetype.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String ioThreadsPolicy;

    public String getIoThreadsPolicy() {
        return ioThreadsPolicy;
    }

    public void setIoThreadsPolicy(String ioThreadsPolicy) {
        this.ioThreadsPolicy = ioThreadsPolicy;
    }

    /**
     * Optionally defines the LaunchSecurity to be used by the instancetype.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("launchSecurity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Optionally defines the LaunchSecurity to be used by the instancetype.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterinstancetypespec.LaunchSecurity launchSecurity;

    public io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterinstancetypespec.LaunchSecurity getLaunchSecurity() {
        return launchSecurity;
    }

    public void setLaunchSecurity(
            io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterinstancetypespec.LaunchSecurity launchSecurity) {
        this.launchSecurity = launchSecurity;
    }

    /**
     * Required Memory related attributes of the instancetype.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("memory")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Required Memory related attributes of the instancetype.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterinstancetypespec.Memory memory;

    public io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterinstancetypespec.Memory getMemory() {
        return memory;
    }

    public void setMemory(io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterinstancetypespec.Memory memory) {
        this.memory = memory;
    }
}
