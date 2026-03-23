package padroes.visitor;

public interface Produtos {
    double aceitar(CalcularImposto c);
}

//Interface de produtos que define o método accept a ser implementado nos produtos concretos.