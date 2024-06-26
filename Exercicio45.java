package Logica;

public class Exercicio45 {

	public static void main(String[] args) {
		// 45) Faça um programa que exiba os primeiros 20 números da sequência de
		// Fibonacci usando o loop "while".

		int numeroLimite = 20;

		int anterior = 0;
		int atual = 1;

		int contador = 0;
		System.out.print( "Os primeiros 20 números da sequência de Fibonacci: \n");
		while (contador < numeroLimite) {
			System.out.print(anterior + " ");


			int proximo = anterior + atual;
			anterior = atual;
			atual = proximo;

			contador++;

		}

	}
}
