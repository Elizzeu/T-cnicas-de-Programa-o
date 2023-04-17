package Lista3;

import java.util.Arrays;
import java.util.Scanner;

public class quest20 {
	public static int[] diminuirVetor(int tamanho){
		   int[] vetor = new int[tamanho]; 
		   for(int i=0; i<tamanho; i++){
		      vetor[i] = i+1; 
		    
		   }
		   for(int i=tamanho-1; i>=1; i--){ 
		      int[] novoVetor = new int[i]; 
		      for(int j=0; j<i; j++){
		         novoVetor[j] = vetor[j]; 
		      }
		      vetor = novoVetor;
		      System.out.println(Arrays.toString(novoVetor));
		   }
		   
		   return vetor;
	}
	
	public static void main(String[] args) {
		Scanner valor = new Scanner (System.in);
		int tamanho = 0;
		
		System.out.println("Digite o tamanho desejado do vetor: ");
		tamanho = valor.nextInt();
		diminuirVetor(tamanho);
		
	}
		   
		   
		   
		   
		   
		      

}
