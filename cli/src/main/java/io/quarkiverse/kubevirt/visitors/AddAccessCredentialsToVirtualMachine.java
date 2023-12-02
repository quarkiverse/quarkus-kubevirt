package io.quarkiverse.kubevirt.visitors;

import io.fabric8.kubernetes.api.builder.TypedVisitor;
import io.quarkiverse.kubevirt.v1.virtualmachinespec.template.SpecFluent;

public class AddAccessCredentialsToVirtualMachine extends TypedVisitor<SpecFluent<?>> {

    private final String secretName;

    public AddAccessCredentialsToVirtualMachine(String secretName) {
        this.secretName = secretName;
    }

    @Override
    public void visit(SpecFluent<?> spec) {
        spec.addNewAccessCredential()
                .withNewSshPublicKey()
                .withNewPropagationMethod()
                .withNewConfigDrive()
                .endVirtualmachinespecConfigDrive()
                .endVirtualmachinespecPropagationMethod()
                .withNewSource()
                .withNewSecret()
                .withSecretName(secretName)
                .endVirtualmachinespecSecret()
                .endVirtualmachinespecSource()
                .endVirtualmachinespecSshPublicKey()
                .endVirtualmachinespecAccessCredential();
    }

}
