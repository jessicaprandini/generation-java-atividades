package atividadesPoo;

/* 7- Crie uma classe paciente e apresente os atributos e métodos 
 * referentes esta classe, em seguida crie um objeto paciente, 
 * defina as instancias deste objeto e apresente as informações 
 * deste objeto no console. */

public class Atividade7PacienteMain {
	
	public static void main(String[] args) {
		Atividade7Paciente pac = new Atividade7Paciente();
		
		pac.nome = "Boris";
		pac.doenca = "Leucemia";
		pac.sexo = false;
		pac.idade = 49;
		pac.peso = 70.00; 
		
		pac.checarSexo();
		
		pac.informacaoPaciente("Boris", "Leucemia", false, 49, 70.00);
	}

}