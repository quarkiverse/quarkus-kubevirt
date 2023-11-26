package io.quarkus.kubevirt.hco.v1beta1;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1beta1", storage = true, served = true)
@io.fabric8.kubernetes.model.annotation.Group("hco.kubevirt.io")
@io.fabric8.kubernetes.model.annotation.Singular("hyperconverged")
@io.fabric8.kubernetes.model.annotation.Plural("hyperconvergeds")
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
public class HyperConverged extends
        io.fabric8.kubernetes.client.CustomResource<io.quarkus.kubevirt.hco.v1beta1.HyperConvergedSpec, io.quarkus.kubevirt.hco.v1beta1.HyperConvergedStatus>
        implements io.fabric8.kubernetes.api.model.Namespaced {
}
