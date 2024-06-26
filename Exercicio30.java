package Logica;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		// 30) Crie um programa que leia o número de maçãs compradas e exiba o valor
		// total a ser pago. O preço das maçãs é de R$ 0,50 cada se a quantidade for
		// menor que 12 e R$ 0,40 cada se a quantidade for igual ou maior que 12.

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o número de maçãs compradas: ");
		int quantidade = scanner.nextInt();

		double precoUnitario;

		if (quantidade < 12) {
			precoUnitario = 0.50;
		} else {
			precoUnitario = 0.40;
		}

		double valorTotal = quantidade * precoUnitario;

		System.out.println("Valor total a ser pago: R$" + valorTotal);

		scanner.close();

	}

}
