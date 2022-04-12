package lista2;

/*
 * 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
 */

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args)
	{
		int idade, total21 = 0, total50 = 0;
		
	
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		idade = ler.nextInt();
		
		while (idade != 99) {
			if (idade < 21 && idade >= 0) {
				total21++;
			}
			else if (idade >= 50) {
				total50++;
			}
			System.out.print("Digite outra idade: ");
			idade = ler.nextInt();
		}
		ler.close();
		System.out.println("Total de pessoas com menos de 21 anos: " + total21);
		System.out.println("Total de pessoas com mais de 50 anos: " + total50);
		

	}

}