package io.quarkiverse.kubevirt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.file.Path;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "from-file", sortOptions = false, mixinStandardHelpOptions = false, header = "List Kubevirt VMs")
public class VmCreateFromFile extends AbstractVmCreate {

    @CommandLine.Parameters(index = "0", description = "Path to file")
    public Path path;

    @Override
    public InputStream getInputStream() {
        try {
            return new FileInputStream(path.toFile());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
