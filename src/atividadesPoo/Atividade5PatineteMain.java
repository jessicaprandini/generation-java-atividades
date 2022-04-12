package atividadesPoo;

/* 5) Crie uma classe patinete e apresente os atributos e
 *  métodos referentes esta classe, em seguida crie um 
 *  objeto patinete, defina as instancias deste objeto e 
 *  apresente as informações deste objeto no console. */

public class Atividade5PatineteMain {
	
	public static void main(String[] args) {
		Atividade5Patinete pat = new Atividade5Patinete();
		
		pat.rodas = 2;
		pat.anoFab = 1992;
		pat.marca = "Prand";
		pat.estado = true;
		
		pat.informacoesPatinete();
		pat.andar();
	}
}