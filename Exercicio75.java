package Logica;

public class Exercicio75 {

	public static void main(String[] args) {
		// 75) Faça um programa que exiba os primeiros 20 números da sequência de
		// Fibonacci.

		int n = 20;

		// Variáveis para os números de Fibonacci
		int anterior = 0;
		int atual = 1;

		// Loop for para gerar e exibir os números da sequência
		for (int i = 1; i <= n; i++) {
			System.out.print(anterior + " ");

			
			int proximo = anterior + atual;
			anterior = atual;
			atual = proximo;
		}

	}

}
