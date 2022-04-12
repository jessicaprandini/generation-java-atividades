package atividadesPoo;

import java.util.Scanner;

/* 4- Crie uma classe funcionário e apresente os atributos e métodos 
 * referentes esta classe, em seguida crie um objeto funcionário, defina 
 * as instancias deste objeto e apresente as informações deste objeto 
 * no console. */

public class Atividade4FuncionarioMain {
	
	public static void main(String[] args) {
		Atividade4Funcionario func = new Atividade4Funcionario();
		
		Scanner leia = new Scanner(System.in);
		
		func.nome = "João";
		func.ocupacao = "Controle de qualidade";
		func.autorizacao = false;
		
		System.out.print("Quantos dias você já faltou esse mês: ");
		func.diasFaltas = leia.nextInt();
		
		func.informacoesFunc();
		leia.close();
	}

}