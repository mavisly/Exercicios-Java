package Exercicios08_02;

import java.util.Scanner;

public class Idade_dias {
public static void main (String []args) {
	Scanner leia = new Scanner (System.in);
	int dias, meses, anos, idade_dias;
	
	System.out.println("\nQuantos anos você tem?");
	anos = leia.nextInt();
	System.out.println("\nQuantos meses você tem?");
	meses = leia.nextInt();
	System.out.println("\nQuantos dias você tem?");
	dias = leia.nextInt();
	
	idade_dias = (anos*365) + (meses*30) + dias; 
	
	System.out.println ("Você tem "+idade_dias+" dias de vida!");
}
}
