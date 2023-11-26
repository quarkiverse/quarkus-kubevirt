package io.quarkus.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "nodeAffinity", "podAffinity", "podAntiAffinity" })
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
public class Affinity implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Describes node affinity scheduling rules for the pod.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeAffinity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Describes node affinity scheduling rules for the pod.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.affinity.NodeAffinity nodeAffinity;

    public io.quarkus.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.affinity.NodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(
            io.quarkus.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.affinity.NodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    /**
     * Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podAffinity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.affinity.PodAffinity podAffinity;

    public io.quarkus.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.affinity.PodAffinity getPodAffinity() {
        return podAffinity;
    }

    public void setPodAffinity(
            io.quarkus.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.affinity.PodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    /**
     * Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other
     * pod(s)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podAntiAffinity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.affinity.PodAntiAffinity podAntiAffinity;

    public io.quarkus.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.affinity.PodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    public void setPodAntiAffinity(
            io.quarkus.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.affinity.PodAntiAffinity podAntiAffinity) {
        this.podAntiAffinity = podAntiAffinity;
    }
}
