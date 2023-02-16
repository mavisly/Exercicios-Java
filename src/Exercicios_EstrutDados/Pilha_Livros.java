package Exercicios_EstrutDados;
import java.util.Scanner;
import java.util.Stack;
public class Pilha_Livros {
public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	Stack<String> livros = new Stack<String>();
	String nome;
	int op=0;


		do {
		System.out.println("1- Adicionar um novo livro");
		System.out.println("2- Listar todos os livros");
		System.out.println("3- Retirar um livro");
		System.out.println("0- Encerrar o programa");
		System.out.println("********************************");
		System.out.println("Escolha uma opção: ");
		op = leia.nextInt();

		switch (op) {
		case 1: 
			System.out.println("Insira o nome do livro: ");
			nome = leia.next();
			livros.push(nome);
			System.out.println("Livro adicionado!");
			
			break;
		case 2: 
			System.out.println("Fila: "+livros);
			break;
		case 3: 
			if (livros.isEmpty()) {
				System.out.println("Fila vazia");
			}else 
			System.out.println(livros.pop());
			System.out.println("Livro retirado!");
			System.out.println(livros);
	}
	}while (op != 0);
	}
}
