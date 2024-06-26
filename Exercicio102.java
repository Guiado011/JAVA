package Logica;

import java.util.Scanner;

public class Exercicio102 {

	public static void main(String[] args) {
		// 102) Faça um programa que leia duas matrizes 2x2 de números inteiros e exiba
		// o produto entre elas.

		Scanner scanner = new Scanner(System.in);

		int[][] matriz1 = new int[2][2];
		int[][] matriz2 = new int[2][2];
		int[][] produto = new int[2][2];

		System.out.println("Digite os elementos da primeira matriz 2x2:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matriz1[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Digite os elementos da segunda matriz 2x2:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matriz2[i][j] = scanner.nextInt();
			}
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				produto[i][j] = matriz1[i][0] * matriz2[0][j] + matriz1[i][1] * matriz2[1][j];
			}
		}

		System.out.println("O produto das duas matrizes 2x2 é:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(produto[i][j] + " ");
			}
			System.out.println();
		}

		scanner.close();

	}

}
