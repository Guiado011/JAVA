package Logica;

import java.util.Scanner;

public class Exercicio85 {

	public static void main(String[] args) {
		// 85) Escreva um programa que leia 5 números inteiros e exiba o maior e o menor
		// valor digitado.

		Scanner entrada = new Scanner(System.in);

		
		int[] numeros = new int[5];

		// Leitura dos números
		System.out.println("Digite 5 números inteiros:");
		for (int i = 0; i < 5; i++) {
			numeros[i] = entrada.nextInt();
		}

		
		int maior = numeros[0];
		int menor = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
			} else if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}

		
		entrada.close();
		
		System.out.println("\nMaior valor: " + maior);
		System.out.println("Menor valor: " + menor);

	}

}
