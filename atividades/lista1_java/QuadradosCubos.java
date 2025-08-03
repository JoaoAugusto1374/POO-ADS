package atividades.lista1_java;

public class QuadradosCubos {
    public static void main(String[] args) {
        int num = 1;
        System.out.printf( " %-10s  %-10s  %-10s %n", "Número", "Quadrado", "cubo");
        while (num <=10) {
            int quadradros = num * num;
            int cubos = num * num * num;
            System. out .printf( "| %-10s | %-8s | %4s |%n", num, quadradros, cubos); 

            num ++;
        }

    }
}
