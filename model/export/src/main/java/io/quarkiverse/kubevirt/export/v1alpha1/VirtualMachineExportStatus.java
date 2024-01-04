package io.quarkiverse.kubevirt.export.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "conditions", "links", "phase", "serviceName", "tokenSecretRef",
    "ttlExpirationTime", "virtualMachineName" })
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
public class VirtualMachineExportStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

  @com.fasterxml.jackson.annotation.JsonProperty("conditions")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private java.util.List<io.quarkiverse.kubevirt.export.v1alpha1.virtualmachineexportstatus.Conditions> conditions;

  public java.util.List<io.quarkiverse.kubevirt.export.v1alpha1.virtualmachineexportstatus.Conditions> getConditions() {
    return conditions;
  }

  public void setConditions(
      java.util.List<io.quarkiverse.kubevirt.export.v1alpha1.virtualmachineexportstatus.Conditions> conditions) {
    this.conditions = conditions;
  }

  /**
   * VirtualMachineExportLinks contains the links that point the exported VM resources
   */
  @com.fasterxml.jackson.annotation.JsonProperty("links")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("VirtualMachineExportLinks contains the links that point the exported VM resources")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.export.v1alpha1.virtualmachineexportstatus.Links links;

  public io.quarkiverse.kubevirt.export.v1alpha1.virtualmachineexportstatus.Links getLinks() {
    return links;
  }

  public void setLinks(io.quarkiverse.kubevirt.export.v1alpha1.virtualmachineexportstatus.Links links) {
    this.links = links;
  }

  /**
   * VirtualMachineExportPhase is the current phase of the VirtualMachineExport
   */
  @com.fasterxml.jackson.annotation.JsonProperty("phase")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("VirtualMachineExportPhase is the current phase of the VirtualMachineExport")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String phase;

  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  /**
   * ServiceName is the name of the service created associated with the Virtual Machine export. It will be used to create the
   * internal URLs for downloading the images
   */
  @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("ServiceName is the name of the service created associated with the Virtual Machine export. It will be used to create the internal URLs for downloading the images")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String serviceName;

  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  /**
   * TokenSecretRef is the name of the secret that contains the token used by the export server pod
   */
  @com.fasterxml.jackson.annotation.JsonProperty("tokenSecretRef")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("TokenSecretRef is the name of the secret that contains the token used by the export server pod")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String tokenSecretRef;

  public String getTokenSecretRef() {
    return tokenSecretRef;
  }

  public void setTokenSecretRef(String tokenSecretRef) {
    this.tokenSecretRef = tokenSecretRef;
  }

  /**
   * The time at which the VM Export will be completely removed according to specified TTL Formula is CreationTimestamp + TTL
   */
  @com.fasterxml.jackson.annotation.JsonProperty("ttlExpirationTime")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("The time at which the VM Export will be completely removed according to specified TTL Formula is CreationTimestamp + TTL")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private java.time.ZonedDateTime ttlExpirationTime;

  @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssVV")
  public java.time.ZonedDateTime getTtlExpirationTime() {
    return ttlExpirationTime;
  }

  @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss[XXX][VV]")
  public void setTtlExpirationTime(java.time.ZonedDateTime ttlExpirationTime) {
    this.ttlExpirationTime = ttlExpirationTime;
  }

  /**
   * VirtualMachineName shows the name of the source virtual machine if the source is either a VirtualMachine or a
   * VirtualMachineSnapshot. This is mainly to easily identify the source VirtualMachine in case of a VirtualMachineSnapshot
   */
  @com.fasterxml.jackson.annotation.JsonProperty("virtualMachineName")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("VirtualMachineName shows the name of the source virtual machine if the source is either a VirtualMachine or a VirtualMachineSnapshot. This is mainly to easily identify the source VirtualMachine in case of a VirtualMachineSnapshot")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String virtualMachineName;

  public String getVirtualMachineName() {
    return virtualMachineName;
  }

  public void setVirtualMachineName(String virtualMachineName) {
    this.virtualMachineName = virtualMachineName;
  }
}
