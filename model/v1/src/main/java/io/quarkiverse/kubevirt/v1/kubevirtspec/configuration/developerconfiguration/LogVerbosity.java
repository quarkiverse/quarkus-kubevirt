package io.quarkiverse.kubevirt.v1.kubevirtspec.configuration.developerconfiguration;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "nodeVerbosity", "virtAPI", "virtController", "virtHandler",
    "virtLauncher", "virtOperator" })
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
public class LogVerbosity implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * NodeVerbosity represents a map of nodes with a specific verbosity level
   */
  @com.fasterxml.jackson.annotation.JsonProperty("nodeVerbosity")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("NodeVerbosity represents a map of nodes with a specific verbosity level")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private java.util.Map<java.lang.String, Long> nodeVerbosity;

  public java.util.Map<java.lang.String, Long> getNodeVerbosity() {
    return nodeVerbosity;
  }

  public void setNodeVerbosity(java.util.Map<java.lang.String, Long> nodeVerbosity) {
    this.nodeVerbosity = nodeVerbosity;
  }

  @com.fasterxml.jackson.annotation.JsonProperty("virtAPI")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Long virtAPI;

  public Long getVirtAPI() {
    return virtAPI;
  }

  public void setVirtAPI(Long virtAPI) {
    this.virtAPI = virtAPI;
  }

  @com.fasterxml.jackson.annotation.JsonProperty("virtController")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Long virtController;

  public Long getVirtController() {
    return virtController;
  }

  public void setVirtController(Long virtController) {
    this.virtController = virtController;
  }

  @com.fasterxml.jackson.annotation.JsonProperty("virtHandler")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Long virtHandler;

  public Long getVirtHandler() {
    return virtHandler;
  }

  public void setVirtHandler(Long virtHandler) {
    this.virtHandler = virtHandler;
  }

  @com.fasterxml.jackson.annotation.JsonProperty("virtLauncher")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Long virtLauncher;

  public Long getVirtLauncher() {
    return virtLauncher;
  }

  public void setVirtLauncher(Long virtLauncher) {
    this.virtLauncher = virtLauncher;
  }

  @com.fasterxml.jackson.annotation.JsonProperty("virtOperator")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Long virtOperator;

  public Long getVirtOperator() {
    return virtOperator;
  }

  public void setVirtOperator(Long virtOperator) {
    this.virtOperator = virtOperator;
  }

  @com.fasterxml.jackson.annotation.JsonIgnore()
  private java.util.Map<String, Object> additionalProperties = new java.util.HashMap<>();

  @com.fasterxml.jackson.annotation.JsonAnyGetter()
  public java.util.Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  @com.fasterxml.jackson.annotation.JsonAnySetter()
  public void setAdditionalProperties(java.util.Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  @com.fasterxml.jackson.annotation.JsonAnySetter()
  public void setAdditionalProperty(java.lang.String key, java.lang.Object value) {
    this.additionalProperties.put(key, value);
  }
}
