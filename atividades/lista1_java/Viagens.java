package atividades.lista1_java;
import java.util.Scanner;

public class Viagens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        int viagens = 0;
        float totalQuilometragem = 0;
        float totalLitros = 0;

        while (true) {
            System.out.println("Digite 1 para adicionar viagem ou -1 para sair:");
            opcao = sc.nextInt();

            if (opcao == -1) {
                break;
            }

            if (opcao == 1) {
                System.out.println("Digite a gasolina gasta na viagem (litros):");
                int litros = sc.nextInt();

                System.out.println("Digite a quilometragem da viagem:");
                int km = sc.nextInt();

                // Convertendo para float para divisão precisa
                float consumo = (float) km / litros;

                // Mostra o consumo dessa viagem
                System.out.printf("Consumo da viagem %d: %.2f km/l\n", viagens + 1, consumo);

                // Acumuladores
                totalLitros += litros;
                totalQuilometragem += km;
                viagens++;
            }
        }

        System.out.println("\n--- Relatório Final ---");
        System.out.printf("Total de viagens registradas: %d\n", viagens);
        System.out.printf("Quilometragem total: %.2f km\n", totalQuilometragem);
        System.out.printf("Litros totais consumidos: %.2f L\n", totalLitros);

        if (totalLitros > 0) {
            float mediaGeral = totalQuilometragem / totalLitros;
            System.out.printf("Consumo médio geral: %.2f km/l\n", mediaGeral);
        } else {
            System.out.println("Nenhuma viagem registrada para calcular média.");
        }

        sc.close();
    }
}
