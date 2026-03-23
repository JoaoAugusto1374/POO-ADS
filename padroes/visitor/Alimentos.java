package padroes.visitor;

public class Alimentos implements Produtos {
    public String nome;
    public double preco;


    public Alimentos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco; 
    }

    public double aceitar(CalcularImposto c) {
        return c.visitAlimentos(this);
    }
}

//Classe Concreta dos alimentos que implementa o accept de visitas do visitor;