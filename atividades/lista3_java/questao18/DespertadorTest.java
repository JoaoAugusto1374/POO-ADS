package atividades.lista3_java.questao18;

public class DespertadorTest {
    public static void main(String[] args) {
        Despertador d = new Despertador();
        d.configurarRelogio(15, 20, 30);
        d.configurarAlarme(15, 30);
        d.executar();
    }
}
