package Exercicios15_02;
import java.util.Scanner;
public class Elementos_Vetor {
public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	
	int [] vetor = new int [10];
	int soma=0,x;
	double media=0;
	
	for (x=0;x<vetor.length;x++) {
		System.out.println("Preencha o vetor: ");
		vetor[x] = leia.nextInt();
		}
	
	System.out.println("\nElementos pares: ");	
	for (x=0;x<vetor.length;x++) {
		if (vetor[x] % 2 == 0 ) {
		System.out.print(vetor[x]+" ");
	}
	}
	System.out.println("\nElementos dos indices impares: ");
	for (x=1;x<vetor.length;x+=2) {
		System.out.print (vetor[x]+" ");
	}
	for (x=0;x<vetor.length;x++) {
		soma+=vetor[x];
		media = soma / vetor.length;
	}
	System.out.println("\nSoma: "+soma);
	System.out.printf("\nMédia: %.2f",media);
	
}
}
