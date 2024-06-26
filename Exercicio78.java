package Logica;

import java.util.Scanner;

public class Exercicio78 {

	public static void main(String[] args) {
		// 78) Faça um programa que leia um número inteiro e exiba os seus dígitos separadamente.
		
		Scanner entrada = new Scanner(System.in);

        // Leitura do número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        // Extraindo os dígitos
        int digito;
        while (numero > 0) {
            digito = numero % 10; // Extrai o dígito menos significativo
            System.out.print(digito + " "); // Exibe o dígito extraído
            numero /= 10; // Remove o dígito extraído do número
        }
        
        entrada.close();

	}

}
