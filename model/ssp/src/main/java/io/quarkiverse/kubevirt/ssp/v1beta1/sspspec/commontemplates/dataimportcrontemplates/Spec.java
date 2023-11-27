package io.quarkiverse.kubevirt.ssp.v1beta1.sspspec.commontemplates.dataimportcrontemplates;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "garbageCollect", "importsToKeep", "managedDataSource", "retentionPolicy",
        "schedule", "template" })
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
public class Spec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * GarbageCollect specifies whether old PVCs should be cleaned up after a new PVC is imported. Options are currently
     * "Outdated" and "Never", defaults to "Outdated".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("garbageCollect")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("GarbageCollect specifies whether old PVCs should be cleaned up after a new PVC is imported. Options are currently \"Outdated\" and \"Never\", defaults to \"Outdated\".")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String garbageCollect;

    public String getGarbageCollect() {
        return garbageCollect;
    }

    public void setGarbageCollect(String garbageCollect) {
        this.garbageCollect = garbageCollect;
    }

    /**
     * Number of import PVCs to keep when garbage collecting. Default is 3.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("importsToKeep")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Number of import PVCs to keep when garbage collecting. Default is 3.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer importsToKeep;

    public Integer getImportsToKeep() {
        return importsToKeep;
    }

    public void setImportsToKeep(Integer importsToKeep) {
        this.importsToKeep = importsToKeep;
    }

    /**
     * ManagedDataSource specifies the name of the corresponding DataSource this cron will manage. DataSource has to be in the
     * same namespace.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managedDataSource")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ManagedDataSource specifies the name of the corresponding DataSource this cron will manage. DataSource has to be in the same namespace.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String managedDataSource;

    public String getManagedDataSource() {
        return managedDataSource;
    }

    public void setManagedDataSource(String managedDataSource) {
        this.managedDataSource = managedDataSource;
    }

    /**
     * RetentionPolicy specifies whether the created DataVolumes and DataSources are retained when their DataImportCron is
     * deleted. Default is RatainAll.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionPolicy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RetentionPolicy specifies whether the created DataVolumes and DataSources are retained when their DataImportCron is deleted. Default is RatainAll.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String retentionPolicy;

    public String getRetentionPolicy() {
        return retentionPolicy;
    }

    public void setRetentionPolicy(String retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
    }

    /**
     * Schedule specifies in cron format when and how often to look for new imports
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schedule")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Schedule specifies in cron format when and how often to look for new imports")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String schedule;

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * Template specifies template for the DVs to be created
     */
    @com.fasterxml.jackson.annotation.JsonProperty("template")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template specifies template for the DVs to be created")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.ssp.v1beta1.sspspec.commontemplates.dataimportcrontemplates.spec.Template template;

    public io.quarkiverse.kubevirt.ssp.v1beta1.sspspec.commontemplates.dataimportcrontemplates.spec.Template getTemplate() {
        return template;
    }

    public void setTemplate(
            io.quarkiverse.kubevirt.ssp.v1beta1.sspspec.commontemplates.dataimportcrontemplates.spec.Template template) {
        this.template = template;
    }
}
