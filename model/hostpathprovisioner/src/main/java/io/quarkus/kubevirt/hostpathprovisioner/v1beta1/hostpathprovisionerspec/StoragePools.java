package io.quarkus.kubevirt.hostpathprovisioner.v1beta1.hostpathprovisionerspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "name", "path", "pvcTemplate" })
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
public class StoragePools implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Name specifies an identifier that is used in the storage class arguments to identify the source to use.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name specifies an identifier that is used in the storage class arguments to identify the source to use.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * path the path to use on the host, this is a required field
     */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("path the path to use on the host, this is a required field")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * PVCTemplate is the template of the PVC to create as the source volume
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pvcTemplate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PVCTemplate is the template of the PVC to create as the source volume")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.hostpathprovisioner.v1beta1.hostpathprovisionerspec.storagepools.PvcTemplate pvcTemplate;

    public io.quarkus.kubevirt.hostpathprovisioner.v1beta1.hostpathprovisionerspec.storagepools.PvcTemplate getPvcTemplate() {
        return pvcTemplate;
    }

    public void setPvcTemplate(
            io.quarkus.kubevirt.hostpathprovisioner.v1beta1.hostpathprovisionerspec.storagepools.PvcTemplate pvcTemplate) {
        this.pvcTemplate = pvcTemplate;
    }
}
