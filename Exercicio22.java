package Logica;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		// 22) Faça um programa que receba o salário de um funcionário e exiba o valor
		// do seu bônus. Se o salário for maior que R$ 2000, o bônus é de 10%, caso
		// contrário, é de 5%.22) Faça um programa que receba o salário de um
		// funcionário e exiba o valor do seu bônus. Se o salário for maior que R$ 2000,
		// o bônus é de 10%, caso contrário, é de 5%.

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o salário do funcionário: R$ ");
		double salario = entrada.nextDouble();

		double taxaBonus;
		double bonus;

		if (salario > 2000) {
			taxaBonus = 0.1;
		} else {
			taxaBonus = 0.05;
		}

		bonus = salario * taxaBonus;

		System.out.printf("Valor do bônus: R$ %.2f\n", bonus);
		
		entrada.close();

	}

}
