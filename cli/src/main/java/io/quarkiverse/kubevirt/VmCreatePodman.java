package io.quarkiverse.kubevirt;

import java.io.InputStream;

import picocli.CommandLine.Command;

@Command(name = "podman", sortOptions = false, mixinStandardHelpOptions = false, header = "Create a VM for Podman")
public class VmCreatePodman extends AbstractVmCreate {

    @Override
    public InputStream getInputStream() {
        return getClass().getClassLoader().getResourceAsStream("podman-vm.yaml");
    }
}
