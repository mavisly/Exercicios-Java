package Exercicios16_02;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Set_Encontrar {
public static void main(String[] args) {
Scanner leia = new Scanner (System.in);
Set <Integer> setInteiros = new HashSet<Integer>();

	setInteiros.add(2);
	setInteiros.add(5);
	setInteiros.add(1);
	setInteiros.add(3);
	setInteiros.add(4);
	setInteiros.add(9);
	setInteiros.add(7);
	setInteiros.add(8);
	setInteiros.add(10);
	setInteiros.add(6);

System.out.println("Insira um número: ");
int num = leia.nextInt();

 for(int x=0;x< setInteiros.size();x++){
        if (setInteiros.contains(num)){
        	System.out.println("\nO número "+num+" foi encontrado!"+ setInteiros.contains(num));
        	break;
        }
        else{
            System.out.println("O número "+num+" não foi encontrado!");
            break;
        }
    }

		
	
	}
}
