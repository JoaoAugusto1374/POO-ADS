package atividades.lista2_java.pacote_fatu;

public class Fatura {
    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;

    public Fatura(String n, String d, int q, double p){
        numero = n;
        descricao = d;
        quantidade = q;
        preco = p;
    }

    public String getNumero(){
        return numero;
    }

    public void setNumero(String n){
        numero = n;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String d){
        descricao = d;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int q) {
        if (q > 0) {
            quantidade = q;
        }
    }

    public double getPreco() {
        return preco; 
    }

    public void setPreco(double p) {
        if (p > 0) {
            preco = p;
        }
    }

    public double getValorDaFatura(int q, double p) {
        if (q < 0) {
            q = 0;
        }

        if (p < 0) {
            p = 0.0;
        }

        return q * p;
    }

}
