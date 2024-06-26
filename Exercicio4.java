package Logica;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * 4) Faça um programa que receba três notas de um aluno (cada nota de 0 a 10) e
		 * calcule a média ponderada considerando pesos 2, 3 e 5 para as notas,
		 * respectivamente.
		 */

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a nota 1 (0 a 10): ");
		double nota1 = entrada.nextDouble();

		System.out.print("Digite a nota 2 (0 a 10): ");
		double nota2 = entrada.nextDouble();

		System.out.print("Digite a nota 3 (0 a 10): ");
		double nota3 = entrada.nextDouble();

		double mediaPonderada = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;

		System.out.printf("Média ponderada: %.2f\n", mediaPonderada);

		entrada.close();

	}

}
