package atividade2;

import java.util.Scanner;

public class LacosDeRepetiçoesIf1 {

	public static void main(String[] args) {
	
		int a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o número A: ");
	    a = leia.nextInt();
		
		System.out.println("\nDigite o número B: ");
		b = leia.nextInt();
		
		System.out.println("\nDigite o número C: ");
		c = leia.nextInt();
		
	
		if (a + b > c) {
	   
			System.out.println("\nA soma de A + B é maior do que C ");
		}else if(a + b < c) {
			System.out.println("\nA Soma de A + B é Menor do que C ");
		}else {
			System.out.println("\nA Soma de A + B é Igual a C ");
		}
		
		

	}

}
