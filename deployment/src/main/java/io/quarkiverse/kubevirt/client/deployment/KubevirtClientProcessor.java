package io.quarkiverse.kubevirt.client.deployment;

import org.jboss.jandex.IndexView;

import io.quarkus.arc.deployment.AdditionalBeanBuildItem;
import io.quarkus.deployment.annotations.BuildProducer;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.CombinedIndexBuildItem;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import io.quarkus.deployment.builditem.IndexDependencyBuildItem;
import io.quarkus.deployment.builditem.nativeimage.ReflectiveClassBuildItem;
import io.quarkus.kubernetes.client.runtime.KubernetesClientProducer;

class KubevirtClientProcessor {

  private static final String FEATURE = "quarkiverse-kubevrit-client";

  @BuildStep
  public FeatureBuildItem feature() {
    return new FeatureBuildItem(FEATURE);
  }

  @BuildStep
  public void addDependencies(BuildProducer<IndexDependencyBuildItem> indexDependency) {
    indexDependency.produce(new IndexDependencyBuildItem("io.quarkiverse.kubevirt", "quarkus-kubevrit-client"));
    indexDependency.produce(new IndexDependencyBuildItem("io.quarkiverse.kubevirt", "quarkus-kubevrit-model-v1"));
    indexDependency.produce(new IndexDependencyBuildItem("io.quarkiverse.kubevirt", "quarkus-kubevrit-model-cdi"));
    indexDependency.produce(new IndexDependencyBuildItem("io.quarkiverse.kubevirt", "quarkus-kubevrit-model-pool"));
  }

  @BuildStep
  public void registerKubevritReflections(BuildProducer<ReflectiveClassBuildItem> reflectiveClass,
      CombinedIndexBuildItem combinedIndexBuildItem) {

    IndexView index = combinedIndexBuildItem.getIndex();

    String[] classes = index.getKnownClasses().stream()
            .map(classInfo -> classInfo.name().toString())
            .filter(name -> name.startsWith("io.quarkiverse.kubevirt.pipeline"))
            .toArray(String[]::new);

    reflectiveClass.produce(ReflectiveClassBuildItem.builder(classes).constructors().methods().fields().build());
  }

  @BuildStep
  public void registerBeans(BuildProducer<AdditionalBeanBuildItem> additionalBeanBuildItemProducer) {
    additionalBeanBuildItemProducer.produce(AdditionalBeanBuildItem.unremovableOf(KubernetesClientProducer.class));
  }
}
