package atividades.lista1_java.pacote_Conta;
import java.util.Scanner;

public class BancoTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Conta c1 = new Conta();

        System.out.println("Digite o número da agência: ");
        c1.setAgencia(scan.nextInt());
        System.out.println("Digite o número da conta: ");
        c1.setNumero(scan.nextInt());

        System.out.println("Conta Criada com sucesso!");
        

        int resposta = 0;

        while(resposta != 4) {
            System.out.println("O que deseja fazer? ");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Ver Saldo");
            System.out.println("4 - Sair do menu");
            resposta = scan.nextInt();

            if ( resposta == 1) {
                System.out.println("Digite o valor que quer sacar: ");
                double valor = scan.nextDouble();
                c1.sacar(valor);
            } else if (resposta == 2) {
                System.out.println("Digite o valor que quer depositar: ");
                double dep = scan.nextDouble();
                c1.depositar(dep);
            } else if(resposta == 3) {
                c1.verSaldo();
            }

        }
    

    }
}
