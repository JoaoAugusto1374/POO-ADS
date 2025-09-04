package exemplos;
import java.util.Scanner;
import java.util.ArrayList;

public class Turma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Arrays> alunos = new ArrayList<>();

        Arrays a1 = new Arrays();
        a1.setNota(0, 10);
        a1.setNota(1, 10);
        a1.setNota(2, 10);

        Arrays a2 = new Arrays();
        a2.setNota(0, 10);
        a2.setNota(1, 10);
        a2.setNota(2, 10);

        Arrays a3 = new Arrays();
        a3.setNota(0, 10);
        a3.setNota(1, 10);
        a3.setNota(2, 10);

        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);

        for ( Arrays al : alunos) {
            System.out.println("Aluno" + al.calcularMedia() + al.getSituacao());
        }

        sc.close();
    }
}
