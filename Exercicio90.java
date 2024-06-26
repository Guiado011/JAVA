package Logica;

import java.util.Scanner;

public class Exercicio90 {

	public static void main(String[] args) {
		// 90)Faça um programa que leia 5 números inteiros e verifique se algum deles é
		// igual a zero.

		Scanner sc = new Scanner(System.in);

		int[] numeros = new int[5];
		boolean existeZero = false;

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			numeros[i] = sc.nextInt();
		}

		for (int numero : numeros) {
			if (numero == 0) {
				existeZero = true;
				break; // Sai do loop se encontrar um zero
			}
		}

		sc.close();

		System.out.println("\nExiste zero na lista? " + existeZero);

	}

}
