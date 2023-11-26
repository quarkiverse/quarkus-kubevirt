package io.quarkus.kubevirt.ssp.v1beta1.sspspec.nodelabeller.placement.affinity.nodeaffinity;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "nodeSelectorTerms" })
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
public class RequiredDuringSchedulingIgnoredDuringExecution implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Required. A list of node selector terms. The terms are ORed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeSelectorTerms")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Required. A list of node selector terms. The terms are ORed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkus.kubevirt.ssp.v1beta1.sspspec.nodelabeller.placement.affinity.nodeaffinity.requiredduringschedulingignoredduringexecution.NodeSelectorTerms> nodeSelectorTerms;

    public java.util.List<io.quarkus.kubevirt.ssp.v1beta1.sspspec.nodelabeller.placement.affinity.nodeaffinity.requiredduringschedulingignoredduringexecution.NodeSelectorTerms> getNodeSelectorTerms() {
        return nodeSelectorTerms;
    }

    public void setNodeSelectorTerms(
            java.util.List<io.quarkus.kubevirt.ssp.v1beta1.sspspec.nodelabeller.placement.affinity.nodeaffinity.requiredduringschedulingignoredduringexecution.NodeSelectorTerms> nodeSelectorTerms) {
        this.nodeSelectorTerms = nodeSelectorTerms;
    }
}
