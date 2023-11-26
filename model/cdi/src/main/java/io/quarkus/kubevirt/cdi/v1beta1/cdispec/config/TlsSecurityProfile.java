package io.quarkus.kubevirt.cdi.v1beta1.cdispec.config;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "custom", "intermediate", "modern", "old", "type" })
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
public class TlsSecurityProfile implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * custom is a user-defined TLS security profile. Be extremely careful using a custom profile as invalid configurations can
     * be catastrophic. An example custom profile looks like this:
     * ciphers: - ECDHE-ECDSA-CHACHA20-POLY1305 - ECDHE-RSA-CHACHA20-POLY1305 - ECDHE-RSA-AES128-GCM-SHA256 -
     * ECDHE-ECDSA-AES128-GCM-SHA256 minTLSVersion: TLSv1.1
     */
    @com.fasterxml.jackson.annotation.JsonProperty("custom")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("custom is a user-defined TLS security profile. Be extremely careful using a custom profile as invalid configurations can be catastrophic. An example custom profile looks like this: \n ciphers: - ECDHE-ECDSA-CHACHA20-POLY1305 - ECDHE-RSA-CHACHA20-POLY1305 - ECDHE-RSA-AES128-GCM-SHA256 - ECDHE-ECDSA-AES128-GCM-SHA256 minTLSVersion: TLSv1.1")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private io.quarkus.kubevirt.cdi.v1beta1.cdispec.config.tlssecurityprofile.Custom custom;

    public io.quarkus.kubevirt.cdi.v1beta1.cdispec.config.tlssecurityprofile.Custom getCustom() {
        return custom;
    }

    public void setCustom(io.quarkus.kubevirt.cdi.v1beta1.cdispec.config.tlssecurityprofile.Custom custom) {
        this.custom = custom;
    }

    /**
     * intermediate is a TLS security profile based on:
     * https://wiki.mozilla.org/Security/Server_Side_TLS#Intermediate_compatibility_.28recommended.29
     * and looks like this (yaml):
     * ciphers: - TLS_AES_128_GCM_SHA256 - TLS_AES_256_GCM_SHA384 - TLS_CHACHA20_POLY1305_SHA256 - ECDHE-ECDSA-AES128-GCM-SHA256
     * - ECDHE-RSA-AES128-GCM-SHA256 - ECDHE-ECDSA-AES256-GCM-SHA384 - ECDHE-RSA-AES256-GCM-SHA384 -
     * ECDHE-ECDSA-CHACHA20-POLY1305 - ECDHE-RSA-CHACHA20-POLY1305 - DHE-RSA-AES128-GCM-SHA256 - DHE-RSA-AES256-GCM-SHA384
     * minTLSVersion: TLSv1.2
     */
    @com.fasterxml.jackson.annotation.JsonProperty("intermediate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("intermediate is a TLS security profile based on: \n https://wiki.mozilla.org/Security/Server_Side_TLS#Intermediate_compatibility_.28recommended.29 \n and looks like this (yaml): \n ciphers: - TLS_AES_128_GCM_SHA256 - TLS_AES_256_GCM_SHA384 - TLS_CHACHA20_POLY1305_SHA256 - ECDHE-ECDSA-AES128-GCM-SHA256 - ECDHE-RSA-AES128-GCM-SHA256 - ECDHE-ECDSA-AES256-GCM-SHA384 - ECDHE-RSA-AES256-GCM-SHA384 - ECDHE-ECDSA-CHACHA20-POLY1305 - ECDHE-RSA-CHACHA20-POLY1305 - DHE-RSA-AES128-GCM-SHA256 - DHE-RSA-AES256-GCM-SHA384 minTLSVersion: TLSv1.2")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private io.quarkus.kubevirt.cdi.v1beta1.cdispec.config.tlssecurityprofile.Intermediate intermediate;

    public io.quarkus.kubevirt.cdi.v1beta1.cdispec.config.tlssecurityprofile.Intermediate getIntermediate() {
        return intermediate;
    }

    public void setIntermediate(io.quarkus.kubevirt.cdi.v1beta1.cdispec.config.tlssecurityprofile.Intermediate intermediate) {
        this.intermediate = intermediate;
    }

    /**
     * modern is a TLS security profile based on:
     * https://wiki.mozilla.org/Security/Server_Side_TLS#Modern_compatibility
     * and looks like this (yaml):
     * ciphers: - TLS_AES_128_GCM_SHA256 - TLS_AES_256_GCM_SHA384 - TLS_CHACHA20_POLY1305_SHA256 minTLSVersion: TLSv1.3
     * NOTE: Currently unsupported.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modern")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("modern is a TLS security profile based on: \n https://wiki.mozilla.org/Security/Server_Side_TLS#Modern_compatibility \n and looks like this (yaml): \n ciphers: - TLS_AES_128_GCM_SHA256 - TLS_AES_256_GCM_SHA384 - TLS_CHACHA20_POLY1305_SHA256 minTLSVersion: TLSv1.3 \n NOTE: Currently unsupported.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private io.quarkus.kubevirt.cdi.v1beta1.cdispec.config.tlssecurityprofile.Modern modern;

    public io.quarkus.kubevirt.cdi.v1beta1.cdispec.config.tlssecurityprofile.Modern getModern() {
        return modern;
    }

    public void setModern(io.quarkus.kubevirt.cdi.v1beta1.cdispec.config.tlssecurityprofile.Modern modern) {
        this.modern = modern;
    }

    /**
     * old is a TLS security profile based on:
     * https://wiki.mozilla.org/Security/Server_Side_TLS#Old_backward_compatibility
     * and looks like this (yaml):
     * ciphers: - TLS_AES_128_GCM_SHA256 - TLS_AES_256_GCM_SHA384 - TLS_CHACHA20_POLY1305_SHA256 - ECDHE-ECDSA-AES128-GCM-SHA256
     * - ECDHE-RSA-AES128-GCM-SHA256 - ECDHE-ECDSA-AES256-GCM-SHA384 - ECDHE-RSA-AES256-GCM-SHA384 -
     * ECDHE-ECDSA-CHACHA20-POLY1305 - ECDHE-RSA-CHACHA20-POLY1305 - DHE-RSA-AES128-GCM-SHA256 - DHE-RSA-AES256-GCM-SHA384 -
     * DHE-RSA-CHACHA20-POLY1305 - ECDHE-ECDSA-AES128-SHA256 - ECDHE-RSA-AES128-SHA256 - ECDHE-ECDSA-AES128-SHA -
     * ECDHE-RSA-AES128-SHA - ECDHE-ECDSA-AES256-SHA384 - ECDHE-RSA-AES256-SHA384 - ECDHE-ECDSA-AES256-SHA -
     * ECDHE-RSA-AES256-SHA - DHE-RSA-AES128-SHA256 - DHE-RSA-AES256-SHA256 - AES128-GCM-SHA256 - AES256-GCM-SHA384 -
     * AES128-SHA256 - AES256-SHA256 - AES128-SHA - AES256-SHA - DES-CBC3-SHA minTLSVersion: TLSv1.0
     */
    @com.fasterxml.jackson.annotation.JsonProperty("old")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("old is a TLS security profile based on: \n https://wiki.mozilla.org/Security/Server_Side_TLS#Old_backward_compatibility \n and looks like this (yaml): \n ciphers: - TLS_AES_128_GCM_SHA256 - TLS_AES_256_GCM_SHA384 - TLS_CHACHA20_POLY1305_SHA256 - ECDHE-ECDSA-AES128-GCM-SHA256 - ECDHE-RSA-AES128-GCM-SHA256 - ECDHE-ECDSA-AES256-GCM-SHA384 - ECDHE-RSA-AES256-GCM-SHA384 - ECDHE-ECDSA-CHACHA20-POLY1305 - ECDHE-RSA-CHACHA20-POLY1305 - DHE-RSA-AES128-GCM-SHA256 - DHE-RSA-AES256-GCM-SHA384 - DHE-RSA-CHACHA20-POLY1305 - ECDHE-ECDSA-AES128-SHA256 - ECDHE-RSA-AES128-SHA256 - ECDHE-ECDSA-AES128-SHA - ECDHE-RSA-AES128-SHA - ECDHE-ECDSA-AES256-SHA384 - ECDHE-RSA-AES256-SHA384 - ECDHE-ECDSA-AES256-SHA - ECDHE-RSA-AES256-SHA - DHE-RSA-AES128-SHA256 - DHE-RSA-AES256-SHA256 - AES128-GCM-SHA256 - AES256-GCM-SHA384 - AES128-SHA256 - AES256-SHA256 - AES128-SHA - AES256-SHA - DES-CBC3-SHA minTLSVersion: TLSv1.0")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private io.quarkus.kubevirt.cdi.v1beta1.cdispec.config.tlssecurityprofile.Old old;

    public io.quarkus.kubevirt.cdi.v1beta1.cdispec.config.tlssecurityprofile.Old getOld() {
        return old;
    }

    public void setOld(io.quarkus.kubevirt.cdi.v1beta1.cdispec.config.tlssecurityprofile.Old old) {
        this.old = old;
    }

    public enum Type {

        @com.fasterxml.jackson.annotation.JsonProperty("Old")
        OLD("Old"),
        @com.fasterxml.jackson.annotation.JsonProperty("Intermediate")
        INTERMEDIATE("Intermediate"),
        @com.fasterxml.jackson.annotation.JsonProperty("Modern")
        MODERN("Modern"),
        @com.fasterxml.jackson.annotation.JsonProperty("Custom")
        CUSTOM("Custom");

        java.lang.String value;

        Type(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * type is one of Old, Intermediate, Modern or Custom. Custom provides the ability to specify individual TLS security
     * profile parameters. Old, Intermediate and Modern are TLS security profiles based on:
     * https://wiki.mozilla.org/Security/Server_Side_TLS#Recommended_configurations
     * The profiles are intent based, so they may change over time as new ciphers are developed and existing ciphers are found
     * to be insecure. Depending on precisely which ciphers are available to a process, the list may be reduced.
     * Note that the Modern profile is currently not supported because it is not yet well adopted by common software libraries.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("type is one of Old, Intermediate, Modern or Custom. Custom provides the ability to specify individual TLS security profile parameters. Old, Intermediate and Modern are TLS security profiles based on: \n https://wiki.mozilla.org/Security/Server_Side_TLS#Recommended_configurations \n The profiles are intent based, so they may change over time as new ciphers are developed and existing ciphers are found to be insecure.  Depending on precisely which ciphers are available to a process, the list may be reduced. \n Note that the Modern profile is currently not supported because it is not yet well adopted by common software libraries.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
