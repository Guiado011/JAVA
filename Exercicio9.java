package Logica;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// 9) Crie um programa que leia o valor do depósito mensal em uma poupança e a
		// taxa de juros mensal, e calcule o montante após 12 meses.

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor do depósito mensal: ");
		double depositoMensal = entrada.nextDouble();

		System.out.print("Digite a taxa de juros mensal (em %): ");
		double taxaJurosMensal = entrada.nextDouble() / 100; // Converter porcentagem para decimal

		double montante = 0;

		for (int mes = 1; mes <= 12; mes++) {
			montante += depositoMensal;
			montante *= (1 + taxaJurosMensal);
		}

		System.out.printf("Montante após 12 meses: %.2f\n", montante);

		entrada.close();

	}

}
