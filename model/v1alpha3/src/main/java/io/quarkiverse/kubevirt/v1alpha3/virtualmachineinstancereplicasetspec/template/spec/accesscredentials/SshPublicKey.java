package io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.accesscredentials;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "propagationMethod", "source" })
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
public class SshPublicKey implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * PropagationMethod represents how the public key is injected into the vm guest.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("propagationMethod")
  @io.fabric8.generator.annotation.Required()
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PropagationMethod represents how the public key is injected into the vm guest.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.accesscredentials.sshpublickey.PropagationMethod propagationMethod;

  public io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.accesscredentials.sshpublickey.PropagationMethod getPropagationMethod() {
    return propagationMethod;
  }

  public void setPropagationMethod(
      io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.accesscredentials.sshpublickey.PropagationMethod propagationMethod) {
    this.propagationMethod = propagationMethod;
  }

  /**
   * Source represents where the public keys are pulled from
   */
  @com.fasterxml.jackson.annotation.JsonProperty("source")
  @io.fabric8.generator.annotation.Required()
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Source represents where the public keys are pulled from")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.accesscredentials.sshpublickey.Source source;

  public io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.accesscredentials.sshpublickey.Source getSource() {
    return source;
  }

  public void setSource(
      io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.accesscredentials.sshpublickey.Source source) {
    this.source = source;
  }
}
