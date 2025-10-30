package projetos.livraria;

import java.util.List;

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
    
	public String exibirDetalhes(Livro l) {
    	String s = String.format("Titulo - %s\n; Autor - %s\n; ano - %d\n; preço - %.2f\n; estoque - %d;", l.getTitulo(), l.getAutor()
    	, l.getAno(), l.getPrecoBase(), l.getEstoque());
    	return s;
	}
    
	public double calcularPrecoVenda() {
    	return precoBase;
	}
    
	public void funcao(List<Livro> l) {
    	System.out.printf("Titulo - %s\n; preço final - $.2f;", titulo, calcularPrecoVenda());
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
