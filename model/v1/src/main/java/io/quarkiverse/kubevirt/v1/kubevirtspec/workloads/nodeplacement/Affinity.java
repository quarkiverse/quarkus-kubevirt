package io.quarkiverse.kubevirt.v1.kubevirtspec.workloads.nodeplacement;

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
    private io.quarkiverse.kubevirt.v1.kubevirtspec.workloads.nodeplacement.affinity.NodeAffinity nodeAffinity;

    public io.quarkiverse.kubevirt.v1.kubevirtspec.workloads.nodeplacement.affinity.NodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(
            io.quarkiverse.kubevirt.v1.kubevirtspec.workloads.nodeplacement.affinity.NodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    /**
     * Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podAffinity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1.kubevirtspec.workloads.nodeplacement.affinity.PodAffinity podAffinity;

    public io.quarkiverse.kubevirt.v1.kubevirtspec.workloads.nodeplacement.affinity.PodAffinity getPodAffinity() {
        return podAffinity;
    }

    public void setPodAffinity(
            io.quarkiverse.kubevirt.v1.kubevirtspec.workloads.nodeplacement.affinity.PodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    /**
     * Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other
     * pod(s)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podAntiAffinity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1.kubevirtspec.workloads.nodeplacement.affinity.PodAntiAffinity podAntiAffinity;

    public io.quarkiverse.kubevirt.v1.kubevirtspec.workloads.nodeplacement.affinity.PodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    public void setPodAntiAffinity(
            io.quarkiverse.kubevirt.v1.kubevirtspec.workloads.nodeplacement.affinity.PodAntiAffinity podAntiAffinity) {
        this.podAntiAffinity = podAntiAffinity;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore()
    private java.util.Map<String, Object> additionalProperties = new java.util.HashMap<>();

    @com.fasterxml.jackson.annotation.JsonAnyGetter()
    public java.util.Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    @com.fasterxml.jackson.annotation.JsonAnySetter()
    public void setAdditionalProperties(java.util.Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @com.fasterxml.jackson.annotation.JsonAnySetter()
    public void setAdditionalProperty(java.lang.String key, java.lang.Object value) {
        this.additionalProperties.put(key, value);
    }
}
