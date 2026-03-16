package padroes.state;

public class EstadoEmSeparacao implements EstadoPedido {

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Avisando estoque para interromper separação.");
        pedido.setEstado(new EstadoCancelado());
    }

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pagamento já realizado.");
    }

    @Override
    public void despachar(Pedido pedido) {
        System.out.println("Pedido despachado.");
        pedido.setEstado(new EstadoEnviado());
    }
}
