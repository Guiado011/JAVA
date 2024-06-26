package Logica;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		// 26) Escreva um programa que leia o código de um produto e a quantidade
		// comprada, e exiba o valor total a ser pago. Considere que cada produto tem um
		// preço diferente.

		Scanner scanner = new Scanner(System.in);

		double precoProdutoA = 10.0;
		double precoProdutoB = 15.0;
		double precoProdutoC = 20.0;

		System.out.print("Digite o código do produto: ");
		String codigoProduto = scanner.nextLine();

		System.out.print("Digite a quantidade comprada: ");
		int quantidade = scanner.nextInt();

		double valorTotal = 0;
		switch (codigoProduto) {
		case "A":
			valorTotal = precoProdutoA * quantidade;
			break;
		case "B":
			valorTotal = precoProdutoB * quantidade;
			break;
		case "C":
			valorTotal = precoProdutoC * quantidade;
			break;
		default:
			System.out.println("Código de produto inválido.");
			
		}

		System.out.println("Valor total a ser pago: R$ " + valorTotal);
		
		scanner.close();

	}

}
