package Lista3;

import java.util.Scanner;

public class quest6 {
	  

	
	public static void ordenaVetc(int Vetor[]) {
		for( int i = 0; i< Vetor.length-1; i++  ) {
			for (int j = i+1; j < Vetor.length; j++) {
				if(Vetor[i] > Vetor[j]) {
					int temp = Vetor[i];
					 Vetor[i] = Vetor[j];
					Vetor[j] = temp;
			}
	
		}
		
	}
		String texto = " ";
		for (int  i= 0; i < Vetor.length; i++) {
			texto +=" Vetor["+ i + "] = " +Vetor[i];
			
		
			
		}
		
		System.out.println(texto);
	
	}	

	public static void main(String[] args) {
int Vetor[] = {1,5,8,0,4};
		
ordenaVetc(Vetor);
		

	}

}
