package projetos.livraria;

public class Livro {
    private String titulo;
	private String autor;
	private int ano;
	private float precoBase;
	private int estoque;
    
    
	public Livro(String titulo, String autor, int ano, float precoBase, int estoque) {
    	this.titulo = titulo;
    	this.autor = autor;
    	this.ano = ano;
    	this.precoBase = precoBase;
    	this.estoque = estoque;
   	 
	}
    
	public String exibirDetalhes() {
        return String.format(
            "Título: %s\nAutor: %s\nAno: %d\nPreço: R$ %.2f\nEstoque: %d",
            this.titulo, this.autor, this.ano, this.precoBase, this.estoque
        );
    }
    
	public double calcularPrecoVenda() {
    	return precoBase;
	}
    
	public String getTitulo() {
    	return this.titulo;
	}
    
	public String getAutor() {
    	return this.autor;
	}
    
	public int getAno() {
    	return this.ano;
	}
    
	public float getPrecoBase() {
    	return this.precoBase;
	}
    
	public int getEstoque() {
    	return this.estoque;
	}
    
	public void setTitulo(String titulo) {
    	this.titulo = titulo;
	}
    
	public void setAno(int ano) {
    	this.ano = ano;
	}
    
	public void setAutor(String autor) {
    	this.autor = autor;
	}
    
	public void setPrecoBase(float precoBase) {
    	if(precoBase > 0) {
        	this.precoBase = precoBase;
    	}
	}
    
	public void setEstoque(int estoque) {
    	if (estoque > 0) {
        	this.estoque = estoque;
    	}
	}
    
}
