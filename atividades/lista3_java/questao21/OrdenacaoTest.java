package atividades.lista3_java.questao21;
import java.util.Scanner;
import java.util.Arrays;

public class OrdenacaoTest {
    public static void main(String[] args) {
        Ordenacao o = new Ordenacao();
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for(int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        int[]resultado = o.ordenarArray(numeros);
        System.out.println("Array ordenado: " + Arrays.toString(resultado));

        sc.close();
    }
}
