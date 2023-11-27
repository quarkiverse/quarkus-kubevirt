package io.quarkiverse.kubevirt.v1alpha3.virtualmachineinstancestatus.volumestatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "attachPodName", "attachPodUID" })
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
public class HotplugVolume implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * AttachPodName is the name of the pod used to attach the volume to the node.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attachPodName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AttachPodName is the name of the pod used to attach the volume to the node.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String attachPodName;

    public String getAttachPodName() {
        return attachPodName;
    }

    public void setAttachPodName(String attachPodName) {
        this.attachPodName = attachPodName;
    }

    /**
     * AttachPodUID is the UID of the pod used to attach the volume to the node.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attachPodUID")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AttachPodUID is the UID of the pod used to attach the volume to the node.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String attachPodUID;

    public String getAttachPodUID() {
        return attachPodUID;
    }

    public void setAttachPodUID(String attachPodUID) {
        this.attachPodUID = attachPodUID;
    }
}
