package Exercicios09_02;
import java.util.Scanner;
public class Calculadora_simples {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		float n1,n2, resultado;
		int op;

		System.out.println ("Escolha a operação matemática: ");
		System.out.println ("1- Soma");
		System.out.println ("2- Subtração");
		System.out.println ("3- Multiplicação");
		System.out.println ("4 - Divisão");
		op = leia.nextInt();
		if (op <=0 || op >=5) {
			System.out.println ("Operação inválida.");
		}else {
		System.out.println ("Insira o primeiro número: ");
		n1 = leia.nextFloat();
		System.out.println ("Insira o segundo número: ");
		n2 = leia.nextFloat();
		
		switch (op) {
		case 1:
			resultado = n1 + n2;
			System.out.println (n1+"+"+n2+"= "+resultado);
			break;
		case 2: 
			resultado = n1 - n2;
			System.out.println (n1+"-"+n2+"= "+resultado);
			break;
		case 3: 
			resultado = n1 * n2;
			System.out.println (n1+"*"+n2+"= "+resultado);
			break;
		case 4: 
			resultado = n1 / n2;
			System.out.println (n1+"/"+n2+"= "+resultado);
			break;
		
		}


	}

}
}
