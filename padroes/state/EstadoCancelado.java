package padroes.state;

public class EstadoCancelado implements EstadoPedido {

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("O pedido já está cancelado.");
    }

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Não é possível pagar um pedido cancelado.");
    }

    @Override
    public void despachar(Pedido pedido) {
        System.out.println("Não é possível despachar um pedido cancelado.");
    }
}
