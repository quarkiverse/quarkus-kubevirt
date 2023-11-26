package io.quarkus.kubevirt.cdi.v1beta1.cdispec.config;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "HTTPProxy", "HTTPSProxy", "noProxy", "trustedCAProxy" })
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
public class ImportProxy implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * HTTPProxy is the URL http://<username>:<pswd>@<ip>:<port> of the import proxy for HTTP requests. Empty means unset and
     * will not result in the import pod env var.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HTTPProxy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("HTTPProxy is the URL http://<username>:<pswd>@<ip>:<port> of the import proxy for HTTP requests.  Empty means unset and will not result in the import pod env var.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String HTTPProxy;

    public String getHTTPProxy() {
        return HTTPProxy;
    }

    public void setHTTPProxy(String HTTPProxy) {
        this.HTTPProxy = HTTPProxy;
    }

    /**
     * HTTPSProxy is the URL https://<username>:<pswd>@<ip>:<port> of the import proxy for HTTPS requests. Empty means unset and
     * will not result in the import pod env var.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HTTPSProxy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("HTTPSProxy is the URL https://<username>:<pswd>@<ip>:<port> of the import proxy for HTTPS requests.  Empty means unset and will not result in the import pod env var.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String HTTPSProxy;

    public String getHTTPSProxy() {
        return HTTPSProxy;
    }

    public void setHTTPSProxy(String HTTPSProxy) {
        this.HTTPSProxy = HTTPSProxy;
    }

    /**
     * NoProxy is a comma-separated list of hostnames and/or CIDRs for which the proxy should not be used. Empty means unset and
     * will not result in the import pod env var.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("noProxy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("NoProxy is a comma-separated list of hostnames and/or CIDRs for which the proxy should not be used. Empty means unset and will not result in the import pod env var.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String noProxy;

    public String getNoProxy() {
        return noProxy;
    }

    public void setNoProxy(String noProxy) {
        this.noProxy = noProxy;
    }

    /**
     * TrustedCAProxy is the name of a ConfigMap in the cdi namespace that contains a user-provided trusted certificate
     * authority (CA) bundle. The TrustedCAProxy ConfigMap is consumed by the DataImportCron controller for creating cronjobs,
     * and by the import controller referring a copy of the ConfigMap in the import namespace. Here is an example of the
     * ConfigMap (in yaml):
     * apiVersion: v1 kind: ConfigMap metadata: name: my-ca-proxy-cm namespace: cdi data: ca.pem: | -----BEGIN CERTIFICATE-----
     * ... <base64 encoded cert> ... -----END CERTIFICATE-----
     */
    @com.fasterxml.jackson.annotation.JsonProperty("trustedCAProxy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TrustedCAProxy is the name of a ConfigMap in the cdi namespace that contains a user-provided trusted certificate authority (CA) bundle. The TrustedCAProxy ConfigMap is consumed by the DataImportCron controller for creating cronjobs, and by the import controller referring a copy of the ConfigMap in the import namespace. Here is an example of the ConfigMap (in yaml): \n apiVersion: v1 kind: ConfigMap metadata: name: my-ca-proxy-cm namespace: cdi data: ca.pem: | -----BEGIN CERTIFICATE----- ... <base64 encoded cert> ... -----END CERTIFICATE-----")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String trustedCAProxy;

    public String getTrustedCAProxy() {
        return trustedCAProxy;
    }

    public void setTrustedCAProxy(String trustedCAProxy) {
        this.trustedCAProxy = trustedCAProxy;
    }
}
