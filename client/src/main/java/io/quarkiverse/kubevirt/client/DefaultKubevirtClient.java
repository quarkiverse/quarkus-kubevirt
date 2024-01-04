package io.quarkiverse.kubevirt.client;

import io.fabric8.kubernetes.client.Client;
import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.RequestConfig;
import io.fabric8.kubernetes.client.WithRequestCallable;
import io.fabric8.kubernetes.client.dsl.FunctionCallable;
import io.fabric8.kubernetes.client.extension.ExtensionRootClientAdapter;
import io.fabric8.kubernetes.client.extension.SupportTestingClient;
import io.quarkiverse.kubevirt.cdi.v1beta1.CdiV1beta1Client;
import io.quarkiverse.kubevirt.cdi.v1beta1.CdiV1beta1DSL;
import io.quarkiverse.kubevirt.pool.v1alpha1.PoolV1alpha1Client;
import io.quarkiverse.kubevirt.pool.v1alpha1.PoolV1alpha1DSL;
import io.quarkiverse.kubevirt.v1.V1Client;
import io.quarkiverse.kubevirt.v1.V1DSL;

public class DefaultKubevirtClient extends ExtensionRootClientAdapter<DefaultKubevirtClient>
    implements NamespacedKubevirtClient, SupportTestingClient {

  public DefaultKubevirtClient() {
    super();
  }

  public DefaultKubevirtClient(Config configuration) {
    super(configuration);
  }

  public DefaultKubevirtClient(Client client) {
    super(client);
  }

  @Override
  protected DefaultKubevirtClient newInstance(Client client) {
    return new DefaultKubevirtClient(client);
  }

  @Override
  public FunctionCallable<NamespacedKubevirtClient> withRequestConfig(RequestConfig requestConfig) {
    return new WithRequestCallable<>(this, requestConfig);
  }

  @Override
  public V1DSL v1() {
    return adapt(V1Client.class);
  }

  @Override
  public CdiV1beta1DSL cdiV1beta1() {
    return adapt(CdiV1beta1Client.class);
  }

  @Override
  public PoolV1alpha1DSL poolV1alpha1() {
    return adapt(PoolV1alpha1Client.class);
  }

  @Override
  public boolean isSupported() {
    return hasApiGroup("kubevirt.io", false);
  }
}
