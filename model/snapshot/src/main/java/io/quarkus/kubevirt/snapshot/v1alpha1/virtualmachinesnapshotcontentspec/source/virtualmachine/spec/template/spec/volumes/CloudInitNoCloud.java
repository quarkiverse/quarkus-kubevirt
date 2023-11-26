package io.quarkus.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.spec.template.spec.volumes;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "networkData", "networkDataBase64", "networkDataSecretRef", "secretRef",
        "userData", "userDataBase64" })
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
public class CloudInitNoCloud implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * NetworkData contains NoCloud inline cloud-init networkdata.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("networkData")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("NetworkData contains NoCloud inline cloud-init networkdata.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String networkData;

    public String getNetworkData() {
        return networkData;
    }

    public void setNetworkData(String networkData) {
        this.networkData = networkData;
    }

    /**
     * NetworkDataBase64 contains NoCloud cloud-init networkdata as a base64 encoded string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("networkDataBase64")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("NetworkDataBase64 contains NoCloud cloud-init networkdata as a base64 encoded string.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String networkDataBase64;

    public String getNetworkDataBase64() {
        return networkDataBase64;
    }

    public void setNetworkDataBase64(String networkDataBase64) {
        this.networkDataBase64 = networkDataBase64;
    }

    /**
     * NetworkDataSecretRef references a k8s secret that contains NoCloud networkdata.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("networkDataSecretRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("NetworkDataSecretRef references a k8s secret that contains NoCloud networkdata.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.spec.template.spec.volumes.cloudinitnocloud.NetworkDataSecretRef networkDataSecretRef;

    public io.quarkus.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.spec.template.spec.volumes.cloudinitnocloud.NetworkDataSecretRef getNetworkDataSecretRef() {
        return networkDataSecretRef;
    }

    public void setNetworkDataSecretRef(
            io.quarkus.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.spec.template.spec.volumes.cloudinitnocloud.NetworkDataSecretRef networkDataSecretRef) {
        this.networkDataSecretRef = networkDataSecretRef;
    }

    /**
     * UserDataSecretRef references a k8s secret that contains NoCloud userdata.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("UserDataSecretRef references a k8s secret that contains NoCloud userdata.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.spec.template.spec.volumes.cloudinitnocloud.SecretRef secretRef;

    public io.quarkus.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.spec.template.spec.volumes.cloudinitnocloud.SecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(
            io.quarkus.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.spec.template.spec.volumes.cloudinitnocloud.SecretRef secretRef) {
        this.secretRef = secretRef;
    }

    /**
     * UserData contains NoCloud inline cloud-init userdata.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userData")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("UserData contains NoCloud inline cloud-init userdata.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String userData;

    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    /**
     * UserDataBase64 contains NoCloud cloud-init userdata as a base64 encoded string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userDataBase64")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("UserDataBase64 contains NoCloud cloud-init userdata as a base64 encoded string.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String userDataBase64;

    public String getUserDataBase64() {
        return userDataBase64;
    }

    public void setUserDataBase64(String userDataBase64) {
        this.userDataBase64 = userDataBase64;
    }
}
