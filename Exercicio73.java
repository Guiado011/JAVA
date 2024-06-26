package Logica;

import java.util.Scanner;

public class Exercicio73 {

	public static void main(String[] args) {
		// 73) Escreva um programa que leia um número inteiro e exiba a sequência de
		// Fibonacci até o número lido.

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int n = entrada.nextInt();

		System.out.println("Sequência de Fibonacci:");

		int anterior = 0;
		int atual = 1;

		for (int i = 1; i <= n; i++) {
			System.out.print(anterior + " ");

			int proximo = anterior + atual;
			anterior = atual;
			atual = proximo;
		}

		entrada.close();

	}

}
