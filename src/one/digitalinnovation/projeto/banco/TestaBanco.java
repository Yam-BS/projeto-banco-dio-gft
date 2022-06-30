package one.digitalinnovation.projeto.banco;

import one.digitalinnovation.projeto.banco.conta.Conta;
import one.digitalinnovation.projeto.banco.conta.ContaCorrente;
import one.digitalinnovation.projeto.banco.conta.ContaPoupanca;

import java.util.Comparator;

public class TestaBanco {
    public static void main(String[] args) {

        Banco banco = new Banco();
        banco.setNome("Banco Central");

//        Instanciando três clientes
        Cliente cliente = new Cliente();
        cliente.setNome("João da Silva");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Maria José");

        Cliente cliente3 = new Cliente();
        cliente3.setNome("Ana Batista");

//        Intanciando três contas utilizando os três clientes
        Conta contaCorrente  = new ContaCorrente(cliente);
        Conta contaCorrente2 = new ContaCorrente(cliente3);
        Conta contaPoupanca = new ContaPoupanca(cliente2);

//        Adicionando cada conta na lista de contas do banco. Elas serão ordenas por padrão em ordem alfabética
        banco.adicionaConta(contaCorrente);
        banco.adicionaConta(contaPoupanca);
        banco.adicionaConta(contaCorrente2);

//        Ordenação alternativa, baseada no número da conta
        banco.getContas().sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));

//        Exibindo a lista de contas
        banco.getContas().forEach(System.out::println);
    }
}
