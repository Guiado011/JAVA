package Logica;

import java.util.Scanner;

public class Exercicio63 {

	public static void main(String[] args) {
		// 63) Faça um programa que leia um número inteiro e exiba os seus dígitos
		// separadamente usando o loop "do-while".

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int numero = scanner.nextInt();

		System.out.println("Dígitos do número " + numero + ":");

		int resto;
		int temp = numero;

		do {
			resto = temp % 10; // Obtém o último dígito do número
			System.out.println(resto);
			temp /= 10; // Remove o último dígito do número
		} while (temp != 0);

		scanner.close();

	}

}
