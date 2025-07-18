package projetos.agendamento_servicos;

public class Usuario {
    String nome;
    String email;
    int telefone;

    public Usuario(String n, String e, int t) {
        nome = n;
        email = e;
        telefone = t;
    }

    public void agendarServicos(Prestador prest, String dataHora) {
        System.out.println("- Agendamento confirmado -");
        System.out.println("Nome: " + nome);
        System.out.println("email: " + email);
        System.out.println("telefone: " + telefone);
        System.out.println("Prestador escolhido: " + prest.getNome());
        System.out.println("Serviço é: " + prest.getServico());
        System.out.println("O valor hora é de: " + prest.getValorHora());
        System.out.println("A data e a hora do serviço é: " + dataHora);
    }

    

}
