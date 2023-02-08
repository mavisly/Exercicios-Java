package Exercicios08_02;
import java.util.Scanner;
public class Distancia_pontos {
public static void main (String[] args) {
  Scanner leia = new Scanner (System.in);
  double x1,x2,y1,y2,D;
  
  System.out.println ("Digite o valor de x1: ");
  x1 = leia.nextDouble();
  System.out.println ("Digite o valor de x2: ");	
  x2 = leia.nextDouble();
  System.out.println ("Digite o valor de y1: ");
  y1 = leia.nextDouble();
  System.out.println ("Digite o valor de y2: ");
  y2 = leia.nextDouble();
  
  D = Math.sqrt((Math.pow(x2, 2) - (2*x2*x1) + Math.pow(x1, 2)) + (Math.pow(y2, 2) - (2*y2*y1) + Math.pow(y1, 2)));
  
  System.out.printf ("O resultado da equação é: %.2f",D);
}
}