package Exercicios10_02;
import java.util.Scanner;
public class Par_Impar {
public static void main (String[] args) {
	Scanner leia = new Scanner(System.in);
	int numero,cont_par=0,cont_impar=0,x;
	
	for (x=1;x<=10;x++) {
		System.out.println ("Digite o "+x+"º número: ");
		numero = leia.nextInt();
	if (numero % 2 == 0) {
		cont_par ++;
	}else {
	 cont_impar ++;
	}	
}
	System.out.println ("Total de números pares: "+cont_par);
	System.out.println ("Total de números pares: "+cont_impar);
}
}
