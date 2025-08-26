package atividades.lista3_java;
import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um dia do ano: ");
        int dia = sc.nextInt();
        System.out.println("Digite um mês do ano: ");
        int mes = sc.nextInt();

        if(dia < 1 || dia > 31) {
            throw new IllegalArgumentException("dia inválido" + dia);
        } else if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("mês inválido" + mes);
        }
            
        
    }
}
