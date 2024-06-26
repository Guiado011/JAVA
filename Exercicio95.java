package Logica;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio95 {

	public static void main(String[] args) {
		// 95) Crie um programa que leia 5 nomes e exiba-os em ordem alfabética.

		Scanner sc = new Scanner(System.in);

		String[] nomes = new String[5];

		for (int i = 0; i < nomes.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º nome: ");
			nomes[i] = sc.nextLine();
		}

		// Ordenação alfabética
		Arrays.sort(nomes);

		System.out.println("\nNomes em ordem alfabética:");
		for (String nome : nomes) {
			System.out.println(nome);

		}

		sc.close();

	}
}
