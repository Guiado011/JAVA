package Logica;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		// 27) Crie um programa que leia a idade de uma pessoa e seu sexo (M ou F) e
		// exiba uma mensagem indicando se ela pode ou não se aposentar. Homens podem se
		// aposentar com 65 anos ou mais, e mulheres com 60 anos ou mais.

		Scanner scanner = new Scanner(System.in);

		// Solicita ao usuário a idade e o sexo
		System.out.print("Digite a idade: ");
		int idade = scanner.nextInt();
		System.out.print("Digite o sexo (M ou F): ");
		char sexo = scanner.next().charAt(0);

		
		if ((sexo == 'M' && idade >= 65) || (sexo == 'F' && idade >= 60)) {
			System.out.println("Você pode se aposentar.");
		} else {
			System.out.println("Você ainda não pode se aposentar.");
		}
		
		scanner.close();

	}

}
