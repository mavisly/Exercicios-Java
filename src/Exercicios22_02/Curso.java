package Exercicios22_02;

public class Curso {
	private String nome;
	private String area;
	private String instituicao;
	private int turma;
	private int duracao;
	public Curso(String nome, String area, String instituicao, int turma, int duracao) {
		this.nome = nome;
		this.area = area;
		this.instituicao = instituicao;
		this.turma = turma;
		this.duracao = duracao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	public int getTurma() {
		return turma;
	}
	public void setTurma(int turma) {
		this.turma = turma;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public void visualizar() {
		System.out.println("Parab�ns! Voc� acaba de se matricular no curso "+nome+", na institui��o "+instituicao+".");
		System.out.println("Este curso faz parte da ar�a "+area+" e tem dura��o de "+duracao+" anos.");
		System.out.println("Suas aulas ir�o come�ar no m�s que vem na turma "+turma+"!");
	}
}
