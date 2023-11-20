package atividade2;

import java.util.Scanner;

public class ImparParIf2 {

	public static void main(String[] args) {

		int numeroDigitado;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número inteiro: ");
		numeroDigitado = leia.nextInt();

		if (numeroDigitado % 2 == 0) {
			//% resto da divisão == verdadeiro verdadeiro
			if (numeroDigitado > 0) {
				System.out.println("O número é " + numeroDigitado + " é par e positivo ");
			} else {
				System.out.println("O número é " + numeroDigitado + " é par e negativo ");
			}
		} else {
			if (numeroDigitado > 0) {
				System.out.println("O número é " + numeroDigitado + " é impar e positivo ");
			} else {
				System.out.println("O número é " + numeroDigitado + " é impar e negativo ");
			}
		}
	}
}
