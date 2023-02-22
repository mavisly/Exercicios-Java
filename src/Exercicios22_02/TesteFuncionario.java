package Exercicios22_02;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario ("Bruno","Gerente",12,18000,45);
		func1.visualizar();
		
		System.out.println("\n Alteração de cargo");
		func1.setCargo("Supervisor");
		func1.visualizar();
		
		System.out.println("\n Aumento de salário");
		func1.setSalario(23000);
		func1.visualizar();
	}

}
