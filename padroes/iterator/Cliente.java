package padroes.iterator;

public class Cliente {
    public static void main(String[] args) {
        PlaylistConcreta playlist = new PlaylistConcreta();

        playlist.adicionar(new Musica("Segura a Cabra", false));
        playlist.adicionar(new Musica("Pétala", true));
        playlist.adicionar(new Musica("The boy with this torn in his side", false));
        playlist.adicionar(new Musica("Hotel California", true));
        
        System.out.println("🎵 Playlist Completa:");
        Iterador it1 = playlist.createIteratorSequencial();
        while (it1.hasMore()) {
            System.out.println(it1.getNext());
        }

        System.out.println("\n⭐ Apenas Favoritas:");
        Iterador it2 = playlist.createIteradorFavoritas();
        while (it2.hasMore()) {
            System.out.println(it2.getNext());
        }
    }
}
