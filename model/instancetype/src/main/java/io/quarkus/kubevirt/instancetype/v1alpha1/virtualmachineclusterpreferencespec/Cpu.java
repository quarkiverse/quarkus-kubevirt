package io.quarkus.kubevirt.instancetype.v1alpha1.virtualmachineclusterpreferencespec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "preferredCPUTopology" })
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
public class Cpu implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * PreferredCPUTopology optionally defines the preferred guest visible CPU topology, defaults to PreferSockets.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preferredCPUTopology")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredCPUTopology optionally defines the preferred guest visible CPU topology, defaults to PreferSockets.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String preferredCPUTopology;

    public String getPreferredCPUTopology() {
        return preferredCPUTopology;
    }

    public void setPreferredCPUTopology(String preferredCPUTopology) {
        this.preferredCPUTopology = preferredCPUTopology;
    }
}
