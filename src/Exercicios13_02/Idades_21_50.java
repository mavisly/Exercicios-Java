package Exercicios13_02;
import java.util.Scanner;
public class Idades_21_50 {
public static void main (String []args) {
	Scanner leia = new Scanner (System.in);
	int idade,x,menor=0,maior=0;
	
	System.out.println ("Insira uma idade: ");
	idade = leia.nextInt();
	while (idade !=-99) {
		System.out.println ("Insira uma idade: ");
		idade = leia.nextInt();	
	if (idade<21) {
		menor++;
	} 
	if (idade>50) {
		maior++;
	}
	}
	System.out.println ("Total de pessoas com idade inferior a 21 anos: "+menor);
	System.out.println ("Total de pessoas com idade inferior a 50 anos: "+maior);
	
}
}
