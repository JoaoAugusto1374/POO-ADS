package projetos.livraria;

public class Cliente {
    private String nome;
    private String email;
    private double saldoCarteira;

    public Cliente(String nome, String email, double saldoCarteira) {
        this.nome = nome;
        this.email = email;
        this.saldoCarteira = saldoCarteira;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public double getSaldoCarteira() {
        return saldoCarteira;
    }

    public void setSaldoCarteira(double saldoCarteira) {
        this.saldoCarteira = saldoCarteira;
    }

    @Override
    public String toString() {
        return nome + " (" + email + ") - Saldo: R$ " + saldoCarteira;
    }
}
