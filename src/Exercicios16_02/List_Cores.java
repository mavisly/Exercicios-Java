package Exercicios16_02;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class List_Cores {
public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	ArrayList<String> cores = new ArrayList<String>();
	
	for (int x = 0;x<5;x++) {
	System.out.println("Adicione uma cor: ");
    String cor = leia.next();
    cores.add(cor);
	}
    
	System.out.println("\nCores adicionadas: "+cores);
	
	Collections.sort(cores);
	
	System.out.println("\nCores adicionas em ordem crescente: "+cores);

	}
}
