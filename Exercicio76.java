package Logica;

import java.util.Scanner;

public class Exercicio76 {

	public static void main(String[] args) {
		// 76) Escreva um programa que leia um número inteiro e exiba a soma de todos os
		// números pares entre 1 e o número lido.

		Scanner entrada = new Scanner(System.in);

		// Leitura do número limite
		System.out.print("Digite um número inteiro: ");
		int limite = entrada.nextInt();

		
		int somaPares = 0;

		
		for (int i = 1; i <= limite; i++) {
			if (i % 2 == 0) { 
				somaPares += i; 
			}
		}

		entrada.close();

		
		System.out.println("Soma dos números pares entre 1 e " + limite + ": " + somaPares);

	}

}
