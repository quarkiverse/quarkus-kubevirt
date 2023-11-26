package io.quarkus.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.spec.template.spec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "sshPublicKey", "userPassword" })
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
public class AccessCredentials implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * SSHPublicKey represents the source and method of applying a ssh public key into a guest virtual machine.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKey")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SSHPublicKey represents the source and method of applying a ssh public key into a guest virtual machine.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.spec.template.spec.accesscredentials.SshPublicKey sshPublicKey;

    public io.quarkus.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.spec.template.spec.accesscredentials.SshPublicKey getSshPublicKey() {
        return sshPublicKey;
    }

    public void setSshPublicKey(
            io.quarkus.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.spec.template.spec.accesscredentials.SshPublicKey sshPublicKey) {
        this.sshPublicKey = sshPublicKey;
    }

    /**
     * UserPassword represents the source and method for applying a guest user's password
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userPassword")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("UserPassword represents the source and method for applying a guest user's password")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.spec.template.spec.accesscredentials.UserPassword userPassword;

    public io.quarkus.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.spec.template.spec.accesscredentials.UserPassword getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(
            io.quarkus.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.spec.template.spec.accesscredentials.UserPassword userPassword) {
        this.userPassword = userPassword;
    }
}
