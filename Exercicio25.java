package Logica;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		// 25) Faça um programa que leia o número de faltas de um aluno em uma
		// disciplina e exiba sua situação. Se o número de faltas for maior que 15, ele
		// é reprovado por falta.

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o número de faltas do aluno: ");
		int faltas = entrada.nextInt();

		String situacao;

		if (faltas > 15) {
			situacao = "Reprovado por faltas.";
		} else {
			situacao = "Aprovado.";
		}

		System.out.printf("Situação do aluno: %s\n", situacao);
		
		entrada.close();

	}

}
