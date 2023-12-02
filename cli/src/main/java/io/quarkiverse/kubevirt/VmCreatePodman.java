package io.quarkiverse.kubevirt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

import io.quarkiverse.kubevirt.utils.Clients;
import io.quarkiverse.kubevirt.v1.VirtualMachine;
import io.quarkiverse.kubevirt.v1.VirtualMachineInstance;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "podman", sortOptions = false, mixinStandardHelpOptions = false, header = "Create a VM for Podman")
public class VmCreatePodman extends AbstractVmCreate {

    @Option(names = { "-c",
            "--configure-testcontainers" }, description = "Configure testcontainers to use the new virtual machine")
    protected boolean configureTestcontainers;

    @Option(names = { "-p", "--podman-port" }, description = "The port that podman is exposed")
    protected Integer podmanPort = 2376;

    @Override
    public InputStream getInputStream() {
        return getClass().getClassLoader().getResourceAsStream("quarkus-dev-virtualmachine.yaml");
    }

    @Override
    public boolean shouldWaitUntilReady() {
        return super.shouldWaitUntilReady() || configureTestcontainers;
    }

    @Override
    public void onReady(List<VirtualMachine> virtualMachines) {
        if (configureTestcontainers && virtualMachines.size() == 1) {
            VirtualMachine virtualMachine = virtualMachines.get(0);
            VirtualMachineInstance virtualMachineInstance = Clients.kubevirt().v1().virtualmachineinstances()
                    .inNamespace(virtualMachine.getMetadata().getNamespace()).withName(virtualMachine.getMetadata().getName())
                    .get();
            String ipAddress = virtualMachineInstance.getStatus().getInterfaces().get(0).getIpAddresses().get(0);
            String dockerHostValue = "tcp://" + ipAddress + ":" + podmanPort;
            Path userHome = Paths.get(System.getProperty("user.home"));
            Path testContainerProperties = userHome.resolve(".testcontainers.properties");
            updatePropertyFile(testContainerProperties.toFile(), "docker.host", dockerHostValue);
            updatePropertyFile(testContainerProperties.toFile(), "testcontainers.reuse.enable", "false");
        }
    }

    public static Optional<Path> findProjectRoot() {
        for (File currentDir = new File(System.getProperty("user.dir")); currentDir != null; currentDir = currentDir
                .getParentFile()) {
            if (containsGitOrQuarkus(currentDir)) {
                return Optional.of(currentDir).map(File::toPath);
            }
        }
        return Optional.empty();
    }

    private static boolean containsGitOrQuarkus(File directory) {
        File gitDirectory = new File(directory, ".git");
        File quarkusDirectory = new File(directory, ".quarkus");
        return gitDirectory.exists() || quarkusDirectory.exists();
    }

    public static void updatePropertyFile(File file, String key, String value) {
        Properties properties = new Properties();
        if (file.exists()) {
            try (InputStream fis = new FileInputStream(file)) {
                properties.load(fis);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        properties.setProperty(key, value);
        try (FileOutputStream fos = new FileOutputStream(file)) {
            properties.store(fos, null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
