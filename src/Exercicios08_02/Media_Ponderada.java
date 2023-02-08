package Exercicios08_02;

import java.util.Scanner;

public class Media_Ponderada {
public static void main (String [] args) {
	Scanner leia = new Scanner (System.in);
	double nota1,nota2,nota3,media;
	
	System.out.println ("Digite a primeira nota: ");
	nota1 = leia.nextDouble();
	System.out.println ("Digite a segunda nota: ");
	nota2 = leia.nextDouble();
	System.out.println ("Digite a terceira nota: ");
	nota3 = leia.nextDouble();
	
	nota1 = nota1 * 2;
	nota2 = nota2 * 3;
	nota3 = nota3 * 5;
	media = (nota1+nota2+nota3)/10;
	
	System.out.println ("A media do aluno foi "+media);
}
}
