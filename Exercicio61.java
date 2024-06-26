package Logica;

import java.util.Scanner;

public class Exercicio61 {

	public static void main(String[] args) {
		// 61) Escreva um programa que leia um número inteiro e exiba a soma de todos os
		// números pares entre 1 e o número lido usando o loop "do-while".

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int numero = scanner.nextInt();

		int somaPares = 0;
		int contador = 2; // Começamos a verificar os números pares a partir do 2

		System.out.println("Soma dos números pares até " + numero + ":");

		do {
			somaPares += contador;
			contador += 2; // Incrementamos de 2 em 2 para garantir que estamos apenas somando números
							// pares
		} while (contador <= numero);

		System.out.println("A soma dos números pares entre 1 e " + numero + " é: " + somaPares);

		scanner.close();

	}

}
