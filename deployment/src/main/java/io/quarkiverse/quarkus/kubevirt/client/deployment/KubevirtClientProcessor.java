package io.quarkiverse.quarkus.kubevirt.client.deployment;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class KubevirtClientProcessor {

    private static final String FEATURE = "kubevirt-client";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }
}
