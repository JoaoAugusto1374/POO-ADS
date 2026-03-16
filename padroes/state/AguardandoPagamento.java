package padroes.state;


public class AguardandoPagamento implements EstadoPedido {
    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido cancelado pois ainda aguardava pagamento.");
    }

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pagamento confirmado.");
        pedido.setEstado(new EstadoEmSeparacao());
    }

    @Override
    public void despachar(Pedido pedido) {
        System.out.println("Não pode despachar sem pagamento.");
    }

}
