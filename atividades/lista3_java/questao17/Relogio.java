package atividades.lista3_java.questao17;

public class Relogio {
    private int hora;
    private int minuto;
    private int segundo;

    public Relogio(){
        this(0,0,0);
    }

    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }


    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setHora(int h) {
        if(h >= 0 && h<= 24) {
            hora = h;
        }
    }

    public void setMinuto(int m) {
        if(m >= 0 && m<= 60) {
            minuto = m;
        }
    }

    public void setSegundo(int s) {
        if(s >= 0 && s<= 60) {
            segundo = s;
        }
    }

    public String alterarHora(int h, int m, int s){   
        setHora(h);
        setMinuto(m);
        setSegundo(s);
        return String.format("A nova hora é %2d:%2d:%2d", hora, minuto, segundo);
    }

    public void incrementarSegundo() {
        setSegundo(this.segundo + 1);
    }

}
