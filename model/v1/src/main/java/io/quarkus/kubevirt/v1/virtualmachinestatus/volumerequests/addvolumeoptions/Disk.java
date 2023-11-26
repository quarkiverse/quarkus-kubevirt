package io.quarkus.kubevirt.v1.virtualmachinestatus.volumerequests.addvolumeoptions;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "blockSize", "bootOrder", "cache", "cdrom", "dedicatedIOThread", "disk",
        "io", "lun", "name", "serial", "shareable", "tag" })
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
public class Disk implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * If specified, the virtual disk will be presented with the given block sizes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("blockSize")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If specified, the virtual disk will be presented with the given block sizes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1.virtualmachinestatus.volumerequests.addvolumeoptions.disk.BlockSize blockSize;

    public io.quarkus.kubevirt.v1.virtualmachinestatus.volumerequests.addvolumeoptions.disk.BlockSize getBlockSize() {
        return blockSize;
    }

    public void setBlockSize(
            io.quarkus.kubevirt.v1.virtualmachinestatus.volumerequests.addvolumeoptions.disk.BlockSize blockSize) {
        this.blockSize = blockSize;
    }

    /**
     * BootOrder is an integer value > 0, used to determine ordering of boot devices. Lower values take precedence. Each disk or
     * interface that has a boot order must have a unique value. Disks without a boot order are not tried if a disk with a boot
     * order exists.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bootOrder")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("BootOrder is an integer value > 0, used to determine ordering of boot devices. Lower values take precedence. Each disk or interface that has a boot order must have a unique value. Disks without a boot order are not tried if a disk with a boot order exists.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long bootOrder;

    public Long getBootOrder() {
        return bootOrder;
    }

    public void setBootOrder(Long bootOrder) {
        this.bootOrder = bootOrder;
    }

    /**
     * Cache specifies which kvm disk cache mode should be used. Supported values are: CacheNone, CacheWriteThrough.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cache")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Cache specifies which kvm disk cache mode should be used. Supported values are: CacheNone, CacheWriteThrough.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String cache;

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }

    /**
     * Attach a volume as a cdrom to the vmi.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cdrom")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Attach a volume as a cdrom to the vmi.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1.virtualmachinestatus.volumerequests.addvolumeoptions.disk.Cdrom cdrom;

    public io.quarkus.kubevirt.v1.virtualmachinestatus.volumerequests.addvolumeoptions.disk.Cdrom getCdrom() {
        return cdrom;
    }

    public void setCdrom(io.quarkus.kubevirt.v1.virtualmachinestatus.volumerequests.addvolumeoptions.disk.Cdrom cdrom) {
        this.cdrom = cdrom;
    }

    /**
     * dedicatedIOThread indicates this disk should have an exclusive IO Thread. Enabling this implies useIOThreads = true.
     * Defaults to false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dedicatedIOThread")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("dedicatedIOThread indicates this disk should have an exclusive IO Thread. Enabling this implies useIOThreads = true. Defaults to false.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean dedicatedIOThread;

    public Boolean getDedicatedIOThread() {
        return dedicatedIOThread;
    }

    public void setDedicatedIOThread(Boolean dedicatedIOThread) {
        this.dedicatedIOThread = dedicatedIOThread;
    }

    /**
     * Attach a volume as a disk to the vmi.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("disk")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Attach a volume as a disk to the vmi.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1.virtualmachinestatus.volumerequests.addvolumeoptions.disk.Disk disk;

    public io.quarkus.kubevirt.v1.virtualmachinestatus.volumerequests.addvolumeoptions.disk.Disk getDisk() {
        return disk;
    }

    public void setDisk(io.quarkus.kubevirt.v1.virtualmachinestatus.volumerequests.addvolumeoptions.disk.Disk disk) {
        this.disk = disk;
    }

    /**
     * IO specifies which QEMU disk IO mode should be used. Supported values are: native, default, threads.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("io")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("IO specifies which QEMU disk IO mode should be used. Supported values are: native, default, threads.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String io;

    public String getIo() {
        return io;
    }

    public void setIo(String io) {
        this.io = io;
    }

    /**
     * Attach a volume as a LUN to the vmi.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lun")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Attach a volume as a LUN to the vmi.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1.virtualmachinestatus.volumerequests.addvolumeoptions.disk.Lun lun;

    public io.quarkus.kubevirt.v1.virtualmachinestatus.volumerequests.addvolumeoptions.disk.Lun getLun() {
        return lun;
    }

    public void setLun(io.quarkus.kubevirt.v1.virtualmachinestatus.volumerequests.addvolumeoptions.disk.Lun lun) {
        this.lun = lun;
    }

    /**
     * Name is the device name
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name is the device name")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Serial provides the ability to specify a serial number for the disk device.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serial")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Serial provides the ability to specify a serial number for the disk device.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String serial;

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    /**
     * If specified the disk is made sharable and multiple write from different VMs are permitted
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shareable")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If specified the disk is made sharable and multiple write from different VMs are permitted")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean shareable;

    public Boolean getShareable() {
        return shareable;
    }

    public void setShareable(Boolean shareable) {
        this.shareable = shareable;
    }

    /**
     * If specified, disk address and its tag will be provided to the guest via config drive metadata
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tag")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If specified, disk address and its tag will be provided to the guest via config drive metadata")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String tag;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
