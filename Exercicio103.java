package Logica;

import java.util.Scanner;

public class Exercicio103 {

	public static void main(String[] args) {
		// 103) Escreva um programa que leia uma matriz 3x3 de números inteiros e exiba
		// o menor valor presente na matriz.

		Scanner scanner = new Scanner(System.in);

		int[][] matriz = new int[3][3];

		System.out.println("Digite os elementos da matriz 3x3:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = scanner.nextInt();
			}
		}

		int menorValor = matriz[0][0];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (matriz[i][j] < menorValor) {
					menorValor = matriz[i][j];
				}
			}
		}

		System.out.println("O menor valor na matriz 3x3 é: " + menorValor);

		scanner.close();

	}

}
