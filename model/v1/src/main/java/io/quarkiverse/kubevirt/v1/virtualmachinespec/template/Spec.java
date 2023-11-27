package io.quarkiverse.kubevirt.v1.virtualmachinespec.template;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "accessCredentials", "affinity", "dnsConfig", "dnsPolicy", "domain",
        "evictionStrategy", "hostname", "livenessProbe", "networks", "nodeSelector", "priorityClassName", "readinessProbe",
        "schedulerName", "startStrategy", "subdomain", "terminationGracePeriodSeconds", "tolerations",
        "topologySpreadConstraints", "volumes" })
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
public class Spec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Specifies a set of public keys to inject into the vm guest
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accessCredentials")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies a set of public keys to inject into the vm guest")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.AccessCredentials> accessCredentials;

    public java.util.List<io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.AccessCredentials> getAccessCredentials() {
        return accessCredentials;
    }

    public void setAccessCredentials(
            java.util.List<io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.AccessCredentials> accessCredentials) {
        this.accessCredentials = accessCredentials;
    }

    /**
     * If affinity is specifies, obey all the affinity rules
     */
    @com.fasterxml.jackson.annotation.JsonProperty("affinity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If affinity is specifies, obey all the affinity rules")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.Affinity affinity;

    public io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.Affinity getAffinity() {
        return affinity;
    }

    public void setAffinity(io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.Affinity affinity) {
        this.affinity = affinity;
    }

    /**
     * Specifies the DNS parameters of a pod. Parameters specified here will be merged to the generated DNS configuration based
     * on DNSPolicy.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dnsConfig")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies the DNS parameters of a pod. Parameters specified here will be merged to the generated DNS configuration based on DNSPolicy.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.DnsConfig dnsConfig;

    public io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.DnsConfig getDnsConfig() {
        return dnsConfig;
    }

    public void setDnsConfig(io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.DnsConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
    }

    /**
     * Set DNS policy for the pod. Defaults to "ClusterFirst". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst',
     * 'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have
     * DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dnsPolicy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Set DNS policy for the pod. Defaults to \"ClusterFirst\". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String dnsPolicy;

    public String getDnsPolicy() {
        return dnsPolicy;
    }

    public void setDnsPolicy(String dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
    }

    /**
     * Specification of the desired behavior of the VirtualMachineInstance on the host.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specification of the desired behavior of the VirtualMachineInstance on the host.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.Domain domain;

    public io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.Domain getDomain() {
        return domain;
    }

    public void setDomain(io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.Domain domain) {
        this.domain = domain;
    }

    /**
     * EvictionStrategy can be set to "LiveMigrate" if the VirtualMachineInstance should be migrated instead of shut-off in case
     * of a node drain.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("evictionStrategy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("EvictionStrategy can be set to \"LiveMigrate\" if the VirtualMachineInstance should be migrated instead of shut-off in case of a node drain.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String evictionStrategy;

    public String getEvictionStrategy() {
        return evictionStrategy;
    }

    public void setEvictionStrategy(String evictionStrategy) {
        this.evictionStrategy = evictionStrategy;
    }

    /**
     * Specifies the hostname of the vmi If not specified, the hostname will be set to the name of the vmi, if dhcp or
     * cloud-init is configured properly.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies the hostname of the vmi If not specified, the hostname will be set to the name of the vmi, if dhcp or cloud-init is configured properly.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String hostname;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * Periodic probe of VirtualMachineInstance liveness. VirtualmachineInstances will be stopped if the probe fails. Cannot be
     * updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("livenessProbe")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Periodic probe of VirtualMachineInstance liveness. VirtualmachineInstances will be stopped if the probe fails. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.LivenessProbe livenessProbe;

    public io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.LivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.LivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    /**
     * List of networks that can be attached to a vm's virtual interface.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("networks")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of networks that can be attached to a vm's virtual interface.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.Networks> networks;

    public java.util.List<io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.Networks> getNetworks() {
        return networks;
    }

    public void setNetworks(java.util.List<io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.Networks> networks) {
        this.networks = networks;
    }

    /**
     * NodeSelector is a selector which must be true for the vmi to fit on a node. Selector which must match a node's labels for
     * the vmi to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeSelector")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("NodeSelector is a selector which must be true for the vmi to fit on a node. Selector which must match a node's labels for the vmi to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> nodeSelector;

    public java.util.Map<java.lang.String, String> getNodeSelector() {
        return nodeSelector;
    }

    public void setNodeSelector(java.util.Map<java.lang.String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    /**
     * If specified, indicates the pod's priority. If not specified, the pod priority will be default or zero if there is no
     * default.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("priorityClassName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If specified, indicates the pod's priority. If not specified, the pod priority will be default or zero if there is no default.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String priorityClassName;

    public String getPriorityClassName() {
        return priorityClassName;
    }

    public void setPriorityClassName(String priorityClassName) {
        this.priorityClassName = priorityClassName;
    }

    /**
     * Periodic probe of VirtualMachineInstance service readiness. VirtualmachineInstances will be removed from service
     * endpoints if the probe fails. Cannot be updated. More info:
     * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readinessProbe")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Periodic probe of VirtualMachineInstance service readiness. VirtualmachineInstances will be removed from service endpoints if the probe fails. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.ReadinessProbe readinessProbe;

    public io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.ReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.ReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    /**
     * If specified, the VMI will be dispatched by specified scheduler. If not specified, the VMI will be dispatched by default
     * scheduler.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schedulerName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If specified, the VMI will be dispatched by specified scheduler. If not specified, the VMI will be dispatched by default scheduler.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String schedulerName;

    public String getSchedulerName() {
        return schedulerName;
    }

    public void setSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
    }

    /**
     * StartStrategy can be set to "Paused" if Virtual Machine should be started in paused state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("startStrategy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("StartStrategy can be set to \"Paused\" if Virtual Machine should be started in paused state.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String startStrategy;

    public String getStartStrategy() {
        return startStrategy;
    }

    public void setStartStrategy(String startStrategy) {
        this.startStrategy = startStrategy;
    }

    /**
     * If specified, the fully qualified vmi hostname will be "<hostname>.<subdomain>.<pod namespace>.svc.<cluster domain>". If
     * not specified, the vmi will not have a domainname at all. The DNS entry will resolve to the vmi, no matter if the vmi
     * itself can pick up a hostname.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subdomain")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If specified, the fully qualified vmi hostname will be \"<hostname>.<subdomain>.<pod namespace>.svc.<cluster domain>\". If not specified, the vmi will not have a domainname at all. The DNS entry will resolve to the vmi, no matter if the vmi itself can pick up a hostname.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String subdomain;

    public String getSubdomain() {
        return subdomain;
    }

    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain;
    }

    /**
     * Grace period observed after signalling a VirtualMachineInstance to stop after which the VirtualMachineInstance is force
     * terminated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("terminationGracePeriodSeconds")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Grace period observed after signalling a VirtualMachineInstance to stop after which the VirtualMachineInstance is force terminated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long terminationGracePeriodSeconds;

    public Long getTerminationGracePeriodSeconds() {
        return terminationGracePeriodSeconds;
    }

    public void setTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    }

    /**
     * If toleration is specified, obey all the toleration rules.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tolerations")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If toleration is specified, obey all the toleration rules.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.Tolerations> tolerations;

    public java.util.List<io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.Tolerations> getTolerations() {
        return tolerations;
    }

    public void setTolerations(
            java.util.List<io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.Tolerations> tolerations) {
        this.tolerations = tolerations;
    }

    /**
     * TopologySpreadConstraints describes how a group of VMIs will be spread across a given topology domains. K8s scheduler
     * will schedule VMI pods in a way which abides by the constraints.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("topologySpreadConstraints")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TopologySpreadConstraints describes how a group of VMIs will be spread across a given topology domains. K8s scheduler will schedule VMI pods in a way which abides by the constraints.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.TopologySpreadConstraints> topologySpreadConstraints;

    public java.util.List<io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.TopologySpreadConstraints> getTopologySpreadConstraints() {
        return topologySpreadConstraints;
    }

    public void setTopologySpreadConstraints(
            java.util.List<io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.TopologySpreadConstraints> topologySpreadConstraints) {
        this.topologySpreadConstraints = topologySpreadConstraints;
    }

    /**
     * List of volumes that can be mounted by disks belonging to the vmi.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumes")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of volumes that can be mounted by disks belonging to the vmi.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.Volumes> volumes;

    public java.util.List<io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.Volumes> getVolumes() {
        return volumes;
    }

    public void setVolumes(java.util.List<io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.Volumes> volumes) {
        this.volumes = volumes;
    }
}
