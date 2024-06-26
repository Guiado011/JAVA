package Logica;

import java.util.Scanner;

public class Exercicio109 {

	public static void main(String[] args) {
		// 109) Escreva um programa que leia uma matriz 3x3 de números inteiros e
		// verifique se ela é uma matriz identidade.

		Scanner scanner = new Scanner(System.in);

		int[][] matriz = new int[3][3];

		System.out.println("Digite os elementos da matriz 3x3:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = scanner.nextInt();
			}
		}

		boolean ehIdentidade = true;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j && matriz[i][j] != 1) {
					ehIdentidade = false;
					break;
				} else if (i != j && matriz[i][j] != 0) {
					ehIdentidade = false;
					break;
				}
			}
			if (!ehIdentidade) {
				break;
			}
		}

		if (ehIdentidade) {
			System.out.println("A matriz é uma matriz identidade.");
		} else {
			System.out.println("A matriz não é uma matriz identidade.");
		}

		scanner.close();

	}

}
