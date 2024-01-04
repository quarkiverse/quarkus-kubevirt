package io.quarkiverse.kubevirt.v1.virtualmachineinstancepresetspec.domain.firmware.kernelboot;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "image", "imagePullPolicy", "imagePullSecret", "initrdPath",
    "kernelPath" })
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
public class Container implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * Image that contains initrd / kernel files.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("image")
  @io.fabric8.generator.annotation.Required()
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Image that contains initrd / kernel files.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String image;

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  /**
   * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent
   * otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
   */
  @com.fasterxml.jackson.annotation.JsonProperty("imagePullPolicy")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String imagePullPolicy;

  public String getImagePullPolicy() {
    return imagePullPolicy;
  }

  public void setImagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
  }

  /**
   * ImagePullSecret is the name of the Docker registry secret required to pull the image. The secret must already exist.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("imagePullSecret")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("ImagePullSecret is the name of the Docker registry secret required to pull the image. The secret must already exist.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String imagePullSecret;

  public String getImagePullSecret() {
    return imagePullSecret;
  }

  public void setImagePullSecret(String imagePullSecret) {
    this.imagePullSecret = imagePullSecret;
  }

  /**
   * the fully-qualified path to the ramdisk image in the host OS
   */
  @com.fasterxml.jackson.annotation.JsonProperty("initrdPath")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("the fully-qualified path to the ramdisk image in the host OS")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String initrdPath;

  public String getInitrdPath() {
    return initrdPath;
  }

  public void setInitrdPath(String initrdPath) {
    this.initrdPath = initrdPath;
  }

  /**
   * The fully-qualified path to the kernel image in the host OS
   */
  @com.fasterxml.jackson.annotation.JsonProperty("kernelPath")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("The fully-qualified path to the kernel image in the host OS")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String kernelPath;

  public String getKernelPath() {
    return kernelPath;
  }

  public void setKernelPath(String kernelPath) {
    this.kernelPath = kernelPath;
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
