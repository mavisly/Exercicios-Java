package Exercicios07_02;
import java.util.Scanner;
public class SalarioLiquido {
	public static void main (String []args) {
		float salario_bruto, adc_noturno, h_extra, descontos, salario_liquido;
		Scanner leia = new Scanner (System.in);
		
		System.out.println ("\nDigite o sal�rio bruto do funcion�rio: ");
		salario_bruto = leia.nextFloat();
		System.out.println ("\nDigite o adicional noturno do funcion�rio: ");
		adc_noturno = leia.nextFloat();
		System.out.println ("\nDigite a quantidade de horas extras do funcion�rio: ");
		h_extra = leia.nextFloat();
		System.out.println ("\nDigite os descontos do funcion�rio: ");
		descontos = leia.nextFloat();
		
		salario_liquido = (salario_bruto + adc_noturno + (h_extra * 5)) - descontos;
		System.out.printf("\nO sal�rio liqu�do desse funcion�rio � de R$ %.2f",salario_liquido);
		
		
		
	}
	

}
