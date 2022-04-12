package lista2;

/*
 * 6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
 */

import java.util.Scanner;

public class Atividade6 {

public static void main(String[] args) {
		
		int num, resto, soma = 0, cont = 0;
		double media;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.print("Digite um número: ");
			num = ler.nextInt();
			
			resto = num % 3;
			
			if (resto == 0 && num != 0) {
				soma += num;
				cont++;
			}
			media = soma/cont;
		} 
		while (num != 0);
		
		ler.close();
		System.out.println("Fim do programa, agora que você digitou o '0'! ");
		System.out.println("Mas, a média dos números inseridos que são múltiplos de 3 é: "
		+ media);
	}
}