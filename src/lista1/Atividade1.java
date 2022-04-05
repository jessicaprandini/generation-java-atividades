package lista1;

import java.util.Scanner;


public class Atividade1 {
  public static void main(String args[]) 
 {
	  Scanner ler = new Scanner(System.in);
	  int n1,n2,n3;
	  
	  System.out.printf("Digite o primeiro número: \n");
	  n1 = ler.nextInt();

	  System.out.printf("Digite o segundo número: \n");
	  n2 = ler.nextInt();
	  
	  System.out.printf("Digite o terceiro número: \n");
	  n3 = ler.nextInt();
	  
	  int maior; 
	  
	  if (n1>n2 && n1>n3) {
		  maior = n1;
	  }
	  else if (n2>n1 && n2>n3) {
		  maior = n2;
	  }
	  else {
		  maior = n3;
	  }
	  
	  System.out.printf("O maior número é: " + maior);
 }
  
}