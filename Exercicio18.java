package Logica;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		// 18) Crie um programa que leia dois números inteiros e exiba o maior deles.

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		int numero1 = entrada.nextInt();

		System.out.print("Digite o segundo número: ");
		int numero2 = entrada.nextInt();

		int maior;

		if (numero1 > numero2) {
			maior = numero1;
		} else {
			maior = numero2;
		}

		System.out.printf("O maior número é: %d\n", maior);
		
		entrada.close();

	}

}
