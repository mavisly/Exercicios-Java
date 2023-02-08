package Exercicios08_02;
import java.util.Scanner;
public class Custo_Carro {
public static void main (String[] args) {
  Scanner leia = new Scanner (System.in);
  double custo_fabrica, custo_final;
  
  System.out.println ("Qual o custo de fábrica?");
  custo_fabrica = leia.nextDouble();
  
  custo_final = custo_fabrica + (custo_fabrica * 0.28) + (custo_fabrica * 0.45);
  
  System.out.printf ("O custo ao consumidor vai ser de R$ %.2f",custo_final);
  
  
}
}
