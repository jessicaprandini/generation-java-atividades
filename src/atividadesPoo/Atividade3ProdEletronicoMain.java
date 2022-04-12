package atividadesPoo;

/* 3- Crie uma classe produto eletrônico e apresente os atributos 
 * e métodos referentes esta classe, em seguida crie um objeto 
 * produto eletrônico, defina as instancias deste objeto e apresente 
 * as informações deste objeto no console. */

public class Atividade3ProdEletronicoMain {
	
	public static void main(String[] args) {
		Atividade3ProdEletronico prod = new Atividade3ProdEletronico();
		
		prod.nome = "Celular Galaxy S21";
		prod.anoFab = 2022;
		prod.porte = false;
		prod.funcTom = true;
		prod.avaliacao = 4.8;
		
		prod.informacoesProd();
	}
	
}
