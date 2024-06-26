package Logica;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		// 33) Crie um programa que leia o nome e o turno (M ou V) de um aluno e exiba
		// uma mensagem de saudação de acordo com o turno. Matutino: "Bom dia, aluno",
		// Vespertino: "Boa tarde, aluno".

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o nome do aluno: ");
		String nome = sc.nextLine();

		System.out.print("Digite o turno (M ou V): ");
		String turno = sc.nextLine().toUpperCase();

		String saudacao;

		if (turno.equals("M")) {
			saudacao = "Bom dia, ";
		} else if (turno.equals("V")) {
			saudacao = "Boa tarde, ";
		} else {
			saudacao = "Turno inválido. ";
		}

		System.out.println(saudacao + nome);
		
		sc.close();

	}

}
