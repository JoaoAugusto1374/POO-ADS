package padroes.state;

public interface EstadoPedido {
    void cancelar(Pedido pedido);
    void pagar(Pedido pedido);
    void despachar(Pedido pedido);
}
