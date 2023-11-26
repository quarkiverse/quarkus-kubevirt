package io.quarkus.kubevirt.instancetype.v1alpha2.virtualmachineclusterinstancetypespec.cpu;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "guestMappingPassthrough" })
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
public class Numa implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * GuestMappingPassthrough will create an efficient guest topology based on host CPUs exclusively assigned to a pod. The
     * created topology ensures that memory and CPUs on the virtual numa nodes never cross boundaries of host numa nodes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("guestMappingPassthrough")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("GuestMappingPassthrough will create an efficient guest topology based on host CPUs exclusively assigned to a pod. The created topology ensures that memory and CPUs on the virtual numa nodes never cross boundaries of host numa nodes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.instancetype.v1alpha2.virtualmachineclusterinstancetypespec.cpu.numa.GuestMappingPassthrough guestMappingPassthrough;

    public io.quarkus.kubevirt.instancetype.v1alpha2.virtualmachineclusterinstancetypespec.cpu.numa.GuestMappingPassthrough getGuestMappingPassthrough() {
        return guestMappingPassthrough;
    }

    public void setGuestMappingPassthrough(
            io.quarkus.kubevirt.instancetype.v1alpha2.virtualmachineclusterinstancetypespec.cpu.numa.GuestMappingPassthrough guestMappingPassthrough) {
        this.guestMappingPassthrough = guestMappingPassthrough;
    }
}
