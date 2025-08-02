package atividades.lista1_java.pacote_Emprego;
import java.util.Scanner;

public class EmpregadoTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empregado emp1 = new Empregado();

        System.out.println("Digite seu nome e sobrenome: ");
        emp1.setNome(sc.next());
        System.out.println("Digite seu salário mensal: ");
        emp1.setSalario(sc.nextDouble());
        double anual = emp1.getSalario() * 12;
        System.out.printf("O salário anual de %s é %.2f", emp1.getNome(), anual);


    }

   

}
