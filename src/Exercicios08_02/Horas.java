package Exercicios08_02;

import java.util.Scanner;

public class Horas {
public static void main (String[] args) {
	Scanner leia = new Scanner (System.in);
	int segundos, minutos, horas, horas_completa;
	
	System.out.println ("Quantos segundos durou o evento?");
	segundos = leia.nextInt();
	
	horas = (segundos / 3600) % 24;
	minutos = (segundos / 60) % 60;
	
	System.out.printf("O evento durou %02dh:%02dmin  ", horas, minutos );
	
	
}
}
