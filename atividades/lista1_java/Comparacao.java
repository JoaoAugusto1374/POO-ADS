package atividades.lista1_java;

import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o primeiro número: ");
        int x = sc.nextInt();
        System.out.println("digite o segundo número: ");
        int y = sc.nextInt();
        System.out.println("digite o terceiro número: ");
        int z = sc.nextInt();

        int maior = x;
        if (y > maior && y > z) {
            maior = y;
        } else if ( z > maior && z > y) {
            maior = z; 
        }

        System.out.println("O maior número é: " + maior);
    }
}
