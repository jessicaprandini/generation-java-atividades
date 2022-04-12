package lista1;

import java.util.Scanner;

		//3- Faça um programa que receba a idade de uma pessoa e 
        //mostre na saída em qual categoria ela se encontra: •	10-14 infantil; 15-17 juvenil; 18-25 adulto;

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
	  ler.close();
	  
	  
	  System.out.printf("Você se encontra na categoria: " + categoria);
 }
  
}