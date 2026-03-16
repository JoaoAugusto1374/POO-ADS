package padroes.state;

public class EstadoNovo implements EstadoPedido {

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido cancelado imediatamente.");
    }

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pagamento realizado.");
        pedido.setEstado(new EstadoEmSeparacao());
    }

    @Override
    public void despachar(Pedido pedido) {
        System.out.println("Não é possível despachar antes de pagar.");
    }
}