package atividadesPoo;

/* 1- Crie uma classe cliente e apresente os atributos e métodos 
 * referentes esta classe, em seguida crie um objeto cliente, 
 * defina as instancias deste objeto e apresente as informações
 * deste objeto no console. */

public class Atividade1Cliente {

	boolean cadastro;
	String nome;
	int idade;
	double saldo;

	public void entrada() {
		if (cadastro == false) {
			System.out.println("Não há cadastro deste cliente, não pode entrar.");
		}
		else {
			System.out.println("Bem-vindo!");
		}
	}
	public void cadastrar() {
		this.cadastro = true;		
	}
	public void desistencia() {
		this.cadastro = false;
	}
	public void status() {
		System.out.println("Cliente é cadastrado? " + this.cadastro);
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Saldo do cliente: " + String.format("%.2f", this.saldo));
		
}
	
}
