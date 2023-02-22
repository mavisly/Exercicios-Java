package Exercicios22_02;

public class TesteIngresso {

	public static void main(String[] args) {
		Ingresso entrada = new Ingresso ("Turne Pirata",01,"Jão","meia-entrada",18);
		entrada.visualizar();
		
		System.out.println("\nNova data");
		entrada.setData(15);
		entrada.visualizar();
		
		System.out.println("\nNovo Evento");
		entrada.setEvento("Turne Lobos");
		entrada.visualizar();

	}

}
