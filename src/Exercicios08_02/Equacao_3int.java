package Exercicios08_02;

import java.util.Scanner;

public class Equacao_3int {
public static void main (String [] args) {
	Scanner leia = new Scanner (System.in);
	double A,B,C,R,S,D;
	
	System.out.println ("Digite o primeiro valor: ");
	A = leia.nextDouble();
	System.out.println ("Digite o segundo valor: ");
	B = leia.nextDouble();
	System.out.println ("Digite o terceiro valor: ");
	C = leia.nextDouble();
	
	R = (Math.pow(A, 2) + (2*A*B)+ Math.pow(B, 2));
	S = (Math.pow(B, 2) + (2*B*C) + Math.pow(C, 2));
	D = (R + S)/2;
	
	System.out.println ("O resultado de R é: "+R);
	System.out.println ("O resultado de S é: "+S);
	System.out.println ("O resultado de D é: "+D);
	
	
}
}
