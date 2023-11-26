package io.quarkus.kubevirt.hco.v1beta1.hyperconvergedspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "batchEvictionInterval", "batchEvictionSize", "workloadUpdateMethods" })
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
public class WorkloadUpdateStrategy implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * BatchEvictionInterval Represents the interval to wait before issuing the next batch of shutdowns
     */
    @com.fasterxml.jackson.annotation.JsonProperty("batchEvictionInterval")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("BatchEvictionInterval Represents the interval to wait before issuing the next batch of shutdowns")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String batchEvictionInterval = "1m0s";

    public String getBatchEvictionInterval() {
        return batchEvictionInterval;
    }

    public void setBatchEvictionInterval(String batchEvictionInterval) {
        this.batchEvictionInterval = batchEvictionInterval;
    }

    /**
     * BatchEvictionSize Represents the number of VMIs that can be forced updated per the BatchShutdownInterval interval
     */
    @com.fasterxml.jackson.annotation.JsonProperty("batchEvictionSize")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("BatchEvictionSize Represents the number of VMIs that can be forced updated per the BatchShutdownInterval interval")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long batchEvictionSize = 10L;

    public Long getBatchEvictionSize() {
        return batchEvictionSize;
    }

    public void setBatchEvictionSize(Long batchEvictionSize) {
        this.batchEvictionSize = batchEvictionSize;
    }

    /**
     * WorkloadUpdateMethods defines the methods that can be used to disrupt workloads during automated workload updates. When
     * multiple methods are present, the least disruptive method takes precedence over more disruptive methods. For example if
     * both LiveMigrate and Evict methods are listed, only VMs which are not live migratable will be restarted/shutdown. An
     * empty list defaults to no automated workload updating.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workloadUpdateMethods")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("WorkloadUpdateMethods defines the methods that can be used to disrupt workloads during automated workload updates. When multiple methods are present, the least disruptive method takes precedence over more disruptive methods. For example if both LiveMigrate and Evict methods are listed, only VMs which are not live migratable will be restarted/shutdown. An empty list defaults to no automated workload updating.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> workloadUpdateMethods = io.fabric8.kubernetes.client.utils.Serialization
            .unmarshal("[\"LiveMigrate\"]", java.util.List.class);

    public java.util.List<String> getWorkloadUpdateMethods() {
        return workloadUpdateMethods;
    }

    public void setWorkloadUpdateMethods(java.util.List<String> workloadUpdateMethods) {
        this.workloadUpdateMethods = workloadUpdateMethods;
    }
}
