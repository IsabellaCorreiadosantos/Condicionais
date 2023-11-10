package atividade2;

import java.util.Scanner;

public class ImparParIf2 {

	public static void main(String[] args) {

		int n1;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número inteiro: ");
		n1 = leia.nextInt();

		if (n1 % 2 == 0) {
			if (n1 > 0) {
				System.out.println("O número é " + n1 + " é par e positivo ");
			} else {
				System.out.println("O número é " + n1 + " é par e negativo ");
			}
		} else {
			if (n1 > 0) {
				System.out.println("O número é " + n1 + " é impar e positivo ");
			} else {
				System.out.println("O número é " + n1 + " é impar e negativo ");
			}
		}

	}

}
