package io.quarkiverse.kubevirt.hco.v1beta1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "certConfig", "commonTemplatesNamespace", "dataImportCronTemplates",
        "defaultCPUModel", "defaultRuntimeClass", "featureGates", "filesystemOverhead", "infra", "kubeSecondaryDNSNameServerIP",
        "liveMigrationConfig", "localStorageClassName", "logVerbosityConfig", "mediatedDevicesConfiguration", "obsoleteCPUs",
        "permittedHostDevices", "resourceRequirements", "scratchSpaceStorageClass", "storageImport", "tektonPipelinesNamespace",
        "tlsSecurityProfile", "tuningPolicy", "uninstallStrategy", "vddkInitImage", "workloadUpdateStrategy", "workloads" })
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
public class HyperConvergedSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * certConfig holds the rotation policy for internal, self-signed certificates
     */
    @com.fasterxml.jackson.annotation.JsonProperty("certConfig")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("certConfig holds the rotation policy for internal, self-signed certificates")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.CertConfig certConfig = io.fabric8.kubernetes.client.utils.Serialization
            .unmarshal(
                    "{\"ca\":{\"duration\":\"48h0m0s\",\"renewBefore\":\"24h0m0s\"},\"server\":{\"duration\":\"24h0m0s\",\"renewBefore\":\"12h0m0s\"}}",
                    io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.CertConfig.class);

    public io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.CertConfig getCertConfig() {
        return certConfig;
    }

    public void setCertConfig(io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.CertConfig certConfig) {
        this.certConfig = certConfig;
    }

    /**
     * CommonTemplatesNamespace defines namespace in which common templates will be deployed. It overrides the default openshift
     * namespace.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("commonTemplatesNamespace")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CommonTemplatesNamespace defines namespace in which common templates will be deployed. It overrides the default openshift namespace.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String commonTemplatesNamespace;

    public String getCommonTemplatesNamespace() {
        return commonTemplatesNamespace;
    }

    public void setCommonTemplatesNamespace(String commonTemplatesNamespace) {
        this.commonTemplatesNamespace = commonTemplatesNamespace;
    }

    /**
     * DataImportCronTemplates holds list of data import cron templates (golden images)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataImportCronTemplates")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DataImportCronTemplates holds list of data import cron templates (golden images)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.DataImportCronTemplates> dataImportCronTemplates;

    public java.util.List<io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.DataImportCronTemplates> getDataImportCronTemplates() {
        return dataImportCronTemplates;
    }

    public void setDataImportCronTemplates(
            java.util.List<io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.DataImportCronTemplates> dataImportCronTemplates) {
        this.dataImportCronTemplates = dataImportCronTemplates;
    }

    /**
     * DefaultCPUModel defines a cluster default for CPU model: default CPU model is set when VMI doesn't have any CPU model.
     * When VMI has CPU model set, then VMI's CPU model is preferred. When default CPU model is not set and VMI's CPU model is
     * not set too, host-model will be set. Default CPU model can be changed when kubevirt is running.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultCPUModel")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DefaultCPUModel defines a cluster default for CPU model: default CPU model is set when VMI doesn't have any CPU model. When VMI has CPU model set, then VMI's CPU model is preferred. When default CPU model is not set and VMI's CPU model is not set too, host-model will be set. Default CPU model can be changed when kubevirt is running.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String defaultCPUModel;

    public String getDefaultCPUModel() {
        return defaultCPUModel;
    }

    public void setDefaultCPUModel(String defaultCPUModel) {
        this.defaultCPUModel = defaultCPUModel;
    }

    /**
     * DefaultRuntimeClass defines a cluster default for the RuntimeClass to be used for VMIs pods if not set there. Default
     * RuntimeClass can be changed when kubevirt is running, existing VMIs are not impacted till the next restart/live-migration
     * when they are eventually going to consume the new default RuntimeClass.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultRuntimeClass")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DefaultRuntimeClass defines a cluster default for the RuntimeClass to be used for VMIs pods if not set there. Default RuntimeClass can be changed when kubevirt is running, existing VMIs are not impacted till the next restart/live-migration when they are eventually going to consume the new default RuntimeClass.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String defaultRuntimeClass;

    public String getDefaultRuntimeClass() {
        return defaultRuntimeClass;
    }

    public void setDefaultRuntimeClass(String defaultRuntimeClass) {
        this.defaultRuntimeClass = defaultRuntimeClass;
    }

    /**
     * featureGates is a map of feature gate flags. Setting a flag to `true` will enable the feature. Setting `false` or
     * removing the feature gate, disables the feature.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("featureGates")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("featureGates is a map of feature gate flags. Setting a flag to `true` will enable the feature. Setting `false` or removing the feature gate, disables the feature.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.FeatureGates featureGates = io.fabric8.kubernetes.client.utils.Serialization
            .unmarshal(
                    "{\"deployKubeSecondaryDNS\":false,\"deployTektonTaskResources\":false,\"enableCommonBootImageImport\":true,\"nonRoot\":true,\"withHostPassthroughCPU\":false}",
                    io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.FeatureGates.class);

    public io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.FeatureGates getFeatureGates() {
        return featureGates;
    }

    public void setFeatureGates(io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.FeatureGates featureGates) {
        this.featureGates = featureGates;
    }

    /**
     * FilesystemOverhead describes the space reserved for overhead when using Filesystem volumes. A value is between 0 and 1,
     * if not defined it is 0.055 (5.5 percent overhead)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("filesystemOverhead")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("FilesystemOverhead describes the space reserved for overhead when using Filesystem volumes. A value is between 0 and 1, if not defined it is 0.055 (5.5 percent overhead)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.FilesystemOverhead filesystemOverhead;

    public io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.FilesystemOverhead getFilesystemOverhead() {
        return filesystemOverhead;
    }

    public void setFilesystemOverhead(
            io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.FilesystemOverhead filesystemOverhead) {
        this.filesystemOverhead = filesystemOverhead;
    }

    /**
     * infra HyperConvergedConfig influences the pod configuration (currently only placement) for all the infra components
     * needed on the virtualization enabled cluster but not necessarily directly on each node running VMs/VMIs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("infra")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("infra HyperConvergedConfig influences the pod configuration (currently only placement) for all the infra components needed on the virtualization enabled cluster but not necessarily directly on each node running VMs/VMIs.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.Infra infra;

    public io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.Infra getInfra() {
        return infra;
    }

    public void setInfra(io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.Infra infra) {
        this.infra = infra;
    }

    /**
     * KubeSecondaryDNSNameServerIP defines name server IP used by KubeSecondaryDNS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kubeSecondaryDNSNameServerIP")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("KubeSecondaryDNSNameServerIP defines name server IP used by KubeSecondaryDNS")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String kubeSecondaryDNSNameServerIP;

    public String getKubeSecondaryDNSNameServerIP() {
        return kubeSecondaryDNSNameServerIP;
    }

    public void setKubeSecondaryDNSNameServerIP(String kubeSecondaryDNSNameServerIP) {
        this.kubeSecondaryDNSNameServerIP = kubeSecondaryDNSNameServerIP;
    }

    /**
     * Live migration limits and timeouts are applied so that migration processes do not overwhelm the cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("liveMigrationConfig")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Live migration limits and timeouts are applied so that migration processes do not overwhelm the cluster.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.LiveMigrationConfig liveMigrationConfig = io.fabric8.kubernetes.client.utils.Serialization
            .unmarshal(
                    "{\"allowAutoConverge\":false,\"allowPostCopy\":false,\"completionTimeoutPerGiB\":800,\"parallelMigrationsPerCluster\":5,\"parallelOutboundMigrationsPerNode\":2,\"progressTimeout\":150}",
                    io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.LiveMigrationConfig.class);

    public io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.LiveMigrationConfig getLiveMigrationConfig() {
        return liveMigrationConfig;
    }

    public void setLiveMigrationConfig(
            io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.LiveMigrationConfig liveMigrationConfig) {
        this.liveMigrationConfig = liveMigrationConfig;
    }

    /**
     * Deprecated: LocalStorageClassName the name of the local storage class.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("localStorageClassName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Deprecated: LocalStorageClassName the name of the local storage class.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String localStorageClassName;

    public String getLocalStorageClassName() {
        return localStorageClassName;
    }

    public void setLocalStorageClassName(String localStorageClassName) {
        this.localStorageClassName = localStorageClassName;
    }

    /**
     * LogVerbosityConfig configures the verbosity level of Kubevirt's different components. The higher the value - the higher
     * the log verbosity.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logVerbosityConfig")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LogVerbosityConfig configures the verbosity level of Kubevirt's different components. The higher the value - the higher the log verbosity.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.LogVerbosityConfig logVerbosityConfig;

    public io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.LogVerbosityConfig getLogVerbosityConfig() {
        return logVerbosityConfig;
    }

    public void setLogVerbosityConfig(
            io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.LogVerbosityConfig logVerbosityConfig) {
        this.logVerbosityConfig = logVerbosityConfig;
    }

    /**
     * MediatedDevicesConfiguration holds information about MDEV types to be defined on nodes, if available
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mediatedDevicesConfiguration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("MediatedDevicesConfiguration holds information about MDEV types to be defined on nodes, if available")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.MediatedDevicesConfiguration mediatedDevicesConfiguration;

    public io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.MediatedDevicesConfiguration getMediatedDevicesConfiguration() {
        return mediatedDevicesConfiguration;
    }

    public void setMediatedDevicesConfiguration(
            io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.MediatedDevicesConfiguration mediatedDevicesConfiguration) {
        this.mediatedDevicesConfiguration = mediatedDevicesConfiguration;
    }

    /**
     * ObsoleteCPUs allows avoiding scheduling of VMs for obsolete CPU models
     */
    @com.fasterxml.jackson.annotation.JsonProperty("obsoleteCPUs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ObsoleteCPUs allows avoiding scheduling of VMs for obsolete CPU models")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.ObsoleteCPUs obsoleteCPUs;

    public io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.ObsoleteCPUs getObsoleteCPUs() {
        return obsoleteCPUs;
    }

    public void setObsoleteCPUs(io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.ObsoleteCPUs obsoleteCPUs) {
        this.obsoleteCPUs = obsoleteCPUs;
    }

    /**
     * PermittedHostDevices holds information about devices allowed for passthrough
     */
    @com.fasterxml.jackson.annotation.JsonProperty("permittedHostDevices")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PermittedHostDevices holds information about devices allowed for passthrough")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.PermittedHostDevices permittedHostDevices;

    public io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.PermittedHostDevices getPermittedHostDevices() {
        return permittedHostDevices;
    }

    public void setPermittedHostDevices(
            io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.PermittedHostDevices permittedHostDevices) {
        this.permittedHostDevices = permittedHostDevices;
    }

    /**
     * ResourceRequirements describes the resource requirements for the operand workloads.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceRequirements")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ResourceRequirements describes the resource requirements for the operand workloads.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.ResourceRequirements resourceRequirements;

    public io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.ResourceRequirements getResourceRequirements() {
        return resourceRequirements;
    }

    public void setResourceRequirements(
            io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.ResourceRequirements resourceRequirements) {
        this.resourceRequirements = resourceRequirements;
    }

    /**
     * Override the storage class used for scratch space during transfer operations. The scratch space storage class is
     * determined in the following order: value of scratchSpaceStorageClass, if that doesn't exist, use the default storage
     * class, if there is no default storage class, use the storage class of the DataVolume, if no storage class specified, use
     * no storage class for scratch space
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scratchSpaceStorageClass")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Override the storage class used for scratch space during transfer operations. The scratch space storage class is determined in the following order: value of scratchSpaceStorageClass, if that doesn't exist, use the default storage class, if there is no default storage class, use the storage class of the DataVolume, if no storage class specified, use no storage class for scratch space")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String scratchSpaceStorageClass;

    public String getScratchSpaceStorageClass() {
        return scratchSpaceStorageClass;
    }

    public void setScratchSpaceStorageClass(String scratchSpaceStorageClass) {
        this.scratchSpaceStorageClass = scratchSpaceStorageClass;
    }

    /**
     * StorageImport contains configuration for importing containerized data
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storageImport")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("StorageImport contains configuration for importing containerized data")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.StorageImport storageImport;

    public io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.StorageImport getStorageImport() {
        return storageImport;
    }

    public void setStorageImport(io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.StorageImport storageImport) {
        this.storageImport = storageImport;
    }

    /**
     * TektonPipelinesNamespace defines namespace in which example pipelines will be deployed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tektonPipelinesNamespace")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TektonPipelinesNamespace defines namespace in which example pipelines will be deployed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String tektonPipelinesNamespace;

    public String getTektonPipelinesNamespace() {
        return tektonPipelinesNamespace;
    }

    public void setTektonPipelinesNamespace(String tektonPipelinesNamespace) {
        this.tektonPipelinesNamespace = tektonPipelinesNamespace;
    }

    /**
     * TLSSecurityProfile specifies the settings for TLS connections to be propagated to all kubevirt-hyperconverged components.
     * If unset, the hyperconverged cluster operator will consume the value set on the APIServer CR on OCP/OKD or Intermediate
     * if on vanilla k8s. Note that only Old, Intermediate and Custom profiles are currently supported, and the maximum
     * available MinTLSVersions is VersionTLS12.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsSecurityProfile")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TLSSecurityProfile specifies the settings for TLS connections to be propagated to all kubevirt-hyperconverged components. If unset, the hyperconverged cluster operator will consume the value set on the APIServer CR on OCP/OKD or Intermediate if on vanilla k8s. Note that only Old, Intermediate and Custom profiles are currently supported, and the maximum available MinTLSVersions is VersionTLS12.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.TlsSecurityProfile tlsSecurityProfile;

    public io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.TlsSecurityProfile getTlsSecurityProfile() {
        return tlsSecurityProfile;
    }

    public void setTlsSecurityProfile(
            io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.TlsSecurityProfile tlsSecurityProfile) {
        this.tlsSecurityProfile = tlsSecurityProfile;
    }

    public enum TuningPolicy {

        @com.fasterxml.jackson.annotation.JsonProperty("annotation")
        ANNOTATION("annotation");

        java.lang.String value;

        TuningPolicy(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * TuningPolicy allows to configure the mode in which the RateLimits of kubevirt are set. If TuningPolicy is not present the
     * default kubevirt values are used. It can be set to `annotation` for fine-tuning the kubevirt queryPerSeconds (qps) and
     * burst values. Qps and burst values are taken from the annotation hco.kubevirt.io/tuningPolicy
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tuningPolicy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TuningPolicy allows to configure the mode in which the RateLimits of kubevirt are set. If TuningPolicy is not present the default kubevirt values are used. It can be set to `annotation` for fine-tuning the kubevirt queryPerSeconds (qps) and burst values. Qps and burst values are taken from the annotation hco.kubevirt.io/tuningPolicy")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private TuningPolicy tuningPolicy;

    public TuningPolicy getTuningPolicy() {
        return tuningPolicy;
    }

    public void setTuningPolicy(TuningPolicy tuningPolicy) {
        this.tuningPolicy = tuningPolicy;
    }

    public enum UninstallStrategy {

        @com.fasterxml.jackson.annotation.JsonProperty("RemoveWorkloads")
        REMOVEWORKLOADS("RemoveWorkloads"),
        @com.fasterxml.jackson.annotation.JsonProperty("BlockUninstallIfWorkloadsExist")
        BLOCKUNINSTALLIFWORKLOADSEXIST("BlockUninstallIfWorkloadsExist");

        java.lang.String value;

        UninstallStrategy(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * UninstallStrategy defines how to proceed on uninstall when workloads (VirtualMachines, DataVolumes) still exist.
     * BlockUninstallIfWorkloadsExist will prevent the CR from being removed when workloads still exist.
     * BlockUninstallIfWorkloadsExist is the safest choice to protect your workloads from accidental data loss, so it's strongly
     * advised. RemoveWorkloads will cause all the workloads to be cascading deleted on uninstallation. WARNING: please notice
     * that RemoveWorkloads will cause your workloads to be deleted as soon as this CR will be, even accidentally, deleted.
     * Please correctly consider the implications of this option before setting it. BlockUninstallIfWorkloadsExist is the
     * default behaviour.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("uninstallStrategy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("UninstallStrategy defines how to proceed on uninstall when workloads (VirtualMachines, DataVolumes) still exist. BlockUninstallIfWorkloadsExist will prevent the CR from being removed when workloads still exist. BlockUninstallIfWorkloadsExist is the safest choice to protect your workloads from accidental data loss, so it's strongly advised. RemoveWorkloads will cause all the workloads to be cascading deleted on uninstallation. WARNING: please notice that RemoveWorkloads will cause your workloads to be deleted as soon as this CR will be, even accidentally, deleted. Please correctly consider the implications of this option before setting it. BlockUninstallIfWorkloadsExist is the default behaviour.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private UninstallStrategy uninstallStrategy = io.fabric8.kubernetes.client.utils.Serialization
            .unmarshal("\"BlockUninstallIfWorkloadsExist\"", UninstallStrategy.class);

    public UninstallStrategy getUninstallStrategy() {
        return uninstallStrategy;
    }

    public void setUninstallStrategy(UninstallStrategy uninstallStrategy) {
        this.uninstallStrategy = uninstallStrategy;
    }

    /**
     * VDDK Init Image eventually used to import VMs from external providers
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vddkInitImage")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("VDDK Init Image eventually used to import VMs from external providers")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String vddkInitImage;

    public String getVddkInitImage() {
        return vddkInitImage;
    }

    public void setVddkInitImage(String vddkInitImage) {
        this.vddkInitImage = vddkInitImage;
    }

    /**
     * WorkloadUpdateStrategy defines at the cluster level how to handle automated workload updates
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workloadUpdateStrategy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("WorkloadUpdateStrategy defines at the cluster level how to handle automated workload updates")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.WorkloadUpdateStrategy workloadUpdateStrategy = io.fabric8.kubernetes.client.utils.Serialization
            .unmarshal(
                    "{\"batchEvictionInterval\":\"1m0s\",\"batchEvictionSize\":10,\"workloadUpdateMethods\":[\"LiveMigrate\"]}",
                    io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.WorkloadUpdateStrategy.class);

    public io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.WorkloadUpdateStrategy getWorkloadUpdateStrategy() {
        return workloadUpdateStrategy;
    }

    public void setWorkloadUpdateStrategy(
            io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.WorkloadUpdateStrategy workloadUpdateStrategy) {
        this.workloadUpdateStrategy = workloadUpdateStrategy;
    }

    /**
     * workloads HyperConvergedConfig influences the pod configuration (currently only placement) of components which need to be
     * running on a node where virtualization workloads should be able to run. Changes to Workloads HyperConvergedConfig can be
     * applied only without existing workload.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workloads")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("workloads HyperConvergedConfig influences the pod configuration (currently only placement) of components which need to be running on a node where virtualization workloads should be able to run. Changes to Workloads HyperConvergedConfig can be applied only without existing workload.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.Workloads workloads;

    public io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.Workloads getWorkloads() {
        return workloads;
    }

    public void setWorkloads(io.quarkiverse.kubevirt.hco.v1beta1.hyperconvergedspec.Workloads workloads) {
        this.workloads = workloads;
    }
}
