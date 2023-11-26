package io.quarkus.kubevirt.v1.virtualmachineinstancepresetspec.domain.devices;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "acpiIndex", "bootOrder", "bridge", "dhcpOptions", "macAddress",
        "macvtap", "masquerade", "model", "name", "passt", "pciAddress", "ports", "slirp", "sriov", "tag" })
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
public class Interfaces implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * If specified, the ACPI index is used to provide network interface device naming, that is stable across changes in PCI
     * addresses assigned to the device. This value is required to be unique across all devices and be between 1 and
     * (16*1024-1).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("acpiIndex")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If specified, the ACPI index is used to provide network interface device naming, that is stable across changes in PCI addresses assigned to the device. This value is required to be unique across all devices and be between 1 and (16*1024-1).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long acpiIndex;

    public Long getAcpiIndex() {
        return acpiIndex;
    }

    public void setAcpiIndex(Long acpiIndex) {
        this.acpiIndex = acpiIndex;
    }

    /**
     * BootOrder is an integer value > 0, used to determine ordering of boot devices. Lower values take precedence. Each
     * interface or disk that has a boot order must have a unique value. Interfaces without a boot order are not tried.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bootOrder")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("BootOrder is an integer value > 0, used to determine ordering of boot devices. Lower values take precedence. Each interface or disk that has a boot order must have a unique value. Interfaces without a boot order are not tried.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long bootOrder;

    public Long getBootOrder() {
        return bootOrder;
    }

    public void setBootOrder(Long bootOrder) {
        this.bootOrder = bootOrder;
    }

    /**
     * InterfaceBridge connects to a given network via a linux bridge.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bridge")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("InterfaceBridge connects to a given network via a linux bridge.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1.virtualmachineinstancepresetspec.domain.devices.interfaces.Bridge bridge;

    public io.quarkus.kubevirt.v1.virtualmachineinstancepresetspec.domain.devices.interfaces.Bridge getBridge() {
        return bridge;
    }

    public void setBridge(io.quarkus.kubevirt.v1.virtualmachineinstancepresetspec.domain.devices.interfaces.Bridge bridge) {
        this.bridge = bridge;
    }

    /**
     * If specified the network interface will pass additional DHCP options to the VMI
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dhcpOptions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If specified the network interface will pass additional DHCP options to the VMI")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1.virtualmachineinstancepresetspec.domain.devices.interfaces.DhcpOptions dhcpOptions;

    public io.quarkus.kubevirt.v1.virtualmachineinstancepresetspec.domain.devices.interfaces.DhcpOptions getDhcpOptions() {
        return dhcpOptions;
    }

    public void setDhcpOptions(
            io.quarkus.kubevirt.v1.virtualmachineinstancepresetspec.domain.devices.interfaces.DhcpOptions dhcpOptions) {
        this.dhcpOptions = dhcpOptions;
    }

    /**
     * Interface MAC address. For example: de:ad:00:00:be:af or DE-AD-00-00-BE-AF.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("macAddress")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Interface MAC address. For example: de:ad:00:00:be:af or DE-AD-00-00-BE-AF.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String macAddress;

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * InterfaceMacvtap connects to a given network by extending the Kubernetes node's L2 networks via a macvtap interface.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("macvtap")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("InterfaceMacvtap connects to a given network by extending the Kubernetes node's L2 networks via a macvtap interface.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1.virtualmachineinstancepresetspec.domain.devices.interfaces.Macvtap macvtap;

    public io.quarkus.kubevirt.v1.virtualmachineinstancepresetspec.domain.devices.interfaces.Macvtap getMacvtap() {
        return macvtap;
    }

    public void setMacvtap(io.quarkus.kubevirt.v1.virtualmachineinstancepresetspec.domain.devices.interfaces.Macvtap macvtap) {
        this.macvtap = macvtap;
    }

    /**
     * InterfaceMasquerade connects to a given network using netfilter rules to nat the traffic.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("masquerade")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("InterfaceMasquerade connects to a given network using netfilter rules to nat the traffic.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1.virtualmachineinstancepresetspec.domain.devices.interfaces.Masquerade masquerade;

    public io.quarkus.kubevirt.v1.virtualmachineinstancepresetspec.domain.devices.interfaces.Masquerade getMasquerade() {
        return masquerade;
    }

    public void setMasquerade(
            io.quarkus.kubevirt.v1.virtualmachineinstancepresetspec.domain.devices.interfaces.Masquerade masquerade) {
        this.masquerade = masquerade;
    }

    /**
     * Interface model. One of: e1000, e1000e, ne2k_pci, pcnet, rtl8139, virtio. Defaults to virtio. TODO:(ihar) switch to enums
     * once opengen-api supports them. See: https://github.com/kubernetes/kube-openapi/issues/51
     */
    @com.fasterxml.jackson.annotation.JsonProperty("model")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Interface model. One of: e1000, e1000e, ne2k_pci, pcnet, rtl8139, virtio. Defaults to virtio. TODO:(ihar) switch to enums once opengen-api supports them. See: https://github.com/kubernetes/kube-openapi/issues/51")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Logical name of the interface as well as a reference to the associated networks. Must match the Name of a Network.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Logical name of the interface as well as a reference to the associated networks. Must match the Name of a Network.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * InterfacePasst connects to a given network.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("passt")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("InterfacePasst connects to a given network.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1.virtualmachineinstancepresetspec.domain.devices.interfaces.Passt passt;

    public io.quarkus.kubevirt.v1.virtualmachineinstancepresetspec.domain.devices.interfaces.Passt getPasst() {
        return passt;
    }

    public void setPasst(io.quarkus.kubevirt.v1.virtualmachineinstancepresetspec.domain.devices.interfaces.Passt passt) {
        this.passt = passt;
    }

    /**
     * If specified, the virtual network interface will be placed on the guests pci address with the specified PCI address. For
     * example: 0000:81:01.10
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pciAddress")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If specified, the virtual network interface will be placed on the guests pci address with the specified PCI address. For example: 0000:81:01.10")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String pciAddress;

    public String getPciAddress() {
        return pciAddress;
    }

    public void setPciAddress(String pciAddress) {
        this.pciAddress = pciAddress;
    }

    /**
     * List of ports to be forwarded to the virtual machine.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ports")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of ports to be forwarded to the virtual machine.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkus.kubevirt.v1.virtualmachineinstancepresetspec.domain.devices.interfaces.Ports> ports;

    public java.util.List<io.quarkus.kubevirt.v1.virtualmachineinstancepresetspec.domain.devices.interfaces.Ports> getPorts() {
        return ports;
    }

    public void setPorts(
            java.util.List<io.quarkus.kubevirt.v1.virtualmachineinstancepresetspec.domain.devices.interfaces.Ports> ports) {
        this.ports = ports;
    }

    /**
     * InterfaceSlirp connects to a given network using QEMU user networking mode.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("slirp")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("InterfaceSlirp connects to a given network using QEMU user networking mode.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1.virtualmachineinstancepresetspec.domain.devices.interfaces.Slirp slirp;

    public io.quarkus.kubevirt.v1.virtualmachineinstancepresetspec.domain.devices.interfaces.Slirp getSlirp() {
        return slirp;
    }

    public void setSlirp(io.quarkus.kubevirt.v1.virtualmachineinstancepresetspec.domain.devices.interfaces.Slirp slirp) {
        this.slirp = slirp;
    }

    /**
     * InterfaceSRIOV connects to a given network by passing-through an SR-IOV PCI device via vfio.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sriov")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("InterfaceSRIOV connects to a given network by passing-through an SR-IOV PCI device via vfio.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1.virtualmachineinstancepresetspec.domain.devices.interfaces.Sriov sriov;

    public io.quarkus.kubevirt.v1.virtualmachineinstancepresetspec.domain.devices.interfaces.Sriov getSriov() {
        return sriov;
    }

    public void setSriov(io.quarkus.kubevirt.v1.virtualmachineinstancepresetspec.domain.devices.interfaces.Sriov sriov) {
        this.sriov = sriov;
    }

    /**
     * If specified, the virtual network interface address and its tag will be provided to the guest via config drive
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tag")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If specified, the virtual network interface address and its tag will be provided to the guest via config drive")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String tag;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
