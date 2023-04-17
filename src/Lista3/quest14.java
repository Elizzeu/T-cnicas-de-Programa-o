package Lista3;

import java.util.Arrays;

public class quest14 {
	public static int[] remover(int Vetor[]){
		int elem = Vetor.length;
		int Vetor2[] = Arrays.copyOf(Vetor, elem);
		
		for (int i = 0; i < elem; i++) {
			int k = i +1;
			int removidos = 0;
			for (int j = i +1; j < elem; j++) {
				if( Vetor2[i] == Vetor2[j]) 
					removidos++;
				else
					Vetor2[k++] = Vetor2[j];
				
			}
			elem  = elem - removidos;
			
		}
		
		Vetor2 = Arrays.copyOf(Vetor2, elem);
		
		System.out.println(Arrays.toString(Vetor2));
		return Vetor2;
	}
	
	public static void main(String[] args) {
		int Vetor[] = {1, 2, 3, 2, 4};
		
		remover(Vetor);
		
	}

}
