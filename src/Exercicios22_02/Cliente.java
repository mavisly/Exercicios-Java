package Exercicios22_02;

public class Cliente {
	private String nome;
	private int idade;
	private String endereco;
	private int ano_nascimento;
	private String cor_favorita;
	public Cliente(String nome, int idade, String endereco, int ano_nascimento, String cor_favorita) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.ano_nascimento = ano_nascimento;
		this.cor_favorita = cor_favorita;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereço() {
		return endereco;
	}
	public void setEndereço(String endereco) {
		this.endereco = endereco;
	}
	public int getAno_nascimento() {
		return ano_nascimento;
	}
	public void setAno_nascimento(int ano_nascimento) {
		this.ano_nascimento = ano_nascimento;
	}
	public String getCor_favorita() {
		return cor_favorita;
	}
	public void setCor_favorita(String cor_favorita) {
		this.cor_favorita = cor_favorita;
	}
	
	public void visualizar() {
		System.out.println(nome+" tem "+idade+" anos, mora em "+endereco+ ", nasceu no ano de "+ano_nascimento+" e sua cor favorita é "+cor_favorita+".");
	}
	
	
}
