package Logica;

import java.util.Scanner;

public class Exercicio89 {

	public static void main(String[] args) {
		// 89) Crie um programa que leia 10 números inteiros e exiba a quantidade de
		// números positivos e a quantidade de números negativos.

		Scanner sc = new Scanner(System.in);

		int[] numeros = new int[10];
		int positivos = 0;
		int negativos = 0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			numeros[i] = sc.nextInt();
		}

		for (int numero : numeros) {
			if (numero > 0) {
				positivos++;
			} else if (numero < 0) {
				negativos++;
			}
		}

		sc.close();

		System.out.println("\nQuantidade de números positivos: " + positivos);
		System.out.println("Quantidade de números negativos: " + negativos);
	}

}
