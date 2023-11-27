package io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "cores", "dedicatedCpuPlacement", "features", "isolateEmulatorThread",
        "model", "numa", "realtime", "sockets", "threads" })
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
public class Cpu implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Cores specifies the number of cores inside the vmi. Must be a value greater or equal 1.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cores")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Cores specifies the number of cores inside the vmi. Must be a value greater or equal 1.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer cores;

    public Integer getCores() {
        return cores;
    }

    public void setCores(Integer cores) {
        this.cores = cores;
    }

    /**
     * DedicatedCPUPlacement requests the scheduler to place the VirtualMachineInstance on a node with enough dedicated pCPUs
     * and pin the vCPUs to it.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dedicatedCpuPlacement")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DedicatedCPUPlacement requests the scheduler to place the VirtualMachineInstance on a node with enough dedicated pCPUs and pin the vCPUs to it.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean dedicatedCpuPlacement;

    public Boolean getDedicatedCpuPlacement() {
        return dedicatedCpuPlacement;
    }

    public void setDedicatedCpuPlacement(Boolean dedicatedCpuPlacement) {
        this.dedicatedCpuPlacement = dedicatedCpuPlacement;
    }

    /**
     * Features specifies the CPU features list inside the VMI.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("features")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Features specifies the CPU features list inside the VMI.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.cpu.Features> features;

    public java.util.List<io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.cpu.Features> getFeatures() {
        return features;
    }

    public void setFeatures(
            java.util.List<io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.cpu.Features> features) {
        this.features = features;
    }

    /**
     * IsolateEmulatorThread requests one more dedicated pCPU to be allocated for the VMI to place the emulator thread on it.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isolateEmulatorThread")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("IsolateEmulatorThread requests one more dedicated pCPU to be allocated for the VMI to place the emulator thread on it.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean isolateEmulatorThread;

    public Boolean getIsolateEmulatorThread() {
        return isolateEmulatorThread;
    }

    public void setIsolateEmulatorThread(Boolean isolateEmulatorThread) {
        this.isolateEmulatorThread = isolateEmulatorThread;
    }

    /**
     * Model specifies the CPU model inside the VMI. List of available models
     * https://github.com/libvirt/libvirt/tree/master/src/cpu_map. It is possible to specify special cases like
     * "host-passthrough" to get the same CPU as the node and "host-model" to get CPU closest to the node one. Defaults to
     * host-model.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("model")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Model specifies the CPU model inside the VMI. List of available models https://github.com/libvirt/libvirt/tree/master/src/cpu_map. It is possible to specify special cases like \"host-passthrough\" to get the same CPU as the node and \"host-model\" to get CPU closest to the node one. Defaults to host-model.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * NUMA allows specifying settings for the guest NUMA topology
     */
    @com.fasterxml.jackson.annotation.JsonProperty("numa")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("NUMA allows specifying settings for the guest NUMA topology")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.cpu.Numa numa;

    public io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.cpu.Numa getNuma() {
        return numa;
    }

    public void setNuma(io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.cpu.Numa numa) {
        this.numa = numa;
    }

    /**
     * Realtime instructs the virt-launcher to tune the VMI for lower latency, optional for real time workloads
     */
    @com.fasterxml.jackson.annotation.JsonProperty("realtime")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Realtime instructs the virt-launcher to tune the VMI for lower latency, optional for real time workloads")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.cpu.Realtime realtime;

    public io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.cpu.Realtime getRealtime() {
        return realtime;
    }

    public void setRealtime(
            io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.cpu.Realtime realtime) {
        this.realtime = realtime;
    }

    /**
     * Sockets specifies the number of sockets inside the vmi. Must be a value greater or equal 1.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sockets")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Sockets specifies the number of sockets inside the vmi. Must be a value greater or equal 1.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer sockets;

    public Integer getSockets() {
        return sockets;
    }

    public void setSockets(Integer sockets) {
        this.sockets = sockets;
    }

    /**
     * Threads specifies the number of threads inside the vmi. Must be a value greater or equal 1.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("threads")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Threads specifies the number of threads inside the vmi. Must be a value greater or equal 1.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer threads;

    public Integer getThreads() {
        return threads;
    }

    public void setThreads(Integer threads) {
        this.threads = threads;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore()
    private java.util.Map<String, Object> additionalProperties = new java.util.HashMap<>();

    @com.fasterxml.jackson.annotation.JsonAnyGetter()
    public java.util.Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    @com.fasterxml.jackson.annotation.JsonAnySetter()
    public void setAdditionalProperties(java.util.Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @com.fasterxml.jackson.annotation.JsonAnySetter()
    public void setAdditionalProperty(java.lang.String key, java.lang.Object value) {
        this.additionalProperties.put(key, value);
    }
}
