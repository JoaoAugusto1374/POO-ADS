package padroes.visitor;

public class CalcularImpostoConcreto implements CalcularImposto{

    public double visitAlimentos(Alimentos a) {
        double imposto = 0.0;
        return imposto;
    }

    public double visitEletronicos(Eletronicos e) {
        double imposto = 0.15 * e.preco;
        return imposto;
    }

    public double visitBebidaAlcoolica(BebidaAlcoolica b) {
        double imposto = 0.40 * b.preco;
        return imposto;
    }

}

// Implementação concreta do calculo de impostos da interface do padrão visitor, aqui fica a lógica algoritmica que é separada dos objetos