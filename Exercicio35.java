package Logica;

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {
		// 35) Escreva um programa que leia três números inteiros e exiba a média
		// aritmética. Se a média for maior ou igual a 7, exiba a mensagem "Aprovado",
		// caso contrário, exiba a mensagem "Reprovado".
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a nota 1: ");
		int nota1 = sc.nextInt();

		System.out.print("Digite a nota 2: ");
		int nota2 = sc.nextInt();

		System.out.print("Digite a nota 3: ");
		int nota3 = sc.nextInt();

		int media = (nota1 + nota2 + nota3) / 3;

		System.out.println("Média: " + media);

		String conceito;

		if (media >= 7) {
			conceito = "Aprovado";
		} else {
			conceito = "Reprovado";
		}

		System.out.println(conceito);

		sc.close();

	}

}
