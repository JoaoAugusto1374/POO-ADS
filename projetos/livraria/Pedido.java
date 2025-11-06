package projetos.livraria;

import java.util.List;
import java.util.ArrayList;

public class Pedido {
    private Cliente cliente;
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    // Sobrecarga 1: adiciona com quantidade específica
    public void adicionarItem(Livro livro, int quantidade) {
        itens.add(new ItemPedido(livro, quantidade));
    }

    // Sobrecarga 2: adiciona com quantidade padrão = 1
    public void adicionarItem(Livro livro) {
        adicionarItem(livro, 1);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void finalizar() {
        double total = calcularTotal();

        if (cliente.getSaldoCarteira() < total) {
            throw new IllegalStateException("Saldo insuficiente para finalizar o pedido.");
        }

        // Debita saldo diretamente
        cliente.setSaldoCarteira(cliente.getSaldoCarteira() - total);

        // Atualiza estoque diretamente
        for (ItemPedido item : itens) {
            Livro livro = item.getLivro();
            int novoEstoque = livro.getEstoque() - item.getQuantidade();

            if (novoEstoque < 0) {
                throw new IllegalStateException("Estoque insuficiente para o livro: " + livro.getTitulo());
            }

            livro.setEstoque(novoEstoque);
        }

        System.out.println("Pedido finalizado com sucesso!");
    }
}
