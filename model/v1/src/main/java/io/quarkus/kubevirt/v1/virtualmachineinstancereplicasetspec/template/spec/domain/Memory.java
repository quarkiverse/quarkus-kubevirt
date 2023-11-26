package io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "guest", "hugepages" })
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
public class Memory implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Guest allows to specifying the amount of memory which is visible inside the Guest OS. The Guest must lie between Requests
     * and Limits from the resources section. Defaults to the requested memory in the resources section if not specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("guest")
    @io.fabric8.generator.annotation.Pattern("^(\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\\+|-)?(([0-9]+(\\.[0-9]*)?)|(\\.[0-9]+))))?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Guest allows to specifying the amount of memory which is visible inside the Guest OS. The Guest must lie between Requests and Limits from the resources section. Defaults to the requested memory in the resources section if not specified.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString guest;

    public io.fabric8.kubernetes.api.model.IntOrString getGuest() {
        return guest;
    }

    public void setGuest(io.fabric8.kubernetes.api.model.IntOrString guest) {
        this.guest = guest;
    }

    /**
     * Hugepages allow to use hugepages for the VirtualMachineInstance instead of regular memory.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hugepages")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Hugepages allow to use hugepages for the VirtualMachineInstance instead of regular memory.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.memory.Hugepages hugepages;

    public io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.memory.Hugepages getHugepages() {
        return hugepages;
    }

    public void setHugepages(
            io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.memory.Hugepages hugepages) {
        this.hugepages = hugepages;
    }
}
