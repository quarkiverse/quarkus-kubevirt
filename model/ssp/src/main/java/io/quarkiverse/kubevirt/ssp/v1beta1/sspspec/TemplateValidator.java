package io.quarkiverse.kubevirt.ssp.v1beta1.sspspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "placement", "replicas" })
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
public class TemplateValidator implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * Placement describes the node scheduling configuration
   */
  @com.fasterxml.jackson.annotation.JsonProperty("placement")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Placement describes the node scheduling configuration")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.ssp.v1beta1.sspspec.templatevalidator.Placement placement;

  public io.quarkiverse.kubevirt.ssp.v1beta1.sspspec.templatevalidator.Placement getPlacement() {
    return placement;
  }

  public void setPlacement(io.quarkiverse.kubevirt.ssp.v1beta1.sspspec.templatevalidator.Placement placement) {
    this.placement = placement;
  }

  /**
   * Replicas is the number of replicas of the template validator pod
   */
  @com.fasterxml.jackson.annotation.JsonProperty("replicas")
  @io.fabric8.generator.annotation.Min(0.0)
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Replicas is the number of replicas of the template validator pod")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Integer replicas = 2;

  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }
}
