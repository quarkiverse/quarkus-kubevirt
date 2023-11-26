package io.quarkus.kubevirt.hostpathprovisioner.v1beta1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "featureGates", "imagePullPolicy", "pathConfig", "storagePools",
        "workload" })
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
public class HostPathProvisionerSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * FeatureGates are a list of specific enabled feature gates
     */
    @com.fasterxml.jackson.annotation.JsonProperty("featureGates")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("FeatureGates are a list of specific enabled feature gates")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> featureGates;

    public java.util.List<String> getFeatureGates() {
        return featureGates;
    }

    public void setFeatureGates(java.util.List<String> featureGates) {
        this.featureGates = featureGates;
    }

    /**
     * ImagePullPolicy is the container pull policy for the host path provisioner containers
     */
    @com.fasterxml.jackson.annotation.JsonProperty("imagePullPolicy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ImagePullPolicy is the container pull policy for the host path provisioner containers")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String imagePullPolicy;

    public String getImagePullPolicy() {
        return imagePullPolicy;
    }

    public void setImagePullPolicy(String imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
    }

    /**
     * PathConfig describes the location and layout of PV storage on nodes. Deprecated
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pathConfig")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PathConfig describes the location and layout of PV storage on nodes. Deprecated")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.hostpathprovisioner.v1beta1.hostpathprovisionerspec.PathConfig pathConfig;

    public io.quarkus.kubevirt.hostpathprovisioner.v1beta1.hostpathprovisionerspec.PathConfig getPathConfig() {
        return pathConfig;
    }

    public void setPathConfig(io.quarkus.kubevirt.hostpathprovisioner.v1beta1.hostpathprovisionerspec.PathConfig pathConfig) {
        this.pathConfig = pathConfig;
    }

    /**
     * StoragePools are a list of storage pools
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storagePools")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("StoragePools are a list of storage pools")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkus.kubevirt.hostpathprovisioner.v1beta1.hostpathprovisionerspec.StoragePools> storagePools;

    public java.util.List<io.quarkus.kubevirt.hostpathprovisioner.v1beta1.hostpathprovisionerspec.StoragePools> getStoragePools() {
        return storagePools;
    }

    public void setStoragePools(
            java.util.List<io.quarkus.kubevirt.hostpathprovisioner.v1beta1.hostpathprovisionerspec.StoragePools> storagePools) {
        this.storagePools = storagePools;
    }

    /**
     * Restrict on which nodes HPP workload pods will be scheduled
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workload")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Restrict on which nodes HPP workload pods will be scheduled")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.hostpathprovisioner.v1beta1.hostpathprovisionerspec.Workload workload;

    public io.quarkus.kubevirt.hostpathprovisioner.v1beta1.hostpathprovisionerspec.Workload getWorkload() {
        return workload;
    }

    public void setWorkload(io.quarkus.kubevirt.hostpathprovisioner.v1beta1.hostpathprovisionerspec.Workload workload) {
        this.workload = workload;
    }
}
