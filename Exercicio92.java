package Logica;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio92 {

	public static void main(String[] args) {
		// 92) Crie um programa que leia 5 números inteiros e exiba-os em ordem
		// decrescente.

		Scanner scanner = new Scanner(System.in);
		Integer[] numeros = new Integer[5];

		System.out.println("Digite 5 números inteiros:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			numeros[i] = scanner.nextInt();
		}

		// Ordenação dos números em ordem decrescente
		Arrays.sort(numeros, Collections.reverseOrder());

		System.out.println("Números em ordem decrescente:");
		for (int numero : numeros) {
			System.out.print(numero + " ");
		}

		scanner.close();

	}

}
