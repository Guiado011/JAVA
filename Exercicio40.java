package Logica;

import java.util.Scanner;

public class Exercicio40 {

	public static void main(String[] args) {
		// 40) Escreva um programa que leia um número inteiro e exiba a tabuada desse
		// número até o décimo valor usando o loop "while".
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        int multiplicador = 1;

        while (multiplicador <= 10) {
            int resultado = numero * multiplicador;
            System.out.println(numero + " x " + multiplicador + " = " + resultado);
            multiplicador++;
        }
        
        sc.close();

	}

}
