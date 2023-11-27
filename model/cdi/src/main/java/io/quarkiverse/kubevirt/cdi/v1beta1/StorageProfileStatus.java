package io.quarkiverse.kubevirt.cdi.v1beta1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "claimPropertySets", "cloneStrategy", "provisioner", "storageClass" })
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
public class StorageProfileStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * ClaimPropertySets computed from the spec and detected in the system
     */
    @com.fasterxml.jackson.annotation.JsonProperty("claimPropertySets")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ClaimPropertySets computed from the spec and detected in the system")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.cdi.v1beta1.storageprofilestatus.ClaimPropertySets> claimPropertySets;

    public java.util.List<io.quarkiverse.kubevirt.cdi.v1beta1.storageprofilestatus.ClaimPropertySets> getClaimPropertySets() {
        return claimPropertySets;
    }

    public void setClaimPropertySets(
            java.util.List<io.quarkiverse.kubevirt.cdi.v1beta1.storageprofilestatus.ClaimPropertySets> claimPropertySets) {
        this.claimPropertySets = claimPropertySets;
    }

    /**
     * CloneStrategy defines the preferred method for performing a CDI clone
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloneStrategy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CloneStrategy defines the preferred method for performing a CDI clone")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String cloneStrategy;

    public String getCloneStrategy() {
        return cloneStrategy;
    }

    public void setCloneStrategy(String cloneStrategy) {
        this.cloneStrategy = cloneStrategy;
    }

    /**
     * The Storage class provisioner plugin name
     */
    @com.fasterxml.jackson.annotation.JsonProperty("provisioner")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The Storage class provisioner plugin name")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String provisioner;

    public String getProvisioner() {
        return provisioner;
    }

    public void setProvisioner(String provisioner) {
        this.provisioner = provisioner;
    }

    /**
     * The StorageClass name for which capabilities are defined
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storageClass")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The StorageClass name for which capabilities are defined")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String storageClass;

    public String getStorageClass() {
        return storageClass;
    }

    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }
}
