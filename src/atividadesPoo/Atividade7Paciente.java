package atividadesPoo;

/* 7- Crie uma classe paciente e apresente os atributos e métodos 
 * referentes esta classe, em seguida crie um objeto paciente, 
 * defina as instancias deste objeto e apresente as informações 
 * deste objeto no console. */

public class Atividade7Paciente {
	
	String nome, doenca;
	boolean sexo;
	int idade;
	double peso;
	
	public void checarSexo() {
		if (sexo == true) {
			System.out.println("O paciente é do sexo feminino.");
		}
		else {
			System.out.println("O paciente é do sexo masculino.");

		}
	}
	
	public void informacaoPaciente(String  nome, String doenca, boolean sexo, int idade, double peso) {
		System.out.println("Nome do paciente: " + this.nome);
		System.out.println("Motivo da consulta: " + this.doenca);
		System.out.println("O paciente é mulher? " + this.sexo);
		System.out.println("A idade do paciente: " + this.idade);
		System.out.println("Peso do paciente: " + String.format("%.2f", this.peso));
	}
}
