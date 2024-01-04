package io.quarkiverse.kubevirt.cdi.v1beta1.cdispec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "dataVolumeTTLSeconds", "featureGates", "filesystemOverhead",
    "importProxy", "insecureRegistries", "podResourceRequirements", "preallocation", "scratchSpaceStorageClass",
    "tlsSecurityProfile", "uploadProxyURLOverride" })
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
public class Config implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * DataVolumeTTLSeconds is the time in seconds after DataVolume completion it can be garbage collected. The default is 0
   * sec. To disable GC use -1.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dataVolumeTTLSeconds")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("DataVolumeTTLSeconds is the time in seconds after DataVolume completion it can be garbage collected. The default is 0 sec. To disable GC use -1.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Integer dataVolumeTTLSeconds;

  public Integer getDataVolumeTTLSeconds() {
    return dataVolumeTTLSeconds;
  }

  public void setDataVolumeTTLSeconds(Integer dataVolumeTTLSeconds) {
    this.dataVolumeTTLSeconds = dataVolumeTTLSeconds;
  }

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
   * FilesystemOverhead describes the space reserved for overhead when using Filesystem volumes. A value is between 0 and 1,
   * if not defined it is 0.055 (5.5% overhead)
   */
  @com.fasterxml.jackson.annotation.JsonProperty("filesystemOverhead")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("FilesystemOverhead describes the space reserved for overhead when using Filesystem volumes. A value is between 0 and 1, if not defined it is 0.055 (5.5% overhead)")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.cdi.v1beta1.cdispec.config.FilesystemOverhead filesystemOverhead;

  public io.quarkiverse.kubevirt.cdi.v1beta1.cdispec.config.FilesystemOverhead getFilesystemOverhead() {
    return filesystemOverhead;
  }

  public void setFilesystemOverhead(
      io.quarkiverse.kubevirt.cdi.v1beta1.cdispec.config.FilesystemOverhead filesystemOverhead) {
    this.filesystemOverhead = filesystemOverhead;
  }

  /**
   * ImportProxy contains importer pod proxy configuration.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("importProxy")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("ImportProxy contains importer pod proxy configuration.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.cdi.v1beta1.cdispec.config.ImportProxy importProxy;

  public io.quarkiverse.kubevirt.cdi.v1beta1.cdispec.config.ImportProxy getImportProxy() {
    return importProxy;
  }

  public void setImportProxy(io.quarkiverse.kubevirt.cdi.v1beta1.cdispec.config.ImportProxy importProxy) {
    this.importProxy = importProxy;
  }

  /**
   * InsecureRegistries is a list of TLS disabled registries
   */
  @com.fasterxml.jackson.annotation.JsonProperty("insecureRegistries")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("InsecureRegistries is a list of TLS disabled registries")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private java.util.List<String> insecureRegistries;

  public java.util.List<String> getInsecureRegistries() {
    return insecureRegistries;
  }

  public void setInsecureRegistries(java.util.List<String> insecureRegistries) {
    this.insecureRegistries = insecureRegistries;
  }

  /**
   * ResourceRequirements describes the compute resource requirements.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("podResourceRequirements")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("ResourceRequirements describes the compute resource requirements.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.cdi.v1beta1.cdispec.config.PodResourceRequirements podResourceRequirements;

  public io.quarkiverse.kubevirt.cdi.v1beta1.cdispec.config.PodResourceRequirements getPodResourceRequirements() {
    return podResourceRequirements;
  }

  public void setPodResourceRequirements(
      io.quarkiverse.kubevirt.cdi.v1beta1.cdispec.config.PodResourceRequirements podResourceRequirements) {
    this.podResourceRequirements = podResourceRequirements;
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
   * Override the storage class to used for scratch space during transfer operations. The scratch space storage class is
   * determined in the following order: 1. value of scratchSpaceStorageClass, if that doesn't exist, use the default storage
   * class, if there is no default storage class, use the storage class of the DataVolume, if no storage class specified, use
   * no storage class for scratch space
   */
  @com.fasterxml.jackson.annotation.JsonProperty("scratchSpaceStorageClass")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Override the storage class to used for scratch space during transfer operations. The scratch space storage class is determined in the following order: 1. value of scratchSpaceStorageClass, if that doesn't exist, use the default storage class, if there is no default storage class, use the storage class of the DataVolume, if no storage class specified, use no storage class for scratch space")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String scratchSpaceStorageClass;

  public String getScratchSpaceStorageClass() {
    return scratchSpaceStorageClass;
  }

  public void setScratchSpaceStorageClass(String scratchSpaceStorageClass) {
    this.scratchSpaceStorageClass = scratchSpaceStorageClass;
  }

  /**
   * TLSSecurityProfile is used by operators to apply cluster-wide TLS security settings to operands.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("tlsSecurityProfile")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("TLSSecurityProfile is used by operators to apply cluster-wide TLS security settings to operands.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.cdi.v1beta1.cdispec.config.TlsSecurityProfile tlsSecurityProfile;

  public io.quarkiverse.kubevirt.cdi.v1beta1.cdispec.config.TlsSecurityProfile getTlsSecurityProfile() {
    return tlsSecurityProfile;
  }

  public void setTlsSecurityProfile(
      io.quarkiverse.kubevirt.cdi.v1beta1.cdispec.config.TlsSecurityProfile tlsSecurityProfile) {
    this.tlsSecurityProfile = tlsSecurityProfile;
  }

  /**
   * Override the URL used when uploading to a DataVolume
   */
  @com.fasterxml.jackson.annotation.JsonProperty("uploadProxyURLOverride")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Override the URL used when uploading to a DataVolume")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String uploadProxyURLOverride;

  public String getUploadProxyURLOverride() {
    return uploadProxyURLOverride;
  }

  public void setUploadProxyURLOverride(String uploadProxyURLOverride) {
    this.uploadProxyURLOverride = uploadProxyURLOverride;
  }
}
