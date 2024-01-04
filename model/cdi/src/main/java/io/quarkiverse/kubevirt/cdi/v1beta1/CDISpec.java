package io.quarkiverse.kubevirt.cdi.v1beta1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "certConfig", "cloneStrategyOverride", "config", "imagePullPolicy",
    "infra", "priorityClass", "uninstallStrategy", "workload" })
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
public class CDISpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * certificate configuration
   */
  @com.fasterxml.jackson.annotation.JsonProperty("certConfig")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("certificate configuration")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.cdi.v1beta1.cdispec.CertConfig certConfig;

  public io.quarkiverse.kubevirt.cdi.v1beta1.cdispec.CertConfig getCertConfig() {
    return certConfig;
  }

  public void setCertConfig(io.quarkiverse.kubevirt.cdi.v1beta1.cdispec.CertConfig certConfig) {
    this.certConfig = certConfig;
  }

  public enum CloneStrategyOverride {

    @com.fasterxml.jackson.annotation.JsonProperty("copy")
    COPY("copy"), @com.fasterxml.jackson.annotation.JsonProperty("snapshot")
    SNAPSHOT("snapshot");

    java.lang.String value;

    CloneStrategyOverride(java.lang.String value) {
      this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue()
    public java.lang.String getValue() {
      return value;
    }
  }

  /**
   * Clone strategy override: should we use a host-assisted copy even if snapshots are available?
   */
  @com.fasterxml.jackson.annotation.JsonProperty("cloneStrategyOverride")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Clone strategy override: should we use a host-assisted copy even if snapshots are available?")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private CloneStrategyOverride cloneStrategyOverride;

  public CloneStrategyOverride getCloneStrategyOverride() {
    return cloneStrategyOverride;
  }

  public void setCloneStrategyOverride(CloneStrategyOverride cloneStrategyOverride) {
    this.cloneStrategyOverride = cloneStrategyOverride;
  }

  /**
   * CDIConfig at CDI level
   */
  @com.fasterxml.jackson.annotation.JsonProperty("config")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("CDIConfig at CDI level")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.cdi.v1beta1.cdispec.Config config;

  public io.quarkiverse.kubevirt.cdi.v1beta1.cdispec.Config getConfig() {
    return config;
  }

  public void setConfig(io.quarkiverse.kubevirt.cdi.v1beta1.cdispec.Config config) {
    this.config = config;
  }

  public enum ImagePullPolicy {

    @com.fasterxml.jackson.annotation.JsonProperty("Always")
    ALWAYS("Always"), @com.fasterxml.jackson.annotation.JsonProperty("IfNotPresent")
    IFNOTPRESENT("IfNotPresent"), @com.fasterxml.jackson.annotation.JsonProperty("Never")
    NEVER("Never");

    java.lang.String value;

    ImagePullPolicy(java.lang.String value) {
      this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue()
    public java.lang.String getValue() {
      return value;
    }
  }

  /**
   * PullPolicy describes a policy for if/when to pull a container image
   */
  @com.fasterxml.jackson.annotation.JsonProperty("imagePullPolicy")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PullPolicy describes a policy for if/when to pull a container image")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private ImagePullPolicy imagePullPolicy;

  public ImagePullPolicy getImagePullPolicy() {
    return imagePullPolicy;
  }

  public void setImagePullPolicy(ImagePullPolicy imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
  }

  /**
   * Rules on which nodes CDI infrastructure pods will be scheduled
   */
  @com.fasterxml.jackson.annotation.JsonProperty("infra")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Rules on which nodes CDI infrastructure pods will be scheduled")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.cdi.v1beta1.cdispec.Infra infra;

  public io.quarkiverse.kubevirt.cdi.v1beta1.cdispec.Infra getInfra() {
    return infra;
  }

  public void setInfra(io.quarkiverse.kubevirt.cdi.v1beta1.cdispec.Infra infra) {
    this.infra = infra;
  }

  /**
   * PriorityClass of the CDI control plane
   */
  @com.fasterxml.jackson.annotation.JsonProperty("priorityClass")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PriorityClass of the CDI control plane")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String priorityClass;

  public String getPriorityClass() {
    return priorityClass;
  }

  public void setPriorityClass(String priorityClass) {
    this.priorityClass = priorityClass;
  }

  public enum UninstallStrategy {

    @com.fasterxml.jackson.annotation.JsonProperty("RemoveWorkloads")
    REMOVEWORKLOADS("RemoveWorkloads"), @com.fasterxml.jackson.annotation.JsonProperty("BlockUninstallIfWorkloadsExist")
    BLOCKUNINSTALLIFWORKLOADSEXIST("BlockUninstallIfWorkloadsExist");

    java.lang.String value;

    UninstallStrategy(java.lang.String value) {
      this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue()
    public java.lang.String getValue() {
      return value;
    }
  }

  /**
   * CDIUninstallStrategy defines the state to leave CDI on uninstall
   */
  @com.fasterxml.jackson.annotation.JsonProperty("uninstallStrategy")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("CDIUninstallStrategy defines the state to leave CDI on uninstall")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private UninstallStrategy uninstallStrategy;

  public UninstallStrategy getUninstallStrategy() {
    return uninstallStrategy;
  }

  public void setUninstallStrategy(UninstallStrategy uninstallStrategy) {
    this.uninstallStrategy = uninstallStrategy;
  }

  /**
   * Restrict on which nodes CDI workload pods will be scheduled
   */
  @com.fasterxml.jackson.annotation.JsonProperty("workload")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Restrict on which nodes CDI workload pods will be scheduled")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.cdi.v1beta1.cdispec.Workload workload;

  public io.quarkiverse.kubevirt.cdi.v1beta1.cdispec.Workload getWorkload() {
    return workload;
  }

  public void setWorkload(io.quarkiverse.kubevirt.cdi.v1beta1.cdispec.Workload workload) {
    this.workload = workload;
  }
}
