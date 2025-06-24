package atividades.lista2_java.questao13;

public class Estacionamento {
    private int horas;

    public Estacionamento(int h) {
        horas = h;
    }

    public int getHoras(int h) {
        return horas = h;
    }

    public void setHoras (int h) {
        if (h > 0 && h < 24) {
            horas = h;
        }
    }

    public double calculateCharges() {
        if (horas <= 3) {
            return 2.00;
        }
        else {
            double t = (horas - 3) * 0.50;
            return (t > 10.00) ? 10.00 : t;
        }
    }
}
