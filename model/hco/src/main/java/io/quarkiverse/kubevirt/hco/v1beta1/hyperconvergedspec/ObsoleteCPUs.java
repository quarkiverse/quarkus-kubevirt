package io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "cpuModels", "minCPUModel" })
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
public class ObsoleteCPUs implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * CPUModels is a list of obsolete CPU models. When the node-labeller obtains the list of obsolete CPU models, it eliminates
     * those CPU models and creates labels for valid CPU models. The default values for this field is nil, however, HCO uses
     * opinionated values, and adding values to this list will add them to the opinionated values.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuModels")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CPUModels is a list of obsolete CPU models. When the node-labeller obtains the list of obsolete CPU models, it eliminates those CPU models and creates labels for valid CPU models. The default values for this field is nil, however, HCO uses opinionated values, and adding values to this list will add them to the opinionated values.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> cpuModels;

    public java.util.List<String> getCpuModels() {
        return cpuModels;
    }

    public void setCpuModels(java.util.List<String> cpuModels) {
        this.cpuModels = cpuModels;
    }

    /**
     * MinCPUModel is the Minimum CPU model that is used for basic CPU features; e.g. Penryn or Haswell. The default value for
     * this field is nil, but in KubeVirt, the default value is "Penryn", if nothing else is set. Use this field to override
     * KubeVirt default value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minCPUModel")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("MinCPUModel is the Minimum CPU model that is used for basic CPU features; e.g. Penryn or Haswell. The default value for this field is nil, but in KubeVirt, the default value is \"Penryn\", if nothing else is set. Use this field to override KubeVirt default value.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String minCPUModel;

    public String getMinCPUModel() {
        return minCPUModel;
    }

    public void setMinCPUModel(String minCPUModel) {
        this.minCPUModel = minCPUModel;
    }
}
