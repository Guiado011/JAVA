package Logica;

import java.util.Scanner;

public class Exercicio39 {

	public static void main(String[] args) {
		// 39) Faça um programa que leia 5 números inteiros usando o loop "while" e
		// exiba a média aritmética dos valores lidos.

		Scanner sc = new Scanner(System.in);
		int contador = 1;
		int soma = 0;

		while (contador <= 5) {
			System.out.print("Digite o " + contador + "º número: ");
			int numero = sc.nextInt();
			soma += numero;
			contador++;
		}

		double media = (double) soma / 5;
		System.out.println("Média: " + media);
		
		sc.close();

	}

}
