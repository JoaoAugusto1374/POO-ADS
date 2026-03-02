package padroes.iterator;
//interface que define a criação das possiveis coleções
public interface Playlist {
    Iterador createIteratorSequencial();
    Iterador createIteradorFavoritas();

}
