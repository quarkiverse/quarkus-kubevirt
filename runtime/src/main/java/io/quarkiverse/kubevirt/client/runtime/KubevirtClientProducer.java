package io.quarkiverse.kubevirt.client.runtime;

import jakarta.enterprise.inject.Produces;
import jakarta.inject.Singleton;

import io.fabric8.kubernetes.client.Config;
import io.quarkiverse.kubevirt.client.DefaultKubevirtClient;
import io.quarkiverse.kubevirt.client.KubevirtClient;
import io.quarkus.arc.DefaultBean;

@Singleton
public class KubevirtClientProducer {

    @DefaultBean
    @Singleton
    @Produces
    public KubevirtClient tektonClient(Config config) {
        return new DefaultKubevirtClient(config);
    }
}
