package io.quarkiverse.kubevirt.client;

public interface NamespacedKubevirtClient extends KubevirtClient,
        GenericKubevirtClient<NamespacedKubevirtClient> {
}
