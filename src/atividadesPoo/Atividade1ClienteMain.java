package atividadesPoo;

/* 1- Crie uma classe cliente e apresente os atributos e métodos 
 * referentes esta classe, em seguida crie um objeto cliente, 
 * defina as instancias deste objeto e apresente as informações
 * deste objeto no console. */

public class Atividade1ClienteMain {

	public static void main(String[] args) {
		
		Atividade1Cliente cliente = new Atividade1Cliente();
		
		cliente.cadastro = true;
		cliente.nome = "Jéssica Garcia Prandini";
		cliente.idade = 30;
		cliente.saldo = 3.000;
		
		cliente.status();
		cliente.entrada();
	}
	
}
