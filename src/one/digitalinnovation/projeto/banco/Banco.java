package one.digitalinnovation.projeto.banco;

import one.digitalinnovation.projeto.banco.conta.Conta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private void ordenaContas() {
        Collections.sort(contas);
    }

    public List<Conta> getContas() {
        ordenaContas();
        return contas;
    }

    public void adicionaConta(Conta conta) {
       this.contas.add(conta);
    }
}
