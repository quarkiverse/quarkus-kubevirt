package io.quarkiverse.kubevirt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.Properties;

import io.quarkiverse.kubevirt.utils.Clients;
import io.quarkiverse.kubevirt.v1.VirtualMachine;
import io.quarkiverse.kubevirt.v1.VirtualMachineInstance;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "use-podman", sortOptions = false, mixinStandardHelpOptions = false, header = "Use a podman virtual machine")
public class VmUsePodman extends AbstractVmCommand {

    @Option(names = { "--podman-port" }, description = "The port that podman is exposed")
    protected Integer podmanPort = 2376;

    @Parameters(index = "0", description = "The virutal machine name")
    public String name;

    @Override
    public Integer call() {
        try {
            VirtualMachine vm = namespace != null && !namespace.isEmpty()
                    ? Clients.kubevirt().v1().virtualmachines().inNamespace(namespace).withName(name).get()
                    : Clients.kubevirt().v1().virtualmachines().withName(name).get();
            useVirtualMachine(vm);
            return CommandLine.ExitCode.OK;
        } catch (Exception e) {
            e.printStackTrace();
            return CommandLine.ExitCode.SOFTWARE;
        }
    }

    public void useVirtualMachine(VirtualMachine virtualMachine) {
        VirtualMachineInstance virtualMachineInstance = Clients.kubevirt().v1().virtualmachineinstances()
                .inNamespace(virtualMachine.getMetadata().getNamespace()).withName(virtualMachine.getMetadata().getName())
                .get();
        String ipAddress = virtualMachineInstance.getStatus().getInterfaces().get(0).getIpAddresses().get(0);
        String dockerHostValue = "tcp://" + ipAddress + ":" + podmanPort;
        Path userHome = Paths.get(System.getProperty("user.home"));
        Path testContainerProperties = userHome.resolve(".testcontainers.properties");
        updatePropertyFile(testContainerProperties.toFile(), "docker.host", dockerHostValue);
        updatePropertyFile(testContainerProperties.toFile(), "testcontainers.reuse.enable", "false");
        System.out.println("Configured testcontainers to use DOCKER_HOST: " + dockerHostValue);
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
