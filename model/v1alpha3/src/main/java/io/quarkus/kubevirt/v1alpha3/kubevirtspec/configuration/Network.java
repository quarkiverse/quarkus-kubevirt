package io.quarkus.kubevirt.v1alpha3.kubevirtspec.configuration;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "defaultNetworkInterface", "permitBridgeInterfaceOnPodNetwork",
        "permitSlirpInterface" })
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
public class Network implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("defaultNetworkInterface")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String defaultNetworkInterface;

    public String getDefaultNetworkInterface() {
        return defaultNetworkInterface;
    }

    public void setDefaultNetworkInterface(String defaultNetworkInterface) {
        this.defaultNetworkInterface = defaultNetworkInterface;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("permitBridgeInterfaceOnPodNetwork")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean permitBridgeInterfaceOnPodNetwork;

    public Boolean getPermitBridgeInterfaceOnPodNetwork() {
        return permitBridgeInterfaceOnPodNetwork;
    }

    public void setPermitBridgeInterfaceOnPodNetwork(Boolean permitBridgeInterfaceOnPodNetwork) {
        this.permitBridgeInterfaceOnPodNetwork = permitBridgeInterfaceOnPodNetwork;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("permitSlirpInterface")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean permitSlirpInterface;

    public Boolean getPermitSlirpInterface() {
        return permitSlirpInterface;
    }

    public void setPermitSlirpInterface(Boolean permitSlirpInterface) {
        this.permitSlirpInterface = permitSlirpInterface;
    }
}
