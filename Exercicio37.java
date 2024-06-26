package Logica;

public class Exercicio37 {

	public static void main(String[] args) {
		// 37) Escreva um programa que calcule a soma dos números de 1 a 100 usando o
		// loop "while".
		
		int soma = 0;
        int numero = 1;

        while (numero <= 100) {
            soma += numero;
            numero++;
        }

        System.out.println("Soma: " + soma);

	}

}
