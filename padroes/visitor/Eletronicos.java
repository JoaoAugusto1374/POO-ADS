package padroes.visitor;

public class Eletronicos implements Produtos {
    public String nome;
    public double preco;

    public Eletronicos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double aceitar(CalcularImposto c) {
        return c.visitEletronicos(this);
    }
    
}

//Classe Concreta dos Eletronicos que implementa o accept de visitas do visitor;