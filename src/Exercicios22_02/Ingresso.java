package Exercicios22_02;

public class Ingresso {
	private String evento;
	private int data;
	private String artista;
	private String tipo;
	private int horario;
	public Ingresso(String evento, int data, String artista, String tipo, int horario) {
		this.evento = evento;
		this.data = data;
		this.artista = artista;
		this.tipo = tipo;
		this.horario = horario;
	}
	public String getEvento() {
		return evento;
	}
	public void setEvento(String evento) {
		this.evento = evento;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getHorario() {
		return horario;
	}
	public void setHorario(int horario) {
		this.horario = horario;
	}
	
	public void visualizar() {
		System.out.println("Este ingresso é referente a "+evento+ " do artista "+artista+"!");
		System.out.println("O evento em questão vai ser realizado no dia "+data+", às "+horario+"h.");
		System.out.println("Este ingresso é "+tipo+" e intransferível.");
	}
	
}
