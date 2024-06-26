package Logica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		// 19) Faça um programa que receba três notas de um aluno e exiba se ele foi
		// aprovado ou reprovado. A média para aprovação é 7.

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Ensira a 1 nota");
		float nota1 = sc.nextFloat();

		System.out.println("Ensira a 2 nota");
		float nota2 = sc.nextFloat();

		System.out.println("Ensira a 3 nota");
		float nota3 = sc.nextFloat();

		System.out.println("Ensira a 4 nota");
		float nota4 = sc.nextFloat();

		float soma = nota1 + nota2 + nota3 + nota4;

		float media = soma / 4;

		sc.close();

		if (media >= 6) {
			System.out.println("Voce passou!" + media);
		}

		else if (media >= 5) {
			System.out.println("Voce esta de Recuperação" + media);
		}

		else {
			System.out.println("Voce foi Reprovado!" + media);
		}

	}

}
