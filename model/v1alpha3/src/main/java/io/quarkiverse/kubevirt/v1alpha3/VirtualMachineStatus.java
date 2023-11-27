package io.quarkiverse.kubevirt.v1alpha3;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "conditions", "created", "memoryDumpRequest", "printableStatus", "ready",
        "restoreInProgress", "snapshotInProgress", "startFailure", "stateChangeRequests", "volumeRequests",
        "volumeSnapshotStatuses" })
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
public class VirtualMachineStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Hold the state information of the VirtualMachine and its VirtualMachineInstance
     */
    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Hold the state information of the VirtualMachine and its VirtualMachineInstance")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachinestatus.Conditions> conditions;

    public java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachinestatus.Conditions> getConditions() {
        return conditions;
    }

    public void setConditions(java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachinestatus.Conditions> conditions) {
        this.conditions = conditions;
    }

    /**
     * Created indicates if the virtual machine is created in the cluster
     */
    @com.fasterxml.jackson.annotation.JsonProperty("created")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Created indicates if the virtual machine is created in the cluster")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean created;

    public Boolean getCreated() {
        return created;
    }

    public void setCreated(Boolean created) {
        this.created = created;
    }

    /**
     * MemoryDumpRequest tracks memory dump request phase and info of getting a memory dump to the given pvc
     */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryDumpRequest")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("MemoryDumpRequest tracks memory dump request phase and info of getting a memory dump to the given pvc")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private io.quarkiverse.kubevirt.v1alpha3.virtualmachinestatus.MemoryDumpRequest memoryDumpRequest;

    public io.quarkiverse.kubevirt.v1alpha3.virtualmachinestatus.MemoryDumpRequest getMemoryDumpRequest() {
        return memoryDumpRequest;
    }

    public void setMemoryDumpRequest(
            io.quarkiverse.kubevirt.v1alpha3.virtualmachinestatus.MemoryDumpRequest memoryDumpRequest) {
        this.memoryDumpRequest = memoryDumpRequest;
    }

    /**
     * PrintableStatus is a human readable, high-level representation of the status of the virtual machine
     */
    @com.fasterxml.jackson.annotation.JsonProperty("printableStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PrintableStatus is a human readable, high-level representation of the status of the virtual machine")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String printableStatus;

    public String getPrintableStatus() {
        return printableStatus;
    }

    public void setPrintableStatus(String printableStatus) {
        this.printableStatus = printableStatus;
    }

    /**
     * Ready indicates if the virtual machine is running and ready
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ready")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Ready indicates if the virtual machine is running and ready")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean ready;

    public Boolean getReady() {
        return ready;
    }

    public void setReady(Boolean ready) {
        this.ready = ready;
    }

    /**
     * RestoreInProgress is the name of the VirtualMachineRestore currently executing
     */
    @com.fasterxml.jackson.annotation.JsonProperty("restoreInProgress")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RestoreInProgress is the name of the VirtualMachineRestore currently executing")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String restoreInProgress;

    public String getRestoreInProgress() {
        return restoreInProgress;
    }

    public void setRestoreInProgress(String restoreInProgress) {
        this.restoreInProgress = restoreInProgress;
    }

    /**
     * SnapshotInProgress is the name of the VirtualMachineSnapshot currently executing
     */
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotInProgress")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SnapshotInProgress is the name of the VirtualMachineSnapshot currently executing")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String snapshotInProgress;

    public String getSnapshotInProgress() {
        return snapshotInProgress;
    }

    public void setSnapshotInProgress(String snapshotInProgress) {
        this.snapshotInProgress = snapshotInProgress;
    }

    /**
     * StartFailure tracks consecutive VMI startup failures for the purposes of crash loop backoffs
     */
    @com.fasterxml.jackson.annotation.JsonProperty("startFailure")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("StartFailure tracks consecutive VMI startup failures for the purposes of crash loop backoffs")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private io.quarkiverse.kubevirt.v1alpha3.virtualmachinestatus.StartFailure startFailure;

    public io.quarkiverse.kubevirt.v1alpha3.virtualmachinestatus.StartFailure getStartFailure() {
        return startFailure;
    }

    public void setStartFailure(io.quarkiverse.kubevirt.v1alpha3.virtualmachinestatus.StartFailure startFailure) {
        this.startFailure = startFailure;
    }

    /**
     * StateChangeRequests indicates a list of actions that should be taken on a VMI e.g. stop a specific VMI then start a new
     * one.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("stateChangeRequests")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("StateChangeRequests indicates a list of actions that should be taken on a VMI e.g. stop a specific VMI then start a new one.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachinestatus.StateChangeRequests> stateChangeRequests;

    public java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachinestatus.StateChangeRequests> getStateChangeRequests() {
        return stateChangeRequests;
    }

    public void setStateChangeRequests(
            java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachinestatus.StateChangeRequests> stateChangeRequests) {
        this.stateChangeRequests = stateChangeRequests;
    }

    /**
     * VolumeRequests indicates a list of volumes add or remove from the VMI template and hotplug on an active running VMI.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeRequests")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("VolumeRequests indicates a list of volumes add or remove from the VMI template and hotplug on an active running VMI.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachinestatus.VolumeRequests> volumeRequests;

    public java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachinestatus.VolumeRequests> getVolumeRequests() {
        return volumeRequests;
    }

    public void setVolumeRequests(
            java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachinestatus.VolumeRequests> volumeRequests) {
        this.volumeRequests = volumeRequests;
    }

    /**
     * VolumeSnapshotStatuses indicates a list of statuses whether snapshotting is supported by each volume.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeSnapshotStatuses")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("VolumeSnapshotStatuses indicates a list of statuses whether snapshotting is supported by each volume.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachinestatus.VolumeSnapshotStatuses> volumeSnapshotStatuses;

    public java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachinestatus.VolumeSnapshotStatuses> getVolumeSnapshotStatuses() {
        return volumeSnapshotStatuses;
    }

    public void setVolumeSnapshotStatuses(
            java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachinestatus.VolumeSnapshotStatuses> volumeSnapshotStatuses) {
        this.volumeSnapshotStatuses = volumeSnapshotStatuses;
    }
}
