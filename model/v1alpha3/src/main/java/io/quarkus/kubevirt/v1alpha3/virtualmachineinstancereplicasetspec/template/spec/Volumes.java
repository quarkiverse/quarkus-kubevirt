package io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "cloudInitConfigDrive", "cloudInitNoCloud", "configMap", "containerDisk",
        "dataVolume", "downwardAPI", "downwardMetrics", "emptyDisk", "ephemeral", "hostDisk", "memoryDump", "name",
        "persistentVolumeClaim", "secret", "serviceAccount", "sysprep" })
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
public class Volumes implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * CloudInitConfigDrive represents a cloud-init Config Drive user-data source. The Config Drive data will be added as a disk
     * to the vmi. A proper cloud-init installation is required inside the guest. More info:
     * https://cloudinit.readthedocs.io/en/latest/topics/datasources/configdrive.html
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudInitConfigDrive")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CloudInitConfigDrive represents a cloud-init Config Drive user-data source. The Config Drive data will be added as a disk to the vmi. A proper cloud-init installation is required inside the guest. More info: https://cloudinit.readthedocs.io/en/latest/topics/datasources/configdrive.html")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.CloudInitConfigDrive cloudInitConfigDrive;

    public io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.CloudInitConfigDrive getCloudInitConfigDrive() {
        return cloudInitConfigDrive;
    }

    public void setCloudInitConfigDrive(
            io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.CloudInitConfigDrive cloudInitConfigDrive) {
        this.cloudInitConfigDrive = cloudInitConfigDrive;
    }

    /**
     * CloudInitNoCloud represents a cloud-init NoCloud user-data source. The NoCloud data will be added as a disk to the vmi. A
     * proper cloud-init installation is required inside the guest. More info:
     * http://cloudinit.readthedocs.io/en/latest/topics/datasources/nocloud.html
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudInitNoCloud")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CloudInitNoCloud represents a cloud-init NoCloud user-data source. The NoCloud data will be added as a disk to the vmi. A proper cloud-init installation is required inside the guest. More info: http://cloudinit.readthedocs.io/en/latest/topics/datasources/nocloud.html")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.CloudInitNoCloud cloudInitNoCloud;

    public io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.CloudInitNoCloud getCloudInitNoCloud() {
        return cloudInitNoCloud;
    }

    public void setCloudInitNoCloud(
            io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.CloudInitNoCloud cloudInitNoCloud) {
        this.cloudInitNoCloud = cloudInitNoCloud;
    }

    /**
     * ConfigMapSource represents a reference to a ConfigMap in the same namespace. More info:
     * https://kubernetes.io/docs/tasks/configure-pod-container/configure-pod-configmap/
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configMap")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ConfigMapSource represents a reference to a ConfigMap in the same namespace. More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-pod-configmap/")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.ConfigMap configMap;

    public io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.ConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(
            io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.ConfigMap configMap) {
        this.configMap = configMap;
    }

    /**
     * ContainerDisk references a docker image, embedding a qcow or raw disk. More info:
     * https://kubevirt.gitbooks.io/user-guide/registry-disk.html
     */
    @com.fasterxml.jackson.annotation.JsonProperty("containerDisk")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ContainerDisk references a docker image, embedding a qcow or raw disk. More info: https://kubevirt.gitbooks.io/user-guide/registry-disk.html")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.ContainerDisk containerDisk;

    public io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.ContainerDisk getContainerDisk() {
        return containerDisk;
    }

    public void setContainerDisk(
            io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.ContainerDisk containerDisk) {
        this.containerDisk = containerDisk;
    }

    /**
     * DataVolume represents the dynamic creation a PVC for this volume as well as the process of populating that PVC with a
     * disk image.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataVolume")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DataVolume represents the dynamic creation a PVC for this volume as well as the process of populating that PVC with a disk image.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.DataVolume dataVolume;

    public io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.DataVolume getDataVolume() {
        return dataVolume;
    }

    public void setDataVolume(
            io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.DataVolume dataVolume) {
        this.dataVolume = dataVolume;
    }

    /**
     * DownwardAPI represents downward API about the pod that should populate this volume
     */
    @com.fasterxml.jackson.annotation.JsonProperty("downwardAPI")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DownwardAPI represents downward API about the pod that should populate this volume")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.DownwardAPI downwardAPI;

    public io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.DownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(
            io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.DownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    /**
     * DownwardMetrics adds a very small disk to VMIs which contains a limited view of host and guest metrics. The disk content
     * is compatible with vhostmd (https://github.com/vhostmd/vhostmd) and vm-dump-metrics.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("downwardMetrics")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DownwardMetrics adds a very small disk to VMIs which contains a limited view of host and guest metrics. The disk content is compatible with vhostmd (https://github.com/vhostmd/vhostmd) and vm-dump-metrics.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.DownwardMetrics downwardMetrics;

    public io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.DownwardMetrics getDownwardMetrics() {
        return downwardMetrics;
    }

    public void setDownwardMetrics(
            io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.DownwardMetrics downwardMetrics) {
        this.downwardMetrics = downwardMetrics;
    }

    /**
     * EmptyDisk represents a temporary disk which shares the vmis lifecycle. More info:
     * https://kubevirt.gitbooks.io/user-guide/disks-and-volumes.html
     */
    @com.fasterxml.jackson.annotation.JsonProperty("emptyDisk")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("EmptyDisk represents a temporary disk which shares the vmis lifecycle. More info: https://kubevirt.gitbooks.io/user-guide/disks-and-volumes.html")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.EmptyDisk emptyDisk;

    public io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.EmptyDisk getEmptyDisk() {
        return emptyDisk;
    }

    public void setEmptyDisk(
            io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.EmptyDisk emptyDisk) {
        this.emptyDisk = emptyDisk;
    }

    /**
     * Ephemeral is a special volume source that "wraps" specified source and provides copy-on-write image on top of it.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ephemeral")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Ephemeral is a special volume source that \"wraps\" specified source and provides copy-on-write image on top of it.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.Ephemeral ephemeral;

    public io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.Ephemeral getEphemeral() {
        return ephemeral;
    }

    public void setEphemeral(
            io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.Ephemeral ephemeral) {
        this.ephemeral = ephemeral;
    }

    /**
     * HostDisk represents a disk created on the cluster level
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostDisk")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("HostDisk represents a disk created on the cluster level")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.HostDisk hostDisk;

    public io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.HostDisk getHostDisk() {
        return hostDisk;
    }

    public void setHostDisk(
            io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.HostDisk hostDisk) {
        this.hostDisk = hostDisk;
    }

    /**
     * MemoryDump is attached to the virt launcher and is populated with a memory dump of the vmi
     */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryDump")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("MemoryDump is attached to the virt launcher and is populated with a memory dump of the vmi")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.MemoryDump memoryDump;

    public io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.MemoryDump getMemoryDump() {
        return memoryDump;
    }

    public void setMemoryDump(
            io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.MemoryDump memoryDump) {
        this.memoryDump = memoryDump;
    }

    /**
     * Volume's name. Must be a DNS_LABEL and unique within the vmi. More info:
     * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Volume's name. Must be a DNS_LABEL and unique within the vmi. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. Directly
     * attached to the vmi via qemu. More info:
     * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
     */
    @com.fasterxml.jackson.annotation.JsonProperty("persistentVolumeClaim")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. Directly attached to the vmi via qemu. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.PersistentVolumeClaim persistentVolumeClaim;

    public io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.PersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(
            io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.PersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    /**
     * SecretVolumeSource represents a reference to a secret data in the same namespace. More info:
     * https://kubernetes.io/docs/concepts/configuration/secret/
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secret")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SecretVolumeSource represents a reference to a secret data in the same namespace. More info: https://kubernetes.io/docs/concepts/configuration/secret/")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.Secret secret;

    public io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.Secret getSecret() {
        return secret;
    }

    public void setSecret(
            io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.Secret secret) {
        this.secret = secret;
    }

    /**
     * ServiceAccountVolumeSource represents a reference to a service account. There can only be one volume of this type! More
     * info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceAccount")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ServiceAccountVolumeSource represents a reference to a service account. There can only be one volume of this type! More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.ServiceAccount serviceAccount;

    public io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.ServiceAccount getServiceAccount() {
        return serviceAccount;
    }

    public void setServiceAccount(
            io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.ServiceAccount serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    /**
     * Represents a Sysprep volume source.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sysprep")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Represents a Sysprep volume source.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.Sysprep sysprep;

    public io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.Sysprep getSysprep() {
        return sysprep;
    }

    public void setSysprep(
            io.quarkus.kubevirt.v1alpha3.virtualmachineinstancereplicasetspec.template.spec.volumes.Sysprep sysprep) {
        this.sysprep = sysprep;
    }
}
