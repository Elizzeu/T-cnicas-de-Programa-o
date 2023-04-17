package Lista3;

import java.util.Scanner;

public class quest8 {
	public static void elem( int Vetor[], int k) {
		Scanner valor = new Scanner (System.in);
		
		
		System.out.println("Digite os valores do primeiro Vetor: ");
		for (int i = 0; i < Vetor.length; i++) {
			System.out.print("indice "+i+": ");
			Vetor[i] = valor.nextInt();	
		}
		System.out.print("Digite o K: ");	
		k = valor.nextInt();
		
		maiorElem(Vetor, k);

}
		
		
	public static void maiorElem(int Vetor[], int k) {
		int maior = 0;
	
		for (int i = 0; i < Vetor.length; i++) {
			if(maior < Vetor[i])
				maior = Vetor[i];	
		}
		
		System.out.println("O maior elemento do vetor é: " + maior);
		System.out.println("K : " +k);
	}
	
	
	
	public static void main(String[] args) {
		int Vetor[] = new int[3];
		int k =0;
		elem(Vetor, k);
		
		
	}
	}
