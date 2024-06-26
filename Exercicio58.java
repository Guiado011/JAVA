package Logica;

import java.util.Scanner;

public class Exercicio58 {

	public static void main(String[] args) {
		// 58) Escreva um programa que leia um número inteiro e exiba a sequência de
		// Fibonacci até o número lido usando o loop "do-while".

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int limite = scanner.nextInt();

		int numeroAnterior = 0;
		int numeroAtual = 1;

		System.out.println("Sequência de Fibonacci até " + limite + ":");

		if (limite >= 0) {
			System.out.print(numeroAnterior);
		}

		do {
			if (limite >= 0) {
				System.out.print(", " + numeroAtual);
			}
			int proximoNumero = numeroAnterior + numeroAtual;
			numeroAnterior = numeroAtual;
			numeroAtual = proximoNumero;
		} while (numeroAtual <= limite);

		scanner.close();
	}

}
