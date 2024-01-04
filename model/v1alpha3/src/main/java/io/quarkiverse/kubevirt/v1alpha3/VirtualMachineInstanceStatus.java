package io.quarkiverse.kubevirt.v1alpha3;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "VSOCKCID", "activePods", "conditions", "evacuationNodeName",
    "fsFreezeStatus", "guestOSInfo", "interfaces", "launcherContainerImageVersion", "migrationMethod", "migrationState",
    "migrationTransport", "nodeName", "phase", "phaseTransitionTimestamps", "qosClass", "reason", "runtimeUser",
    "selinuxContext", "topologyHints", "virtualMachineRevisionName", "volumeStatus" })
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
public class VirtualMachineInstanceStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * VSOCKCID is used to track the allocated VSOCK CID in the VM.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("VSOCKCID")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("VSOCKCID is used to track the allocated VSOCK CID in the VM.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Integer VSOCKCID;

  public Integer getVSOCKCID() {
    return VSOCKCID;
  }

  public void setVSOCKCID(Integer VSOCKCID) {
    this.VSOCKCID = VSOCKCID;
  }

  /**
   * ActivePods is a mapping of pod UID to node name. It is possible for multiple pods to be running for a single VMI during
   * migration.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("activePods")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("ActivePods is a mapping of pod UID to node name. It is possible for multiple pods to be running for a single VMI during migration.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private java.util.Map<java.lang.String, String> activePods;

  public java.util.Map<java.lang.String, String> getActivePods() {
    return activePods;
  }

  public void setActivePods(java.util.Map<java.lang.String, String> activePods) {
    this.activePods = activePods;
  }

  /**
   * Conditions are specific points in VirtualMachineInstance's pod runtime.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("conditions")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Conditions are specific points in VirtualMachineInstance's pod runtime.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancestatus.Conditions> conditions;

  public java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancestatus.Conditions> getConditions() {
    return conditions;
  }

  public void setConditions(
      java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancestatus.Conditions> conditions) {
    this.conditions = conditions;
  }

  /**
   * EvacuationNodeName is used to track the eviction process of a VMI. It stores the name of the node that we want to
   * evacuate. It is meant to be used by KubeVirt core components only and can't be set or modified by users.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("evacuationNodeName")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("EvacuationNodeName is used to track the eviction process of a VMI. It stores the name of the node that we want to evacuate. It is meant to be used by KubeVirt core components only and can't be set or modified by users.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String evacuationNodeName;

  public String getEvacuationNodeName() {
    return evacuationNodeName;
  }

  public void setEvacuationNodeName(String evacuationNodeName) {
    this.evacuationNodeName = evacuationNodeName;
  }

  /**
   * FSFreezeStatus is the state of the fs of the guest it can be either frozen or thawed
   */
  @com.fasterxml.jackson.annotation.JsonProperty("fsFreezeStatus")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("FSFreezeStatus is the state of the fs of the guest it can be either frozen or thawed")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String fsFreezeStatus;

  public String getFsFreezeStatus() {
    return fsFreezeStatus;
  }

  public void setFsFreezeStatus(String fsFreezeStatus) {
    this.fsFreezeStatus = fsFreezeStatus;
  }

  /**
   * Guest OS Information
   */
  @com.fasterxml.jackson.annotation.JsonProperty("guestOSInfo")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Guest OS Information")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancestatus.GuestOSInfo guestOSInfo;

  public io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancestatus.GuestOSInfo getGuestOSInfo() {
    return guestOSInfo;
  }

  public void setGuestOSInfo(io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancestatus.GuestOSInfo guestOSInfo) {
    this.guestOSInfo = guestOSInfo;
  }

  /**
   * Interfaces represent the details of available network interfaces.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("interfaces")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Interfaces represent the details of available network interfaces.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancestatus.Interfaces> interfaces;

  public java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancestatus.Interfaces> getInterfaces() {
    return interfaces;
  }

  public void setInterfaces(
      java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancestatus.Interfaces> interfaces) {
    this.interfaces = interfaces;
  }

  /**
   * LauncherContainerImageVersion indicates what container image is currently active for the vmi.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("launcherContainerImageVersion")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("LauncherContainerImageVersion indicates what container image is currently active for the vmi.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String launcherContainerImageVersion;

  public String getLauncherContainerImageVersion() {
    return launcherContainerImageVersion;
  }

  public void setLauncherContainerImageVersion(String launcherContainerImageVersion) {
    this.launcherContainerImageVersion = launcherContainerImageVersion;
  }

  /**
   * Represents the method using which the vmi can be migrated: live migration or block migration
   */
  @com.fasterxml.jackson.annotation.JsonProperty("migrationMethod")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Represents the method using which the vmi can be migrated: live migration or block migration")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String migrationMethod;

  public String getMigrationMethod() {
    return migrationMethod;
  }

  public void setMigrationMethod(String migrationMethod) {
    this.migrationMethod = migrationMethod;
  }

  /**
   * Represents the status of a live migration
   */
  @com.fasterxml.jackson.annotation.JsonProperty("migrationState")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Represents the status of a live migration")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancestatus.MigrationState migrationState;

  public io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancestatus.MigrationState getMigrationState() {
    return migrationState;
  }

  public void setMigrationState(io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancestatus.MigrationState migrationState) {
    this.migrationState = migrationState;
  }

  /**
   * This represents the migration transport
   */
  @com.fasterxml.jackson.annotation.JsonProperty("migrationTransport")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("This represents the migration transport")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String migrationTransport;

  public String getMigrationTransport() {
    return migrationTransport;
  }

  public void setMigrationTransport(String migrationTransport) {
    this.migrationTransport = migrationTransport;
  }

  /**
   * NodeName is the name where the VirtualMachineInstance is currently running.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("nodeName")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("NodeName is the name where the VirtualMachineInstance is currently running.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String nodeName;

  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  /**
   * Phase is the status of the VirtualMachineInstance in kubernetes world. It is not the VirtualMachineInstance status, but
   * partially correlates to it.
   */
  @com.fasterxml.jackson.annotation.JsonProperty("phase")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Phase is the status of the VirtualMachineInstance in kubernetes world. It is not the VirtualMachineInstance status, but partially correlates to it.")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String phase;

  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  /**
   * PhaseTransitionTimestamp is the timestamp of when the last phase change occurred
   */
  @com.fasterxml.jackson.annotation.JsonProperty("phaseTransitionTimestamps")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PhaseTransitionTimestamp is the timestamp of when the last phase change occurred")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancestatus.PhaseTransitionTimestamps> phaseTransitionTimestamps;

  public java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancestatus.PhaseTransitionTimestamps> getPhaseTransitionTimestamps() {
    return phaseTransitionTimestamps;
  }

  public void setPhaseTransitionTimestamps(
      java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancestatus.PhaseTransitionTimestamps> phaseTransitionTimestamps) {
    this.phaseTransitionTimestamps = phaseTransitionTimestamps;
  }

  /**
   * The Quality of Service (QOS) classification assigned to the virtual machine instance based on resource requirements See
   * PodQOSClass type for available QOS classes More info:
   * https://git.k8s.io/community/contributors/design-proposals/node/resource-qos.md
   */
  @com.fasterxml.jackson.annotation.JsonProperty("qosClass")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("The Quality of Service (QOS) classification assigned to the virtual machine instance based on resource requirements See PodQOSClass type for available QOS classes More info: https://git.k8s.io/community/contributors/design-proposals/node/resource-qos.md")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String qosClass;

  public String getQosClass() {
    return qosClass;
  }

  public void setQosClass(String qosClass) {
    this.qosClass = qosClass;
  }

  /**
   * A brief CamelCase message indicating details about why the VMI is in this state. e.g. 'NodeUnresponsive'
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reason")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("A brief CamelCase message indicating details about why the VMI is in this state. e.g. 'NodeUnresponsive'")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String reason;

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  /**
   * RuntimeUser is used to determine what user will be used in launcher
   */
  @com.fasterxml.jackson.annotation.JsonProperty("runtimeUser")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("RuntimeUser is used to determine what user will be used in launcher")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private Long runtimeUser;

  public Long getRuntimeUser() {
    return runtimeUser;
  }

  public void setRuntimeUser(Long runtimeUser) {
    this.runtimeUser = runtimeUser;
  }

  /**
   * SELinuxContext is the actual SELinux context of the virt-launcher pod
   */
  @com.fasterxml.jackson.annotation.JsonProperty("selinuxContext")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("SELinuxContext is the actual SELinux context of the virt-launcher pod")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String selinuxContext;

  public String getSelinuxContext() {
    return selinuxContext;
  }

  public void setSelinuxContext(String selinuxContext) {
    this.selinuxContext = selinuxContext;
  }

  @com.fasterxml.jackson.annotation.JsonProperty("topologyHints")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancestatus.TopologyHints topologyHints;

  public io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancestatus.TopologyHints getTopologyHints() {
    return topologyHints;
  }

  public void setTopologyHints(io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancestatus.TopologyHints topologyHints) {
    this.topologyHints = topologyHints;
  }

  /**
   * VirtualMachineRevisionName is used to get the vm revision of the vmi when doing an online vm snapshot
   */
  @com.fasterxml.jackson.annotation.JsonProperty("virtualMachineRevisionName")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("VirtualMachineRevisionName is used to get the vm revision of the vmi when doing an online vm snapshot")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private String virtualMachineRevisionName;

  public String getVirtualMachineRevisionName() {
    return virtualMachineRevisionName;
  }

  public void setVirtualMachineRevisionName(String virtualMachineRevisionName) {
    this.virtualMachineRevisionName = virtualMachineRevisionName;
  }

  /**
   * VolumeStatus contains the statuses of all the volumes
   */
  @com.fasterxml.jackson.annotation.JsonProperty("volumeStatus")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("VolumeStatus contains the statuses of all the volumes")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancestatus.VolumeStatus> volumeStatus;

  public java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancestatus.VolumeStatus> getVolumeStatus() {
    return volumeStatus;
  }

  public void setVolumeStatus(
      java.util.List<io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancestatus.VolumeStatus> volumeStatus) {
    this.volumeStatus = volumeStatus;
  }
}
