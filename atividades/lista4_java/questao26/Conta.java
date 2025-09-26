package atividades.lista4_java.questao26;

public abstract class Conta {
    protected String numero;
    protected String agencia;
    private String senha;
    protected double saldo;

    public Conta(String numero, String agencia, String senha) {
        this.numero = numero;
        this.agencia = agencia;
        this.senha = senha;
        this.saldo = 0;
    }


    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void sacar(double valor) {
        saldo = saldo - valor;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public String verSaldo() {
        String resposta = String.format("O saldo atual é %f", saldo);
        return resposta;
    }

    public String gerarExtrato() {
        String historico = String.format("O saldo é %f com depositos %f", null);
        return historico;
    }

}
