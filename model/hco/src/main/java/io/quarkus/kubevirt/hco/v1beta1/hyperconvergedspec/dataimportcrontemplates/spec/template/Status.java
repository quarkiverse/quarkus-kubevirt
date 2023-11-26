package io.quarkus.kubevirt.hco.v1beta1.hyperconvergedspec.dataimportcrontemplates.spec.template;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "claimName", "conditions", "phase", "progress", "restartCount" })
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
public class Status implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * ClaimName is the name of the underlying PVC used by the DataVolume.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("claimName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ClaimName is the name of the underlying PVC used by the DataVolume.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String claimName;

    public String getClaimName() {
        return claimName;
    }

    public void setClaimName(String claimName) {
        this.claimName = claimName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkus.kubevirt.hco.v1beta1.hyperconvergedspec.dataimportcrontemplates.spec.template.status.Conditions> conditions;

    public java.util.List<io.quarkus.kubevirt.hco.v1beta1.hyperconvergedspec.dataimportcrontemplates.spec.template.status.Conditions> getConditions() {
        return conditions;
    }

    public void setConditions(
            java.util.List<io.quarkus.kubevirt.hco.v1beta1.hyperconvergedspec.dataimportcrontemplates.spec.template.status.Conditions> conditions) {
        this.conditions = conditions;
    }

    /**
     * Phase is the current phase of the data volume
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Phase is the current phase of the data volume")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * DataVolumeProgress is the current progress of the DataVolume transfer operation. Value between 0 and 100 inclusive, N/A
     * if not available
     */
    @com.fasterxml.jackson.annotation.JsonProperty("progress")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DataVolumeProgress is the current progress of the DataVolume transfer operation. Value between 0 and 100 inclusive, N/A if not available")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String progress;

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    /**
     * RestartCount is the number of times the pod populating the DataVolume has restarted
     */
    @com.fasterxml.jackson.annotation.JsonProperty("restartCount")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RestartCount is the number of times the pod populating the DataVolume has restarted")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer restartCount;

    public Integer getRestartCount() {
        return restartCount;
    }

    public void setRestartCount(Integer restartCount) {
        this.restartCount = restartCount;
    }
}
