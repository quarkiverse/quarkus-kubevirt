package io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.placementconfiguration;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "affinity", "nodeSelector", "tolerations" })
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
public class Infra implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Affinity is a group of affinity scheduling rules.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("affinity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Affinity is a group of affinity scheduling rules.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.placementconfiguration.infra.Affinity affinity;

    public io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.placementconfiguration.infra.Affinity getAffinity() {
        return affinity;
    }

    public void setAffinity(
            io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.placementconfiguration.infra.Affinity affinity) {
        this.affinity = affinity;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("nodeSelector")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> nodeSelector;

    public java.util.Map<java.lang.String, String> getNodeSelector() {
        return nodeSelector;
    }

    public void setNodeSelector(java.util.Map<java.lang.String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("tolerations")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.placementconfiguration.infra.Tolerations> tolerations;

    public java.util.List<io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.placementconfiguration.infra.Tolerations> getTolerations() {
        return tolerations;
    }

    public void setTolerations(
            java.util.List<io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.placementconfiguration.infra.Tolerations> tolerations) {
        this.tolerations = tolerations;
    }
}
