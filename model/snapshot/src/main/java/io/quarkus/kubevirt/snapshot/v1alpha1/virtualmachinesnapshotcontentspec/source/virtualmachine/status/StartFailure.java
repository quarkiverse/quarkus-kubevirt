package io.quarkus.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.status;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "consecutiveFailCount", "lastFailedVMIUID", "retryAfterTimestamp" })
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
public class StartFailure implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("consecutiveFailCount")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long consecutiveFailCount;

    public Long getConsecutiveFailCount() {
        return consecutiveFailCount;
    }

    public void setConsecutiveFailCount(Long consecutiveFailCount) {
        this.consecutiveFailCount = consecutiveFailCount;
    }

    /**
     * UID is a type that holds unique ID values, including UUIDs. Because we don't ONLY use UUIDs, this is an alias to string.
     * Being a type captures intent and helps make sure that UIDs and names do not get conflated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastFailedVMIUID")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("UID is a type that holds unique ID values, including UUIDs.  Because we don't ONLY use UUIDs, this is an alias to string.  Being a type captures intent and helps make sure that UIDs and names do not get conflated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String lastFailedVMIUID;

    public String getLastFailedVMIUID() {
        return lastFailedVMIUID;
    }

    public void setLastFailedVMIUID(String lastFailedVMIUID) {
        this.lastFailedVMIUID = lastFailedVMIUID;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("retryAfterTimestamp")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.time.ZonedDateTime retryAfterTimestamp;

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssVV")
    public java.time.ZonedDateTime getRetryAfterTimestamp() {
        return retryAfterTimestamp;
    }

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss[XXX][VV]")
    public void setRetryAfterTimestamp(java.time.ZonedDateTime retryAfterTimestamp) {
        this.retryAfterTimestamp = retryAfterTimestamp;
    }
}
