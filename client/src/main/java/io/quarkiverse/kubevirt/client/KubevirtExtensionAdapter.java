package io.quarkiverse.kubevirt.client;

import io.fabric8.kubernetes.client.Client;
import io.fabric8.kubernetes.client.extension.ExtensionAdapter;
import io.quarkiverse.kubevirt.cdi.v1beta1.CdiV1beta1Client;
import io.quarkiverse.kubevirt.cdi.v1beta1.CdiV1beta1DSL;
import io.quarkiverse.kubevirt.pool.v1alpha1.PoolV1alpha1Client;
import io.quarkiverse.kubevirt.pool.v1alpha1.PoolV1alpha1DSL;
import io.quarkiverse.kubevirt.v1.V1Client;
import io.quarkiverse.kubevirt.v1.V1DSL;

public class KubevirtExtensionAdapter implements ExtensionAdapter<KubevirtClient> {

  @Override
  public Class<KubevirtClient> getExtensionType() {
    return KubevirtClient.class;
  }

  @Override
  public KubevirtClient adapt(Client client) {
    return new DefaultKubevirtClient(client);
  }

  @Override
  public void registerClients(ClientFactory factory) {
    factory.register(V1DSL.class, new V1Client());
    factory.register(CdiV1beta1DSL.class, new CdiV1beta1Client());
    factory.register(PoolV1alpha1DSL.class, new PoolV1alpha1Client());
  }
}
