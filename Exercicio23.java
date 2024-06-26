package Logica;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		// 23) Escreva um programa que leia o nome de um mês e exiba a quantidade de
		// dias que ele possui. Considere apenas meses válidos.

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o nome do mês (em maiúsculas): ");
		String mes = entrada.nextLine();

		int dias = 0;

		switch (mes) {
		case "JANEIRO":
		case "MARÇO":
		case "MAIO":
		case "JULHO":
		case "AGOSTO":
		case "OUTUBRO":
		case "DEZEMBRO":
			dias = 31;
			break;
		case "FEVEREIRO":
			dias = 28; // Ano bissexto não é considerado
			break;
		case "ABRIL":
		case "JUNHO":
		case "SETEMBRO":
		case "NOVEMBRO":
			dias = 30;
			break;
		default:
			System.out.println("Mês inválido.");
			break;
		}

		if (dias > 0) {
			System.out.printf("O mês %s possui %d dias.\n", mes, dias);
		}
		
		entrada.close();

	}

}
