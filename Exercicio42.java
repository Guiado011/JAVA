package Logica;

import java.util.Scanner;

public class Exercicio42 {

	public static void main(String[] args) {
		// 42) Faça um programa que leia um número inteiro e exiba se ele é um número
		// primo usando o loop "while".

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int numero = scanner.nextInt();

		boolean ehPrimo = true;
		if (numero <= 1) {
			ehPrimo = false;
		} else {
			int divisor = 2;
			while (divisor <= Math.sqrt(numero)) {
				if (numero % divisor == 0) {
					ehPrimo = false;
					break;
				}
				divisor++;
			}
		}

		if (ehPrimo) {
			System.out.println(numero + " é um número primo.");
		} else {
			System.out.println(numero + " não é um número primo.");
		}

		scanner.close();
		
		

	}

}
