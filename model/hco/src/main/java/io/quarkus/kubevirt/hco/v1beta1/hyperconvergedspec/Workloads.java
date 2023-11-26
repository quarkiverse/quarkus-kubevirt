package io.quarkus.kubevirt.hco.v1beta1.hyperconvergedspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "nodePlacement" })
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
public class Workloads implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * NodePlacement describes node scheduling configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodePlacement")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("NodePlacement describes node scheduling configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.hco.v1beta1.hyperconvergedspec.workloads.NodePlacement nodePlacement;

    public io.quarkus.kubevirt.hco.v1beta1.hyperconvergedspec.workloads.NodePlacement getNodePlacement() {
        return nodePlacement;
    }

    public void setNodePlacement(io.quarkus.kubevirt.hco.v1beta1.hyperconvergedspec.workloads.NodePlacement nodePlacement) {
        this.nodePlacement = nodePlacement;
    }
}
