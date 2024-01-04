package io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachineclusterpreferencespec.features.preferredhyperv;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "enabled", "spinlocks" })
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
public class Spinlocks implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * Enabled determines if the feature should be enabled or disabled on the guest. Defaults to true.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("enabled")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enabled determines if the feature should be enabled or disabled on the guest. Defaults to true.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Boolean enabled;

  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * Retries indicates the number of retries. Must be a value greater or equal 4096. Defaults to 4096.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("spinlocks")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Retries indicates the number of retries. Must be a value greater or equal 4096. Defaults to 4096.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Integer spinlocks;

  public Integer getSpinlocks() {
    return spinlocks;
  }

  public void setSpinlocks(Integer spinlocks) {
    this.spinlocks = spinlocks;
  }
}
