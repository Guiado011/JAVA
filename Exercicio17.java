package Logica;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// 17) Escreva um programa que leia a idade de uma pessoa e exiba uma mensagem
		// indicando se ela é criança, adolescente, adulto ou idoso.

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();

		if (idade < 0) {
			System.out.println("Idade inválida.");
		} else if (idade <= 12) {
			System.out.println("Você é criança.");
		} else if (idade <= 18) {
			System.out.println("Você é adolescente.");
		} else if (idade <= 65) {
			System.out.println("Você é adulto.");
		} else {
			System.out.println("Você é idoso.");
		}
		
		entrada.close();

	}

}
