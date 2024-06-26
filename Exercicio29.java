package Logica;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		// 29) Escreva um programa que leia o nome e a nota de um aluno e exiba sua
		// situação na disciplina. Se a nota for maior ou igual a 7, o aluno está
		// aprovado. Caso contrário, está em recuperação.

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o nome do aluno: ");
		String nomeAluno = scanner.nextLine();
		System.out.print("Digite a nota do aluno: ");
		double notaAluno = scanner.nextDouble();

		if (notaAluno >= 7.0) {
			System.out.println("O aluno " + nomeAluno + " está aprovado.");
		} else {
			System.out.println("O aluno " + nomeAluno + " está em recuperação.");
		}
		
		scanner.close();

	}

}
