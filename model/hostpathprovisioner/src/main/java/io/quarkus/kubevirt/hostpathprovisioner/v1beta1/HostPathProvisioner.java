package io.quarkus.kubevirt.hostpathprovisioner.v1beta1;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1beta1", storage = true, served = true)
@io.fabric8.kubernetes.model.annotation.Group("hostpathprovisioner.kubevirt.io")
@io.fabric8.kubernetes.model.annotation.Singular("hostpathprovisioner")
@io.fabric8.kubernetes.model.annotation.Plural("hostpathprovisioners")
@lombok.ToString()
@lombok.EqualsAndHashCode(callSuper = true)
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
public class HostPathProvisioner extends
        io.fabric8.kubernetes.client.CustomResource<io.quarkus.kubevirt.hostpathprovisioner.v1beta1.HostPathProvisionerSpec, io.quarkus.kubevirt.hostpathprovisioner.v1beta1.HostPathProvisionerStatus> {
}
