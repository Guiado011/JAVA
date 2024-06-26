package Logica;

import java.util.Scanner;

public class Exercicio88 {

	public static void main(String[] args) {
		// 88) Escreva um programa que leia 5 números inteiros e calcule a média dos
		// valores pares e a média dos valores ímpares.

		Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int somaPares = 0, qtdPares = 0;
        int somaImpares = 0, qtdImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                somaPares += numero;
                qtdPares++;
            } else {
                somaImpares += numero;
                qtdImpares++;
            }
        }
        
        sc.close();

        double mediaPares = (qtdPares > 0) ? (double) somaPares / qtdPares : 0;
        double mediaImpares = (qtdImpares > 0) ? (double) somaImpares / qtdImpares : 0;

        System.out.println("\nMédia dos pares: " + mediaPares);
        System.out.println("Média dos ímpares: " + mediaImpares);
	}

}
