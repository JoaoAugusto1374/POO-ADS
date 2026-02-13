public class Cliente {

    //Classe cliente, que monta e usa a aplicação;
    public static void main(String[] args) {
        Controle controle = new Controle();
        Luz luz = new Luz();
        Tv tv = new Tv();

        Comando ligarLuz = new LigarLuzCommand(luz);
        Comando ligarTv = new LigarTvCommand(tv);

        controle.executarComando(ligarTv);
        controle.executarComando(ligarLuz);

        controle.undo();
        controle.undo();

        controle.redo();
        controle.redo();
    }
}
