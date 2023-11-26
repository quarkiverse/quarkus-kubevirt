package io.quarkus.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.accesscredentials.userpassword;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "qemuGuestAgent" })
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
public class PropagationMethod implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * QemuGuestAgentAccessCredentailPropagation means passwords are dynamically injected into the vm at runtime via the qemu
     * guest agent. This feature requires the qemu guest agent to be running within the guest.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("qemuGuestAgent")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("QemuGuestAgentAccessCredentailPropagation means passwords are dynamically injected into the vm at runtime via the qemu guest agent. This feature requires the qemu guest agent to be running within the guest.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.accesscredentials.userpassword.propagationmethod.QemuGuestAgent qemuGuestAgent;

    public io.quarkus.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.accesscredentials.userpassword.propagationmethod.QemuGuestAgent getQemuGuestAgent() {
        return qemuGuestAgent;
    }

    public void setQemuGuestAgent(
            io.quarkus.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.template.spec.accesscredentials.userpassword.propagationmethod.QemuGuestAgent qemuGuestAgent) {
        this.qemuGuestAgent = qemuGuestAgent;
    }
}
