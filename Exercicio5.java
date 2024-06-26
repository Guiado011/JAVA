package Logica;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		/*
		 * 5) Escreva um programa que leia o preço de um produto e a quantidade
		 * comprada, e calcule o valor total a ser pago com desconto de 10% se a
		 * quantidade for maior que 10 unidades.
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o preço do produto: ");
		double preco = scanner.nextDouble();

		System.out.print("Digite a quantidade comprada: ");
		int quantidade = scanner.nextInt();

		if (quantidade > 10) {
			double valorTotal = preco * quantidade * 0.9;
			System.out.println("Total a ser pago com desconto de 10%: " + valorTotal);
		} else {
			double valorTotal = preco * quantidade;
			System.out.println("Total a ser pago: " + valorTotal);
		}

		scanner.close();

	}

}
