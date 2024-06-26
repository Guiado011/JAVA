package Logica;

import java.util.Scanner;

public class Exercicio57 {

	public static void main(String[] args) {
		// 57) Faça um programa que leia um número inteiro e exiba se ele é um número
		// primo usando o loop "do-while".

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int numero = scanner.nextInt();

		boolean ehPrimo = true;
		int divisor = 2;

		do {
			if (numero % divisor == 0) {
				ehPrimo = false;
				break;
			}
			divisor++;
		} while (divisor <= numero / 2);

		if (ehPrimo) {
			System.out.println(numero + " é um número primo.");
		} else {
			System.out.println(numero + " não é um número primo.");
		}

		scanner.close();

	}

}
