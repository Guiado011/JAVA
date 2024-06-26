package Logica;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// 15) Crie um programa que leia o salário de um funcionário e calcule o novo
		// salário com um aumento de 15%.

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite seu salário atual: ");
		double salarioAtual = entrada.nextDouble();

		double valorAumento = salarioAtual * 0.15;
		double novoSalario = salarioAtual + valorAumento;

		System.out.printf("Seu novo salário com 15%% de aumento é: R$%.2f\n", novoSalario);	
		entrada.close();

	}

}
