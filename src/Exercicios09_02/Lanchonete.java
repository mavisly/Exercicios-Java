package Exercicios09_02;
import java.util.Scanner;
public class Lanchonete {
	public static void main(String[] args) {
Scanner leia = new Scanner (System.in);
	int op,quant,valor;
	System.out.println ("\nMenu da lanchonete:");
	System.out.println ("\n1- Cachorro Quente - R$10,00");
	System.out.println ("\n2- X Salada - R$15,00");
	System.out.println ("\n3- X Bacon - R$18,00");
	System.out.println ("\n4- Bauru - R$12,00");
	System.out.println ("\n5- Refrigerante - R$ 8,00");
	System.out.println ("\n6- Suco de laranja - R$13,00");
	System.out.println ("\nInsira o c�digo do seu lanche:");
	op = leia.nextInt();
	if (op <=0 || op >=7) {
		System.out.println ("Opera��o inv�lida.");
	}else {
	System.out.println ("\nQuantos v�o ser?");
	quant = leia.nextInt();
	
	switch (op) {
	case 1: 
		valor = quant * 10;
		System.out.println ("V�o ser "+quant+" cachorros quente, e vai custar R$"+valor);
	break;
	case 2:
		valor = quant *15;
		System.out.println ("V�o ser "+quant+" X Salada, e vai custar R$"+valor);
	break;	
	case 3: 
		valor = quant *18;
		System.out.println ("V�o ser "+quant+" X Bacon, e vai custar R$"+valor);
	break;	
	case 4: 
		valor = quant *12;
		System.out.println ("V�o ser "+quant+" baurus, e vai custar R$"+valor);
	break;	
	case 5:
		valor = quant * 8;
		System.out.println ("V�o ser "+quant+" refrigerantes, e vai custar R$"+valor);
	break;	
	case 6: 
		valor = quant * 13;
		System.out.println ("V�o ser "+quant+" sucos de laranja, e vai custar R$"+valor+".");
	break;	
	default : 
		System.out.println ("Escolha uma op��o v�lida!");

	}

	}
	}
}

