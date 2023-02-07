package Exercicios07_02;

import java.util.Scanner;

public class Diferenca {
   public static void main(String []args) {
	   int n1,n2,n3,n4, diferenca;
	   Scanner leia = new Scanner (System.in);
	   
	   System.out.println("\nDigite o primeiro numero: ");
	   n1 = leia.nextInt();
	   System.out.println("\nDigite o segundo numero: ");
	   n2 = leia.nextInt();
	   System.out.println("\nDigite o terceiro numero: ");
	   n3 = leia.nextInt();
	   System.out.println("\nDigite o quarto numero: ");
	   n4 = leia.nextInt();
	   
	   diferenca = (n1*n2) - (n3*n4);
	   
	  System.out.println ("A diferença entre o produto dos dois primeiros números e os dois últimos é: "+diferenca);
	 
	   
   }
   
	
}
