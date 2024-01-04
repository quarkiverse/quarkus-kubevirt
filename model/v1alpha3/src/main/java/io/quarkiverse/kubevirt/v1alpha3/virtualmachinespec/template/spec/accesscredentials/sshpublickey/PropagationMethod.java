package io.quarkiverse.kubevirt.v1alpha3.virtualmachinespec.template.spec.accesscredentials.sshpublickey;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "configDrive", "qemuGuestAgent" })
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
public class PropagationMethod implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * ConfigDrivePropagation means that the ssh public keys are injected into the VM using metadata using the configDrive
   * cloud-init provider
   */
  @com.fasterxml.jackson.annotation.JsonProperty("configDrive")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("ConfigDrivePropagation means that the ssh public keys are injected into the VM using metadata using the configDrive cloud-init provider")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1alpha3.virtualmachinespec.template.spec.accesscredentials.sshpublickey.propagationmethod.ConfigDrive configDrive;

  public io.quarkiverse.kubevirt.v1alpha3.virtualmachinespec.template.spec.accesscredentials.sshpublickey.propagationmethod.ConfigDrive getConfigDrive() {
    return configDrive;
  }

  public void setConfigDrive(
      io.quarkiverse.kubevirt.v1alpha3.virtualmachinespec.template.spec.accesscredentials.sshpublickey.propagationmethod.ConfigDrive configDrive) {
    this.configDrive = configDrive;
  }

  /**
   * QemuGuestAgentAccessCredentailPropagation means ssh public keys are dynamically injected into the vm at runtime via the
   * qemu guest agent. This feature requires the qemu guest agent to be running within the guest.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("qemuGuestAgent")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("QemuGuestAgentAccessCredentailPropagation means ssh public keys are dynamically injected into the vm at runtime via the qemu guest agent. This feature requires the qemu guest agent to be running within the guest.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1alpha3.virtualmachinespec.template.spec.accesscredentials.sshpublickey.propagationmethod.QemuGuestAgent qemuGuestAgent;

  public io.quarkiverse.kubevirt.v1alpha3.virtualmachinespec.template.spec.accesscredentials.sshpublickey.propagationmethod.QemuGuestAgent getQemuGuestAgent() {
    return qemuGuestAgent;
  }

  public void setQemuGuestAgent(
      io.quarkiverse.kubevirt.v1alpha3.virtualmachinespec.template.spec.accesscredentials.sshpublickey.propagationmethod.QemuGuestAgent qemuGuestAgent) {
    this.qemuGuestAgent = qemuGuestAgent;
  }
}
