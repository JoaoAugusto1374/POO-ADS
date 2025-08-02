package atividades.lista1_java;

import java.util.Scanner;

public class Adicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int n1 = sc.nextInt();
        System.out.println("Digite um número inteiro: ");
        int n2 = sc.nextInt();
        int soma = n1 + n2;

        System.out.printf("O resultado da soma de %d e %d é %d", n1, n2, soma);

    }
}


