package Exercicios15_02;
import java.util.Scanner;
public class Encontrar_Vetor {
public static void main(String[] args) {
Scanner leia = new Scanner (System.in);

int [] vetor = new int [9];
int numero,x,posicao=0;
	
	for (x=0;x<vetor.length;x++) {
		System.out.println("Insira um n�mero: ");
		vetor[x] = leia.nextInt();
	}
	System.out.println("Digite o n�mero que voc� quer encontrar: ");
	numero = leia.nextInt();
	for (x=0;x<vetor.length;x++) {
		if (vetor[x] == numero) {
			posicao = x;
			System.out.println("O n�mero "+numero+" est� localizado na posi��o: "+posicao);
		} if (vetor[x] != numero) {
			System.out.println("O n�mero "+numero+" n�o foi localizado!");
			break;
		}
	}
	}
}
