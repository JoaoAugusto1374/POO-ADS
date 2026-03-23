package padroes.visitor;


// Interface visitor do padrão com os métodos de calculo de impostos definidos na visita dos elementos

public interface CalcularImposto {
    double visitAlimentos(Alimentos a);
    double visitEletronicos(Eletronicos e);
    double visitBebidaAlcoolica(BebidaAlcoolica b);

}
