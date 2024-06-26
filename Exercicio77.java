package Logica;

public class Exercicio77 {

	public static void main(String[] args) {
		// 77) Crie um programa que exiba os números ímpares de 50 a 1.

		int limiteInferior = 50;

		int limiteSuperior = 1;

		for (int i = limiteInferior; i >= limiteSuperior; i--) {

			if (i % 2 != 0) {
				System.out.print(i + " "); // Exibe o número ímpar
			}

		}

	}
}
