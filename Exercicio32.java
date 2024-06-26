package Logica;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		// 32) Escreva um programa que leia a nota de um aluno em uma prova e exiba a
		// sua conceituação conforme a tabela de notas.

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a nota do aluno: ");
		double nota = sc.nextDouble();

		String conceito;

		if (nota >= 9.0) {
			conceito = "A";
		} else if (nota >= 7.5) {
			conceito = "B";
		} else if (nota >= 6.0) {
			conceito = "C";
		} else if (nota >= 4.0) {
			conceito = "D";
		} else {
			conceito = "E";
		}

		System.out.println("Conceito: " + conceito);
		
		sc.close();

	}

}
