package Exercicios09_02;

import java.util.Scanner;

public class Carac_Animais {
public static void main (String []args) {
	Scanner leia = new Scanner (System.in);
	String word1,word2,word3;
	
	System.out.println ("Digite a primeira caracter�stica: ");
	word1 = leia.next();
	System.out.println ("Digite a segunda caracter�stica: ");
	word2 = leia.next();
	System.out.println ("Digite a terceira caracter�stica: ");
	word3 = leia.next();
	
	if (word1.equalsIgnoreCase("vertebrado")) {
		if (word2.equalsIgnoreCase("ave")) {
			if (word3.equalsIgnoreCase("carn�voro")) {
				System.out.println ("\n� uma �guia");
			}else {
			System.out.println ("\n� uma pomba");
		}
		} else if (word3.equalsIgnoreCase("on�voro")){
			System.out.println ("\n� um homem");
		}else {
			System.out.println ("\n� uma vaca");
		}
	}else if (word2.equalsIgnoreCase("inseto")) {
		if (word3.equalsIgnoreCase("hemat�grafo")) {
			System.out.println ("\n� uma pulga");
		}else {
			System.out.println ("\n� uma lagarta");
		}
	}else if (word3.equalsIgnoreCase("hemat�grafo")) {
		System.out.println ("\n� uma sanguessuga");
	}else {
		System.out.println ("\n� uma minhoca");
	}

}
}