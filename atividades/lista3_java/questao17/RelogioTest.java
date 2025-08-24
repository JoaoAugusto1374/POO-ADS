package atividades.lista3_java.questao17;
import java.util.Scanner;

public class RelogioTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Relogio r = new Relogio(15, 20, 30);

        System.out.println(r.alterarHora(12, 30, 40));
        r.incrementarSegundo();
    }
}
