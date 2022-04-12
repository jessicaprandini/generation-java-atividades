package lista2;

/* 5 - Crie um programa que leia um número do teclado até que 
 * encontre um número igual a zero. 
 * No final, mostre a soma dos números digitados.
 * (DO...WHILE) */

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		int numero, soma = 0;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.print("Digite um número: ");
			numero = ler.nextInt();
			soma += numero;
		} 
		while (numero != 0);
		
		ler.close();
		System.out.println("A soma dos números digitados é: " + soma);
	}
}
