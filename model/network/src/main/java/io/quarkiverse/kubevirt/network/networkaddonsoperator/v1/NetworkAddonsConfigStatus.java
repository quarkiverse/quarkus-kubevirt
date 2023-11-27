package io.quarkiverse.kubevirt.network.networkaddonsoperator.v1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "conditions", "containers", "observedVersion", "operatorVersion",
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
public class NetworkAddonsConfigStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigstatus.Conditions> conditions;

    public java.util.List<io.quarkiverse.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigstatus.Conditions> getConditions() {
        return conditions;
    }

    public void setConditions(
            java.util.List<io.quarkiverse.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigstatus.Conditions> conditions) {
        this.conditions = conditions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("containers")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigstatus.Containers> containers;

    public java.util.List<io.quarkiverse.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigstatus.Containers> getContainers() {
        return containers;
    }

    public void setContainers(
            java.util.List<io.quarkiverse.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigstatus.Containers> containers) {
        this.containers = containers;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("observedVersion")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String observedVersion;

    public String getObservedVersion() {
        return observedVersion;
    }

    public void setObservedVersion(String observedVersion) {
        this.observedVersion = observedVersion;
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

    @com.fasterxml.jackson.annotation.JsonProperty("targetVersion")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String targetVersion;

    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }
}
