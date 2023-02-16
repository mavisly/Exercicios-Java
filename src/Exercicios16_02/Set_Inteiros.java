package Exercicios16_02;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
public class Set_Inteiros {
public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	Set<Integer> setInteiros = new HashSet<Integer>();
	
	for (int x = 0;x<10;x++) {
		System.out.println("Adicione um número: ");
	    Integer num = leia.nextInt();
	    setInteiros.add(num);
		}
	
	System.out.println("\n\nListar todos os Elementos com o Iterator");
	
	Iterator<Integer> iNumeros = setInteiros.iterator();
	while(iNumeros.hasNext()) {
		System.out.println(iNumeros.next());
	}

	}
}
