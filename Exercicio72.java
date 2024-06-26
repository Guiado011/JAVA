package Logica;

import java.util.Scanner;

public class Exercicio72 {

	public static void main(String[] args) {
		// 72) Faça um programa que leia um número inteiro e exiba se ele é um número
		// primo.

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		int numero = scanner.nextInt();
		scanner.close();

		boolean primo = numero > 1;

		for (int i = 2; i <= Math.sqrt(numero) && primo; i++) {
			primo = numero % i != 0;
		}

		
		System.out.println(numero + (primo ? " é um número primo." : " não é um número primo."));

	}

}
