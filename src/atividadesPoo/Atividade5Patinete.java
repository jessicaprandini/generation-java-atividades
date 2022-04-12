package atividadesPoo;

/* 5) Crie uma classe patinete e apresente os atributos e
 *  métodos referentes esta classe, em seguida crie um 
 *  objeto patinete, defina as instancias deste objeto e 
 *  apresente as informações deste objeto no console. */

public class Atividade5Patinete {
	
	int rodas, anoFab;
	String marca;
	boolean estado;
	
	public void quebrar() {
		System.out.println("Patinete Quebrado");
	}
	
	public void consertar() {
	}
	
	public void andar() {
		if (estado == false) {
			System.out.println("Precisa arrumar!");
		}
		else {
			System.out.println("Está em boas condições de uso!");
		}
	}
	
	public void informacoesPatinete() {
		System.out.println("O patinete tem " + this.rodas + " rodas.");
		
		if (rodas == 2) {
			System.out.println("Show né!");
		}
		System.out.println("O patinete foi fabricado no ano de: " + this.anoFab);
		System.out.println("É da marca: " + this.marca);
		System.out.println("O patinete está em boas condições? " + this.estado);
		
		if (estado == false) {
			System.out.println("Deve consertar ele antes de usar.");
		}
		else {
			System.out.println("Pode brincar a vontade!");
		}
	}
}