package Exercicios22_02;

public class TesteCurso {

	public static void main(String[] args) {
		Curso curso1 = new Curso ("An�lise e Desenvolvimento de Sistemas","tecnol�gica","UNINASSAU",60,2);
		curso1.visualizar();
		
		System.out.println("\nAltera��o na dura��o");
		curso1.setDuracao(4);
		curso1.visualizar();
		
		System.out.println("\nAltera��o na turma");
		curso1.setTurma(59);
		curso1.visualizar();
	}

}
