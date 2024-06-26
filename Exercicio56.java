package Logica;

import java.util.Scanner;

public class Exercicio56 {

	public static void main(String[] args) {
		// 56) Crie um programa que leia um número inteiro positivo e exiba todos os
		// divisores desse número usando o loop "do-while".

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número inteiro positivo: ");
		int numero = scanner.nextInt();

		if (numero <= 0) {
			System.out.println("O número deve ser um inteiro positivo.");
		} else {
			int divisor = 1;

			System.out.println("Divisores de " + numero + ":");

			do {
				if (numero % divisor == 0) {
					System.out.println(divisor);
				}
				divisor++;
			} while (divisor <= numero);
		}

		scanner.close();

	}

}
