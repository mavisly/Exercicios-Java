package Exercicios13_02;
public class Resto_5 {
	public static void main(String[] args) {
int x,multiplos=0;

for (x=1000;x<=1999;x++) {
	if (x % 11 == 5) {
		multiplos = x;
		System.out.println (multiplos+" é múltiplo de 11 com resto 5!");
	}
}
}
}
