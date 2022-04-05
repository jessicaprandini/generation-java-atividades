package lista1;

import java.util.Scanner;


public class Atividade4 {
  public static void main(String args[]) 
 {
	  Scanner ler = new Scanner(System.in);
	  int numero;
	  
	  System.out.printf("Digite um número: \n");
	  numero = ler.nextInt();
	  Double resultado; 
	  
	  // se resultado da divisao for 0 o numero é par
	  if (numero % 2 == 0 ) {
	  resultado = Math.sqrt(numero);
	  
	  System.out.printf("O número " + numero + " é par e a raiz quadrada é: " + resultado); 
	  }
	  // se não é impar
	  else { 
		  resultado = (double) (numero*numero);
		  System.out.printf("O número " + numero + " é ímpar e a potencia é: " + resultado);   
	  }
	  
	 
 }
  
}