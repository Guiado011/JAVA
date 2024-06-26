package Logica;

import java.util.Scanner;

public class Exercicio91 {

	public static void main(String[] args) {
		// 91) Escreva um programa que leia 10 números inteiros e exiba a soma dos
		// valores positivos e a soma dos valores negativos.

		Scanner sc = new Scanner(System.in);

		int[] numeros = new int[10];
		int somaPositivos = 0;
		int somaNegativos = 0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			numeros[i] = sc.nextInt();
		}

		for (int numero : numeros) {
			if (numero > 0) {
				somaPositivos += numero;
			} else if (numero < 0) {
				somaNegativos += numero;
			}
		}

		sc.close();

		System.out.println("\nSoma dos números positivos: " + somaPositivos);
		System.out.println("Soma dos números negativos: " + somaNegativos);

	}

}
