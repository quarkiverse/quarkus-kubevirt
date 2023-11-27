package io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "exec", "failureThreshold", "guestAgentPing", "httpGet",
        "initialDelaySeconds", "periodSeconds", "successThreshold", "tcpSocket", "timeoutSeconds" })
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
public class ReadinessProbe implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * One and only one of the following should be specified. Exec specifies the action to take, it will be executed on the
     * guest through the qemu-guest-agent. If the guest agent is not available, this probe will fail.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exec")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("One and only one of the following should be specified. Exec specifies the action to take, it will be executed on the guest through the qemu-guest-agent. If the guest agent is not available, this probe will fail.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.readinessprobe.Exec exec;

    public io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.readinessprobe.Exec getExec() {
        return exec;
    }

    public void setExec(
            io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.readinessprobe.Exec exec) {
        this.exec = exec;
    }

    /**
     * Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value
     * is 1.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("failureThreshold")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer failureThreshold;

    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    /**
     * GuestAgentPing contacts the qemu-guest-agent for availability checks.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("guestAgentPing")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("GuestAgentPing contacts the qemu-guest-agent for availability checks.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.readinessprobe.GuestAgentPing guestAgentPing;

    public io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.readinessprobe.GuestAgentPing getGuestAgentPing() {
        return guestAgentPing;
    }

    public void setGuestAgentPing(
            io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.readinessprobe.GuestAgentPing guestAgentPing) {
        this.guestAgentPing = guestAgentPing;
    }

    /**
     * HTTPGet specifies the http request to perform.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("httpGet")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("HTTPGet specifies the http request to perform.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.readinessprobe.HttpGet httpGet;

    public io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.readinessprobe.HttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(
            io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.readinessprobe.HttpGet httpGet) {
        this.httpGet = httpGet;
    }

    /**
     * Number of seconds after the VirtualMachineInstance has started before liveness probes are initiated. More info:
     * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("initialDelaySeconds")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Number of seconds after the VirtualMachineInstance has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer initialDelaySeconds;

    public Integer getInitialDelaySeconds() {
        return initialDelaySeconds;
    }

    public void setInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
    }

    /**
     * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("periodSeconds")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer periodSeconds;

    public Integer getPeriodSeconds() {
        return periodSeconds;
    }

    public void setPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
    }

    /**
     * Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for
     * liveness. Minimum value is 1.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("successThreshold")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness. Minimum value is 1.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer successThreshold;

    public Integer getSuccessThreshold() {
        return successThreshold;
    }

    public void setSuccessThreshold(Integer successThreshold) {
        this.successThreshold = successThreshold;
    }

    /**
     * TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported TODO: implement a realistic TCP lifecycle
     * hook
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tcpSocket")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.readinessprobe.TcpSocket tcpSocket;

    public io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.readinessprobe.TcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(
            io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.readinessprobe.TcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

    /**
     * Number of seconds after which the probe times out. For exec probes the timeout fails the probe but does not terminate the
     * command running on the guest. This means a blocking command can result in an increasing load on the guest. A small buffer
     * will be added to the resulting workload exec probe to compensate for delays caused by the qemu guest exec mechanism.
     * Defaults to 1 second. Minimum value is 1. More info:
     * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutSeconds")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Number of seconds after which the probe times out. For exec probes the timeout fails the probe but does not terminate the command running on the guest. This means a blocking command can result in an increasing load on the guest. A small buffer will be added to the resulting workload exec probe to compensate for delays caused by the qemu guest exec mechanism. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer timeoutSeconds;

    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }
}
