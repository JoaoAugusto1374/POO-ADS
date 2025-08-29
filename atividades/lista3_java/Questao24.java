package atividades.lista3_java;
import java.util.Random;

public class Questao24 {
    public static void main(String[] args) {
        Random lancamento = new Random();
        int lance = 1;
        int[] somasPossiveis = new int[11];
        

        while(lance <= 5) {
            int lance1 = lancamento.nextInt(6) + 1;
            int lance2 = lancamento.nextInt(6) + 1;
            int soma = lance1 + lance2;
            
            somasPossiveis[soma-2]++;

            lance++;
        }

        for(int i = 0; i < somasPossiveis.length; i++){
            System.out.printf("A soma na posição %d foi %d \n", i, somasPossiveis[i]);
        }

        

    }
    

}
