package Exercicios09_02;
import java.util.Scanner;
public class Doacao_Sangue {
public static void main (String [] args) {
	Scanner leia = new Scanner (System.in);
	String nome;
	int idade;
	boolean primeira_doacao;
	
	System.out.println ("Digite o nome do doador: ");
	nome = leia.next();
	System.out.println ("Digite a idade do doador: ");
	idade = leia.nextInt();
	System.out.println ("É a sua primeira doação? Responda com true ou false");
	primeira_doacao = leia.nextBoolean();
	
	if (idade >= 18 && idade <=59) {
		System.out.println (nome+" está apto a doar sangue!");
	}
	else if (primeira_doacao = true && idade >=60 && idade <=69) {
		System.out.println (nome+" não está apto a doar sangue");
	} else if (primeira_doacao = false) {
		System.out.println (nome+" está apto a doar sangue!");
	}
}
}
