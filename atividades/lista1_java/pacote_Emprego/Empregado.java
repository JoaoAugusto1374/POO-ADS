package atividades.lista1_java.pacote_Emprego;

public class Empregado {
    private String nome;
    private String sobrenome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String n) {
        nome = n;
    }

    public void setSobreNome(String so) {
        sobrenome = so;
    }

    public void setSalario(double s) {
        if( s > 0) {
            salario = s;
        }
    }

}
