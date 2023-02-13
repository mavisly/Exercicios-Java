package Exercicios13_02;
import java.util.Scanner;
public class Par_impar {
public static void main (String []args) {
	Scanner leia = new Scanner (System.in);
	int numero, x, par=0, impar=0;
	
	for (x=1;x<=10;x++) {
		System.out.println ("Insira um número: ");
		numero = leia.nextInt();
		if (numero % 2 ==0) {
			par++;
		}else {
			impar++;
		}
	}
	System.out.println ("Total de números pares: "+par);
	System.out.println ("Total de números ímpares: "+impar);
}
}
