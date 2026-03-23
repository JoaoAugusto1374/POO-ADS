package padroes.visitor;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    public static void main(String[] args) {
        List<Produtos> produtos = new ArrayList<>();

        Alimentos a = new Alimentos("carne", 12);
        BebidaAlcoolica b = new BebidaAlcoolica("vodka", 20);
        Eletronicos e = new Eletronicos("celular", 200);

        produtos.add(a);
        produtos.add(b);
        produtos.add(e);
        
        CalcularImposto c = new CalcularImpostoConcreto();
        double totalImposto = 0;


        for(Produtos p : produtos) {
            totalImposto += p.aceitar(c);
        }

        System.out.println("Total de impostos " + totalImposto);

    }

}

// Classe cliente que recebe a lista de produtos e itera sobre elas calculando o imposto individual e retornando o imposto total do carrinho, usei somente o imposto mesmo e não o preço total com imposto, pois entendi que seria somente o imposto do carrinho pedido na questão.