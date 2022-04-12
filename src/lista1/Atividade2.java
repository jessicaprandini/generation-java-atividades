package lista1;

import java.util.Arrays;
import java.util.Scanner;

    // 2- Faça um programa que entre com três números e coloque em ordem crescente.

public class Atividade2 {
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
	  
	  int[] valores = {n1, n2, n3};

	  // n1 é maior que n2
	  if (n1>n2) {
		  // e n1 é maior que n3
		  if (n1 > n3) {
			// e n1 é maior que n2 e n1 é maior que n3 e n2 maior que o n3 => n3, n2, n1
			  if(n2 > n3) {
				  valores[0] = n3;
				  valores[1] = n2;
				  valores[2] = n1;
			  }
			// e n1 é maior que n2 e n1 é maior que n3 mas o n2 menor que o n3 => n2, n3, n1
			  else {
				  valores[0] = n2;
				  valores[1] = n3;
				  valores[2] = n1;
			  }
		  }
		// e n1 maior que n2 e menor que n3  => n2, n1, n3
		  else {
			  valores[0] = n2;
			  valores[1] = n1;
			  valores[2] = n3;
		  }
	  }
	  // n1 é menor que n2
	  else {
		  if (n2 > n3) { 	//n1 menor que n2 e n3 menor que n2  => n1, n3, n2
			  valores[0] = n1;
			  valores[1] = n3;
			  valores[2] = n2;
		  }
			 
		 else { // n1 menor que n2 e n2 menor que n3  => n1, n2, n3
				  valores[0] = n1;
				  valores[1] = n2;
				  valores[2] = n3;
			  }
	  }
	  System.out.printf("Valores em ordem crescente: " + Arrays.toString(valores));
	  ler.close();
 }
}