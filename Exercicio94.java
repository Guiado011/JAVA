package Logica;

import java.util.Scanner;

public class Exercicio94 {

	public static void main(String[] args) {
		// 94) Escreva um programa que leia 7 números inteiros e exiba apenas os números
		// pares.

		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[7];

		System.out.println("Digite 7 números inteiros:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			numeros[i] = scanner.nextInt();
		}

		System.out.println("Números pares:");
		for (int numero : numeros) {
			if (numero % 2 == 0) {
				System.out.print(numero + " ");
			}

			scanner.close();

		}
	}
}