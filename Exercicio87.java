package Logica;

import java.util.Scanner;

public class Exercicio87 {

	public static void main(String[] args) {
		// 87) Faça um programa que leia 10 números inteiros e exiba quantos deles são positivos.
		
		Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int contadorPositivos = 0;

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] > 0) {
                contadorPositivos++;
            }
        }
        
        scanner.close();

        System.out.println("Quantidade de números positivos: " + contadorPositivos);

	}

}
