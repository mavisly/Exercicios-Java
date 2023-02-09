package Exercicios09_02;
import java.util.Scanner;
public class Maior_que_C {
public static void main (String [] args) {
	Scanner leia = new Scanner (System.in);
	int A,B,C;
	
	System.out.println ("Digite o valor A: ");
	A = leia.nextInt();
	System.out.println ("Digite o valor B: ");
	B = leia.nextInt();
	System.out.println ("Digite o valor de C: ");
	C = leia.nextInt();
	
	if (A + B > C) {
		System.out.println ("A soma de A + B é maior do que C!");
		}
	else if (A + B == C) {
		System.out.println ("A soma de A + B é igual a C!");
	}
	else {
		System.out.println ("A soma de A + B é menor que C!");
	}
	
		
		
	}
	
	
}

