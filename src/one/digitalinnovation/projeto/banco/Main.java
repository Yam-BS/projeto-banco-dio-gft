package one.digitalinnovation.projeto.banco;

import one.digitalinnovation.projeto.banco.conta.Conta;
import one.digitalinnovation.projeto.banco.conta.ContaCorrente;
import one.digitalinnovation.projeto.banco.conta.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Cliente jose = new Cliente();

        jose.setNome("José");
        Conta cc = new ContaCorrente(jose);
        Conta poupanca = new ContaPoupanca(jose);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
