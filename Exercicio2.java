package Logica;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// 2) Escreva um programa que leia o raio de um círculo e calcule sua área e
		// perímetro.

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o valor do raio: ");
		double raio = scanner.nextDouble();

		double area = Math.PI * Math.pow(raio, 2);
		double perimetro = 2 * Math.PI * raio;

		System.out.printf("A área do círculo é: %.2f\n", area);
		System.out.printf("O perímetro do círculo é: %.2f\n", perimetro);

		scanner.close();
	}

}
