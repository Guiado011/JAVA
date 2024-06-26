package Logica;

import java.util.Scanner;

public class Exercicio93 {

	public static void main(String[] args) {
		// 93) Faça um programa que leia 10 números inteiros e exiba quantos deles estão
		// no intervalo de 10 a 50.

		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[10];
		int contador = 0;

		System.out.println("Digite 10 números inteiros:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			numeros[i] = scanner.nextInt();
		}

		for (int numero : numeros) {
			if (numero >= 10 && numero <= 50) {
				contador++;
			}
		}

		scanner.close();

		System.out.println("Quantidade de números no intervalo de 10 a 50: " + contador);

	}

}
