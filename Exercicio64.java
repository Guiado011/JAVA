package Logica;

import java.util.Scanner;

public class Exercicio64 {

	public static void main(String[] args) {
		// 64) Escreva um programa que calcule o fatorial de um número inteiro inserido
		// pelo usuário usando o loop "do-while".64) Escreva um programa que calcule o
		// fatorial de um número inteiro inserido pelo usuário usando o loop "do-while".

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int numero = scanner.nextInt();

		int fatorial = 1;
		int contador = 1;

		System.out.println("O fatorial de " + numero + " é:");

		do {
			fatorial *= contador;
			contador++;
		} while (contador <= numero);

		System.out.println(fatorial);

		scanner.close();

	}

}
