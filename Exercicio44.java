package Logica;

import java.util.Scanner;

public class Exercicio44 {

	public static void main(String[] args) {
		// 44) Crie um programa que leia o nome e a idade de 5 pessoas usando o loop
		// "while" e exiba a média das idades.
		
		Scanner sc = new Scanner(System.in);

        int contador = 1;
        int somaIdade = 0;

        while (contador <= 5) {
            System.out.print("Digite o nome da " + contador + "ª pessoa: ");
            String nome = sc.nextLine();

            System.out.print("Digite a idade da " + contador + "ª pessoa: ");
            int idade = sc.nextInt();

            somaIdade += idade;
            contador++;

            // Limpar buffer do Scanner para evitar erros de leitura
            sc.nextLine();
        }

        double mediaIdade = (double) somaIdade / 5;
        System.out.println("\nMédia das idades: " + mediaIdade);
        
        sc.close();

	}

}
