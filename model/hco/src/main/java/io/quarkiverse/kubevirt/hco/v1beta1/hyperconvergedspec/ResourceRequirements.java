package io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "storageWorkloads" })
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
public class ResourceRequirements implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * StorageWorkloads defines the resources requirements for storage workloads. It will propagate to the CDI custom resource
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storageWorkloads")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("StorageWorkloads defines the resources requirements for storage workloads. It will propagate to the CDI custom resource")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.resourcerequirements.StorageWorkloads storageWorkloads;

    public io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.resourcerequirements.StorageWorkloads getStorageWorkloads() {
        return storageWorkloads;
    }

    public void setStorageWorkloads(
            io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.resourcerequirements.StorageWorkloads storageWorkloads) {
        this.storageWorkloads = storageWorkloads;
    }
}
