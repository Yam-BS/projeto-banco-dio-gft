package one.digitalinnovation.projeto.banco.conta;

import one.digitalinnovation.projeto.banco.Cliente;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupanca === ");
        super.imprimirInfosComuns();
    }
}
