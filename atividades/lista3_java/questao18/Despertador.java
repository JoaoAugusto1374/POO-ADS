package atividades.lista3_java.questao18;
import atividades.lista3_java.questao17.Relogio;

public class Despertador {
    private Relogio relogio;
    private Relogio alarme;

    public Despertador() {
        this.relogio = new Relogio(0, 0, 0); 
        this.alarme = new Relogio(0,0);
    }

    public void configurarRelogio(int h, int m, int s) {
        relogio.setHora(h);
        relogio.setMinuto(m);
        relogio.setSegundo(s);
    }

    public void configurarAlarme(int h, int m) {
        alarme.setHora(h);
        alarme.setMinuto(m);
        
    }

    public void executar() {
    while (relogio.getHora() != alarme.getHora() ||
           relogio.getMinuto() != alarme.getMinuto() ||
           relogio.getSegundo() != alarme.getSegundo()) {

        relogio.incrementarSegundo();
    }

    System.out.println("O horário do relógio é o mesmo do alarme");
    }


}
