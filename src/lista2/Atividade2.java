package lista2;

/*
 * 2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */

import java.util.Scanner;


public class Atividade2 {
	public static void main(String[] args) {
		
		int num, restante, contarPar = 0, contarImpar = 0;
		
		
		Scanner ler = new Scanner(System.in);
		
		for (int n = 1; n <= 3; n++) {
			
			System.out.print("Digite um número: ");
			
			num = ler.nextInt();
			restante = num % 2;
					
			if (restante == 0) {
				contarPar++;
			}
			else {
				contarImpar++;
			}
		}
		ler.close();
		System.out.println("Quantidade de números pares: " + contarPar);
		System.out.println("Quantidade de números impares: " + contarImpar);
	}

}