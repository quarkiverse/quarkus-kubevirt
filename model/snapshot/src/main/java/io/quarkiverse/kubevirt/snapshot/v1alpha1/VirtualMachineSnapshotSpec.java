package io.quarkiverse.kubevirt.snapshot.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "deletionPolicy", "failureDeadline", "source" })
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
public class VirtualMachineSnapshotSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * DeletionPolicy defines that to do with VirtualMachineSnapshot when VirtualMachineSnapshot is deleted
   */
  @com.fasterxml.jackson.annotation.JsonProperty("deletionPolicy")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("DeletionPolicy defines that to do with VirtualMachineSnapshot when VirtualMachineSnapshot is deleted")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String deletionPolicy;

  public String getDeletionPolicy() {
    return deletionPolicy;
  }

  public void setDeletionPolicy(String deletionPolicy) {
    this.deletionPolicy = deletionPolicy;
  }

  /**
   * This time represents the number of seconds we permit the vm snapshot to take. In case we pass this deadline we mark this
   * snapshot as failed. Defaults to DefaultFailureDeadline - 5min
   */
  @com.fasterxml.jackson.annotation.JsonProperty("failureDeadline")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("This time represents the number of seconds we permit the vm snapshot to take. In case we pass this deadline we mark this snapshot as failed. Defaults to DefaultFailureDeadline - 5min")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String failureDeadline;

  public String getFailureDeadline() {
    return failureDeadline;
  }

  public void setFailureDeadline(String failureDeadline) {
    this.failureDeadline = failureDeadline;
  }

  /**
   * TypedLocalObjectReference contains enough information to let you locate the typed referenced object inside the same
   * namespace.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("source")
  @io.fabric8.generator.annotation.Required()
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("TypedLocalObjectReference contains enough information to let you locate the typed referenced object inside the same namespace.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotspec.Source source;

  public io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotspec.Source getSource() {
    return source;
  }

  public void setSource(io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotspec.Source source) {
    this.source = source;
  }
}
