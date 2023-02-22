package Exercicios22_02;

public class Produto {
	private String console;
	private int preco;
	private int memoria;
	private String edicao;
	private String cor;
	public Produto(String console, int preco, int memoria, String edicao, String cor) {
		this.console = console;
		this.preco = preco;
		this.memoria = memoria;
		this.edicao = edicao;
		this.cor = cor;
	}
	public String getConsole() {
		return console;
	}
	public void setConsole(String console) {
		this.console = console;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int ano) {
		this.preco = ano;
	}
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void visualizar() {
		System.out.println("O "+console+", edição "+edicao+", que atualmente custa R$"+preco+", está disponivel na cor "+cor+" e com memória de "+memoria+"MB.");
	}
	
}
	
	
