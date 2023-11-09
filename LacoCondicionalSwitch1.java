package atividade2;

import java.util.Scanner;

public class LacoCondicionalSwitch1 {

	public static void main(String[] args) {
		
		
		int item = 0, quantidade;
		
		float preco = 0, valorTotal;
		
		String produto = null;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\t\tLanchonete da esquina");
		
		System.out.println("\n1- cachorro quente |R$ 10.00");
		
		System.out.println("\n2- X-salada        |R$ 15.00");
		
		System.out.println("\n3- X-Bacon         |R$ 18.00");
		
		System.out.println("\n4- Bauru           |R$ 12.00");
		
		System.out.println("\n5- Refrigerante    |R$ 8.00");
		
		System.out.print("\n6- Suco de laranja | R$ 13.00");
		
		System.out.print("\ndigite de 1 a 6:");
		item = leia.nextInt();
		
		System.out.print("\nQuantidade comprada:");
		quantidade = leia.nextInt();
		
		switch (item) {
		case 1:
			produto = "Cachorro Quente";
			preco = 10.00F;
			break;
		case 2:
			produto = "X-salada";
			preco = 15.00F;
			break;
		case 3:
			produto = "X-bacon";
			preco = 18.00F;
			break;
		case 4:
			produto = "Bauru";
			preco = 12.00F;
			break;
		case 5:
			produto = "Refrigerante";
			preco = 8.00F;
			break;
		case 6:
			produto = "Suco de laranja";
			preco = 13.00F;
			break;
		}
		
		valorTotal = preco * quantidade;
		
		System.out.println("\nProduto: " + produto);
		System.out.printf("Valor total: R$%.2f\n",valorTotal);
		

	}

}
