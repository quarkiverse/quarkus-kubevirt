package io.quarkus.kubevirt.network.networkaddonsoperator.v1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "imagePullPolicy", "kubeMacPool", "kubeSecondaryDNS", "linuxBridge",
        "macvtap", "multus", "multusDynamicNetworks", "ovs", "placementConfiguration", "selfSignConfiguration",
        "tlsSecurityProfile" })
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
public class NetworkAddonsConfigSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * PullPolicy describes a policy for if/when to pull a container image
     */
    @com.fasterxml.jackson.annotation.JsonProperty("imagePullPolicy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PullPolicy describes a policy for if/when to pull a container image")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String imagePullPolicy;

    public String getImagePullPolicy() {
        return imagePullPolicy;
    }

    public void setImagePullPolicy(String imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
    }

    /**
     * KubeMacPool plugin manages MAC allocation to Pods and VMs in Kubernetes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kubeMacPool")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("KubeMacPool plugin manages MAC allocation to Pods and VMs in Kubernetes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.KubeMacPool kubeMacPool;

    public io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.KubeMacPool getKubeMacPool() {
        return kubeMacPool;
    }

    public void setKubeMacPool(
            io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.KubeMacPool kubeMacPool) {
        this.kubeMacPool = kubeMacPool;
    }

    /**
     * KubeSecondaryDNS plugin allows to support FQDN for VMI's secondary networks
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kubeSecondaryDNS")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("KubeSecondaryDNS plugin allows to support FQDN for VMI's secondary networks")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.KubeSecondaryDNS kubeSecondaryDNS;

    public io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.KubeSecondaryDNS getKubeSecondaryDNS() {
        return kubeSecondaryDNS;
    }

    public void setKubeSecondaryDNS(
            io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.KubeSecondaryDNS kubeSecondaryDNS) {
        this.kubeSecondaryDNS = kubeSecondaryDNS;
    }

    /**
     * LinuxBridge plugin allows users to create a bridge and add the host and the container to it
     */
    @com.fasterxml.jackson.annotation.JsonProperty("linuxBridge")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LinuxBridge plugin allows users to create a bridge and add the host and the container to it")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.LinuxBridge linuxBridge;

    public io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.LinuxBridge getLinuxBridge() {
        return linuxBridge;
    }

    public void setLinuxBridge(
            io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.LinuxBridge linuxBridge) {
        this.linuxBridge = linuxBridge;
    }

    /**
     * MacvtapCni plugin allows users to define Kubernetes networks on top of existing host interfaces
     */
    @com.fasterxml.jackson.annotation.JsonProperty("macvtap")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("MacvtapCni plugin allows users to define Kubernetes networks on top of existing host interfaces")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.Macvtap macvtap;

    public io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.Macvtap getMacvtap() {
        return macvtap;
    }

    public void setMacvtap(io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.Macvtap macvtap) {
        this.macvtap = macvtap;
    }

    /**
     * Multus plugin enables attaching multiple network interfaces to Pods in Kubernetes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("multus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Multus plugin enables attaching multiple network interfaces to Pods in Kubernetes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.Multus multus;

    public io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.Multus getMultus() {
        return multus;
    }

    public void setMultus(io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.Multus multus) {
        this.multus = multus;
    }

    /**
     * A multus extension enabling hot-plug and hot-unplug of Pod interfaces
     */
    @com.fasterxml.jackson.annotation.JsonProperty("multusDynamicNetworks")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A multus extension enabling hot-plug and hot-unplug of Pod interfaces")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.MultusDynamicNetworks multusDynamicNetworks;

    public io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.MultusDynamicNetworks getMultusDynamicNetworks() {
        return multusDynamicNetworks;
    }

    public void setMultusDynamicNetworks(
            io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.MultusDynamicNetworks multusDynamicNetworks) {
        this.multusDynamicNetworks = multusDynamicNetworks;
    }

    /**
     * Ovs plugin allows users to define Kubernetes networks on top of Open vSwitch bridges available on nodes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ovs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Ovs plugin allows users to define Kubernetes networks on top of Open vSwitch bridges available on nodes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.Ovs ovs;

    public io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.Ovs getOvs() {
        return ovs;
    }

    public void setOvs(io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.Ovs ovs) {
        this.ovs = ovs;
    }

    /**
     * PlacementConfiguration defines node placement configuration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("placementConfiguration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PlacementConfiguration defines node placement configuration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.PlacementConfiguration placementConfiguration;

    public io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.PlacementConfiguration getPlacementConfiguration() {
        return placementConfiguration;
    }

    public void setPlacementConfiguration(
            io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.PlacementConfiguration placementConfiguration) {
        this.placementConfiguration = placementConfiguration;
    }

    /**
     * SelfSignConfiguration defines self sign configuration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("selfSignConfiguration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SelfSignConfiguration defines self sign configuration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.SelfSignConfiguration selfSignConfiguration;

    public io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.SelfSignConfiguration getSelfSignConfiguration() {
        return selfSignConfiguration;
    }

    public void setSelfSignConfiguration(
            io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.SelfSignConfiguration selfSignConfiguration) {
        this.selfSignConfiguration = selfSignConfiguration;
    }

    /**
     * TLSSecurityProfile defines the schema for a TLS security profile. This object is used by operators to apply TLS security
     * settings to operands.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsSecurityProfile")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TLSSecurityProfile defines the schema for a TLS security profile. This object is used by operators to apply TLS security settings to operands.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.TlsSecurityProfile tlsSecurityProfile;

    public io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.TlsSecurityProfile getTlsSecurityProfile() {
        return tlsSecurityProfile;
    }

    public void setTlsSecurityProfile(
            io.quarkus.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.TlsSecurityProfile tlsSecurityProfile) {
        this.tlsSecurityProfile = tlsSecurityProfile;
    }
}
