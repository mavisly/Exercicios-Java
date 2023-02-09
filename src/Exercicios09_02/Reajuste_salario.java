package Exercicios09_02;
import java.util.Scanner;
public class Reajuste_salario {
public static void main (String []args) {
	Scanner leia = new Scanner (System.in);
	String nome;
	int cod_cargo;
	double salario, salariofinal;
	
	System.out.println ("Informe o nome do funcionário: ");
	nome = leia.nextLine();
	System.out.println ("Informe o código do cargo do funcionário: ");
	System.out.println ("1- Gerente");
	System.out.println ("2- Vendedor");
	System.out.println ("3- Supervisor");
	System.out.println ("4- Motorista");
	System.out.println ("5- Estoquista");
	System.out.println ("6- Técnico de TI");
	cod_cargo = leia.nextInt();
	if (cod_cargo <=0 || cod_cargo >=7) {
		System.out.println ("Operação inválida.");
	}else {
	System.out.println ("Qual o valor do salário desse funcionário?");
	salario = leia.nextFloat();
	switch (cod_cargo) {
	case 1:
		salariofinal = salario + (0.10 * salario);
		System.out.println ("Nome do colaborador: "+nome+ ", Cargo: "+cod_cargo+", novo salário: R$"+salariofinal);
		break;
	case 2: 
		salariofinal = salario + (0.07 * salario);
		System.out.println ("Nome do colaborador: "+nome+ ", Cargo: "+cod_cargo+", novo salário: R$"+salariofinal);
		break;
	case 3:	
		salariofinal = salario + (0.09 * salario);
		System.out.println ("Nome do colaborador: "+nome+ ", Cargo: "+cod_cargo+", novo salário: R$"+salariofinal);
		break;
	case 4: 		
		salariofinal = salario + (0.06 * salario);
		System.out.println ("Nome do colaborador: "+nome+ ", Cargo: "+cod_cargo+", novo salário: R$"+salariofinal);
		break;
	case 5: 
		salariofinal = salario + (0.05 * salario);
		System.out.println ("Nome do colaborador: "+nome+ ", Cargo: "+cod_cargo+", novo salário: R$"+salariofinal);
		break;
	case 6:	
		salariofinal = salario + (0.08 * salario);
		System.out.println ("Nome do colaborador: "+nome+ ", Cargo: "+cod_cargo+", novo salário: R$"+salariofinal);
	break;
	default: 
		System.out.println ("Funcionário não encontrado.");
	}
	
	
	
	
}
}
}
