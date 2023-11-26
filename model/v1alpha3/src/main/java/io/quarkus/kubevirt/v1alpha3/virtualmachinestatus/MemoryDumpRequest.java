package io.quarkus.kubevirt.v1alpha3.virtualmachinestatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "claimName", "endTimestamp", "fileName", "message", "phase", "remove",
        "startTimestamp" })
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
public class MemoryDumpRequest implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * ClaimName is the name of the pvc that will contain the memory dump
     */
    @com.fasterxml.jackson.annotation.JsonProperty("claimName")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ClaimName is the name of the pvc that will contain the memory dump")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String claimName;

    public String getClaimName() {
        return claimName;
    }

    public void setClaimName(String claimName) {
        this.claimName = claimName;
    }

    /**
     * EndTimestamp represents the time the memory dump was completed
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endTimestamp")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("EndTimestamp represents the time the memory dump was completed")
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
     * FileName represents the name of the output file
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fileName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("FileName represents the name of the output file")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Message is a detailed message about failure of the memory dump
     */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Message is a detailed message about failure of the memory dump")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Phase represents the memory dump phase
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Phase represents the memory dump phase")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * Remove represents request of dissociating the memory dump pvc
     */
    @com.fasterxml.jackson.annotation.JsonProperty("remove")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Remove represents request of dissociating the memory dump pvc")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean remove;

    public Boolean getRemove() {
        return remove;
    }

    public void setRemove(Boolean remove) {
        this.remove = remove;
    }

    /**
     * StartTimestamp represents the time the memory dump started
     */
    @com.fasterxml.jackson.annotation.JsonProperty("startTimestamp")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("StartTimestamp represents the time the memory dump started")
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
}
