package projetos.agendamento_servicos;
import java.util.Scanner;

public class AgendaTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prestador p1 = new Prestador("João", "Encanador", 50.0);
        Prestador p2 = new Prestador("Pedro", "Pedreiro", 40.0);
        Usuario user1 = new Usuario(null, null, 0);

        System.out.println("Bem vindo ao Sistema de agendamento!");
        System.out.println("Digite seu nome: ");
        user1.nome = sc.nextLine();
        System.out.println("Digite seu email: ");
        user1.email = sc.next();
        System.out.println("Digite seu telefone: ");
        user1.telefone = sc.nextInt();
        System.out.println("\nPrestadores disponíveis:");
        System.out.println("1 - " + p1);
        System.out.println("2 - " + p2);

        // Escolha
        System.out.print("Escolha o prestador (1 ou 2): ");
        int escolha = sc.nextInt();
        sc.nextLine();
        Prestador prestadorEscolhido = (escolha == 1) ? p1:p2;
        System.out.println("Digite a data e a hora: ");
        String dataHora = sc.nextLine();

        user1.agendarServicos(prestadorEscolhido, dataHora);
    }
}
