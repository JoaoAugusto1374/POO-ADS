package padroes.bridge;

public class Test {
    public static void main( String [] args) {
        Bdr bd1 = new Bdr();
        Web bd = new Web(bd1);

        bd.salvar();
    }

}
