package io.quarkiverse.kubevirt.utils;

import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientBuilder;
import io.quarkiverse.kubevirt.client.KubevirtClient;

public final class Clients {

  public static KubernetesClient KUBERNETES_CLIENT = new KubernetesClientBuilder().build();
  public static KubevirtClient KUBEVIRT_CLIENT = KUBERNETES_CLIENT.adapt(KubevirtClient.class);

  private Clients() {
    //Utility
  }

  public static KubernetesClient kubernetes() {
    return KUBERNETES_CLIENT;
  }

  public static KubevirtClient kubevirt() {
    return KUBEVIRT_CLIENT;
  }
}
