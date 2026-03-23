package padroes.visitor;

public class BebidaAlcoolica implements Produtos {
    public String nome;
    public double preco;

    public BebidaAlcoolica(String nome, double preco) {
        this.nome = nome;
        this.preco = preco; 
    }

    public double aceitar(CalcularImposto c) {
        return c.visitBebidaAlcoolica(this);
    }
}

//Classe Concreta das bebidas alcoolicas que implementa o accept de visitas do visitor;