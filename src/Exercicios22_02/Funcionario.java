package Exercicios22_02;

public class Funcionario {
	private String nome;
	private String cargo;
	private int anos_empresa;
	private int salario;
	private int idade;
	
	public Funcionario(String nome, String cargo, int anos_empresa, int salario, int idade) {
		this.nome = nome;
		this.cargo = cargo;
		this.anos_empresa = anos_empresa;
		this.salario = salario;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getAnos_empresa() {
		return anos_empresa;
	}

	public void setAnos_empresa(int anos_empresa) {
		this.anos_empresa = anos_empresa;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void visualizar() {
		System.out.println("O funcionário "+nome+", que tem "+idade+" anos, trabalha conosco no cargo de "+cargo+" há "+anos_empresa+" anos.");
		System.out.println("Atualmente o seu salário é de: R$"+salario);
	}
	
	
	
}
