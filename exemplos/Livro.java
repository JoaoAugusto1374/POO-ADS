package exemplos;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;

    public Livro() {
    }

    public Livro(String t, String a, int ano) {
        setTitulo(t);
        setAutor(a);
        setAno(ano);
    }

    public String exibirInfo() {
        String mensagem = String.format("O livro %s do autor %s foi publicado em %d", titulo, autor, ano);
        return mensagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public void setTitulo(String t) {
        titulo = t;
    }

    public void setAutor(String a) {
        autor = a;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


}
