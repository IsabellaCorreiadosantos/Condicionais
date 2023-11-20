package atividade2;

import java.util.Scanner;

public class ContaBancariaSwitch8 {

	public static void main(String[] args) {
		
		int op;
		float saldo = 1000,din;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n codigos de operação");
		System.out.println("\n 1 - saldo");
		System.out.println("\n 2 - saque");
		System.out.println("\n 3 - deposito");
		System.out.println("\n digite qual operação você deseja:");
		op = leia.nextInt();
		
		switch(op) {
		case 1:
			System.out.println("\nOperação - Saldo\n");
			System.out.println("\nSaldo" +saldo);
		break;
		
		case 2:
			System.out.println("\nOperação - Saque\n");
			System.out.println("insira o valor do saque que você deseja retirar: ");
			din = leia.nextFloat();
					
			if (din > saldo || din < 0) {
				System.out.println("Saldo insuficiente ou inválido!");
			} else {
				saldo -= din;
				System.out.println("Novo saldo: " + saldo);
			}
			
		break;
		
		case 3:
			System.out.println("\nOperação - deposito\n");
			System.out.println("insira o valor do deposito: ");
			din = leia.nextFloat();
			
			if(din < 0 ) {
				System.out.println("\nDeposito invalido");
			}else {
				saldo -= din;
				System.out.println("\nNovo Saldo"+ saldo);
			}
		break;

		default:
			System.out.println("\nOpção Invalida!!");
		
	 }

	}
	
}