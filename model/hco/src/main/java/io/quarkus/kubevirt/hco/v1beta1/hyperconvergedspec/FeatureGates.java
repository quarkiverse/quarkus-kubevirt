package io.quarkus.kubevirt.hco.v1beta1.hyperconvergedspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "deployKubeSecondaryDNS", "deployTektonTaskResources",
        "disableMDevConfiguration", "enableCommonBootImageImport", "nonRoot", "withHostPassthroughCPU" })
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
public class FeatureGates implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Deploy KubeSecondaryDNS by CNAO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deployKubeSecondaryDNS")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Deploy KubeSecondaryDNS by CNAO")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean deployKubeSecondaryDNS = false;

    public Boolean getDeployKubeSecondaryDNS() {
        return deployKubeSecondaryDNS;
    }

    public void setDeployKubeSecondaryDNS(Boolean deployKubeSecondaryDNS) {
        this.deployKubeSecondaryDNS = deployKubeSecondaryDNS;
    }

    /**
     * deploy resources (kubevirt tekton tasks and example pipelines) in Tekton tasks operator
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deployTektonTaskResources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("deploy resources (kubevirt tekton tasks and example pipelines) in Tekton tasks operator")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean deployTektonTaskResources = false;

    public Boolean getDeployTektonTaskResources() {
        return deployTektonTaskResources;
    }

    public void setDeployTektonTaskResources(Boolean deployTektonTaskResources) {
        this.deployTektonTaskResources = deployTektonTaskResources;
    }

    /**
     * Disable mediated devices handling on KubeVirt
     */
    @com.fasterxml.jackson.annotation.JsonProperty("disableMDevConfiguration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Disable mediated devices handling on KubeVirt")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean disableMDevConfiguration = false;

    public Boolean getDisableMDevConfiguration() {
        return disableMDevConfiguration;
    }

    public void setDisableMDevConfiguration(Boolean disableMDevConfiguration) {
        this.disableMDevConfiguration = disableMDevConfiguration;
    }

    /**
     * Opt-in to automatic delivery/updates of the common data import cron templates. There are two sources for the data import
     * cron templates: hard coded list of common templates, and custom templates that can be added to the
     * dataImportCronTemplates field. This feature gates only control the common templates. It is possible to use custom
     * templates by adding them to the dataImportCronTemplates field.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enableCommonBootImageImport")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Opt-in to automatic delivery/updates of the common data import cron templates. There are two sources for the data import cron templates: hard coded list of common templates, and custom templates that can be added to the dataImportCronTemplates field. This feature gates only control the common templates. It is possible to use custom templates by adding them to the dataImportCronTemplates field.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enableCommonBootImageImport = true;

    public Boolean getEnableCommonBootImageImport() {
        return enableCommonBootImageImport;
    }

    public void setEnableCommonBootImageImport(Boolean enableCommonBootImageImport) {
        this.enableCommonBootImageImport = enableCommonBootImageImport;
    }

    /**
     * Enables rootless virt-launcher.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nonRoot")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enables rootless virt-launcher.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean nonRoot = true;

    public Boolean getNonRoot() {
        return nonRoot;
    }

    public void setNonRoot(Boolean nonRoot) {
        this.nonRoot = nonRoot;
    }

    /**
     * Allow migrating a virtual machine with CPU host-passthrough mode. This should be enabled only when the Cluster is
     * homogeneous from CPU HW perspective doc here
     */
    @com.fasterxml.jackson.annotation.JsonProperty("withHostPassthroughCPU")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow migrating a virtual machine with CPU host-passthrough mode. This should be enabled only when the Cluster is homogeneous from CPU HW perspective doc here")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean withHostPassthroughCPU = false;

    public Boolean getWithHostPassthroughCPU() {
        return withHostPassthroughCPU;
    }

    public void setWithHostPassthroughCPU(Boolean withHostPassthroughCPU) {
        this.withHostPassthroughCPU = withHostPassthroughCPU;
    }
}
