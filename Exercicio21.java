package Logica;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		// 21) Crie um programa que leia a idade de um grupo de pessoas e exiba quantas
		// são menores de idade e quantas são maiores de idade.
		
		Scanner entrada = new Scanner(System.in);

        int idadeMaiorIdade = 18;
        int contadorMenor = 0;
        int contadorMaior = 0;

        System.out.print("Digite quantas pessoas serão analisadas: ");
        int quantidadePessoas = entrada.nextInt();

        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.printf("Digite a idade da %dª pessoa: ", i);
            int idade = entrada.nextInt();

            if (idade < idadeMaiorIdade) {
                contadorMenor++;
            } else {
                contadorMaior++;
            }
        }

        System.out.printf("\n%d pessoas são menores de idade.\n", contadorMenor);
        System.out.printf("%d pessoas são maiores de idade.\n", contadorMaior);
        
        entrada.close();
    }
	
	
		

	}


