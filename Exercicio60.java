package Logica;

public class Exercicio60 {

	public static void main(String[] args) {
		// 60) Faça um programa que exiba os primeiros 20 números da sequência de
		// Fibonacci usando o loop "do-while".

		int limite = 20; // Definindo o limite para os primeiros 20 números da sequência de Fibonacci

		int numeroAnterior = 0;
		int numeroAtual = 1;
		int contador = 0;

		System.out.println("Primeiros 20 números da sequência de Fibonacci:");

		do {
			System.out.print(numeroAnterior + " ");
			int proximoNumero = numeroAnterior + numeroAtual;
			numeroAnterior = numeroAtual;
			numeroAtual = proximoNumero;
			contador++;
		} while (contador < limite);
	}

}
