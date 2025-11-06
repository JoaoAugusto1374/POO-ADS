package projetos.livraria;

public class Test {
    public static void main(String[] args) {
        // Livros
        LivroFisico lf1 = new LivroFisico(20.0, "Java para todos", "Deitel", 1998, 200, 800);
        LivroDigital ld1 = new LivroDigital(200.5, "Biblia", "Moisés", 1000, 10, 100);

        // Cliente
        Cliente cli = new Cliente("João Augusto", "joao@email.com", 300.0);

        // Relatórios iniciais
        System.out.println("=== Estoque inicial ===");
        System.out.println(lf1.exibirDetalhes());
        System.out.println(ld1.exibirDetalhes());
        System.out.println(cli);

        // Pedido
        Pedido pedido = new Pedido(cli);
        pedido.adicionarItem(lf1, 1);
        pedido.adicionarItem(ld1); // quantidade padrão = 1

        
        pedido.finalizar();

        // Relatórios finais
        System.out.println("\n=== Estoque final ===");
        System.out.println(lf1.exibirDetalhes());
        System.out.println(ld1.exibirDetalhes());
        System.out.println(cli);
    }
}
