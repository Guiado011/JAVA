package Logica;

import java.util.Scanner;

public class Exercicio83 {

	public static void main(String[] args) {

		// 83) Crie um programa que leia 7 números inteiros e exiba a média aritmética
		// dos valores lidos.

		Scanner entrada = new Scanner(System.in);

		int[] numeros = new int[7];

		System.out.println("Digite 7 números inteiros:");
		for (int i = 0; i < 7; i++) {
			numeros[i] = entrada.nextInt();
		}

		double soma = 0;
		for (int numero : numeros) {
			soma += numero;
		}
		double media = soma / numeros.length;

		entrada.close();

		System.out.printf("\nMédia aritmética: %.2f", media);

	}

}
