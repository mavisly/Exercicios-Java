package Exercicios22_02;

public class TesteCurso {

	public static void main(String[] args) {
		Curso curso1 = new Curso ("Análise e Desenvolvimento de Sistemas","tecnológica","UNINASSAU",60,2);
		curso1.visualizar();
		
		System.out.println("\nAlteração na duração");
		curso1.setDuracao(4);
		curso1.visualizar();
		
		System.out.println("\nAlteração na turma");
		curso1.setTurma(59);
		curso1.visualizar();
	}

}
