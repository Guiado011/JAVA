package Logica;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		// 34) Faça um programa que leia a idade de uma pessoa e exiba se ela pode ou
		// não votar. O voto é obrigatório para pessoas entre 18 e 70 anos, e
		// facultativo para pessoas entre 16 e 18 anos e com mais de 70 anos.

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a idade: ");
		int idade = sc.nextInt();

		String situacaoVoto;

		if (idade >= 18 && idade <= 70) {
			situacaoVoto = "Voto obrigatório";
		} else if (idade >= 16 && idade < 18 || idade > 70) {
			situacaoVoto = "Voto facultativo";
		} else {
			situacaoVoto = "Idade não permite votar";
		}

		System.out.println(situacaoVoto);
		
		sc.close();

	}

}
