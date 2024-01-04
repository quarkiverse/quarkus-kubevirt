package io.quarkiverse.kubevirt.v1alpha3.virtualmachinespec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "apiVersion", "kind", "metadata", "spec", "status" })
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
public class DataVolumeTemplates implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to
   * the latest internal value, and may reject unrecognized values. More info:
   * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  @com.fasterxml.jackson.annotation.JsonProperty("apiVersion")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String apiVersion;

  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
   * the client submits requests to. Cannot be updated. In CamelCase. More info:
   * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  @com.fasterxml.jackson.annotation.JsonProperty("kind")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String kind;

  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  @com.fasterxml.jackson.annotation.JsonProperty("metadata")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
  @io.fabric8.generator.annotation.Nullable()
  private io.quarkiverse.kubevirt.v1alpha3.virtualmachinespec.datavolumetemplates.Metadata metadata;

  public io.quarkiverse.kubevirt.v1alpha3.virtualmachinespec.datavolumetemplates.Metadata getMetadata() {
    return metadata;
  }

  public void setMetadata(io.quarkiverse.kubevirt.v1alpha3.virtualmachinespec.datavolumetemplates.Metadata metadata) {
    this.metadata = metadata;
  }

  /**
   * DataVolumeSpec contains the DataVolume specification.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("spec")
  @io.fabric8.generator.annotation.Required()
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("DataVolumeSpec contains the DataVolume specification.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1alpha3.virtualmachinespec.datavolumetemplates.Spec spec;

  public io.quarkiverse.kubevirt.v1alpha3.virtualmachinespec.datavolumetemplates.Spec getSpec() {
    return spec;
  }

  public void setSpec(io.quarkiverse.kubevirt.v1alpha3.virtualmachinespec.datavolumetemplates.Spec spec) {
    this.spec = spec;
  }

  /**
   * DataVolumeTemplateDummyStatus is here simply for backwards compatibility with a previous API.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("DataVolumeTemplateDummyStatus is here simply for backwards compatibility with a previous API.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
  @io.fabric8.generator.annotation.Nullable()
  private io.quarkiverse.kubevirt.v1alpha3.virtualmachinespec.datavolumetemplates.Status status;

  public io.quarkiverse.kubevirt.v1alpha3.virtualmachinespec.datavolumetemplates.Status getStatus() {
    return status;
  }

  public void setStatus(io.quarkiverse.kubevirt.v1alpha3.virtualmachinespec.datavolumetemplates.Status status) {
    this.status = status;
  }
}
