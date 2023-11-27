package io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "dataVolumeTemplates", "instancetype", "preference", "runStrategy",
        "running", "template" })
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
     * dataVolumeTemplates is a list of dataVolumes that the VirtualMachineInstance template can reference. DataVolumes in this
     * list are dynamically created for the VirtualMachine and are tied to the VirtualMachine's life-cycle.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataVolumeTemplates")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("dataVolumeTemplates is a list of dataVolumes that the VirtualMachineInstance template can reference. DataVolumes in this list are dynamically created for the VirtualMachine and are tied to the VirtualMachine's life-cycle.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.DataVolumeTemplates> dataVolumeTemplates;

    public java.util.List<io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.DataVolumeTemplates> getDataVolumeTemplates() {
        return dataVolumeTemplates;
    }

    public void setDataVolumeTemplates(
            java.util.List<io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.DataVolumeTemplates> dataVolumeTemplates) {
        this.dataVolumeTemplates = dataVolumeTemplates;
    }

    /**
     * InstancetypeMatcher references a instancetype that is used to fill fields in Template
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instancetype")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("InstancetypeMatcher references a instancetype that is used to fill fields in Template")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.Instancetype instancetype;

    public io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.Instancetype getInstancetype() {
        return instancetype;
    }

    public void setInstancetype(
            io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.Instancetype instancetype) {
        this.instancetype = instancetype;
    }

    /**
     * PreferenceMatcher references a set of preference that is used to fill fields in Template
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preference")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreferenceMatcher references a set of preference that is used to fill fields in Template")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.Preference preference;

    public io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.Preference getPreference() {
        return preference;
    }

    public void setPreference(
            io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.Preference preference) {
        this.preference = preference;
    }

    /**
     * Running state indicates the requested running state of the VirtualMachineInstance mutually exclusive with Running
     */
    @com.fasterxml.jackson.annotation.JsonProperty("runStrategy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Running state indicates the requested running state of the VirtualMachineInstance mutually exclusive with Running")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String runStrategy;

    public String getRunStrategy() {
        return runStrategy;
    }

    public void setRunStrategy(String runStrategy) {
        this.runStrategy = runStrategy;
    }

    /**
     * Running controls whether the associatied VirtualMachineInstance is created or not Mutually exclusive with RunStrategy
     */
    @com.fasterxml.jackson.annotation.JsonProperty("running")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Running controls whether the associatied VirtualMachineInstance is created or not Mutually exclusive with RunStrategy")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean running;

    public Boolean getRunning() {
        return running;
    }

    public void setRunning(Boolean running) {
        this.running = running;
    }

    /**
     * Template is the direct specification of VirtualMachineInstance
     */
    @com.fasterxml.jackson.annotation.JsonProperty("template")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template is the direct specification of VirtualMachineInstance")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.Template template;

    public io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.Template getTemplate() {
        return template;
    }

    public void setTemplate(
            io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.Template template) {
        this.template = template;
    }
}
