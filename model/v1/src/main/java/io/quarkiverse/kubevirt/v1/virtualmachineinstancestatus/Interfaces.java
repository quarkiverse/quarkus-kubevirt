package io.quarkiverse.kubevirt.v1.virtualmachineinstancestatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "infoSource", "interfaceName", "ipAddress", "ipAddresses", "mac", "name",
    "queueCount" })
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
public class Interfaces implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * Specifies the origin of the interface data collected. values: domain, guest-agent, or both
   */
  @com.fasterxml.jackson.annotation.JsonProperty("infoSource")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies the origin of the interface data collected. values: domain, guest-agent, or both")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String infoSource;

  public String getInfoSource() {
    return infoSource;
  }

  public void setInfoSource(String infoSource) {
    this.infoSource = infoSource;
  }

  /**
   * The interface name inside the Virtual Machine
   */
  @com.fasterxml.jackson.annotation.JsonProperty("interfaceName")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("The interface name inside the Virtual Machine")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String interfaceName;

  public String getInterfaceName() {
    return interfaceName;
  }

  public void setInterfaceName(String interfaceName) {
    this.interfaceName = interfaceName;
  }

  /**
   * IP address of a Virtual Machine interface. It is always the first item of IPs
   */
  @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("IP address of a Virtual Machine interface. It is always the first item of IPs")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String ipAddress;

  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  /**
   * List of all IP addresses of a Virtual Machine interface
   */
  @com.fasterxml.jackson.annotation.JsonProperty("ipAddresses")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of all IP addresses of a Virtual Machine interface")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private java.util.List<String> ipAddresses;

  public java.util.List<String> getIpAddresses() {
    return ipAddresses;
  }

  public void setIpAddresses(java.util.List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
  }

  /**
   * Hardware address of a Virtual Machine interface
   */
  @com.fasterxml.jackson.annotation.JsonProperty("mac")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Hardware address of a Virtual Machine interface")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String mac;

  public String getMac() {
    return mac;
  }

  public void setMac(String mac) {
    this.mac = mac;
  }

  /**
   * Name of the interface, corresponds to name of the network assigned to the interface
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the interface, corresponds to name of the network assigned to the interface")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Specifies how many queues are allocated by MultiQueue
   */
  @com.fasterxml.jackson.annotation.JsonProperty("queueCount")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies how many queues are allocated by MultiQueue")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Integer queueCount;

  public Integer getQueueCount() {
    return queueCount;
  }

  public void setQueueCount(Integer queueCount) {
    this.queueCount = queueCount;
  }

  @com.fasterxml.jackson.annotation.JsonIgnore()
  private java.util.Map<String, Object> additionalProperties = new java.util.HashMap<>();

  @com.fasterxml.jackson.annotation.JsonAnyGetter()
  public java.util.Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  @com.fasterxml.jackson.annotation.JsonAnySetter()
  public void setAdditionalProperties(java.util.Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  @com.fasterxml.jackson.annotation.JsonAnySetter()
  public void setAdditionalProperty(java.lang.String key, java.lang.Object value) {
    this.additionalProperties.put(key, value);
  }
}
