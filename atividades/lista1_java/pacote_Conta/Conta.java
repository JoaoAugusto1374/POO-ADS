package atividades.lista1_java.pacote_Conta;

public class Conta {
    private int agencia;
    private int numero;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int n) {
        numero = n;
    }

    public int getAgencia(){
        return agencia;
    }

    public void setAgencia(int a) {
        agencia = a;
    }

    public void sacar(double s) {
        if ( saldo > s) {
            saldo = saldo - s;
        } else {
            System.out.println("Saldo insuficiente!");
        }
        
    }

    public void depositar(double d) {
        saldo = saldo + d;
    }

    public void verSaldo() {
        System.out.println(saldo);
    }

}
