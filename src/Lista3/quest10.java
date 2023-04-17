package Lista3;

import java.util.Scanner;

public class quest10 {

	public static void elem( float Vetor1[], float Vetor2[]) {
		Scanner valor = new Scanner (System.in);
		
		
		System.out.println("Digite os valores do primeiro Vetor: ");
		for (int i = 0; i < Vetor1.length; i++) {
			System.out.print("indice "+i+": ");
			Vetor1[i] = valor.nextInt();
			}
		System.out.println("Digite os valores do segundo Vetor: ");
		for (int j = 0; j < Vetor2.length; j++) {
			System.out.print("indice "+j+": ");
			Vetor2[j] = valor.nextInt();
		    }
		compara(Vetor1, Vetor2);
	}
	
	
	public static void compara(float Vetor1[], float Vetor2[]) {
		for (int i = 0, j = 0; i < Vetor2.length; i++, j++) {
			if(Vetor1[i] == Vetor2[j])
				System.out.println("Os valores do indice "+i+" em ambos os vetores são iguais");
			else	
				System.out.println("Os valores do indice "+i+" em ambos os vetores são diferentes");
			
		}
	}



	
	public static void main(String[] args) {
		float Vetor1[] = new float[5];
		float Vetor2[] = new float[5];
		
		elem(Vetor1, Vetor2);
		
	
	
		
	}
}
