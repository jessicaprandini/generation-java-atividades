package atividadesPoo;

import java.util.Scanner;

/* 6- Crie uma classe conta bancaria e apresente os atributos e 
 * métodos referentes esta classe, em seguida crie um objeto conta 
 * bancaria, defina as instancias deste objeto e apresente as 
 * informações deste objeto no console. */

public class Atividade6ContaBancMain {
	
	public static void main(String[] args) {
		Atividade6ContaBanc cont = new Atividade6ContaBanc();
		
		Scanner leia = new Scanner(System.in);
		
		cont.agencia = "Itaú";
		cont.dono = "Boris";
		cont.tipoConta = true;
		
		System.out.print("Informe-nos seu saldo atual: ");
		cont.saldo = leia.nextDouble();
		
		cont.depositar();
		
		cont.sacar();
		
		cont.limite = cont.saldo * 0.20;
		
		cont.checagemDeConta();
		leia.close();
	}

}