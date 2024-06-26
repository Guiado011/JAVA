package Logica;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// 6) Crie um programa que leia um número inteiro e exiba se ele é par ou ímpar.

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int numero = scanner.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O número " + numero + " é par.");
		} else {
			System.out.println("O número " + numero + " é ímpar.");
		}

		scanner.close();

	}

}
