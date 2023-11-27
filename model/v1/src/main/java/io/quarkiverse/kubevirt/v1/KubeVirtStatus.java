package io.quarkiverse.kubevirt.v1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "conditions", "generations", "observedDeploymentConfig",
        "observedDeploymentID", "observedGeneration", "observedKubeVirtRegistry", "observedKubeVirtVersion", "operatorVersion",
        "outdatedVirtualMachineInstanceWorkloads", "phase", "targetDeploymentConfig", "targetDeploymentID",
        "targetKubeVirtRegistry", "targetKubeVirtVersion" })
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
public class KubeVirtStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.v1.kubevirtstatus.Conditions> conditions;

    public java.util.List<io.quarkiverse.kubevirt.v1.kubevirtstatus.Conditions> getConditions() {
        return conditions;
    }

    public void setConditions(java.util.List<io.quarkiverse.kubevirt.v1.kubevirtstatus.Conditions> conditions) {
        this.conditions = conditions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("generations")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.v1.kubevirtstatus.Generations> generations;

    public java.util.List<io.quarkiverse.kubevirt.v1.kubevirtstatus.Generations> getGenerations() {
        return generations;
    }

    public void setGenerations(java.util.List<io.quarkiverse.kubevirt.v1.kubevirtstatus.Generations> generations) {
        this.generations = generations;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("observedDeploymentConfig")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String observedDeploymentConfig;

    public String getObservedDeploymentConfig() {
        return observedDeploymentConfig;
    }

    public void setObservedDeploymentConfig(String observedDeploymentConfig) {
        this.observedDeploymentConfig = observedDeploymentConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("observedDeploymentID")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String observedDeploymentID;

    public String getObservedDeploymentID() {
        return observedDeploymentID;
    }

    public void setObservedDeploymentID(String observedDeploymentID) {
        this.observedDeploymentID = observedDeploymentID;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("observedGeneration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long observedGeneration;

    public Long getObservedGeneration() {
        return observedGeneration;
    }

    public void setObservedGeneration(Long observedGeneration) {
        this.observedGeneration = observedGeneration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("observedKubeVirtRegistry")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String observedKubeVirtRegistry;

    public String getObservedKubeVirtRegistry() {
        return observedKubeVirtRegistry;
    }

    public void setObservedKubeVirtRegistry(String observedKubeVirtRegistry) {
        this.observedKubeVirtRegistry = observedKubeVirtRegistry;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("observedKubeVirtVersion")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String observedKubeVirtVersion;

    public String getObservedKubeVirtVersion() {
        return observedKubeVirtVersion;
    }

    public void setObservedKubeVirtVersion(String observedKubeVirtVersion) {
        this.observedKubeVirtVersion = observedKubeVirtVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("operatorVersion")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String operatorVersion;

    public String getOperatorVersion() {
        return operatorVersion;
    }

    public void setOperatorVersion(String operatorVersion) {
        this.operatorVersion = operatorVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("outdatedVirtualMachineInstanceWorkloads")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long outdatedVirtualMachineInstanceWorkloads;

    public Long getOutdatedVirtualMachineInstanceWorkloads() {
        return outdatedVirtualMachineInstanceWorkloads;
    }

    public void setOutdatedVirtualMachineInstanceWorkloads(Long outdatedVirtualMachineInstanceWorkloads) {
        this.outdatedVirtualMachineInstanceWorkloads = outdatedVirtualMachineInstanceWorkloads;
    }

    /**
     * KubeVirtPhase is a label for the phase of a KubeVirt deployment at the current time.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("KubeVirtPhase is a label for the phase of a KubeVirt deployment at the current time.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("targetDeploymentConfig")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String targetDeploymentConfig;

    public String getTargetDeploymentConfig() {
        return targetDeploymentConfig;
    }

    public void setTargetDeploymentConfig(String targetDeploymentConfig) {
        this.targetDeploymentConfig = targetDeploymentConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("targetDeploymentID")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String targetDeploymentID;

    public String getTargetDeploymentID() {
        return targetDeploymentID;
    }

    public void setTargetDeploymentID(String targetDeploymentID) {
        this.targetDeploymentID = targetDeploymentID;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("targetKubeVirtRegistry")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String targetKubeVirtRegistry;

    public String getTargetKubeVirtRegistry() {
        return targetKubeVirtRegistry;
    }

    public void setTargetKubeVirtRegistry(String targetKubeVirtRegistry) {
        this.targetKubeVirtRegistry = targetKubeVirtRegistry;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("targetKubeVirtVersion")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String targetKubeVirtVersion;

    public String getTargetKubeVirtVersion() {
        return targetKubeVirtVersion;
    }

    public void setTargetKubeVirtVersion(String targetKubeVirtVersion) {
        this.targetKubeVirtVersion = targetKubeVirtVersion;
    }
}
