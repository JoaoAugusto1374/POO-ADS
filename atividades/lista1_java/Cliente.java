package atividades.lista1_java;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int clientes = 0;

        int op = 0;
        while(op != -1) {
            System.out.println("Adicionar cliente 1; Sair -1");
            System.out.println("Digite número da conta: ");
            int num = sc.nextInt();
            System.out.println("Digite o saldo: ");
            int saldo = sc.nextInt();
            System.out.println("Digite total de cobranças: ");
            int despesas = sc.nextInt();
            System.out.println("Digite número de creditos aplicados: ");
            int creditos = sc.nextInt();
            System.out.println("Limite de credito autorizado: ");
            int limite = sc.nextInt();

            saldo = saldo + despesas - creditos;

            clientes++;
        }

    }
}
