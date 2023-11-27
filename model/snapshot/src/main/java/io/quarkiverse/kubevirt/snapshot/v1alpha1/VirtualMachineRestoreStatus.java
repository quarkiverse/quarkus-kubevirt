package io.quarkiverse.kubevirt.snapshot.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "complete", "conditions", "deletedDataVolumes", "restoreTime",
        "restores" })
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
public class VirtualMachineRestoreStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("complete")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean complete;

    public Boolean getComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinerestorestatus.Conditions> conditions;

    public java.util.List<io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinerestorestatus.Conditions> getConditions() {
        return conditions;
    }

    public void setConditions(
            java.util.List<io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinerestorestatus.Conditions> conditions) {
        this.conditions = conditions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("deletedDataVolumes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> deletedDataVolumes;

    public java.util.List<String> getDeletedDataVolumes() {
        return deletedDataVolumes;
    }

    public void setDeletedDataVolumes(java.util.List<String> deletedDataVolumes) {
        this.deletedDataVolumes = deletedDataVolumes;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("restoreTime")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.time.ZonedDateTime restoreTime;

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssVV")
    public java.time.ZonedDateTime getRestoreTime() {
        return restoreTime;
    }

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss[XXX][VV]")
    public void setRestoreTime(java.time.ZonedDateTime restoreTime) {
        this.restoreTime = restoreTime;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("restores")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinerestorestatus.Restores> restores;

    public java.util.List<io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinerestorestatus.Restores> getRestores() {
        return restores;
    }

    public void setRestores(
            java.util.List<io.quarkiverse.kubevirt.snapshot.v1alpha1.virtualmachinerestorestatus.Restores> restores) {
        this.restores = restores;
    }
}
