package Logica;

import java.util.Scanner;

public class Exercicio105 {

	public static void main(String[] args) {
		// 105) Faça um programa que leia uma matriz 4x4 de números inteiros e exiba a
		// soma dos elementos de cada coluna.

		Scanner scanner = new Scanner(System.in);

		int[][] matriz = new int[4][4];

		System.out.println("Digite os elementos da matriz 4x4:");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matriz[i][j] = scanner.nextInt();
			}
		}

		int[] somaColunas = new int[4];

		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 4; i++) {
				somaColunas[j] += matriz[i][j];
			}
		}

		System.out.println("Soma dos elementos de cada coluna:");
		for (int j = 0; j < 4; j++) {
			System.out.println("Coluna " + j + ": " + somaColunas[j]);
		}

		scanner.close();

	}

}
