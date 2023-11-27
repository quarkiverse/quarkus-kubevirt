package io.quarkiverse.kubevirt.client;

import io.quarkiverse.kubevirt.cdi.v1beta1.CdiV1beta1DSL;
import io.quarkiverse.kubevirt.pool.v1alpha1.PoolV1alpha1DSL;
import io.quarkiverse.kubevirt.v1.V1DSL;

public interface KubevirtClient {

    V1DSL v1();

    CdiV1beta1DSL cdiV1beta1();

    PoolV1alpha1DSL poolV1alpha1();
}
