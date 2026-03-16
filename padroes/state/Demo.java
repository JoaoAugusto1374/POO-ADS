package padroes.state;

public class Demo {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        pedido.pagar();      
        pedido.despachar();  
        pedido.cancelar();   

    }

}
