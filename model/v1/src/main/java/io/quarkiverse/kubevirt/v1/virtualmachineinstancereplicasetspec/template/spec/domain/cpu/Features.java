package io.quarkiverse.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.cpu;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "name", "policy" })
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
public class Features implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Name of the CPU feature
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the CPU feature")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Policy is the CPU feature attribute which can have the following attributes: force - The virtual CPU will claim the
     * feature is supported regardless of it being supported by host CPU. require - Guest creation will fail unless the feature
     * is supported by the host CPU or the hypervisor is able to emulate it. optional - The feature will be supported by virtual
     * CPU if and only if it is supported by host CPU. disable - The feature will not be supported by virtual CPU. forbid -
     * Guest creation will fail if the feature is supported by host CPU. Defaults to require
     */
    @com.fasterxml.jackson.annotation.JsonProperty("policy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Policy is the CPU feature attribute which can have the following attributes: force    - The virtual CPU will claim the feature is supported regardless of it being supported by host CPU. require  - Guest creation will fail unless the feature is supported by the host CPU or the hypervisor is able to emulate it. optional - The feature will be supported by virtual CPU if and only if it is supported by host CPU. disable  - The feature will not be supported by virtual CPU. forbid   - Guest creation will fail if the feature is supported by host CPU. Defaults to require")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String policy;

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }
}
