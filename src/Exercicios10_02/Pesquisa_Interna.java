package Exercicios10_02;
import java.util.Scanner;
public class Pesquisa_Interna {
public static void main (String [] args) {
	Scanner leia = new Scanner (System.in);
	int idade, sexo, categoria,pessoas_back=0,mulheres_front=0,homem_mobile=0,mulheres_full=0;
	String continua="s";
	
	while (continua.equalsIgnoreCase("s")) {
	System.out.println ("Digite a idade: ");
	idade = leia.nextInt();
	System.out.println ("Digite o sexo: ");
	System.out.println ("1- Masculino");
	System.out.println ("2- Feminino");
	System.out.println ("3- Outros");
	sexo = leia.nextInt();
	System.out.println ("Digite a categoria: ");
	System.out.println ("1- Backend");
	System.out.println ("2- Frontend");
	System.out.println ("3- Mobile");
	System.out.println ("4- Fullstack");
	categoria = leia.nextInt();
	System.out.println ("Deseja continuar? Use S para SIM e N para NÃO");
	continua = leia.next();
	
	if (categoria == 1 ) {
		pessoas_back++;
	}
	if (categoria == 2 && sexo == 2) {
		mulheres_front++;
	}
	if (categoria == 3 && sexo == 1 && idade >40) {
		homem_mobile++;
	}
	if (categoria == 4 && sexo == 2 && idade < 30) {
		mulheres_full++;
	}
}
	System.out.println ("Total de pessoas desenvolvedoras Backend: "+pessoas_back);
	System.out.println ("Total de mulheres desenvolvedoras Frontend: "+mulheres_front);
	System.out.println ("Total de homens desenvolvedores Mobile maiores de 40 anos: "+homem_mobile);
	System.out.println ("Total de mulheres desenvolvedoras Fullstack menores de 30 anos: "+mulheres_full);
}
}
