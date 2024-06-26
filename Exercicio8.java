package Logica;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		// 8) Escreva um programa que leia dois números inteiros e troque os seus
		// valores, ou seja, o primeiro deve ficar com o valor do segundo e vice-versa.

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		int numero1 = entrada.nextInt();

		System.out.print("Digite o segundo número: ");
		int numero2 = entrada.nextInt();

		
		int teste = numero1;

		numero1 = numero2;

		numero2 = teste;

		System.out.printf("Primeiro número após troca: %d\n", numero1);
		System.out.printf("Segundo número após troca: %d\n", numero2);
		
		entrada.close();

	}

}
