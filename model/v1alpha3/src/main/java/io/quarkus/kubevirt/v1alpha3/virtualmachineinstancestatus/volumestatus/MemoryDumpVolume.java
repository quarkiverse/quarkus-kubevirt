package io.quarkus.kubevirt.v1alpha3.virtualmachineinstancestatus.volumestatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "claimName", "endTimestamp", "startTimestamp", "targetFileName" })
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
public class MemoryDumpVolume implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * ClaimName is the name of the pvc the memory was dumped to
     */
    @com.fasterxml.jackson.annotation.JsonProperty("claimName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ClaimName is the name of the pvc the memory was dumped to")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String claimName;

    public String getClaimName() {
        return claimName;
    }

    public void setClaimName(String claimName) {
        this.claimName = claimName;
    }

    /**
     * EndTimestamp is the time when the memory dump completed
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endTimestamp")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("EndTimestamp is the time when the memory dump completed")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.time.ZonedDateTime endTimestamp;

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssVV")
    public java.time.ZonedDateTime getEndTimestamp() {
        return endTimestamp;
    }

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss[XXX][VV]")
    public void setEndTimestamp(java.time.ZonedDateTime endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    /**
     * StartTimestamp is the time when the memory dump started
     */
    @com.fasterxml.jackson.annotation.JsonProperty("startTimestamp")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("StartTimestamp is the time when the memory dump started")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.time.ZonedDateTime startTimestamp;

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssVV")
    public java.time.ZonedDateTime getStartTimestamp() {
        return startTimestamp;
    }

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss[XXX][VV]")
    public void setStartTimestamp(java.time.ZonedDateTime startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    /**
     * TargetFileName is the name of the memory dump output
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetFileName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TargetFileName is the name of the memory dump output")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String targetFileName;

    public String getTargetFileName() {
        return targetFileName;
    }

    public void setTargetFileName(String targetFileName) {
        this.targetFileName = targetFileName;
    }
}
