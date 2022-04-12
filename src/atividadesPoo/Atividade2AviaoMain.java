package atividadesPoo;

/* 2- Crie uma classe avião e apresente os atributos e métodos referentes a 
 * esta classe, em seguida crie um objeto avião, defina as instancias deste 
 * objeto e apresente as informações deste objeto no console.*/

public class Atividade2AviaoMain {
	
	public static void main(String[] args) {
		Atividade2Aviao aviao = new Atividade2Aviao();
		
		aviao.anosConstruido = 29;
		aviao.uso = "Civil";
		aviao.marca = "BOEING 777";
		aviao.atividade = true;
		aviao.manutencao = false;
		
		aviao.estadoAviao();
		}
	
}
