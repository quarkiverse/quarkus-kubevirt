package io.quarkiverse.kubevirt;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import io.fabric8.kubernetes.api.builder.Visitor;
import io.fabric8.kubernetes.api.model.HasMetadata;
import io.fabric8.kubernetes.api.model.Secret;
import io.fabric8.kubernetes.api.model.SecretBuilder;
import io.quarkiverse.kubevirt.utils.Clients;
import io.quarkiverse.kubevirt.v1.VirtualMachine;
import io.quarkiverse.kubevirt.visitors.AddAccessCredentialsToVirtualMachine;
import io.quarkiverse.kubevirt.visitors.ApplyNamespace;
import picocli.CommandLine;
import picocli.CommandLine.Option;

public abstract class AbstractVmCreate extends AbstractVmCommand {

  @Option(names = { "-r", "--replace-existing" }, description = "Replace existing matching VMs.")
  protected boolean replaceExisting;

  @Option(names = { "-k", "--public-key" }, description = "Path to public key.")
  protected Path publicKey;

  @Option(names = { "-s", "--ssh-secret" }, description = "The name of the ssh secret.")
  protected String sshSecretName = "quarkus-dev-secret";

  public abstract InputStream getInputStream();

  public void onCreated(List<VirtualMachine> virtualMachines) {
  }

  public void onReady(List<VirtualMachine> virtualMachines) {
  }

  @Override
  public Integer call() {
    List<Visitor<?>> visitors = new ArrayList<>();
    if (replaceExisting) {
      deleteExistingVirtualMachines();
    }

    try (InputStream is = getInputStream()) {
      List<VirtualMachine> existingVms = existingVirtualMachines();
      if (existingVms.size() > 0) {
        output.info("Failed to create VMs. The following VMs already exist.");
        VMS.addAll(existingVms);
        TABLE.print();
        output.info("Please cosnider using --replace-existing");
        return CommandLine.ExitCode.SOFTWARE;
      }

      if (namespace != null && !namespace.isEmpty()) {
        visitors.add(new ApplyNamespace(namespace));
      }

      if (publicKey != null) {
        if (!publicKey.toFile().exists()) {
          output.error("Public key file: " + publicKey.toAbsolutePath() + " does not exist");
          return CommandLine.ExitCode.USAGE;
        }

        Secret secret = new SecretBuilder()
            .withNewMetadata()
            .withName(sshSecretName)
            .withNamespace(namespace)
            .endMetadata()
            .withType("Opaque")
            .addToData("key", Base64.getEncoder().encodeToString(Files.readString(publicKey).getBytes()))
            .build();

        Clients.kubernetes().resource(secret).serverSideApply();
        visitors.add(new AddAccessCredentialsToVirtualMachine(sshSecretName));
      }

      List<HasMetadata> createdResources = Clients.kubernetes().load(is)
          .accept(visitors.toArray(new Visitor[visitors.size()])).create();
      final List<VirtualMachine> createdVms = createdResources.stream().filter(i -> i instanceof VirtualMachine)
          .map(VirtualMachine.class::cast).collect(Collectors.toList());
      onCreated(createdVms);
      VMS.addAll(createdVms);

      if (!shouldWaitUntilReady()) {
        output.info("Created VMs:");
        TABLE.print();
      } else {
        output.info("Waiting for VMs:");
        TABLE.print();
        Clients.kubernetes().resourceList(createdVms).waitUntilCondition(
            vm -> vm instanceof VirtualMachine &&
                ((VirtualMachine) vm).getStatus() != null &&
                ((VirtualMachine) vm).getStatus().getReady() != null &&
                ((VirtualMachine) vm).getStatus().getReady(),
            5L, TimeUnit.MINUTES);

        List<VirtualMachine> readyVms = Clients.kubernetes().resourceList(createdVms).get().stream()
            .filter(i -> i instanceof VirtualMachine).map(VirtualMachine.class::cast).collect(Collectors.toList());
        VMS.clear();
        VMS.addAll(readyVms);
        TABLE.refresh();
        onReady(readyVms);
      }
      return CommandLine.ExitCode.OK;
    } catch (Exception e) {
      e.printStackTrace();
      return CommandLine.ExitCode.SOFTWARE;
    }
  }

  @Override
  public List<VirtualMachine> existingVirtualMachines() {
    try (InputStream is = getInputStream()) {
      return Clients.kubernetes().load(is).accept(new ApplyNamespace(namespace)).get().stream()
          .filter(i -> i instanceof VirtualMachine)
          .map(VirtualMachine.class::cast).collect(Collectors.toList());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public void deleteExistingVirtualMachines() {
    try (InputStream is = getInputStream()) {
      List<HasMetadata> existingResources = Clients.kubernetes().load(is).accept(new ApplyNamespace(namespace)).get();
      final List<VirtualMachine> existingVms = existingResources.stream().filter(i -> i instanceof VirtualMachine)
          .map(VirtualMachine.class::cast).collect(Collectors.toList());
      for (VirtualMachine vm : existingVms) {
        Clients.kubernetes().resource(vm).delete();
      }
      for (VirtualMachine terminating : existingVms) {
        Clients.kubernetes().resource(terminating).waitUntilCondition(vm -> vm == null, 1L, TimeUnit.MINUTES);
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
