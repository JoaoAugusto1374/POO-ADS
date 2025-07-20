package atividades.lista2_java.pacote_vendas;

public class Vendas {
    private int numeroProd;
    private int quantidade;

    public Vendas(int n, int q) {
        numeroProd = n;
        quantidade = q;        
    }

    public int getNumeroProd() {
        return numeroProd;
    }

    public void setNumeroProd(int n) {
        numeroProd = n;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int q) {
        quantidade = q;
    }

    public double calcularVendas() {
        double valorProd = 0 ;
        switch (numeroProd) {
            case 1:
                valorProd = 2.98 * quantidade;
                break;
            case 2:
                valorProd = 4.50 * quantidade;
                break;
            case 3:
                valorProd = 9.98 * quantidade;
                break;
            case 4:
                valorProd = 4.49 *quantidade;
                break;
            case 5:
                valorProd = 6.87 * quantidade;
                break;
            default:
                break;
        }
        return valorProd;
    }
}
