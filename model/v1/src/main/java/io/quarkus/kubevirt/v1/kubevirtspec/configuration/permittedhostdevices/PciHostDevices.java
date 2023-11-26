package io.quarkus.kubevirt.v1.kubevirtspec.configuration.permittedhostdevices;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "externalResourceProvider", "pciVendorSelector", "resourceName" })
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
public class PciHostDevices implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * If true, KubeVirt will leave the allocation and monitoring to an external device plugin
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalResourceProvider")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If true, KubeVirt will leave the allocation and monitoring to an external device plugin")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean externalResourceProvider;

    public Boolean getExternalResourceProvider() {
        return externalResourceProvider;
    }

    public void setExternalResourceProvider(Boolean externalResourceProvider) {
        this.externalResourceProvider = externalResourceProvider;
    }

    /**
     * The vendor_id:product_id tuple of the PCI device
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pciVendorSelector")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The vendor_id:product_id tuple of the PCI device")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String pciVendorSelector;

    public String getPciVendorSelector() {
        return pciVendorSelector;
    }

    public void setPciVendorSelector(String pciVendorSelector) {
        this.pciVendorSelector = pciVendorSelector;
    }

    /**
     * The name of the resource that is representing the device. Exposed by a device plugin and requested by VMs. Typically of
     * the form vendor.com/product_nameThe name of the resource that is representing the device. Exposed by a device plugin and
     * requested by VMs. Typically of the form vendor.com/product_name
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The name of the resource that is representing the device. Exposed by a device plugin and requested by VMs. Typically of the form vendor.com/product_nameThe name of the resource that is representing the device. Exposed by a device plugin and requested by VMs. Typically of the form vendor.com/product_name")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String resourceName;

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
}
