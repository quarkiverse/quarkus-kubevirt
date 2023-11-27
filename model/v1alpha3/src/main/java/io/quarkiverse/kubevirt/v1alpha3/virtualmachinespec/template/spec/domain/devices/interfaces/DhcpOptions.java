package io.quarkiverse.kubevirt.v1alpha3.virtualmachinespec.template.spec.domain.devices.interfaces;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "bootFileName", "ntpServers", "privateOptions", "tftpServerName" })
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
public class DhcpOptions implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * If specified will pass option 67 to interface's DHCP server
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bootFileName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If specified will pass option 67 to interface's DHCP server")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String bootFileName;

    public String getBootFileName() {
        return bootFileName;
    }

    public void setBootFileName(String bootFileName) {
        this.bootFileName = bootFileName;
    }

    /**
     * If specified will pass the configured NTP server to the VM via DHCP option 042.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ntpServers")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If specified will pass the configured NTP server to the VM via DHCP option 042.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> ntpServers;

    public java.util.List<String> getNtpServers() {
        return ntpServers;
    }

    public void setNtpServers(java.util.List<String> ntpServers) {
        this.ntpServers = ntpServers;
    }

    /**
     * If specified will pass extra DHCP options for private use, range: 224-254
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privateOptions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If specified will pass extra DHCP options for private use, range: 224-254")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachinespec.template.spec.domain.devices.interfaces.dhcpoptions.PrivateOptions> privateOptions;

    public java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachinespec.template.spec.domain.devices.interfaces.dhcpoptions.PrivateOptions> getPrivateOptions() {
        return privateOptions;
    }

    public void setPrivateOptions(
            java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachinespec.template.spec.domain.devices.interfaces.dhcpoptions.PrivateOptions> privateOptions) {
        this.privateOptions = privateOptions;
    }

    /**
     * If specified will pass option 66 to interface's DHCP server
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tftpServerName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If specified will pass option 66 to interface's DHCP server")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String tftpServerName;

    public String getTftpServerName() {
        return tftpServerName;
    }

    public void setTftpServerName(String tftpServerName) {
        this.tftpServerName = tftpServerName;
    }
}
