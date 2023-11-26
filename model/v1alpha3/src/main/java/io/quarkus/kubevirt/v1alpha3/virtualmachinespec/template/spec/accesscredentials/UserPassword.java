package io.quarkus.kubevirt.v1alpha3.virtualmachinespec.template.spec.accesscredentials;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "propagationMethod", "source" })
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
public class UserPassword implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * propagationMethod represents how the user passwords are injected into the vm guest.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("propagationMethod")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("propagationMethod represents how the user passwords are injected into the vm guest.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1alpha3.virtualmachinespec.template.spec.accesscredentials.userpassword.PropagationMethod propagationMethod;

    public io.quarkus.kubevirt.v1alpha3.virtualmachinespec.template.spec.accesscredentials.userpassword.PropagationMethod getPropagationMethod() {
        return propagationMethod;
    }

    public void setPropagationMethod(
            io.quarkus.kubevirt.v1alpha3.virtualmachinespec.template.spec.accesscredentials.userpassword.PropagationMethod propagationMethod) {
        this.propagationMethod = propagationMethod;
    }

    /**
     * Source represents where the user passwords are pulled from
     */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Source represents where the user passwords are pulled from")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1alpha3.virtualmachinespec.template.spec.accesscredentials.userpassword.Source source;

    public io.quarkus.kubevirt.v1alpha3.virtualmachinespec.template.spec.accesscredentials.userpassword.Source getSource() {
        return source;
    }

    public void setSource(
            io.quarkus.kubevirt.v1alpha3.virtualmachinespec.template.spec.accesscredentials.userpassword.Source source) {
        this.source = source;
    }
}
