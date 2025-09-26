package atividades.lista4_java.questao26;

public class ContaCorrente extends Conta {
    private double valorAdmin;
    
    public ContaCorrente(String numero, String agencia, String senha, double valorAdmin) {
        super(numero, agencia, senha);
        this.valorAdmin = valorAdmin;
    }

    public double cobrarAdmin() {
        saldo = saldo - valorAdmin;
        return saldo;
    }

    


}
