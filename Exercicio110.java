package Logica;

import java.util.Scanner;

public class Exercicio110 {

	public static void main(String[] args) {
		// 110) Crie um programa que leia duas matrizes 2x2 de números inteiros e exiba
		// a subtração entre elas.

		Scanner scanner = new Scanner(System.in);

		int[][] matriz1 = new int[2][2];
		System.out.println("Digite os elementos da primeira matriz 2x2:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matriz1[i][j] = scanner.nextInt();
			}
		}

		int[][] matriz2 = new int[2][2];
		System.out.println("Digite os elementos da segunda matriz 2x2:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matriz2[i][j] = scanner.nextInt();
			}
		}

		int[][] resultado = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				resultado[i][j] = matriz1[i][j] - matriz2[i][j];
			}
		}

		System.out.println("Resultado da subtração das matrizes:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(resultado[i][j] + " ");
			}
			System.out.println();
		}

		scanner.close();

	}

}
