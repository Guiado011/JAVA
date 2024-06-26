package Logica;

import java.util.Scanner;

public class Exercicio98 {

	public static void main(String[] args) {
		// 98) Crie um programa que leia uma matriz 3x3 de números inteiros e exiba a
		// soma dos elementos da diagonal principal.

		Scanner scanner = new Scanner(System.in);
		int[][] matriz = new int[3][3];

		System.out.println("Digite os elementos da matriz 3x3:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = scanner.nextInt();
			}
		}

		int somaDiagonalPrincipal = 0;
		for (int i = 0; i < 3; i++) {
			somaDiagonalPrincipal += matriz[i][i];
		}

		System.out.println("A soma dos elementos da diagonal principal da matriz 3x3 é: " + somaDiagonalPrincipal);

		scanner.close();

	}

}
