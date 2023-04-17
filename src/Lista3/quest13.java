package Lista3;

import java.util.Arrays;
import java.util.Scanner;

public class quest13 {
	public static boolean existe(int x, int Vetor3[], int k) {
		for (int i = 0; i < k; i++) {
			if(Vetor3[i]== x)
				return true;
			
		}
		
		return false;
	}
	public static void elem( int Vetor1[], int Vetor2[]) {
		Scanner valor = new Scanner (System.in);
		
		
		System.out.println("Digite os valores do primeiro Vetor: ");
		for (int i = 0; i < Vetor1.length; i++) {
			System.out.println("indice "+i+":");
			Vetor1[i] = valor.nextInt();
			}
		System.out.println("Digite os valores do segundo Vetor: ");
		for (int j = 0; j < Vetor2.length; j++) {
			System.out.println("indice "+j+":");
			Vetor2[j] = valor.nextInt();
		    }
		
		juntar(Vetor1, Vetor2);
	}
	
	public static int[] juntar(int Vetor1[], int Vetor2[]) {
		int Vetor3[] = new int [Vetor1.length + Vetor2.length];
		int k =0;
		for (int i = 0; i < Vetor1.length; i++) {
			Vetor3[k++] = Vetor1[i];
			
		for (int j = 0; j < Vetor2.length; j++) {
			if(!existe(Vetor2[i], Vetor3, k)) {
				Vetor3[k++] = Vetor2[j];
			}
		}
		
		
		}
		Vetor3 = Arrays.copyOf(Vetor3, k);
	
		System.out.println(Arrays.toString(Vetor3));
		return Vetor3;
		
		

	}	
			

			
		public static void main(String[] args) {
			int Vetor1[] = new int[3];
			int Vetor2[] = new int[2];
			
			
			elem(Vetor1, Vetor2);
			
			
		}
	

}
