package Exercicios10_02;
import java.util.Scanner;
public class Multiplos {

	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	int n1, n2,x, multiplos=0;
	
	System.out.println ("Informe o primeiro n�mero: ");
	n1 = leia.nextInt();
	System.out.println ("Informe o segundo n�mero: ");
	n2 = leia.nextInt();
	if (n2 <= n1) {
		System.out.println ("Intervalo inv�lido!");
	}else 
	
	System.out.println ("No intervalo entre "+n1+ " e "+n2+":");
	for (x=n1;x<=n2;x++) {
		if (x % 3 == 0 && x % 5 == 0) {
			multiplos = x;
		System.out.println (multiplos+" � m�ltiplo de 3 e 5");
	
	
		}
	}
	
	}

}
