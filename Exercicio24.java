package Logica;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		// 24) Crie um programa que leia três números inteiros e exiba-os em ordem
		// crescente.

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		int numero1 = entrada.nextInt();

		System.out.print("Digite o segundo número: ");
		int numero2 = entrada.nextInt();

		System.out.print("Digite o terceiro número: ");
		int numero3 = entrada.nextInt();

		int menor, medio, maior;

		// Encontrar o menor número
		if (numero1 <= numero2 && numero1 <= numero3) {
			menor = numero1;
		} else if (numero2 <= numero1 && numero2 <= numero3) {
			menor = numero2;
		} else {
			menor = numero3;
		}

		// Encontrar o maior número
		if (numero1 >= numero2 && numero1 >= numero3) {
			maior = numero1;
		} else if (numero2 >= numero1 && numero2 >= numero3) {
			maior = numero2;
		} else {
			maior = numero3;
		}

		// Encontrar o número médio
		medio = (numero1 + numero2 + numero3) - menor - maior;

		System.out.printf("Números em ordem crescente: %d, %d, %d\n", menor, medio, maior);
		
		entrada.close();

	}

}
