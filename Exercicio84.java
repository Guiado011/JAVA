package Logica;

import java.util.Scanner;

public class Exercicio84 {

	public static void main(String[] args) {
		// 84) Faça um programa que leia 5 números inteiros e exiba quantos deles são
		// pares.

		Scanner entrada = new Scanner(System.in);

		
		int[] numeros = new int[5];

		
		System.out.println("Digite 5 números inteiros:");
		for (int i = 0; i < 5; i++) {
			numeros[i] = entrada.nextInt();
		}

		
		int pares = 0;
		for (int numero : numeros) {
			if (numero % 2 == 0) {
				pares++;
			}
		}

		
		entrada.close();
		System.out.println("\nQuantidade de números pares: " + pares);

	}

}
