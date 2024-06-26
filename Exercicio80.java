package Logica;

import java.util.Scanner;

public class Exercicio80 {

	public static void main(String[] args) {
		// 79) Escreva um programa que calcule o fatorial de um número inteiro inserido
		// pelo usuário.

		Scanner entrada = new Scanner(System.in);

		
		System.out.print("Digite um número inteiro não negativo: ");
		int numero = entrada.nextInt();

		
		if (numero < 0) {
			System.out.println("Erro: Número inválido. O fatorial só pode ser calculado para números não negativos.");
			return;
		}

		
		long fatorial = 1; 
		for (int i = 1; i <= numero; i++) {
			fatorial *= i;
		}
		
		

		
		String resultadoFormatado = String.format("Fatorial de %d: %,d", numero, fatorial);

		entrada.close();
		
		System.out.println(resultadoFormatado);

	}

}
