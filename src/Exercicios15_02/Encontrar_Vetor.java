package Exercicios15_02;
import java.util.Scanner;
public class Encontrar_Vetor {
public static void main(String[] args) {
Scanner leia = new Scanner (System.in);

int [] vetor = new int [9];
int numero,x,posicao=0;
	
	for (x=0;x<vetor.length;x++) {
		System.out.println("Insira um número: ");
		vetor[x] = leia.nextInt();
	}
	System.out.println("Digite o número que você quer encontrar: ");
	numero = leia.nextInt();
	for (x=0;x<vetor.length;x++) {
		if (vetor[x] == numero) {
			posicao = x;
			System.out.println("O número "+numero+" está localizado na posição: "+posicao);
		} if (vetor[x] != numero) {
			System.out.println("O número "+numero+" não foi localizado!");
			break;
		}
	}
	}
}
