package io.quarkiverse.kubevirt.codegen;

import io.sundr.transform.annotations.AnnotationSelector;
import io.sundr.transform.annotations.PackageSelector;
import io.sundr.transform.annotations.TemplateTransformation;
import io.sundr.transform.annotations.TemplateTransformations;

@TemplateTransformations(annotations = @AnnotationSelector(value = io.fabric8.kubernetes.model.annotation.Group.class, packages = @PackageSelector("io.quarkiverse.kubevirt.instancetype.v1alpha2")), value = {
    @TemplateTransformation("/resource-list.vm"),
    @TemplateTransformation(value = "/service.vm", outputPath = "META-INF/services/io.fabric8.kubernetes.api.model.KubernetesResource", gather = true),
    @TemplateTransformation(value = "/dsl.vm", outputPath = "io.quarkiverse.kubevirt/v1apha2/Dsl.java", gather = true),
    @TemplateTransformation(value = "/client.vm", outputPath = "io.quarkiverse.kubevirt/v1alpha2/Client.java", gather = true)
})
public class CodegenV1alpha2 {
}
