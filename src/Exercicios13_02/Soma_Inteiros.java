package Exercicios13_02;
import java.util.Scanner;
public class Soma_Inteiros {
public static void main(String[] args) {
Scanner leia = new Scanner (System.in);
int numero,soma=0;
		do {
			System.out.println ("Insira um número: ");
			numero = leia.nextInt();
			soma += numero;
		}while (numero != 0);
System.out.println ("A soma dos números inseridos é: "+soma);
	}
}
