package io.quarkiverse.kubevirt.v1alpha3.virtualmachinespec.template.spec.domain.firmware;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "container", "kernelArgs" })
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
public class KernelBoot implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * Container defines the container that containes kernel artifacts
   */
  @com.fasterxml.jackson.annotation.JsonProperty("container")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Container defines the container that containes kernel artifacts")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1alpha3.virtualmachinespec.template.spec.domain.firmware.kernelboot.Container container;

  public io.quarkiverse.kubevirt.v1alpha3.virtualmachinespec.template.spec.domain.firmware.kernelboot.Container getContainer() {
    return container;
  }

  public void setContainer(
      io.quarkiverse.kubevirt.v1alpha3.virtualmachinespec.template.spec.domain.firmware.kernelboot.Container container) {
    this.container = container;
  }

  /**
   * Arguments to be passed to the kernel at boot time
   */
  @com.fasterxml.jackson.annotation.JsonProperty("kernelArgs")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Arguments to be passed to the kernel at boot time")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String kernelArgs;

  public String getKernelArgs() {
    return kernelArgs;
  }

  public void setKernelArgs(String kernelArgs) {
    this.kernelArgs = kernelArgs;
  }
}
