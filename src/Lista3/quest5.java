package Lista3;

import java.util.Scanner;

public class quest5 {
	int Vetor[] = new int[10];
	
	
	public static void elemVetor(int Vetor[]) {
		Scanner valor = new Scanner (System.in);
		System.out.print("O vetor os valor do vetor: " );
		for(int a=0; a<Vetor.length; a++) {
			System.out.println("Indique " +a+ ":" );
			Vetor[a] = valor.nextInt();
			
		copy(Vetor);
		}
	}
		
	public static void copy(int Vetor[]) {
			int copyVet[] = new int[Vetor.length];
			
			System.out.println(" Copia: ");
			
			for(int b=0; b<copyVet.length; b++) {
				copyVet[b] = Vetor[b];
				
				System.out.println(" " +copyVet[b]+ " ");
			}
			
		
	}
	
	public static void main(String[] args) {
		int Vetor[] = new int [3];
		
		elemVetor(Vetor);
		
		
	
		
	
		
}
}
