package Logica;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// 10) Faça um programa que leia um número inteiro e exiba a sua tabuada de
		// multiplicação até o décimo valor.

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int numero = entrada.nextInt();

		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			int resultado = numero * multiplicador;
			System.out.printf("%d x %d = %d\n", numero, multiplicador, resultado);
		}
		
		entrada.close();

	}

}
