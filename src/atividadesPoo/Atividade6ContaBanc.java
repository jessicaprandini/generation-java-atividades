package atividadesPoo;

import java.util.Scanner;

/* 6- Crie uma classe conta bancaria e apresente os atributos e 
 * métodos referentes esta classe, em seguida crie um objeto conta 
 * bancaria, defina as instancias deste objeto e apresente as 
 * informações deste objeto no console. */

public class Atividade6ContaBanc {
	
	String agencia, dono;
	boolean tipoConta;
	double saldo, limite;
	double d, s;
	
	Scanner leia = new Scanner(System.in);
	
	public void checaTipoConta() {
		if (tipoConta == true) {
			System.out.println("Conta corrente.");
		}
		else {
			System.out.println("Conta poupança.");
		}
	}
	
	public void sacar() {
		if (saldo <= 0) {
			System.out.println("Vai sacar o que, meu filho.");
		}
		else {
			System.out.println("Quanto você quer sacar: ");
			s = leia.nextDouble();
			saldo -= s;
			// saldo = saldo - n
		}
	}
	
	public void depositar() {
		System.out.println("Quanto você quer depositar: ");
		d = leia.nextDouble();
		saldo += d;
	}
	
	public void checagemDeConta() {
		System.out.println("A agência é: " + this.agencia);
		System.out.println("O dono da conta é: " + this.dono);
		System.out.println("O tipo da conta é corrente? " + this.tipoConta);
		System.out.println("Saldo da conta: " + String.format("%.3f", this.saldo));
		System.out.println("Limite diário: " + String.format("%.3f", this.limite));
	}
}