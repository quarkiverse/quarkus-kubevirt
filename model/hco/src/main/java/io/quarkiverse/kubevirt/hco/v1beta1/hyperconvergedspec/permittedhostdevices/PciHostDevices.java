package io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.permittedhostdevices;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "disabled", "externalResourceProvider", "pciDeviceSelector",
        "resourceName" })
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
     * HCO enforces the existence of several PciHostDevice objects. Set disabled field to true instead of remove these objects.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("disabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("HCO enforces the existence of several PciHostDevice objects. Set disabled field to true instead of remove these objects.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean disabled;

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * indicates that this resource is being provided by an external device plugin
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalResourceProvider")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("indicates that this resource is being provided by an external device plugin")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean externalResourceProvider;

    public Boolean getExternalResourceProvider() {
        return externalResourceProvider;
    }

    public void setExternalResourceProvider(Boolean externalResourceProvider) {
        this.externalResourceProvider = externalResourceProvider;
    }

    /**
     * a combination of a vendor_id:product_id required to identify a PCI device on a host.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pciDeviceSelector")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("a combination of a vendor_id:product_id required to identify a PCI device on a host.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String pciDeviceSelector;

    public String getPciDeviceSelector() {
        return pciDeviceSelector;
    }

    public void setPciDeviceSelector(String pciDeviceSelector) {
        this.pciDeviceSelector = pciDeviceSelector;
    }

    /**
     * name by which a device is advertised and being requested
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("name by which a device is advertised and being requested")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String resourceName;

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
}
