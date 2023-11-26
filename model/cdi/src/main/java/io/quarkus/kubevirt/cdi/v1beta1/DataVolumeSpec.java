package io.quarkus.kubevirt.cdi.v1beta1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "checkpoints", "contentType", "finalCheckpoint", "preallocation",
        "priorityClassName", "pvc", "source", "sourceRef", "storage" })
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
public class DataVolumeSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Checkpoints is a list of DataVolumeCheckpoints, representing stages in a multistage import.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("checkpoints")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Checkpoints is a list of DataVolumeCheckpoints, representing stages in a multistage import.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkus.kubevirt.cdi.v1beta1.datavolumespec.Checkpoints> checkpoints;

    public java.util.List<io.quarkus.kubevirt.cdi.v1beta1.datavolumespec.Checkpoints> getCheckpoints() {
        return checkpoints;
    }

    public void setCheckpoints(java.util.List<io.quarkus.kubevirt.cdi.v1beta1.datavolumespec.Checkpoints> checkpoints) {
        this.checkpoints = checkpoints;
    }

    public enum ContentType {

        @com.fasterxml.jackson.annotation.JsonProperty("kubevirt")
        KUBEVIRT("kubevirt"),
        @com.fasterxml.jackson.annotation.JsonProperty("archive")
        ARCHIVE("archive");

        java.lang.String value;

        ContentType(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * DataVolumeContentType options: "kubevirt", "archive"
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contentType")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DataVolumeContentType options: \"kubevirt\", \"archive\"")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private ContentType contentType;

    public ContentType getContentType() {
        return contentType;
    }

    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }

    /**
     * FinalCheckpoint indicates whether the current DataVolumeCheckpoint is the final checkpoint.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("finalCheckpoint")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("FinalCheckpoint indicates whether the current DataVolumeCheckpoint is the final checkpoint.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean finalCheckpoint;

    public Boolean getFinalCheckpoint() {
        return finalCheckpoint;
    }

    public void setFinalCheckpoint(Boolean finalCheckpoint) {
        this.finalCheckpoint = finalCheckpoint;
    }

    /**
     * Preallocation controls whether storage for DataVolumes should be allocated in advance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preallocation")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Preallocation controls whether storage for DataVolumes should be allocated in advance.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean preallocation;

    public Boolean getPreallocation() {
        return preallocation;
    }

    public void setPreallocation(Boolean preallocation) {
        this.preallocation = preallocation;
    }

    /**
     * PriorityClassName for Importer, Cloner and Uploader pod
     */
    @com.fasterxml.jackson.annotation.JsonProperty("priorityClassName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PriorityClassName for Importer, Cloner and Uploader pod")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String priorityClassName;

    public String getPriorityClassName() {
        return priorityClassName;
    }

    public void setPriorityClassName(String priorityClassName) {
        this.priorityClassName = priorityClassName;
    }

    /**
     * PVC is the PVC specification
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pvc")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PVC is the PVC specification")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.cdi.v1beta1.datavolumespec.Pvc pvc;

    public io.quarkus.kubevirt.cdi.v1beta1.datavolumespec.Pvc getPvc() {
        return pvc;
    }

    public void setPvc(io.quarkus.kubevirt.cdi.v1beta1.datavolumespec.Pvc pvc) {
        this.pvc = pvc;
    }

    /**
     * Source is the src of the data for the requested DataVolume
     */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Source is the src of the data for the requested DataVolume")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.cdi.v1beta1.datavolumespec.Source source;

    public io.quarkus.kubevirt.cdi.v1beta1.datavolumespec.Source getSource() {
        return source;
    }

    public void setSource(io.quarkus.kubevirt.cdi.v1beta1.datavolumespec.Source source) {
        this.source = source;
    }

    /**
     * SourceRef is an indirect reference to the source of data for the requested DataVolume
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SourceRef is an indirect reference to the source of data for the requested DataVolume")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.cdi.v1beta1.datavolumespec.SourceRef sourceRef;

    public io.quarkus.kubevirt.cdi.v1beta1.datavolumespec.SourceRef getSourceRef() {
        return sourceRef;
    }

    public void setSourceRef(io.quarkus.kubevirt.cdi.v1beta1.datavolumespec.SourceRef sourceRef) {
        this.sourceRef = sourceRef;
    }

    /**
     * Storage is the requested storage specification
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storage")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Storage is the requested storage specification")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.cdi.v1beta1.datavolumespec.Storage storage;

    public io.quarkus.kubevirt.cdi.v1beta1.datavolumespec.Storage getStorage() {
        return storage;
    }

    public void setStorage(io.quarkus.kubevirt.cdi.v1beta1.datavolumespec.Storage storage) {
        this.storage = storage;
    }
}
