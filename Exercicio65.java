package Logica;

import java.util.Scanner;

public class Exercicio65 {

	public static void main(String[] args) {
		// 65) Crie um programa que leia o nome e a idade de várias pessoas usando o
		// loop "do-while" até que o nome "fim" seja informado. Ao final, exiba a média
		// das idades.

		Scanner scanner = new Scanner(System.in);

		int somaIdades = 0;
		int contador = 0;
		String nome;

		System.out.println("Digite o nome e a idade das pessoas (digite 'fim' para encerrar):");

		do {
			System.out.print("Nome: ");
			nome = scanner.next();

			if (!nome.equals("fim")) {
				System.out.print("Idade: ");
				int idade = scanner.nextInt();

				somaIdades += idade;
				contador++;
			}
		} while (!nome.equals("fim"));

		if (contador > 0) {
			double mediaIdades = (double) somaIdades / contador;
			System.out.println("A média das idades é: " + mediaIdades);
		} else {
			System.out.println("Nenhuma idade foi inserida.");
		}

		scanner.close();

	}

}
