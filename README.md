# Quarkus Kubevirt

[![Version](https://img.shields.io/maven-central/v/io.quarkiverse.kubevirt/quarkus-kubevirt-client?logo=apache-maven&style=flat-square)](https://search.maven.org/artifact/io.quarkiverse.kubevirt/quarkus-kubevirt-client)

A client and CLI for [Kubevirt](https://kubevirt.io/).

## Usage

To use the client add the following dependency to the pom.xml

```xml
<dependency>
    <groupId>io.quarkiverse.kubevirt</groupId>
    <artifactId>quarkus-kubevirt</artifactId>
</dependency>

```

### Injecting the client

To inject the client into your code:

```java
@Inject
private KubevirtClient client;
```

The client can be used like this:

```java
List<VirtualMachine> virtualMachines = client.v1().virtualmachines().list().getItems();
```

### Supported APIs

The project supports the following apiGroup and versions::

- kubevirt.io/v1alpha3 (io.quarkiverse.kubevirt:quarkus-kubevirt-model-v1alpha3)
- kubevirt.io/v1  (io.quarkiverse.kubevirt:quarkus-kubevirt-model-v1)
- pool.kubevirt.io/v1alpha1 (io.quarkiverse.kubevirt:quarkus-kubevirt-pool)
- cdi.kubevirt.io/v1beta1 (io.quarkiverse.kubevirt:quarkus-kubevirt-cdi)
- networkaddonsoperator.kubevirt.io/v1 (io.quarkiverse.kubevirt:quarkus-kubevirt-network)
- networkaddonsoperator.kubevirt.io/v1alpha1 (io.quarkiverse.kubevirt:quarkus-kubevirt-network)
- instancetype.kubevirt.io/v1alpha1 (io.quarkiverse.kubevirt:quarkus-kubevirt-instancetype)
- instancetype.kubevirt.io/v1alpha2 (io.quarkiverse.kubevirt:quarkus-kubevirt-instancetype)
- hco.kubevirt.io/v1beta1 (io.quarkiverse.kubevirt:quarkus-kubevirt-hco)
- export.kubevirt.io/v1alpha1 (io.quarkiverse.kubevirt:quarkus-kubevirt-export)
- hostpathprovisioner.kubevirt.io/v1beta1 (io.quarkiverse.kubevirt:quarkus-kubevirt-hostpathprovisioner)
- snapshot.kubevirt.io/v1alpha1 (io.quarkiverse.kubevirt:quarkus-kubevirt-snapshot)
- ssp.kubevirt.io/v1beta1 (io.quarkiverse.kubevirt:quarkus-kubevirt-ssp)
- tektontasks.kubevirt.io/v1alpha1 (io.quarkiverse.kubevirt:quarkus-kubevirt-tektontasks)

##### APIs exposed to the client DSL

**Note** That not all APIs are exposed to the client DSL.

The exposed ones are the following:

- kubevirt.io/v1  (io.quarkiverse.kubevirt:quarkus-kubevirt-model-v1)
- pool.kubevirt.io/v1alpha1 (io.quarkiverse.kubevirt:quarkus-kubevirt-pool)
- cdi.kubevirt.io/v1beta1 (io.quarkiverse.kubevirt:quarkus-kubevirt-cdi)

#### APIs not exposed to the client DSL

All other API are meant to be used via the kubernetes client resource capability.

For example to list all VirtualMachines using the v1alpha3 API:

```java
@Inject KubernetesClient kubernetesClient;

public void printVirtualMachines() {
    List<VirtualMachine> virtualMachines = kubernetesClient.resources(VirtualMachine.class).list().getItems();
}
```

### Using the CLI

When adddintg the `io.quarkiverse.kubevirt:quarkus-kubevirt` dependency to the `pom.xml` you can use the CLI to interact with the Kubevirt API (within any project directory).

The CLI can also be added independently as a Quarkus CLI plugin.

```bash
quarkus plug add io.quarkiverse.kubevirt:quarkus-kubevirt-cli:runner:jar:999-SNAPSHOT
```

The later has value to globally enable the plugin (not just for the current project), or to use version that have not been publicly releashed yet (local builds).

#### Listing virtual machines
For example to get all the available virtual machines:

```sh
quarkus kubevirt vm list
```

#### Creating a virtual machine from a VirtalMachine resource file

```sh
quarkus kubevirt vm create from-file /path/to/vm.yaml
```

#### Creating a Podman Virtual machine for use with DevServices

```sh
quarkus kubevirt vm create podman
```

or to create and also wait until readdy:

```sh
quarkus kubevirt vm create podman -w
```

to also replace existing vms:

```sh
quarkus kubevirt vm create podman -r
```


