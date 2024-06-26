package Logica;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		// 14) Escreva um programa que leia a idade de uma pessoa em anos, meses e dias,
		// e calcule quantos dias de vida ela tem.

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite sua idade em anos: ");
		int anos = entrada.nextInt();

		System.out.print("Digite sua idade em meses: ");
		int meses = entrada.nextInt();

		System.out.print("Digite sua idade em dias: ");
		int dias = entrada.nextInt();

		// Convertendo meses para dias
		int diasMeses = meses * 30;

		int idadeEmDias = anos * 365 + diasMeses + dias;

		System.out.printf("Você viveu um total de %d dias.\n", idadeEmDias);
		
		entrada.close();

	}

}
