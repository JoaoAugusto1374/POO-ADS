package atividades.lista4_java.questao26;

public class Poupanca extends Conta {
    private double taxaRendimento;

    public Poupanca(String numero, String agencia, String senha) {
        super(numero, agencia, senha);
        this.taxaRendimento = 0.5;
    }


    
}
