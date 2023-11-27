package io.quarkiverse.kubevirt.hostpathprovisioner.v1beta1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "conditions", "observedVersion", "operatorVersion", "storagePoolStatuses",
        "targetVersion" })
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
public class HostPathProvisionerStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Conditions contains the current conditions observed by the operator
     */
    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Conditions contains the current conditions observed by the operator")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.hostpathprovisioner.v1beta1.hostpathprovisionerstatus.Conditions> conditions;

    public java.util.List<io.quarkiverse.kubevirt.hostpathprovisioner.v1beta1.hostpathprovisionerstatus.Conditions> getConditions() {
        return conditions;
    }

    public void setConditions(
            java.util.List<io.quarkiverse.kubevirt.hostpathprovisioner.v1beta1.hostpathprovisionerstatus.Conditions> conditions) {
        this.conditions = conditions;
    }

    /**
     * ObservedVersion The observed version of the HostPathProvisioner deployment
     */
    @com.fasterxml.jackson.annotation.JsonProperty("observedVersion")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ObservedVersion The observed version of the HostPathProvisioner deployment")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String observedVersion;

    public String getObservedVersion() {
        return observedVersion;
    }

    public void setObservedVersion(String observedVersion) {
        this.observedVersion = observedVersion;
    }

    /**
     * OperatorVersion The version of the HostPathProvisioner Operator
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operatorVersion")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("OperatorVersion The version of the HostPathProvisioner Operator")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String operatorVersion;

    public String getOperatorVersion() {
        return operatorVersion;
    }

    public void setOperatorVersion(String operatorVersion) {
        this.operatorVersion = operatorVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("storagePoolStatuses")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.hostpathprovisioner.v1beta1.hostpathprovisionerstatus.StoragePoolStatuses> storagePoolStatuses;

    public java.util.List<io.quarkiverse.kubevirt.hostpathprovisioner.v1beta1.hostpathprovisionerstatus.StoragePoolStatuses> getStoragePoolStatuses() {
        return storagePoolStatuses;
    }

    public void setStoragePoolStatuses(
            java.util.List<io.quarkiverse.kubevirt.hostpathprovisioner.v1beta1.hostpathprovisionerstatus.StoragePoolStatuses> storagePoolStatuses) {
        this.storagePoolStatuses = storagePoolStatuses;
    }

    /**
     * TargetVersion The targeted version of the HostPathProvisioner deployment
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetVersion")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TargetVersion The targeted version of the HostPathProvisioner deployment")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String targetVersion;

    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }
}
