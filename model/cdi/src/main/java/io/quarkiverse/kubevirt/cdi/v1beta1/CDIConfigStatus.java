package io.quarkiverse.kubevirt.cdi.v1beta1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "defaultPodResourceRequirements", "filesystemOverhead", "importProxy",
        "preallocation", "scratchSpaceStorageClass", "uploadProxyURL" })
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
public class CDIConfigStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * ResourceRequirements describes the compute resource requirements.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultPodResourceRequirements")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ResourceRequirements describes the compute resource requirements.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.cdi.v1beta1.cdiconfigstatus.DefaultPodResourceRequirements defaultPodResourceRequirements;

    public io.quarkiverse.kubevirt.cdi.v1beta1.cdiconfigstatus.DefaultPodResourceRequirements getDefaultPodResourceRequirements() {
        return defaultPodResourceRequirements;
    }

    public void setDefaultPodResourceRequirements(
            io.quarkiverse.kubevirt.cdi.v1beta1.cdiconfigstatus.DefaultPodResourceRequirements defaultPodResourceRequirements) {
        this.defaultPodResourceRequirements = defaultPodResourceRequirements;
    }

    /**
     * FilesystemOverhead describes the space reserved for overhead when using Filesystem volumes. A percentage value is between
     * 0 and 1
     */
    @com.fasterxml.jackson.annotation.JsonProperty("filesystemOverhead")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("FilesystemOverhead describes the space reserved for overhead when using Filesystem volumes. A percentage value is between 0 and 1")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.cdi.v1beta1.cdiconfigstatus.FilesystemOverhead filesystemOverhead;

    public io.quarkiverse.kubevirt.cdi.v1beta1.cdiconfigstatus.FilesystemOverhead getFilesystemOverhead() {
        return filesystemOverhead;
    }

    public void setFilesystemOverhead(
            io.quarkiverse.kubevirt.cdi.v1beta1.cdiconfigstatus.FilesystemOverhead filesystemOverhead) {
        this.filesystemOverhead = filesystemOverhead;
    }

    /**
     * ImportProxy contains importer pod proxy configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("importProxy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ImportProxy contains importer pod proxy configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.cdi.v1beta1.cdiconfigstatus.ImportProxy importProxy;

    public io.quarkiverse.kubevirt.cdi.v1beta1.cdiconfigstatus.ImportProxy getImportProxy() {
        return importProxy;
    }

    public void setImportProxy(io.quarkiverse.kubevirt.cdi.v1beta1.cdiconfigstatus.ImportProxy importProxy) {
        this.importProxy = importProxy;
    }

    /**
     * Preallocation controls whether storage for DataVolumes should be allocated in advance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preallocation")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Preallocation controls whether storage for DataVolumes should be allocated in advance.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean preallocation;

    public Boolean getPreallocation() {
        return preallocation;
    }

    public void setPreallocation(Boolean preallocation) {
        this.preallocation = preallocation;
    }

    /**
     * The calculated storage class to be used for scratch space
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scratchSpaceStorageClass")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The calculated storage class to be used for scratch space")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String scratchSpaceStorageClass;

    public String getScratchSpaceStorageClass() {
        return scratchSpaceStorageClass;
    }

    public void setScratchSpaceStorageClass(String scratchSpaceStorageClass) {
        this.scratchSpaceStorageClass = scratchSpaceStorageClass;
    }

    /**
     * The calculated upload proxy URL
     */
    @com.fasterxml.jackson.annotation.JsonProperty("uploadProxyURL")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The calculated upload proxy URL")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String uploadProxyURL;

    public String getUploadProxyURL() {
        return uploadProxyURL;
    }

    public void setUploadProxyURL(String uploadProxyURL) {
        this.uploadProxyURL = uploadProxyURL;
    }
}
