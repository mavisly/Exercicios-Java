package Exercicios09_02;
import java.util.Scanner;
public class Reajuste_salario {
public static void main (String []args) {
	Scanner leia = new Scanner (System.in);
	String nome;
	int cod_cargo;
	double salario, salariofinal;
	
	System.out.println ("Informe o nome do funcion�rio: ");
	nome = leia.nextLine();
	System.out.println ("Informe o c�digo do cargo do funcion�rio: ");
	System.out.println ("1- Gerente");
	System.out.println ("2- Vendedor");
	System.out.println ("3- Supervisor");
	System.out.println ("4- Motorista");
	System.out.println ("5- Estoquista");
	System.out.println ("6- T�cnico de TI");
	cod_cargo = leia.nextInt();
	if (cod_cargo <=0 || cod_cargo >=7) {
		System.out.println ("Opera��o inv�lida.");
	}else {
	System.out.println ("Qual o valor do sal�rio desse funcion�rio?");
	salario = leia.nextFloat();
	switch (cod_cargo) {
	case 1:
		salariofinal = salario + (0.10 * salario);
		System.out.println ("Nome do colaborador: "+nome+ ", Cargo: "+cod_cargo+", novo sal�rio: R$"+salariofinal);
		break;
	case 2: 
		salariofinal = salario + (0.07 * salario);
		System.out.println ("Nome do colaborador: "+nome+ ", Cargo: "+cod_cargo+", novo sal�rio: R$"+salariofinal);
		break;
	case 3:	
		salariofinal = salario + (0.09 * salario);
		System.out.println ("Nome do colaborador: "+nome+ ", Cargo: "+cod_cargo+", novo sal�rio: R$"+salariofinal);
		break;
	case 4: 		
		salariofinal = salario + (0.06 * salario);
		System.out.println ("Nome do colaborador: "+nome+ ", Cargo: "+cod_cargo+", novo sal�rio: R$"+salariofinal);
		break;
	case 5: 
		salariofinal = salario + (0.05 * salario);
		System.out.println ("Nome do colaborador: "+nome+ ", Cargo: "+cod_cargo+", novo sal�rio: R$"+salariofinal);
		break;
	case 6:	
		salariofinal = salario + (0.08 * salario);
		System.out.println ("Nome do colaborador: "+nome+ ", Cargo: "+cod_cargo+", novo sal�rio: R$"+salariofinal);
	break;
	default: 
		System.out.println ("Funcion�rio n�o encontrado.");
	}
	
	
	
	
}
}
}
