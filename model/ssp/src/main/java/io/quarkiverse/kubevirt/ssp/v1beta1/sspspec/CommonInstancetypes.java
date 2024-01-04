package io.quarkiverse.kubevirt.ssp.v1beta1.sspspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "url" })
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
public class CommonInstancetypes implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * URL of a remote Kustomize target from which to generate and deploy resources.
   * The following caveats apply to the provided URL:
   * Only 'https://' and 'git://' URLs are supported.
   * The URL must include '?ref=$ref' or '?version=$ref' pinning it to a specific reference. It is recommended that the
   * reference be a specific commit or tag to ensure the generated contents does not change over time. As such it is
   * recommended not to use branches as the ref for the time being.
   * Only VirtualMachineClusterPreference and VirtualMachineClusterInstancetype resources generated from the URL are deployed
   * by the operand.
   * See the following Kustomize documentation for more details:
   * remote targets https://github.com/kubernetes-sigs/kustomize/blob/master/examples/remoteBuild.md
   */
  @com.fasterxml.jackson.annotation.JsonProperty("url")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("URL of a remote Kustomize target from which to generate and deploy resources. \n The following caveats apply to the provided URL: \n * Only 'https://' and 'git://' URLs are supported. \n * The URL must include '?ref=$ref' or '?version=$ref' pinning it to a specific reference. It is recommended that the reference be a specific commit or tag to ensure the generated contents does not change over time. As such it is recommended not to use branches as the ref for the time being. \n * Only VirtualMachineClusterPreference and VirtualMachineClusterInstancetype resources generated from the URL are deployed by the operand. \n See the following Kustomize documentation for more details: \n remote targets https://github.com/kubernetes-sigs/kustomize/blob/master/examples/remoteBuild.md")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String url;

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
