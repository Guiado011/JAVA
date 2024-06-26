package Logica;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// 13) Faça um programa que leia dois números inteiros e verifique se o primeiro
		// é múltiplo do segundo.

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		int numero1 = entrada.nextInt();

		System.out.print("Digite o segundo número: ");
		int numero2 = entrada.nextInt();

		boolean Multiplo = numero1 % numero2 == 0;

		if (Multiplo) {
			System.out.printf("%d é múltiplo de %d\n", numero1, numero2);
		} else {
			System.out.printf("%d não é múltiplo de %d\n", numero1, numero2);
		}
		
		entrada.close();

	}

}
