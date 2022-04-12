package atividadesPoo;

/* 4- Crie uma classe funcionário e apresente os atributos e métodos 
 * referentes esta classe, em seguida crie um objeto funcionário, defina 
 * as instancias deste objeto e apresente as informações deste objeto 
 * no console. */

public class Atividade4Funcionario {
	
	String nome, ocupacao;
	boolean autorizacao;
	int diasFaltas;
	
	public void informacoesFunc() {
		System.out.println("Nome do funcionário: " + this.nome);
		
		System.out.println("Ocupação do funcionário: " + this.ocupacao);
		System.out.print("Tem autorização para estar nessa sala?");
		

		if (autorizacao == false) {
			System.out.println("Não, você não tem autorização para estar aqui.");
		}
		
		System.out.print("Quantidade de dias que faltou ao trabalho: " + this.diasFaltas);
		
		if (diasFaltas >= 4) {
			System.out.println(" , infelizmente, se continuar assim, você será demitido");
		}
		else if (diasFaltas > 0 && diasFaltas < 4) {
			System.out.println(" , número aceitável mas tente comparecer mais ao trabalho!");
		}
		else {
			System.out.println(" , sem faltas!");
		}
	}
	
}
