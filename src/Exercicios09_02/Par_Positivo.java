package Exercicios09_02;
import java.util.Scanner;
public class Par_Positivo {
public static void main (String [] args) {
	Scanner leia = new Scanner (System.in);
	int A;
	
	System.out.println ("Digite um n�mero: ");
	A = leia.nextInt();
									
	if (A % 2 ==0 && A > 0) {
		System.out.println ("O n�mero "+A+" � par e positivo!");
	}
	else if (A % 2 ==0 && A < 0) {
		System.out.println ("O n�mero "+A+" � par e negativo!");
	}
	else if (A % 2 != 0 && A >0) {
		System.out.println ("O numero "+A+" � �mpar e positivo!");
	}
	else if (A % 2 != 0 && A <0) {
		System.out.println ("O numero "+A+" � �mpar e negativo!");
	}
	
	
}


}
