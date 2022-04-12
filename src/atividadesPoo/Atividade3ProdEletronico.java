package atividadesPoo;

/* 3- Crie uma classe produto eletrônico e apresente os atributos 
 * e métodos referentes esta classe, em seguida crie um objeto 
 * produto eletrônico, defina as instancias deste objeto e apresente 
 * as informações deste objeto no console. */

public class Atividade3ProdEletronico {
	
	String nome;
	int anoFab;
	boolean porte, funcTom;
	double avaliacao;
	
	
	public void checarPorte() {
		if (porte = true) {
			System.out.println("Este produto é de grande porte.");
		}
		else {
			System.out.println("Este produto é de pequeno porte.");
		}
	}
	
	
	public void checarFuncionamento() {
		if(funcTom = true) {
			System.out.println("Este produto funciona fora da tomada.");
		}
		else {
			System.out.println("Este produto não funciona fora da tomada.");
		}
	}
	
	public void informacoesProd() {
		System.out.println("O produto é um: " + this.nome);
		System.out.println("Seu ano de fabricação é: " + this.anoFab);
		System.out.println("È um produto de grande porte? " + this.porte);
		System.out.println("Funciona fora da tomada? " + this.funcTom);
		System.out.println("Avaliação do produto pelos nossos clientes: " + this.avaliacao);
		
		if (avaliacao < 2.0) {
			System.out.println("Faremos o possível para melhorar a qualidade do produto!.");
		}
		else if (avaliacao > 2.0 && avaliacao <= 4.0){
			System.out.println("Produto de avaliação mediana.");
		}
		else {
			System.out.println("Produto de excelente avaliação pelos nossos clientes!");
		}
	}
	
}
