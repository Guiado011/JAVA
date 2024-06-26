package Logica;

import java.util.Scanner;

public class Exercicio101 {

	public static void main(String[] args) {
		// 101) Crie um programa que leia uma matriz 4x4 de números inteiros e exiba a
		// média aritmética dos elementos.

		Scanner scanner = new Scanner(System.in);

		int[][] matriz = new int[4][4];

		System.out.println("Digite os elementos da matriz 4x4:");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matriz[i][j] = scanner.nextInt();
			}
		}

		int soma = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				soma += matriz[i][j];
			}
		}

		int numeroElementos = 4 * 4;
		double media = (double) soma / numeroElementos;

		System.out.println("A média aritmética dos elementos da matriz 4x4 é: " + media);

		scanner.close();

	}

}
