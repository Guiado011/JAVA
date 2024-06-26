package Logica;

import java.util.Scanner;

public class Exercicio41 {

	public static void main(String[] args) {
		// 41) Crie um programa que leia um número inteiro positivo e exiba todos os
		// divisores desse número usando o loop "while".
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = sc.nextInt();

        if (numero <= 0) {
            System.out.println("Erro: O número deve ser positivo.");
            return;
        }

        int divisor = 1;

        while (divisor <= numero) {
            if (numero % divisor == 0) {
                System.out.println(divisor);
            }
            divisor++;
            
            sc.close();
	}

}
}
