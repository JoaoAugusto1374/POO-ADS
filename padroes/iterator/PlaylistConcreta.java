package padroes.iterator;

import java.util.ArrayList;
import java.util.List;
//coleção concreta da playlist de musicas que implemnta a interface playlist
public class PlaylistConcreta implements Playlist{

    private List<Musica> musicas = new ArrayList<>();

    public void adicionar(Musica m) {
        musicas.add(m);
    }

    public Iterador createIteratorSequencial() {
        return new IteradorSequencial(this);
    }

    public Iterador createIteradorFavoritas() {
        return new IteradorFavoritas(this);
    }

    public List<Musica> getMusicas() {
        return musicas;
    }
}
