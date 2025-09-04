package exemplos;

public class BibliotecaTest {
   public static void main(String[] args) {
        Usuario user1 = new Usuario("Pedro", "pedro@gmail.com");
        Usuario user2 = new Usuario("Joao", "joao@gmail.com");

        Livro livro1 = new Livro("Harry potter", "Paula", 2009);
        Livro livro2 = new Livro("Biblia", "Moisés", 1110);
        Livro livro3 = new Livro("O alquimista", "Paulo Coelho", 2003);

        Emprestimo e = new Emprestimo(livro1, user1, 20);
        Emprestimo e1 = new Emprestimo(livro2,user2, 10);

        String resumo1 = e.exibirResumo();
        String resumo2 = e1.exibirResumo();

        System.out.println(resumo1);
        System.out.println(resumo2);

   } 
}
