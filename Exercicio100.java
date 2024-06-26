package Logica;

import java.util.Scanner;

public class Exercicio100 {

	public static void main(String[] args) {
		// 100) Escreva um programa que leia uma matriz 3x3 de números inteiros e exiba o maior valor presente na matriz.
		
         Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        int maiorValor = matriz[0][0];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                }
            }
        }
        
        System.out.println("O maior valor na matriz 3x3 é: " + maiorValor);
        
        scanner.close();

	}

}
