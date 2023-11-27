package io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.volumes;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "fields", "volumeLabel" })
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
public class DownwardAPI implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Fields is a list of downward API volume file
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fields")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Fields is a list of downward API volume file")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.volumes.downwardapi.Fields> fields;

    public java.util.List<io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.volumes.downwardapi.Fields> getFields() {
        return fields;
    }

    public void setFields(
            java.util.List<io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.volumes.downwardapi.Fields> fields) {
        this.fields = fields;
    }

    /**
     * The volume label of the resulting disk inside the VMI. Different bootstrapping mechanisms require different values.
     * Typical values are "cidata" (cloud-init), "config-2" (cloud-init) or "OEMDRV" (kickstart).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeLabel")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The volume label of the resulting disk inside the VMI. Different bootstrapping mechanisms require different values. Typical values are \"cidata\" (cloud-init), \"config-2\" (cloud-init) or \"OEMDRV\" (kickstart).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String volumeLabel;

    public String getVolumeLabel() {
        return volumeLabel;
    }

    public void setVolumeLabel(String volumeLabel) {
        this.volumeLabel = volumeLabel;
    }
}
