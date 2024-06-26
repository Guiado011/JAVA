package Logica;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		// 11) Escreva um programa que calcule a média aritmética entre três números
		// reais inseridos pelo usuário.

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		double numero1 = entrada.nextDouble();

		System.out.print("Digite o segundo número: ");
		double numero2 = entrada.nextDouble();

		System.out.print("Digite o terceiro número: ");
		double numero3 = entrada.nextDouble();

		double media = (numero1 + numero2 + numero3) / 3;

		System.out.printf("Média aritmética: %.2f\n", media);
		
	  entrada.close();

	}

}
