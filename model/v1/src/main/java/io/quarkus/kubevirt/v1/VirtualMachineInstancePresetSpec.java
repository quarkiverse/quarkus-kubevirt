package io.quarkus.kubevirt.v1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "domain", "selector" })
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
public class VirtualMachineInstancePresetSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Domain is the same object type as contained in VirtualMachineInstanceSpec
     */
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Domain is the same object type as contained in VirtualMachineInstanceSpec")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1.virtualmachineinstancepresetspec.Domain domain;

    public io.quarkus.kubevirt.v1.virtualmachineinstancepresetspec.Domain getDomain() {
        return domain;
    }

    public void setDomain(io.quarkus.kubevirt.v1.virtualmachineinstancepresetspec.Domain domain) {
        this.domain = domain;
    }

    /**
     * Selector is a label query over a set of VMIs. Required.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("selector")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Selector is a label query over a set of VMIs. Required.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1.virtualmachineinstancepresetspec.Selector selector;

    public io.quarkus.kubevirt.v1.virtualmachineinstancepresetspec.Selector getSelector() {
        return selector;
    }

    public void setSelector(io.quarkus.kubevirt.v1.virtualmachineinstancepresetspec.Selector selector) {
        this.selector = selector;
    }
}
