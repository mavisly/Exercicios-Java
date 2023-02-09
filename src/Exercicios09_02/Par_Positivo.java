package Exercicios09_02;
import java.util.Scanner;
public class Par_Positivo {
public static void main (String [] args) {
	Scanner leia = new Scanner (System.in);
	int A;
	
	System.out.println ("Digite um número: ");
	A = leia.nextInt();
									
	if (A % 2 ==0 && A > 0) {
		System.out.println ("O número "+A+" é par e positivo!");
	}
	else if (A % 2 ==0 && A < 0) {
		System.out.println ("O número "+A+" é par e negativo!");
	}
	else if (A % 2 != 0 && A >0) {
		System.out.println ("O numero "+A+" é ímpar e positivo!");
	}
	else if (A % 2 != 0 && A <0) {
		System.out.println ("O numero "+A+" é ímpar e negativo!");
	}
	
	
}


}
