package Exercicios07_02;

import java.util.Scanner;

public class Salario {
	public static void main (String[] args) {
		float salario, abono, novo_salario;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite o salário: ");
		salario = leia.nextFloat();
		System.out.println("\nDigite o abono: ");
		abono =leia.nextFloat();
		
		novo_salario = (salario + abono); 
		
		System.out.printf ("\nO novo salário é: %.2f",novo_salario);
		
	}
	

}
