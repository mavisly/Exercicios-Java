package Exercicios08_02;

import java.util.Scanner;

public class Idade_completa {
public static void main (String [] args) {
	Scanner leia = new Scanner (System.in);
	int anos, meses, dias, idade_completa;
	
	System.out.println ("Quantos dias de vida você tem?");
	dias = leia.nextInt();
	
	anos = dias / 365;
	meses = anos / 12;
	dias = meses / 30;
	
	System.out.println ("Sua idade completa é: "+anos+" anos,"+meses+" meses e "+dias+" dias!");
	
	
}
}
