package exemplos;

public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private int dias;

    public Emprestimo(Livro l, Usuario u, int d) {
        this.livro = l;
        this.usuario = u;
        this.dias = d;
    }

    public Emprestimo() {
        livro = new Livro();
        usuario = new Usuario(null, null);
    }

    public String exibirResumo() {
        String mensagem = String.format("O %s pegou o(a) %s por %d dias", usuario.getNome(), livro.getTitulo(), dias);

        return mensagem;
    }

}
