package Logica;

public class Exercicio62 {

	public static void main(String[] args) {
		// 62) Crie um programa que exiba os números ímpares de 1 a 50 usando o loop
		// "do-while".

		int numero = 1;

		System.out.println("Números ímpares de 1 a 50:");

		do {
			if (numero % 2 != 0) {
				System.out.print(numero + " ");
			}
			numero++;
		} while (numero <= 50);

	}

}
