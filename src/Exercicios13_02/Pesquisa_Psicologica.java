package Exercicios13_02;
import java.util.Scanner;
public class Pesquisa_Psicologica {
public static void main (String []args) {
	Scanner leia = new Scanner (System.in);
	int idade,genero,calme=0,mulherNervosa=0,homemAgressivo=0,nbCalme=0,nervoseMais40=0,calmeMenos18=0,estado;
	String maisUma="s";
	
	while (maisUma.equalsIgnoreCase("s")) {
		System.out.println ("Qual sua idade?");
		idade = leia.nextInt();
		System.out.println ("\nQual sua identificação de genero?");
		System.out.println ("1- Feminino");
		System.out.println ("2- Masculino");
		System.out.println ("3- Não-binário");
		genero = leia.nextInt();
		
		System.out.println ("Com qual das opções você mais se identifica?");
		System.out.println ("Considere: ");
		System.out.println ("1- Calme");
		System.out.println ("2- Nervose");
		System.out.println ("3- Agressive");
		estado = leia.nextInt();
		
		System.out.println ("Deseja inserir mais um registro?");
		System.out.println ("Considere S para SIM e N para NÃO");
		maisUma = leia.next();
		
		if (estado == 1) {
			calme++;
		}
		if (estado == 2 && genero == 1) {
			mulherNervosa++;
		}
		if (estado == 3 && genero == 2) {
			homemAgressivo++;
		}
		if (estado == 1 && genero == 3) {
			nbCalme++;
		}
		if (estado == 2 && idade >40) {
			nervoseMais40++;
		}
		if (estado == 1 && idade<18) {
			calmeMenos18++;
		}
	}
	System.out.println ("Total de pessoas calmas: "+calme);
	System.out.println ("Total de mulheres nervosas: "+mulherNervosa);
	System.out.println ("Total de homens agressivos: "+homemAgressivo);
	System.out.println ("Total de não-binaries calmes: "+nbCalme);
	System.out.println ("Total de pessoas nervosas com mais de 40 anos: "+nervoseMais40);
	System.out.println ("Total de pessoas calmas com menos 18 anos: "+calmeMenos18);
	
}
}

