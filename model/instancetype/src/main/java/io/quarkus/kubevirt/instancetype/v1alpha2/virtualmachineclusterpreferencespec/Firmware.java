package io.quarkus.kubevirt.instancetype.v1alpha2.virtualmachineclusterpreferencespec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "preferredUseBios", "preferredUseBiosSerial", "preferredUseEfi",
        "preferredUseSecureBoot" })
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
public class Firmware implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * PreferredUseBios optionally enables BIOS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preferredUseBios")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredUseBios optionally enables BIOS")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean preferredUseBios;

    public Boolean getPreferredUseBios() {
        return preferredUseBios;
    }

    public void setPreferredUseBios(Boolean preferredUseBios) {
        this.preferredUseBios = preferredUseBios;
    }

    /**
     * PreferredUseBiosSerial optionally transmitts BIOS output over the serial.
     * Requires PreferredUseBios to be enabled.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preferredUseBiosSerial")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredUseBiosSerial optionally transmitts BIOS output over the serial. \n Requires PreferredUseBios to be enabled.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean preferredUseBiosSerial;

    public Boolean getPreferredUseBiosSerial() {
        return preferredUseBiosSerial;
    }

    public void setPreferredUseBiosSerial(Boolean preferredUseBiosSerial) {
        this.preferredUseBiosSerial = preferredUseBiosSerial;
    }

    /**
     * PreferredUseEfi optionally enables EFI
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preferredUseEfi")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredUseEfi optionally enables EFI")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean preferredUseEfi;

    public Boolean getPreferredUseEfi() {
        return preferredUseEfi;
    }

    public void setPreferredUseEfi(Boolean preferredUseEfi) {
        this.preferredUseEfi = preferredUseEfi;
    }

    /**
     * PreferredUseSecureBoot optionally enables SecureBoot and the OVMF roms will be swapped for SecureBoot-enabled ones.
     * Requires PreferredUseEfi and PreferredSmm to be enabled.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preferredUseSecureBoot")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferredUseSecureBoot optionally enables SecureBoot and the OVMF roms will be swapped for SecureBoot-enabled ones. \n Requires PreferredUseEfi and PreferredSmm to be enabled.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean preferredUseSecureBoot;

    public Boolean getPreferredUseSecureBoot() {
        return preferredUseSecureBoot;
    }

    public void setPreferredUseSecureBoot(Boolean preferredUseSecureBoot) {
        this.preferredUseSecureBoot = preferredUseSecureBoot;
    }
}
