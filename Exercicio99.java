package Logica;

import java.util.Scanner;

public class Exercicio99 {

	public static void main(String[] args) {
		// 99) Faça um programa que leia duas matrizes 2x2 de números inteiros e exiba a
		// soma das duas matrizes.

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite os números inteiros:");

		int[][] matriz1 = new int[2][2];
		int[][] matriz2 = new int[2][2];
		int[][] matrizSoma = new int[2][2];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matriz1[i][j] = scanner.nextInt();
			}
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matriz2[i][j] = scanner.nextInt();
			}
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(matrizSoma[i][j] + " ");
			}
			System.out.println();
		}

		scanner.close();

	}

}
