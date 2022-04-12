package lista2;

/*
 * 4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.
 */

import java.util.Scanner;

public class Atividade4 {

public static void main(String[] args) {
		
		int idade, sexo, opcao;
		int contPCalma = 0, contMNerv = 0, contHAgre = 0;
		int contOC = 0, contN40 = 0, contC18 = 0;
		int contInt = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a sua idade: ");
		idade = ler.nextInt();
		
		System.out.println("Digite qual seu sexo de acordo com as opções abaixo: ");
		System.out.print("(1 - Feminino | 2 - Masculino | 3 - Outro)  ");
		sexo = ler.nextInt();
		
		System.out.println("Qual é o seu temperamento? Escolha dentre as opções abaixo:");
		System.out.print("(1 - Calma | 2 - Nervosa | 3 - Agressiva)  ");
		opcao = ler.nextInt();
		
		if (opcao == 1) {
			contPCalma++;
		}
		if (sexo == 1 && opcao == 2) {
			contMNerv++;
		}
		if (sexo == 2 && opcao == 3) {
			contHAgre++;
		}
		if (sexo == 3 && opcao == 1) {
			contOC++;
		}
		if (idade > 40 && opcao == 2) {
			contN40++;
		}
		if (idade < 18 && opcao == 1) {
			contC18++;
		}
		contInt++;
		
		while (contInt < 150 && idade>=1 && sexo>=1 && sexo<=3 && opcao>=1 && opcao<=3) {
			
			System.out.println("Próxima pessoa a ser intrevistada!");
			System.out.print("Digite a sua idade: ");
			idade = ler.nextInt();
			
			System.out.println("Digite seu sexo de acordo com as opção abaixo: ");
			System.out.print("(1 - Feminino | 2 - Masculino | 3 - Outro)  ");
			sexo = ler.nextInt();
			
			System.out.println("Qual é o seu temperamento? Escolha dentre as opção abaixo:");
			System.out.print("(1 - Calma | 2 - Nervosa | 3 - Agressiva)  ");
			opcao = ler.nextInt();
			
			if (opcao == 1) {
				contPCalma++;
			}
			if (sexo == 1 && opcao == 2) {
				contMNerv++;
			}
			if (sexo == 2 && opcao == 3) {
				contHAgre++;
			}
			if (sexo == 3 && opcao == 1) {
				contOC++;
			}
			if (idade > 40 && opcao == 2) {
				contN40++;
			}
			if (idade < 18 && opcao == 1) {
				contC18++;
			}
			contInt++;
		}
		ler.close();
		System.out.println("O número de pessoas calmas é de: " + contPCalma);
		System.out.println("O número de mulheres nervosas é de: " + contMNerv);
		System.out.println("O número de homens agressivos é de: " + contHAgre);
		System.out.println("O número de pessoas calmas: " + contOC);
		System.out.println("O número de pessoas nervosas com mais de 40 anos é de: " + contN40);
		System.out.println("O número de pessoas calmas com menos de 18 anos é de: " + contC18);
	}

}