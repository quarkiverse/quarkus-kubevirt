package io.quarkus.kubevirt.ssp.v1beta1.sspspec.templatevalidator;

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
public class Placement implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * affinity enables pod affinity/anti-affinity placement expanding the types of constraints that can be expressed with
     * nodeSelector. affinity is going to be applied to the relevant kind of pods in parallel with nodeSelector See
     * https://kubernetes.io/docs/concepts/scheduling-eviction/assign-pod-node/#affinity-and-anti-affinity
     */
    @com.fasterxml.jackson.annotation.JsonProperty("affinity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("affinity enables pod affinity/anti-affinity placement expanding the types of constraints that can be expressed with nodeSelector. affinity is going to be applied to the relevant kind of pods in parallel with nodeSelector See https://kubernetes.io/docs/concepts/scheduling-eviction/assign-pod-node/#affinity-and-anti-affinity")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.ssp.v1beta1.sspspec.templatevalidator.placement.Affinity affinity;

    public io.quarkus.kubevirt.ssp.v1beta1.sspspec.templatevalidator.placement.Affinity getAffinity() {
        return affinity;
    }

    public void setAffinity(io.quarkus.kubevirt.ssp.v1beta1.sspspec.templatevalidator.placement.Affinity affinity) {
        this.affinity = affinity;
    }

    /**
     * nodeSelector is the node selector applied to the relevant kind of pods It specifies a map of key-value pairs: for the pod
     * to be eligible to run on a node, the node must have each of the indicated key-value pairs as labels (it can have
     * additional labels as well). See https://kubernetes.io/docs/concepts/configuration/assign-pod-node/#nodeselector
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeSelector")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("nodeSelector is the node selector applied to the relevant kind of pods It specifies a map of key-value pairs: for the pod to be eligible to run on a node, the node must have each of the indicated key-value pairs as labels (it can have additional labels as well). See https://kubernetes.io/docs/concepts/configuration/assign-pod-node/#nodeselector")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> nodeSelector;

    public java.util.Map<java.lang.String, String> getNodeSelector() {
        return nodeSelector;
    }

    public void setNodeSelector(java.util.Map<java.lang.String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    /**
     * tolerations is a list of tolerations applied to the relevant kind of pods See
     * https://kubernetes.io/docs/concepts/configuration/taint-and-toleration/ for more info. These are additional tolerations
     * other than default ones.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tolerations")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("tolerations is a list of tolerations applied to the relevant kind of pods See https://kubernetes.io/docs/concepts/configuration/taint-and-toleration/ for more info. These are additional tolerations other than default ones.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkus.kubevirt.ssp.v1beta1.sspspec.templatevalidator.placement.Tolerations> tolerations;

    public java.util.List<io.quarkus.kubevirt.ssp.v1beta1.sspspec.templatevalidator.placement.Tolerations> getTolerations() {
        return tolerations;
    }

    public void setTolerations(
            java.util.List<io.quarkus.kubevirt.ssp.v1beta1.sspspec.templatevalidator.placement.Tolerations> tolerations) {
        this.tolerations = tolerations;
    }
}
