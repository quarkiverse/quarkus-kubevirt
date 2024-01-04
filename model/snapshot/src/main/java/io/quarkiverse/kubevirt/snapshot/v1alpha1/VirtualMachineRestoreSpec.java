package io.quarkiverse.kubevirt.snapshot.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "patches", "target", "virtualMachineSnapshotName" })
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
public class VirtualMachineRestoreSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * If the target for the restore does not exist, it will be created. Patches holds JSON patches that would be applied to the
   * target manifest before it's created. Patches should fit the target's Kind.
   * Example for a patch: {"op": "replace", "path": "/metadata/name", "value": "new-vm-name"}
   */
  @com.fasterxml.jackson.annotation.JsonProperty("patches")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("If the target for the restore does not exist, it will be created. Patches holds JSON patches that would be applied to the target manifest before it's created. Patches should fit the target's Kind. \n Example for a patch: {\"op\": \"replace\", \"path\": \"/metadata/name\", \"value\": \"new-vm-name\"}")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private java.util.List<String> patches;

  public java.util.List<String> getPatches() {
    return patches;
  }

  public void setPatches(java.util.List<String> patches) {
    this.patches = patches;
  }

  /**
   * initially only VirtualMachine type supported
   */
  @com.fasterxml.jackson.annotation.JsonProperty("target")
  @io.fabric8.generator.annotation.Required()
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("initially only VirtualMachine type supported")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinerestorespec.Target target;

  public io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinerestorespec.Target getTarget() {
    return target;
  }

  public void setTarget(io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinerestorespec.Target target) {
    this.target = target;
  }

  @com.fasterxml.jackson.annotation.JsonProperty("virtualMachineSnapshotName")
  @io.fabric8.generator.annotation.Required()
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String virtualMachineSnapshotName;

  public String getVirtualMachineSnapshotName() {
    return virtualMachineSnapshotName;
  }

  public void setVirtualMachineSnapshotName(String virtualMachineSnapshotName) {
    this.virtualMachineSnapshotName = virtualMachineSnapshotName;
  }
}
