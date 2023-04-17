package Lista3;

import java.util.Scanner;

public class quest9 {
	
	public static void elem( int Vetor[], int k) {
		Scanner valor = new Scanner (System.in);
		
		
		System.out.println("Digite os valores do primeiro Vetor: ");
		for (int i = 0; i < Vetor.length; i++) {
			System.out.print("indice "+i+": ");
			Vetor[i] = valor.nextInt();	
		}
		System.out.print("Digite o K: ");	
		k = valor.nextInt();
		
		menorElem(Vetor, k);

}
		
		
	public static void menorElem(int Vetor[], int k) {
		int menor = 0;
	
		for (int i = 0; i < Vetor.length; i++) {
			if(menor > Vetor[i] )
				menor = Vetor[i];	
		}
		
		System.out.println("O menor elemento do vetor é: " + menor);
		System.out.println("K : " +k);
	}
	
	
	
	public static void main(String[] args) {
		int Vetor[] = new int[3];
		int k =0;
		elem(Vetor, k);
		
		
	}

}
