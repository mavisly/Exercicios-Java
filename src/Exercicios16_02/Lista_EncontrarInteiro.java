package Exercicios16_02;
import java.util.ArrayList;
import java.util.Scanner;
public class Lista_EncontrarInteiro {
public static void main (String []args) {
	Scanner leia = new Scanner (System.in);
	ArrayList <Integer> inteiros = new ArrayList <Integer>();
	
	inteiros.add(2);
	inteiros.add(5);
	inteiros.add(1);
	inteiros.add(3);
	inteiros.add(4);
	inteiros.add(9);
	inteiros.add(7);
	inteiros.add(8);
	inteiros.add(10);
	inteiros.add(6);
	
	System.out.println("Insira um número: ");
	int num = leia.nextInt();
	
	 for(int x=0;x< inteiros.size();x++){
	        if (inteiros.contains(num)){
	        	System.out.println("\nA posição do número "+num+" é: "+ inteiros.indexOf(num));
	        	break;
	        }
	        else{
	            System.out.println("O número "+num+" não foi encontrado!");
	            break;
	        }
	    }
}
}
