package io.quarkiverse.kubevirt.tektontasks.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "featureGates", "pipelines" })
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
public class TektonTasksSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * FeatureGates defines feature gate for tto operator
   */
  @com.fasterxml.jackson.annotation.JsonProperty("featureGates")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("FeatureGates defines feature gate for tto operator")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.tektontasks.v1alpha1.tektontasksspec.FeatureGates featureGates;

  public io.quarkiverse.kubevirt.tektontasks.v1alpha1.tektontasksspec.FeatureGates getFeatureGates() {
    return featureGates;
  }

  public void setFeatureGates(io.quarkiverse.kubevirt.tektontasks.v1alpha1.tektontasksspec.FeatureGates featureGates) {
    this.featureGates = featureGates;
  }

  /**
   * Pipelines defines variables for configuration of pipelines
   */
  @com.fasterxml.jackson.annotation.JsonProperty("pipelines")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Pipelines defines variables for configuration of pipelines")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.tektontasks.v1alpha1.tektontasksspec.Pipelines pipelines;

  public io.quarkiverse.kubevirt.tektontasks.v1alpha1.tektontasksspec.Pipelines getPipelines() {
    return pipelines;
  }

  public void setPipelines(io.quarkiverse.kubevirt.tektontasks.v1alpha1.tektontasksspec.Pipelines pipelines) {
    this.pipelines = pipelines;
  }
}
