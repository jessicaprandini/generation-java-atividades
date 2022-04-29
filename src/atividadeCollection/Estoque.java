package atividadeCollection;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/* 3 - Crie uma um programa para trabalhar com estoque de uma loja, 
 	o programa deverá trabalhar com Collection do tipo List do Java 
 	para manipular os dados desse estoque, o programa deverá atender 
 	as seguintes funcionalidades:
	Armazenar dados da List
	Remover dados da list;
	Atualizar dados da list.
	Apresentar todos os dados da list. */

public class Estoque {

	public static void main(String[] args) {
		String item1 = "Caderno";
		String item2 = "Lápis";
		String item3 = "Caneta";
		String item4 = "Estojo";
		int escolha;
		
		ArrayList<String> est = new ArrayList<>();
		
		est.add(item1);
		est.add(item2);
		est.add(item3);
		est.add(item4);
		
		System.out.println(est);
		
		System.out.println();
		est.remove(3);
		System.out.println(est);
		
		System.out.print("Deseja mudar algum item? Se sim, escolha um dos itens. Se não/Quando terminar, digite 4: ");
		
		Scanner leia = new Scanner(System.in);
		escolha = leia.nextInt();
		
		try {
			while (escolha != 4) {
				switch (escolha) {
				case 1:
					System.out.println("Qual o novo produto?");
					item1 = leia.next();
					System.out.println(est);
					System.out.print("Deseja mudar mais algum item? Se sim, escolha um dos itens. Se não/Quando terminar, digite 4: ");
					escolha = leia.nextInt();
					break;
				case 2:
					System.out.println("Qual o novo produto?");
					item2 = leia.next();
					System.out.println(est);
					System.out.print("Deseja mudar mais algum item? Se sim, escolha um dos itens. Se não/Quando terminar, digite 4: ");
					escolha = leia.nextInt();
					break;
				case 3:
					System.out.println("Qual o novo produto?");
					item3 = leia.next();
					System.out.println(est);
					System.out.print("Deseja mudar mais algum item? Se sim, escolha um dos itens. Se não/Quando terminar, digite 4: ");
					escolha = leia.nextInt();
					break;
				case 4:
					System.out.println("Entendido.");
					break;
				}
			}
		} catch (InputMismatchException erro) {
			System.out.println("Engraçadinho(a) você, hein?" + erro);
			System.out.println("Deseja mudar algum item? Se sim, escolha um dos itens. Se não/Quando terminar, digite 5.");
			escolha = leia.nextInt();
			leia.close();
		}
	}
}