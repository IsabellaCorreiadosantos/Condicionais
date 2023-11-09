package atividade2;

import java.util.Scanner;

public class doarsangueLacosif3 {

	public static void main(String[] args) {
		
		
		String nome;
		int idade;
		boolean doou;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o Nome do doador: ");
	    nome = leia.nextLine();
		
		System.out.println("\nDigite a Idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("\nPrimeira doação de sangue?:(true ou false): ");
		doou = leia.nextBoolean();
		
		
		
		
		if (idade>=18 && idade <=69) {
			
		if ((idade>=60 && doou == false) || idade < 60) {
			System.out.println(nome+ " Está apto(a) para doar sangue. ");
		
		}else {
			System.out.print(nome + " Não está apto(a) a doar sangue.");
			
		}
		
		
		}else {
			System.out.print(nome + " Não está apto(a) a doar sangue!. ");
		}

	}

}
