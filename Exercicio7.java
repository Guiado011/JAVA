package Logica;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// 7) Faça um programa que receba o salário base de um funcionárioe calcule o
		// seu salário líquido, considerando que o funcionário recebe 5% de comissão
		// sobre o salário base.

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o salário base do funcionário: ");
		double salarioBase = scanner.nextDouble();

		double comissao = salarioBase * 0.05;

		double salarioLiquido = salarioBase + comissao;

		System.out.println("O salário líquido do funcionário é: " + salarioLiquido);

		scanner.close();

	}

}
