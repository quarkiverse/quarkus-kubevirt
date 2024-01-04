package io.quarkiverse.kubevirt.cdi.v1beta1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "claimPropertySets", "cloneStrategy" })
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
public class StorageProfileSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * ClaimPropertySets is a provided set of properties applicable to PVC
   */
  @com.fasterxml.jackson.annotation.JsonProperty("claimPropertySets")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("ClaimPropertySets is a provided set of properties applicable to PVC")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private java.util.List<io.quarkiverse.kubevirt.cdi.v1beta1.storageprofilespec.ClaimPropertySets> claimPropertySets;

  public java.util.List<io.quarkiverse.kubevirt.cdi.v1beta1.storageprofilespec.ClaimPropertySets> getClaimPropertySets() {
    return claimPropertySets;
  }

  public void setClaimPropertySets(
      java.util.List<io.quarkiverse.kubevirt.cdi.v1beta1.storageprofilespec.ClaimPropertySets> claimPropertySets) {
    this.claimPropertySets = claimPropertySets;
  }

  /**
   * CloneStrategy defines the preferred method for performing a CDI clone
   */
  @com.fasterxml.jackson.annotation.JsonProperty("cloneStrategy")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("CloneStrategy defines the preferred method for performing a CDI clone")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String cloneStrategy;

  public String getCloneStrategy() {
    return cloneStrategy;
  }

  public void setCloneStrategy(String cloneStrategy) {
    this.cloneStrategy = cloneStrategy;
  }
}
