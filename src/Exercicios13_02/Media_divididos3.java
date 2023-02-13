package Exercicios13_02;
import java.util.Scanner;
public class Media_divididos3 {
public static void main(String[] args) {
Scanner leia = new Scanner (System.in);
double numero,media=0,soma=0,cont=0;
	
	do {
		System.out.println ("Insira um número: ");
		numero = leia.nextDouble();
		if (numero != 0) {
		cont ++;
		}
		if (numero % 3 ==0) {
			soma += numero;
			media = soma / cont;
		}
	}while (numero !=0);
	System.out.println ("A média dos múltiplos de 3 é: "+media);


	}

}
