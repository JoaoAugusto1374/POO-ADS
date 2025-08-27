package atividades.lista3_java.questao20;
import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] t = new int[2][3];
        t[0][0] = 1;
        t[0][1] = 0;
        t[0][2] = 3;
        t[1][0] = 4;
        t[1][1] = 5;
        t[1][2] = 6;
        System.out.println("O tamanho do array é " + (t.length * t[0].length));

        for(int l = 0; l < t.length; l ++){
            for ( int c = 0; c < t[l].length; c++){
                t[l][c] = 0;
            }
        }

        for(int i = 0; i < t.length; i++) {
            for(int j = 0; j < t[i].length; i++) {
                System.out.println("Digite o valor do array");
                t[i][j] = sc.nextInt();
            }
        }

        int menor = t[0][0];
        for( int[] linha : t) {
            for(int valor : linha) {
                if ( valor < menor) {
                    menor = valor;
                }
            }
        }

        System.out.printf("Os valores da primeira linha são: %d, %d, %d", t[0][0], t[0][1], t[0][2]);

        int soma = t[0][2] + t[1][2];

        

        for(int i = 0; i < t.length; i++) {
            for(int j = 0; j < t[i].length; j++) {
                System.out.printf("%d", t[i][j]);
            } System.out.println();
        }

    }
    
}
