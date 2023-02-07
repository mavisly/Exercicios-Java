package Exercicios07_02;
import java.util.Scanner;
public class SalarioLiquido {
	public static void main (String []args) {
		float salario_bruto, adc_noturno, h_extra, descontos, salario_liquido;
		Scanner leia = new Scanner (System.in);
		
		System.out.println ("\nDigite o salário bruto do funcionário: ");
		salario_bruto = leia.nextFloat();
		System.out.println ("\nDigite o adicional noturno do funcionário: ");
		adc_noturno = leia.nextFloat();
		System.out.println ("\nDigite a quantidade de horas extras do funcionário: ");
		h_extra = leia.nextFloat();
		System.out.println ("\nDigite os descontos do funcionário: ");
		descontos = leia.nextFloat();
		
		salario_liquido = (salario_bruto + adc_noturno + (h_extra * 5)) - descontos;
		System.out.printf("\nO salário liquído desse funcionário é de R$ %.2f",salario_liquido);
		
		
		
	}
	

}
