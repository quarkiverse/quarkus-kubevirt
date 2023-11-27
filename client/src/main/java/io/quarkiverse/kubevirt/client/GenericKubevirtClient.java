package io.quarkiverse.kubevirt.client;

import io.fabric8.kubernetes.client.Client;
import io.fabric8.kubernetes.client.dsl.AnyNamespaceable;
import io.fabric8.kubernetes.client.dsl.Namespaceable;
import io.fabric8.kubernetes.client.dsl.RequestConfigurable;

public interface GenericKubevirtClient<C extends Client> extends Client, KubevirtClient,
        Namespaceable<C>,
        AnyNamespaceable<C>,
        RequestConfigurable<C> {
}
