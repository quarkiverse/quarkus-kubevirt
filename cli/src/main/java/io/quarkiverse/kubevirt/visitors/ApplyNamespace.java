package io.quarkiverse.kubevirt.visitors;

import io.fabric8.kubernetes.api.builder.TypedVisitor;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;

public class ApplyNamespace extends TypedVisitor<ObjectMetaFluent<?>> {

    private final String namespace;

    public ApplyNamespace(String namespace) {
        this.namespace = namespace;
    }

    @Override
    public void visit(ObjectMetaFluent<?> metadata) {
        metadata.withNamespace(namespace);
    }

}
