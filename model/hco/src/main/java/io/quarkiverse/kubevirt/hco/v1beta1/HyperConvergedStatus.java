package io.quarkiverse.kubevirt.hco.v1beta1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "conditions", "dataImportCronTemplates", "dataImportSchedule",
        "observedGeneration", "relatedObjects", "systemHealthStatus", "versions" })
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
public class HyperConvergedStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Conditions describes the state of the HyperConverged resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Conditions describes the state of the HyperConverged resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedstatus.Conditions> conditions;

    public java.util.List<io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedstatus.Conditions> getConditions() {
        return conditions;
    }

    public void setConditions(java.util.List<io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedstatus.Conditions> conditions) {
        this.conditions = conditions;
    }

    /**
     * DataImportCronTemplates is a list of the actual DataImportCronTemplates as HCO update in the SSP CR. The list contains
     * both the common and the custom templates, including any modification done by HCO.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataImportCronTemplates")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DataImportCronTemplates is a list of the actual DataImportCronTemplates as HCO update in the SSP CR. The list contains both the common and the custom templates, including any modification done by HCO.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedstatus.DataImportCronTemplates> dataImportCronTemplates;

    public java.util.List<io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedstatus.DataImportCronTemplates> getDataImportCronTemplates() {
        return dataImportCronTemplates;
    }

    public void setDataImportCronTemplates(
            java.util.List<io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedstatus.DataImportCronTemplates> dataImportCronTemplates) {
        this.dataImportCronTemplates = dataImportCronTemplates;
    }

    /**
     * DataImportSchedule is the cron expression that is used in for the hard-coded data import cron templates. HCO generates
     * the value of this field once and stored in the status field, so will survive restart.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataImportSchedule")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DataImportSchedule is the cron expression that is used in for the hard-coded data import cron templates. HCO generates the value of this field once and stored in the status field, so will survive restart.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String dataImportSchedule;

    public String getDataImportSchedule() {
        return dataImportSchedule;
    }

    public void setDataImportSchedule(String dataImportSchedule) {
        this.dataImportSchedule = dataImportSchedule;
    }

    /**
     * ObservedGeneration reflects the HyperConverged resource generation. If the ObservedGeneration is less than the resource
     * generation in metadata, the status is out of date
     */
    @com.fasterxml.jackson.annotation.JsonProperty("observedGeneration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ObservedGeneration reflects the HyperConverged resource generation. If the ObservedGeneration is less than the resource generation in metadata, the status is out of date")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long observedGeneration;

    public Long getObservedGeneration() {
        return observedGeneration;
    }

    public void setObservedGeneration(Long observedGeneration) {
        this.observedGeneration = observedGeneration;
    }

    /**
     * RelatedObjects is a list of objects created and maintained by this operator. Object references will be added to this list
     * after they have been created AND found in the cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("relatedObjects")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RelatedObjects is a list of objects created and maintained by this operator. Object references will be added to this list after they have been created AND found in the cluster.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedstatus.RelatedObjects> relatedObjects;

    public java.util.List<io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedstatus.RelatedObjects> getRelatedObjects() {
        return relatedObjects;
    }

    public void setRelatedObjects(
            java.util.List<io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedstatus.RelatedObjects> relatedObjects) {
        this.relatedObjects = relatedObjects;
    }

    /**
     * SystemHealthStatus reflects the health of HCO and its secondary resources, based on the aggregated conditions.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemHealthStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SystemHealthStatus reflects the health of HCO and its secondary resources, based on the aggregated conditions.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String systemHealthStatus;

    public String getSystemHealthStatus() {
        return systemHealthStatus;
    }

    public void setSystemHealthStatus(String systemHealthStatus) {
        this.systemHealthStatus = systemHealthStatus;
    }

    /**
     * Versions is a list of HCO component versions, as name/version pairs. The version with a name of "operator" is the HCO
     * version itself, as described here:
     * https://github.com/openshift/cluster-version-operator/blob/master/docs/dev/clusteroperator.md#version
     */
    @com.fasterxml.jackson.annotation.JsonProperty("versions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Versions is a list of HCO component versions, as name/version pairs. The version with a name of \"operator\" is the HCO version itself, as described here: https://github.com/openshift/cluster-version-operator/blob/master/docs/dev/clusteroperator.md#version")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedstatus.Versions> versions;

    public java.util.List<io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedstatus.Versions> getVersions() {
        return versions;
    }

    public void setVersions(java.util.List<io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedstatus.Versions> versions) {
        this.versions = versions;
    }
}
