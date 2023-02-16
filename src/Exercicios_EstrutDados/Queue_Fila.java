package Exercicios_EstrutDados;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Queue_Fila {
public static void main(String[] args) {
Scanner leia = new Scanner (System.in);
Queue<String> clientes = new LinkedList<String>();
String nome;
int op=0;


	do {
	System.out.println("1- Adicionar um novo cliente");
	System.out.println("2- Listar todos os clientes");
	System.out.println("3- Retirar uma pessoa da fila");
	System.out.println("0- Encerrar o programa");
	System.out.println("********************************");
	System.out.println("Escolha uma opção: ");
	op = leia.nextInt();

	switch (op) {
	case 1: 
		System.out.println("Insira o nome do cliente: ");
		nome = leia.next();
		System.out.println("Cliente adicionado!");
		clientes.add(nome);
		break;
	case 2: 
		System.out.println("Fila: "+clientes);
		break;
	case 3: 
		if (clientes.isEmpty()) {
			System.out.println("Fila vazia");
		}else 
		System.out.println(clientes.remove());
		System.out.println("Cliente chamado!");
		System.out.println(clientes);
}
}while (op != 0);
}
}
