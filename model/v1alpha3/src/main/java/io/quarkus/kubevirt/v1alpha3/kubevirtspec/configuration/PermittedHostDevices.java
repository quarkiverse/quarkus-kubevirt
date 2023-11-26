package io.quarkus.kubevirt.v1alpha3.kubevirtspec.configuration;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "mediatedDevices", "pciHostDevices" })
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
public class PermittedHostDevices implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("mediatedDevices")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkus.kubevirt.v1alpha3.kubevirtspec.configuration.permittedhostdevices.MediatedDevices> mediatedDevices;

    public java.util.List<io.quarkus.kubevirt.v1alpha3.kubevirtspec.configuration.permittedhostdevices.MediatedDevices> getMediatedDevices() {
        return mediatedDevices;
    }

    public void setMediatedDevices(
            java.util.List<io.quarkus.kubevirt.v1alpha3.kubevirtspec.configuration.permittedhostdevices.MediatedDevices> mediatedDevices) {
        this.mediatedDevices = mediatedDevices;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("pciHostDevices")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkus.kubevirt.v1alpha3.kubevirtspec.configuration.permittedhostdevices.PciHostDevices> pciHostDevices;

    public java.util.List<io.quarkus.kubevirt.v1alpha3.kubevirtspec.configuration.permittedhostdevices.PciHostDevices> getPciHostDevices() {
        return pciHostDevices;
    }

    public void setPciHostDevices(
            java.util.List<io.quarkus.kubevirt.v1alpha3.kubevirtspec.configuration.permittedhostdevices.PciHostDevices> pciHostDevices) {
        this.pciHostDevices = pciHostDevices;
    }
}
