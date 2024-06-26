package Logica;

import java.util.Scanner;

public class Exercicio69 {

	public static void main(String[] args) {
		// 69) Faça um programa que leia 5 números inteiros e exiba a média aritmética
		// dos valores lidos.

		Scanner scanner = new Scanner(System.in);

		int soma = 0;

		System.out.println("Digite 5 números inteiros:");

		for (int i = 1; i <= 5; i++) {
			System.out.print("Número " + i + ": ");
			int numero = scanner.nextInt();
			soma += numero;
		}

		double media = (double) soma / 5;

		System.out.println("A média aritmética dos valores lidos é: " + media);

		scanner.close();

	}

}
