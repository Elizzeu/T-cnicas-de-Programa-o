package Lista3;

import java.util.Scanner;

public class quest4 {
	
	public static int contarElemento(int[] vetor1, int[] vetor2, int elemento){
		   int contador = 0;
		   for(int i=0; i<vetor1.length; i++){
		      if(vetor1[i] == elemento){
		         contador++;
		      }
		   }
		   for(int i=0; i<vetor2.length; i++){
		      if(vetor2[i] == elemento){
		         contador++;
		      }
		   }
		   System.out.println(contador);
		   return contador;
		}
	
	public static void main(String[] args) {
	Scanner valor = new Scanner (System.in); 
	int Vetor1[] = {1, 3, 3, 2, 5};
	int Vetor2[] = {1, 2, 3, 2, 4};
	int elem = 0;
	
	System.out.print("Qual elemento de deja ser contado: ");
	elem = valor.nextInt();
	
	contarElemento(Vetor1, Vetor2, elem);
	
	
	}

}
