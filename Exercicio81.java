package Logica;

import java.util.Scanner;

public class Exercicio81 {

	public static void main(String[] args) {
		// 81) Faça um programa que leia 5 números inteiros e exiba-os na ordem inversa
		// em que foram digitados.

		Scanner entrada = new Scanner(System.in);

		
		int[] numeros = new int[5];

		
		System.out.println("Digite 5 números inteiros:");
		for (int i = 0; i < 5; i++) {
			numeros[i] = entrada.nextInt();
		}

		
		System.out.println("\nNúmeros na ordem inversa:");
		for (int i = 4; i >= 0; i--) {
			System.out.print(numeros[i] + " ");
		}
		
		entrada.close();
	}

}
