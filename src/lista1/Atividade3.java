package lista1;

import java.util.Scanner;


public class Atividade3 {
  public static void main(String args[]) 
 {
	  Scanner ler = new Scanner(System.in);
	  int idade;
	  
	  System.out.printf("Digite sua idade: \n");
	  idade = ler.nextInt();
	  
	  String categoria;
	  if (idade >=10 && idade <=14) {
		  categoria = "Infantil";
	  }
	  else if (idade >=15 && idade <=17) {
		  categoria = "Juvenil";
	  }
	  
	  else if (idade >=18 && idade <=25) {
		  categoria = "Adulto";
	  }
	  else {
		  categoria = "Categoria inválida";
	  }
	  
	  
	  
	  System.out.printf("Você se encontra na categoria: " + categoria);
 }
  
}