package atividadeHeranca;

public class AtividadeZoo {
public static void main(String[] args) {
		
		AtividadeCachorro cachorro = new AtividadeCachorro();
		AtividadeCavalo cavalo = new AtividadeCavalo();
		AtividadePreguica preguica = new AtividadePreguica();
		
		System.out.println("Venham conhecer nossos animais, no Zoo! \n");
		
		cachorro.correr();
		cachorro.emitirSom();
		
		System.out.println("Esse é o cachorro! \n");
		
		cavalo.galopar();
		cavalo.emitirSom();
		
		System.out.println("Esse é o cavalo! \n");
		
		preguica.subirEmArvore();
		preguica.emitirSom();
		
		System.out.println("Esse é o bicho preguiça!");
	}

}
