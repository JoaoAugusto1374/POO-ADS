package padroes.iterator;

import java.util.ArrayList;
import java.util.List;

public class IteradorSequencial implements Iterador{
    private PlaylistConcreta colecao;
    private int state = 0;

    public IteradorSequencial(PlaylistConcreta c) {
        this.colecao = c;
    }

    public Musica getNext() {
        if(!hasMore()) {
            return null;
        }

        return colecao.getMusicas().get(state++);
    }

    public boolean hasMore() {
        return state < colecao.getMusicas().size();
    }

    
}
