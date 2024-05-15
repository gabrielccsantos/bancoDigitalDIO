package entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(){
        contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void getContas(){
        contas.stream().forEach(System.out::println);
    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

}
