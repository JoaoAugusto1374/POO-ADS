package padroes.iterator;
//iterador das musicas favoritas
public class IteradorFavoritas implements Iterador{
    private PlaylistConcreta colecao;
    private int state;

    public IteradorFavoritas(PlaylistConcreta c) {
        this.colecao = c;
    }

    public Musica getNext() { 
         if (!hasMore()) {
            return null;
        }

        return colecao.getMusicas().get(state++);
    }

    public boolean hasMore() {
        while (state < colecao.getMusicas().size()) {
            if (colecao.getMusicas().get(state).isFavorita()) {
                return true;
            }
            state++;
        }
        return false;
    }

}
