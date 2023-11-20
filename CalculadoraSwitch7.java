package atividade2;

import java.util.Scanner;

public class CalculadoraSwitch7 {

	public static void main(String[] args) {
		
		float num1,num2;
		int op;
		 
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n entre com o primeiro numero: ");
		num1 = leia.nextFloat();
		System.out.println("\n entre com o segundo numero: ");
		num2 = leia.nextFloat();
		System.out.println("\n operaçao: ");
		
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão\n");
		op = leia.nextInt();
		
		switch(op) {
		case 1:
			System.out.println("\nresultasdo soma:" +(num1 + num2));
		break;
		
		case 2:
			System.out.println("\nresultado subtração:"+(num1 - num2));
		break;
		
		case 3:
			System.out.println("\nresultado multiplicação:"+(num1 * num2));
		break;
		case 4:
			System.out.println("\nresultado divisão:"+(num1 / num2));
		break;
		
		default:
			System.out.println("\nOpção Invalida!!");
			
			
		}

	}

}
