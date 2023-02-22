package Exercicios22_02;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente ("Maria",20,"Rua Angelica",2003,"preto");
		
		cliente1.visualizar();
		
		System.out.println("\n Alteração na cor");
		cliente1.setCor_favorita("roxo");
		cliente1.visualizar();
		
		System.out.println("\n Alteração de endereço");
		cliente1.setEndereço("Rua Dr. Bento Teobaldo Ferraz");
		cliente1.visualizar();
		
	}

}
