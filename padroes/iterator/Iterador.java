package padroes.iterator;
//Interface iteradora que define os métodos dos iteradores concretos
public interface Iterador {
    Musica getNext();
    boolean hasMore();

}
