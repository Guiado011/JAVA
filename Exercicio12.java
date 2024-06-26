package Logica;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		// 12) Crie um programa que leia o peso e a altura de uma pessoa e exiba o seu
		// Índice de Massa Corporal (IMC).

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite seu peso (em kg): ");
		double peso = entrada.nextDouble();

		System.out.print("Digite sua altura (em metros): ");
		double altura = entrada.nextDouble();

		double imc = peso / (altura * altura);

		System.out.printf("Seu IMC é: %.2f\n", imc);

		if (imc < 18.5) {
			System.out.println("Classificação: Abaixo do peso");
		} else if (imc < 25) {
			System.out.println("Classificação: Peso normal");
		} else if (imc < 30) {
			System.out.println("Classificação: Sobrepeso");
		} else {
			System.out.println("Classificação: Obesidade");
		}

		entrada.close();

	}

}
