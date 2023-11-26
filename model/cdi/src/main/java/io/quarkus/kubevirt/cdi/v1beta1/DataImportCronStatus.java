package io.quarkus.kubevirt.cdi.v1beta1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "conditions", "currentImports", "lastExecutionTimestamp",
        "lastImportTimestamp", "lastImportedPVC" })
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
public class DataImportCronStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkus.kubevirt.cdi.v1beta1.dataimportcronstatus.Conditions> conditions;

    public java.util.List<io.quarkus.kubevirt.cdi.v1beta1.dataimportcronstatus.Conditions> getConditions() {
        return conditions;
    }

    public void setConditions(java.util.List<io.quarkus.kubevirt.cdi.v1beta1.dataimportcronstatus.Conditions> conditions) {
        this.conditions = conditions;
    }

    /**
     * CurrentImports are the imports in progress. Currently only a single import is supported.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("currentImports")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CurrentImports are the imports in progress. Currently only a single import is supported.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkus.kubevirt.cdi.v1beta1.dataimportcronstatus.CurrentImports> currentImports;

    public java.util.List<io.quarkus.kubevirt.cdi.v1beta1.dataimportcronstatus.CurrentImports> getCurrentImports() {
        return currentImports;
    }

    public void setCurrentImports(
            java.util.List<io.quarkus.kubevirt.cdi.v1beta1.dataimportcronstatus.CurrentImports> currentImports) {
        this.currentImports = currentImports;
    }

    /**
     * LastExecutionTimestamp is the time of the last polling
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastExecutionTimestamp")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LastExecutionTimestamp is the time of the last polling")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.time.ZonedDateTime lastExecutionTimestamp;

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssVV")
    public java.time.ZonedDateTime getLastExecutionTimestamp() {
        return lastExecutionTimestamp;
    }

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss[XXX][VV]")
    public void setLastExecutionTimestamp(java.time.ZonedDateTime lastExecutionTimestamp) {
        this.lastExecutionTimestamp = lastExecutionTimestamp;
    }

    /**
     * LastImportTimestamp is the time of the last import
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastImportTimestamp")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LastImportTimestamp is the time of the last import")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.time.ZonedDateTime lastImportTimestamp;

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssVV")
    public java.time.ZonedDateTime getLastImportTimestamp() {
        return lastImportTimestamp;
    }

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss[XXX][VV]")
    public void setLastImportTimestamp(java.time.ZonedDateTime lastImportTimestamp) {
        this.lastImportTimestamp = lastImportTimestamp;
    }

    /**
     * LastImportedPVC is the last imported PVC
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastImportedPVC")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LastImportedPVC is the last imported PVC")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.cdi.v1beta1.dataimportcronstatus.LastImportedPVC lastImportedPVC;

    public io.quarkus.kubevirt.cdi.v1beta1.dataimportcronstatus.LastImportedPVC getLastImportedPVC() {
        return lastImportedPVC;
    }

    public void setLastImportedPVC(io.quarkus.kubevirt.cdi.v1beta1.dataimportcronstatus.LastImportedPVC lastImportedPVC) {
        this.lastImportedPVC = lastImportedPVC;
    }
}
