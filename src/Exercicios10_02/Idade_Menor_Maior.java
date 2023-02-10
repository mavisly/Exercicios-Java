package Exercicios10_02;
import java.util.Scanner;
public class Idade_Menor_Maior {
public static void main (String []args) {
	Scanner leia = new Scanner (System.in);
	int idade,menor=0,maior=0;
	System.out.println ("Informe uma idade: ");
	idade = leia.nextInt();
	while (idade>=0) {
		if (idade >21) {
			menor++;
		}
		if (idade >50) {
			maior++;
		}
		System.out.println ("Informe uma idade: ");
		idade = leia.nextInt();
		}
	System.out.println ("Total de pessoas menores de 21: "+menor);
	System.out.println ("Total de pessoas maiores de 50: "+maior);
	
	
	
}
}
