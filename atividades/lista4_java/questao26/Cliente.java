package atividades.lista4_java.questao26;

public class Cliente {
    private String nome;
    private Conta conta;

    public Cliente(String nome) {
        this.nome = nome;
        this.conta = null;
    }

    public void criarConta(Conta conta) {
        this.conta = conta;
    }

}
