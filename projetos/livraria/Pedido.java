package projetos.livraria;

import java.util.HashMap;
import java.util.Map;

public class Pedido {
    Cliente cliente;
    private Map<Livro, Integer> itens = new HashMap<>();
    
    public double calcularTotal(Livro l, int quantidade) {
        double valorTotal = l.calcularPrecoVenda() * quantidade;
        return valorTotal;
    }

    public void adicionarItem(Livro l, Integer quant) {
        
    }

    public void finalizar() {
        if (cliente.getSaldoCarteira() > 0) {
            double novoSaldo = cliente.getSaldoCarteira() - calcularTotal(null, 0);
            
        } else {
            throw new IllegalArgumentException("Saldo negativo");
        }
    }

}
