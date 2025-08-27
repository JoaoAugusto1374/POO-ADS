package atividades.lista3_java.questao22;
import java.util.Scanner;

public class Vendas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] comissoes = new int[9];

        while(true) {
            System.out.println("Digite o valor total das vendas ou -1 para sair: ");
            double vendas = sc.nextDouble();
            if(vendas == -1) {
                break;
            }
            int salario = (int)(200 + 0.09 * vendas);
            
            if(salario >= 1000) {
                comissoes[8]++;
            } else {
                int intervalo = (int)((salario - 200) / 100);
                comissoes[intervalo]++;
            }

        }

        System.out.println("O total de salarios em cada intervalo é: ");
        System.out.println("200-299: " + comissoes[0]);
        System.out.println("300-399: " + comissoes[1]);
        System.out.println("400-499: " + comissoes[2]);
        System.out.println("500-599: " + comissoes[3]);
        System.out.println("600-699: " + comissoes[4]);
        System.out.println("700-799: " + comissoes[5]);
        System.out.println("800-899: " + comissoes[6]);
        System.out.println("900-999: " + comissoes[7]);
        System.out.println("1000-: " + comissoes[8]);

        sc.close();
    }
    

}
