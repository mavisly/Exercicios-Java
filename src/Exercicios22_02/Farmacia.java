package Exercicios22_02;

public class Farmacia {
	private String laboratorio;
	private int preco;
	private int posologia;
	private String tipo;
	private String administracao;
	public Farmacia(String laboratorio, int preco, int posologia, String tipo, String administracao) {
		this.laboratorio = laboratorio;
		this.preco = preco;
		this.posologia = posologia;
		this.tipo = tipo;
		this.administracao = administracao;
	}
	public String getLaboratorio() {
		return laboratorio;
	}
	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public int getPosologia() {
		return posologia;
	}
	public void setPosologia(int posologia) {
		this.posologia = posologia;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getAdministracao() {
		return administracao;
	}
	public void setAdministracao(String administracao) {
		this.administracao = administracao;
	}
	
	public void visualizar() {
		System.out.println("O laboratório "+laboratorio+" fabrica o remédio solicitado.");
		System.out.println("Ele custa R$"+preco+",00");
		System.out.println("Ele é um tipo de medicamento "+tipo);
		System.out.println("Deve ser administrado "+posologia+" vezes ao dia e por via "+administracao);
	}
}
