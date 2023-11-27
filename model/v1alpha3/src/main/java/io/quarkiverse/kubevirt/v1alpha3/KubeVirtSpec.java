package io.quarkiverse.kubevirt.v1alpha3;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "certificateRotateStrategy", "configuration", "customizeComponents",
        "imagePullPolicy", "imagePullSecrets", "imageRegistry", "imageTag", "infra", "monitorAccount", "monitorNamespace",
        "productComponent", "productName", "productVersion", "serviceMonitorNamespace", "uninstallStrategy",
        "workloadUpdateStrategy", "workloads" })
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@lombok.ToString()
@lombok.EqualsAndHashCode()
@io.sundr.builder.annotations.Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectMeta.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectReference.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.LabelSelector.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Container.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.EnvVar.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ContainerPort.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Volume.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.VolumeMount.class)
})
public class KubeVirtSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("certificateRotateStrategy")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.CertificateRotateStrategy certificateRotateStrategy;

    public io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.CertificateRotateStrategy getCertificateRotateStrategy() {
        return certificateRotateStrategy;
    }

    public void setCertificateRotateStrategy(
            io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.CertificateRotateStrategy certificateRotateStrategy) {
        this.certificateRotateStrategy = certificateRotateStrategy;
    }

    /**
     * holds kubevirt configurations. same as the virt-configMap
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("holds kubevirt configurations. same as the virt-configMap")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.Configuration configuration;

    public io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.Configuration configuration) {
        this.configuration = configuration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("customizeComponents")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.CustomizeComponents customizeComponents;

    public io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.CustomizeComponents getCustomizeComponents() {
        return customizeComponents;
    }

    public void setCustomizeComponents(io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.CustomizeComponents customizeComponents) {
        this.customizeComponents = customizeComponents;
    }

    /**
     * The ImagePullPolicy to use.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("imagePullPolicy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The ImagePullPolicy to use.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String imagePullPolicy;

    public String getImagePullPolicy() {
        return imagePullPolicy;
    }

    public void setImagePullPolicy(String imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
    }

    /**
     * The imagePullSecrets to pull the container images from Defaults to none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("imagePullSecrets")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The imagePullSecrets to pull the container images from Defaults to none")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.ImagePullSecrets> imagePullSecrets;

    public java.util.List<io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.ImagePullSecrets> getImagePullSecrets() {
        return imagePullSecrets;
    }

    public void setImagePullSecrets(
            java.util.List<io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.ImagePullSecrets> imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
    }

    /**
     * The image registry to pull the container images from Defaults to the same registry the operator's container image is
     * pulled from.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("imageRegistry")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The image registry to pull the container images from Defaults to the same registry the operator's container image is pulled from.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String imageRegistry;

    public String getImageRegistry() {
        return imageRegistry;
    }

    public void setImageRegistry(String imageRegistry) {
        this.imageRegistry = imageRegistry;
    }

    /**
     * The image tag to use for the continer images installed. Defaults to the same tag as the operator's container image.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("imageTag")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The image tag to use for the continer images installed. Defaults to the same tag as the operator's container image.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String imageTag;

    public String getImageTag() {
        return imageTag;
    }

    public void setImageTag(String imageTag) {
        this.imageTag = imageTag;
    }

    /**
     * selectors and tolerations that should apply to KubeVirt infrastructure components
     */
    @com.fasterxml.jackson.annotation.JsonProperty("infra")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("selectors and tolerations that should apply to KubeVirt infrastructure components")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.Infra infra;

    public io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.Infra getInfra() {
        return infra;
    }

    public void setInfra(io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.Infra infra) {
        this.infra = infra;
    }

    /**
     * The name of the Prometheus service account that needs read-access to KubeVirt endpoints Defaults to prometheus-k8s
     */
    @com.fasterxml.jackson.annotation.JsonProperty("monitorAccount")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The name of the Prometheus service account that needs read-access to KubeVirt endpoints Defaults to prometheus-k8s")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String monitorAccount;

    public String getMonitorAccount() {
        return monitorAccount;
    }

    public void setMonitorAccount(String monitorAccount) {
        this.monitorAccount = monitorAccount;
    }

    /**
     * The namespace Prometheus is deployed in Defaults to openshift-monitor
     */
    @com.fasterxml.jackson.annotation.JsonProperty("monitorNamespace")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The namespace Prometheus is deployed in Defaults to openshift-monitor")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String monitorNamespace;

    public String getMonitorNamespace() {
        return monitorNamespace;
    }

    public void setMonitorNamespace(String monitorNamespace) {
        this.monitorNamespace = monitorNamespace;
    }

    /**
     * Designate the apps.kubevirt.io/component label for KubeVirt components. Useful if KubeVirt is included as part of a
     * product. If ProductComponent is not specified, the component label default value is kubevirt.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("productComponent")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Designate the apps.kubevirt.io/component label for KubeVirt components. Useful if KubeVirt is included as part of a product. If ProductComponent is not specified, the component label default value is kubevirt.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String productComponent;

    public String getProductComponent() {
        return productComponent;
    }

    public void setProductComponent(String productComponent) {
        this.productComponent = productComponent;
    }

    /**
     * Designate the apps.kubevirt.io/part-of label for KubeVirt components. Useful if KubeVirt is included as part of a
     * product. If ProductName is not specified, the part-of label will be omitted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("productName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Designate the apps.kubevirt.io/part-of label for KubeVirt components. Useful if KubeVirt is included as part of a product. If ProductName is not specified, the part-of label will be omitted.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String productName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Designate the apps.kubevirt.io/version label for KubeVirt components. Useful if KubeVirt is included as part of a
     * product. If ProductVersion is not specified, KubeVirt's version will be used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("productVersion")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Designate the apps.kubevirt.io/version label for KubeVirt components. Useful if KubeVirt is included as part of a product. If ProductVersion is not specified, KubeVirt's version will be used.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String productVersion;

    public String getProductVersion() {
        return productVersion;
    }

    public void setProductVersion(String productVersion) {
        this.productVersion = productVersion;
    }

    /**
     * The namespace the service monitor will be deployed When ServiceMonitorNamespace is set, then we'll install the service
     * monitor object in that namespace otherwise we will use the monitoring namespace.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceMonitorNamespace")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The namespace the service monitor will be deployed  When ServiceMonitorNamespace is set, then we'll install the service monitor object in that namespace otherwise we will use the monitoring namespace.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String serviceMonitorNamespace;

    public String getServiceMonitorNamespace() {
        return serviceMonitorNamespace;
    }

    public void setServiceMonitorNamespace(String serviceMonitorNamespace) {
        this.serviceMonitorNamespace = serviceMonitorNamespace;
    }

    /**
     * Specifies if kubevirt can be deleted if workloads are still present. This is mainly a precaution to avoid accidental data
     * loss
     */
    @com.fasterxml.jackson.annotation.JsonProperty("uninstallStrategy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies if kubevirt can be deleted if workloads are still present. This is mainly a precaution to avoid accidental data loss")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String uninstallStrategy;

    public String getUninstallStrategy() {
        return uninstallStrategy;
    }

    public void setUninstallStrategy(String uninstallStrategy) {
        this.uninstallStrategy = uninstallStrategy;
    }

    /**
     * WorkloadUpdateStrategy defines at the cluster level how to handle automated workload updates
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workloadUpdateStrategy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("WorkloadUpdateStrategy defines at the cluster level how to handle automated workload updates")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.WorkloadUpdateStrategy workloadUpdateStrategy;

    public io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.WorkloadUpdateStrategy getWorkloadUpdateStrategy() {
        return workloadUpdateStrategy;
    }

    public void setWorkloadUpdateStrategy(
            io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.WorkloadUpdateStrategy workloadUpdateStrategy) {
        this.workloadUpdateStrategy = workloadUpdateStrategy;
    }

    /**
     * selectors and tolerations that should apply to KubeVirt workloads
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workloads")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("selectors and tolerations that should apply to KubeVirt workloads")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.Workloads workloads;

    public io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.Workloads getWorkloads() {
        return workloads;
    }

    public void setWorkloads(io.quarkiverse.kubevirt.v1alpha3.kubevirtspec.Workloads workloads) {
        this.workloads = workloads;
    }
}
