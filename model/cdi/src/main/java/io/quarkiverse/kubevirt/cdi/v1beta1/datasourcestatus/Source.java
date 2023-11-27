package io.quarkiverse.kubevirt.cdi.v1beta1.datasourcestatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "pvc", "snapshot" })
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
public class Source implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * DataVolumeSourcePVC provides the parameters to create a Data Volume from an existing PVC
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pvc")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DataVolumeSourcePVC provides the parameters to create a Data Volume from an existing PVC")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.cdi.v1beta1.datasourcestatus.source.Pvc pvc;

    public io.quarkiverse.kubevirt.cdi.v1beta1.datasourcestatus.source.Pvc getPvc() {
        return pvc;
    }

    public void setPvc(io.quarkiverse.kubevirt.cdi.v1beta1.datasourcestatus.source.Pvc pvc) {
        this.pvc = pvc;
    }

    /**
     * DataVolumeSourceSnapshot provides the parameters to create a Data Volume from an existing VolumeSnapshot
     */
    @com.fasterxml.jackson.annotation.JsonProperty("snapshot")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DataVolumeSourceSnapshot provides the parameters to create a Data Volume from an existing VolumeSnapshot")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.cdi.v1beta1.datasourcestatus.source.Snapshot snapshot;

    public io.quarkiverse.kubevirt.cdi.v1beta1.datasourcestatus.source.Snapshot getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(io.quarkiverse.kubevirt.cdi.v1beta1.datasourcestatus.source.Snapshot snapshot) {
        this.snapshot = snapshot;
    }
}
