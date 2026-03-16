package padroes.state;

public class EstadoEnviado implements EstadoPedido {

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido já enviado. Iniciar logística reversa.");
    }

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pedido já pago.");
    }

    @Override
    public void despachar(Pedido pedido) {
        System.out.println("Pedido já foi enviado.");
    }
}
