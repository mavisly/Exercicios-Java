package Exercicios15_02;
import java.util.Scanner;
public class Matriz_3x3 {
public static void main (String []args) {
	Scanner leia = new Scanner (System.in);
	
	int [][] matriz = new int [3][3];
	int somaprincipal=0, somasecundaria=0,linha,coluna;
	
	for (linha=0;linha<3;linha++) {
		for (coluna=0;coluna<3;coluna++) {
			System.out.println("Preencha a matriz: ");
			matriz [linha][coluna] = leia.nextInt();
	}
	}
		System.out.println("Elementos da diagonal principal: ");
		for (linha=0;linha<3;linha++) {
			for (coluna=0;coluna<3;coluna++) {	
				if (linha == coluna) {
					System.out.print(matriz[linha][coluna]+" ");
				}
			}	
		}
		System.out.println("\nElementos da diagonal secundária: ");
		for (linha=0;linha<3;linha++) {
			for (coluna=0;coluna<3;coluna++) {	
		 if(linha+coluna == matriz.length-1){
             System.out.print(matriz[linha][coluna]+" ");
        }
		}
		}
		for (linha=0;linha<3;linha++) {
			for (coluna=0;coluna<3;coluna++) {	
				if (linha == coluna) {
					somaprincipal += matriz[linha][coluna];
				}
			}
		}
		for (linha=0;linha<3;linha++) {
			for (coluna=0;coluna<3;coluna++) {	
				if (linha+coluna == matriz.length-1) {
					somasecundaria += matriz[linha][coluna];
				}
			}
		}
		System.out.println("\nSoma da diagonal primária: "+somaprincipal);
		System.out.println("\nSoma da diagonal secundária: "+somasecundaria);
}
}