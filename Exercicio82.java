package Logica;

import java.util.Scanner;

public class Exercicio82 {

	public static void main(String[] args) {
		// 82) Escreva um programa que leia 10 números inteiros e exiba a soma deles.

		Scanner entrada = new Scanner(System.in);

		
		int[] numeros = new int[10];

		
		System.out.println("Digite 10 números inteiros:");
		for (int i = 0; i < 10; i++) {
			numeros[i] = entrada.nextInt();
		}

		
		int soma = 0;
		for (int numero : numeros) {
			soma += numero;
		}
		
		entrada.close();

		
		System.out.println("\nSoma dos números: " + soma);
		
		

	}

}
