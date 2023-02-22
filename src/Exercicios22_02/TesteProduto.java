package Exercicios22_02;

public class TesteProduto {

	public static void main(String[] args) {
		Produto videogame1 = new Produto ("Nintendo Wii",1600,512,"Black Edition","preta");
		videogame1.visualizar();
		
		System.out.println ("\nAlterar console");
		videogame1.setConsole ("Xbox");
		videogame1.setPreco (4200);
		videogame1.setMemoria(1000);
		videogame1.setEdicao("Series X");
		videogame1.visualizar();
	}

}
