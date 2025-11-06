package projetos.livraria;

public class LivroFisico extends Livro{
    	private double pesoGramas;

	public LivroFisico(double pesoGramas, String titulo, String autor, int ano, float precoBase, int estoque) {
    	super(titulo, autor, ano, precoBase, estoque);
    	this.pesoGramas = pesoGramas;
	}

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() + ", peso - " + pesoGramas;
    } 
    
	@Override
	public double calcularPrecoVenda() {
    	double valor = super.calcularPrecoVenda();
    	double taxa = valor * 0.1;
    	return valor + taxa + 5.0;
	}
    
}


