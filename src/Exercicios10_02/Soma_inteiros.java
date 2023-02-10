package Exercicios10_02;
import java.util.Scanner;
public class Soma_inteiros {
public static void main (String []args ){
	Scanner leia = new Scanner (System.in);
	int numero,soma=0;
	System.out.println ("Insira um número: ");
	numero = leia.nextInt();
	do {
	System.out.println ("Insira um número: ");
	numero = leia.nextInt();
	if (numero > 0 ) {
		soma += numero;
	}
	}while (numero != 0);
	
	
	System.out.println ("A soma dos números positivos é: "+soma);

}
}