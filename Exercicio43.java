package Logica;

import java.util.Scanner;

public class Exercicio43 {

	public static void main(String[] args) {
		// 43) Escreva um programa que leia um número inteiro e exiba a sequência de
		// Fibonacci até o número lido usando o loop "while".
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int a = 0, b = 1;
        int fibonacci = 0;

        System.out.print("Sequência de Fibonacci: " + a);

        while (fibonacci <= numero) {
            System.out.print(", " + b);
            fibonacci = a + b;
            a = b;
            b = fibonacci;
        }

        System.out.println();

        scanner.close();
        
        

	}

}
