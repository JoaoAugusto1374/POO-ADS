package projetos.livraria;

public class LivroDigital extends Livro {
    	private double tamanhoArquivoMb;
    
	public LivroDigital(double tamanhoArquivoMB, String titulo, String autor, int ano, float precoBase, int estoque) {
    	super(titulo, autor, ano, precoBase, estoque);
    	this.tamanhoArquivoMb = tamanhoArquivoMb;
	}

	public double getTamanhoArquivoMb() {
    	return tamanhoArquivoMb;
	}

	public void setTamanhoArquivoMb(double tamanhoArquivoMb) {
    	this.tamanhoArquivoMb = tamanhoArquivoMb;
	}
    
	@Override
	public String exibirDetalhes(Livro l) {
    	return super.exibirDetalhes(l) + ", tamanho do arquivo - " + tamanhoArquivoMb;
	}
    
	@Override
	public double calcularPrecoVenda() {
    	double valor = super.calcularPrecoVenda();
    	double taxa = valor * 0.15;
    	return valor - taxa;
	}

}
