package Exercicios22_02;

public class TestaFarmacia {

	public static void main(String[] args) {
		Farmacia remedio1 = new Farmacia ("Medley",10,4,"analg�sico","oral");
		remedio1.visualizar();
		
		System.out.println("\nAltera��o de administra��o e posologia");
		remedio1.setAdministracao("sublingual");
		remedio1.setPosologia(2);
		remedio1.visualizar();

	}

}
