package atividadesPoo;

/* 2- Crie uma classe avião e apresente os atributos e métodos referentes a 
 * esta classe, em seguida crie um objeto avião, defina as instancias deste 
 * objeto e apresente as informações deste objeto no console.*/

public class Atividade2Aviao {
	
		String uso, marca;
		boolean atividade, manutencao;
		int anosConstruido;
		
		public void voar() {
			System.out.println("Apertem os cintos, o avião irá decolar!");
		}
		
		public void pousar() {
			System.out.println("Dentro de instantes estaremos pousando, caros passageiros!");
		}
		public void disponibilidade() {
			if(atividade = true ) {
				System.out.println("Avião está ocupado em sua rota.");
			}
			else {
				System.out.println("Avião pronto para voar!");
			}
		}
		public void chamarTecnicos() {
			if (manutencao == true) {
				System.out.println("Não, a manutenção está em dia!");
			}
			else {
				System.out.println("Chamar, pois estamos precisando de manutenção.");
			}
		}
		public void desgastar() {
		}
		public void revitalizar() {
		}
		public void estadoAviao() {
			System.out.println("O avião foi construído há " + this.anosConstruido + " anos atrás");
			System.out.println("O avião é de uso " + this.uso);
			System.out.println("A marca do avião é: " + this.marca);
			System.out.println("Avião está voando no momento? " + this.atividade);
			System.out.println("O avião precisa de manutenção? " + this.manutencao);
		}
	
}
