package Logica;

import java.util.Scanner;

public class Exercicio59 {

	public static void main(String[] args) {
		// 59) Crie um programa que leia o nome e a idade de 5 pessoas usando o loop
		// "do-while" e exiba a média das idades.

		Scanner scanner = new Scanner(System.in);

		int somaIdades = 0;
		int contador = 0;

		do {
			System.out.print("Digite o nome da pessoa " + (contador + 1) + ": ");
			String nome = scanner.next();

			System.out.print("Digite a idade de " + nome + ": ");
			int idade = scanner.nextInt();

			somaIdades += idade;
			contador++;
		} while (contador < 5);

		double mediaIdades = (double) somaIdades / contador;
		System.out.println("A média das idades é: " + mediaIdades);

		scanner.close();

	}

}
