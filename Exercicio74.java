package Logica;

import java.util.Scanner;

public class Exercicio74 {

	public static void main(String[] args) {
		// 74) Crie um programa que leia o nome e a idade de 5 pessoas e exiba a média
		// das idades.

		Scanner entrada = new Scanner(System.in);

		
		String[] nomes = new String[5];
		int[] idades = new int[5];

		
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
			nomes[i] = entrada.nextLine();

			System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
			idades[i] = entrada.nextInt();

			entrada.nextLine(); // Consumir quebra de linha
		}

		int somaIdade = 0;
		for (int idade : idades) {
			somaIdade += idade;
		}

		double mediaIdadeDouble = (double) somaIdade / idades.length;
																		
		int mediaIdadeArredondada = (int) Math.round(mediaIdadeDouble); 

		entrada.close();
		
		System.out.println("\nMédia de idade: " + mediaIdadeArredondada);
	}

}
