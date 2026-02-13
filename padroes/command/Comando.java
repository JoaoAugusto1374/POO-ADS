public interface Comando {
    void executar();
    void undo();

    //Interface comando que define os métodos que serão utilizados pelos comandos concretos.

}
