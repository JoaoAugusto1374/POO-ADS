package atividades.lista2_java.pacote_revisao;

public class Date {
    private int mes;
    private int dia;
    private int ano;

    public Date (int m, int d, int a) {
        mes = m;
        dia = d;
        ano = a;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int m) {
        if (m > 0 && m < 12) {
            mes = m;
        }
    }

    public int getDia(){
        return dia;
    }

    public void setDia(int d) {
        if (d >= 1 && d <= 31){
            dia = d;
        }
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int a) {
        if (a > 0) {
            ano = a;
        }
    }

    public String displayDate (int m, int d, int a) {
        String texto = String.format("A data é %d/%d/%d", getDia(), getMes(), getAno());
        return texto;
    }
}
