package io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancespec.networks;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "vmIPv6NetworkCIDR", "vmNetworkCIDR" })
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
public class Pod implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * IPv6 CIDR for the vm network. Defaults to fd10:0:2::/120 if not specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vmIPv6NetworkCIDR")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("IPv6 CIDR for the vm network. Defaults to fd10:0:2::/120 if not specified.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String vmIPv6NetworkCIDR;

    public String getVmIPv6NetworkCIDR() {
        return vmIPv6NetworkCIDR;
    }

    public void setVmIPv6NetworkCIDR(String vmIPv6NetworkCIDR) {
        this.vmIPv6NetworkCIDR = vmIPv6NetworkCIDR;
    }

    /**
     * CIDR for vm network. Default 10.0.2.0/24 if not specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vmNetworkCIDR")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CIDR for vm network. Default 10.0.2.0/24 if not specified.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String vmNetworkCIDR;

    public String getVmNetworkCIDR() {
        return vmNetworkCIDR;
    }

    public void setVmNetworkCIDR(String vmNetworkCIDR) {
        this.vmNetworkCIDR = vmNetworkCIDR;
    }
}
