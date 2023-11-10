package atividade2;

import java.util.Scanner;

public class CargoSwitch6 {

	public static void main(String[] args) {
		
		String nome, cargo;
		int codigoCargo;
		float sal, reajusteSa, novoSal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nNome do colaborador: ");
	    nome = leia.nextLine();
		
		System.out.println("\nEntre com um numero inteiro de 1 a 6 para o Cargo: ");
		codigoCargo = leia.nextInt();
		
		System.out.println("\nSalário: ");
		sal = leia.nextFloat();
		
		
		
		
		switch (codigoCargo) {
		
		case 1:
			cargo = "gerente";
					reajusteSa = 0.10f;	
					novoSal = sal + (reajusteSa  * sal);
					System.out.printf("Nome do Colaborador: %s \nCargo: Gerente \nSalário: %.2f", cargo, novoSal);
			break;
		
		case 2:
			cargo = "Vendedor";
					reajusteSa = 0.07f;
					novoSal = sal + (reajusteSa  * sal);
					System.out.printf("Nome do Colaborador: %s \nCargo: Gerente \nSalário: %.2f", cargo, novoSal);
			break;
		
		case 3:
			cargo = "Supervisor";
					reajusteSa = 0.09f;
					novoSal = sal + (reajusteSa  * sal);
					System.out.printf("Nome do Colaborador: %s \nCargo: Gerente \nSalário: %.2f", cargo, novoSal);
			break;
		
		case 4:
			cargo = "Motorista";
					reajusteSa = 0.06f;
					novoSal = sal + (reajusteSa  * sal);
					System.out.printf("Nome do Colaborador: %s \nCargo: Gerente \nSalário: %.2f", cargo, novoSal);
			break;
		
		case 5:
			cargo = "Estoquista";
					reajusteSa = 0.05f;
					novoSal = sal + (reajusteSa  * sal);
					System.out.printf("Nome do Colaborador: %s \nCargo: Gerente \nSalário: %.2f", cargo, novoSal);
			break;
		
		case 6:
			cargo = "Técnico de TI";
					reajusteSa = 0.08f;
					novoSal = sal + (reajusteSa  * sal);
					System.out.printf("Nome do Colaborador: %s \nCargo: Gerente \nSalário: %.2f", cargo, novoSal);
			break;
			
			
					
		}
		
		
		
		
		
		

	}

}
