package Logica;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// 3) Crie um programa que leia a base e a altura de um triângulo e calcule sua
		// área.

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor da base: ");
		double base = entrada.nextDouble();

		System.out.print("Digite o valor da altura: ");
		double altura = entrada.nextDouble();

		double area = (base * altura) / 2;

		System.out.printf("A área do triângulo é: %.2f\n", area);

		entrada.close();

	}

}
