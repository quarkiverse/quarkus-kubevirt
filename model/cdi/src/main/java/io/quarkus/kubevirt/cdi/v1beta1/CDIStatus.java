package io.quarkus.kubevirt.cdi.v1beta1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "conditions", "observedVersion", "operatorVersion", "phase",
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
public class CDIStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * A list of current conditions of the resource
     */
    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A list of current conditions of the resource")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkus.kubevirt.cdi.v1beta1.cdistatus.Conditions> conditions;

    public java.util.List<io.quarkus.kubevirt.cdi.v1beta1.cdistatus.Conditions> getConditions() {
        return conditions;
    }

    public void setConditions(java.util.List<io.quarkus.kubevirt.cdi.v1beta1.cdistatus.Conditions> conditions) {
        this.conditions = conditions;
    }

    /**
     * The observed version of the resource
     */
    @com.fasterxml.jackson.annotation.JsonProperty("observedVersion")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The observed version of the resource")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String observedVersion;

    public String getObservedVersion() {
        return observedVersion;
    }

    public void setObservedVersion(String observedVersion) {
        this.observedVersion = observedVersion;
    }

    /**
     * The version of the resource as defined by the operator
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operatorVersion")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The version of the resource as defined by the operator")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String operatorVersion;

    public String getOperatorVersion() {
        return operatorVersion;
    }

    public void setOperatorVersion(String operatorVersion) {
        this.operatorVersion = operatorVersion;
    }

    /**
     * Phase is the current phase of the deployment
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Phase is the current phase of the deployment")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * The desired version of the resource
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetVersion")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The desired version of the resource")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String targetVersion;

    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }
}
