package io.quarkus.kubevirt.v1alpha3.virtualmachinespec.template.spec.domain;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "sev" })
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
public class LaunchSecurity implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * AMD Secure Encrypted Virtualization (SEV).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sev")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AMD Secure Encrypted Virtualization (SEV).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1alpha3.virtualmachinespec.template.spec.domain.launchsecurity.Sev sev;

    public io.quarkus.kubevirt.v1alpha3.virtualmachinespec.template.spec.domain.launchsecurity.Sev getSev() {
        return sev;
    }

    public void setSev(io.quarkus.kubevirt.v1alpha3.virtualmachinespec.template.spec.domain.launchsecurity.Sev sev) {
        this.sev = sev;
    }
}
