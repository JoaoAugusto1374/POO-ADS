package padroes.iterator;
//classe para ter registro das musicas
public class Musica {
    private String nome;
    private boolean favorita = false;

    public Musica(String nome, boolean favorita) {
        this.nome = nome;
        this.favorita = favorita;
    }

    public String getNome() {
        return nome;
    }

    public boolean isFavorita() {
        return favorita;
    }

}
