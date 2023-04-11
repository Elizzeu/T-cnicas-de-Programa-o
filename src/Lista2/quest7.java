package Lista2;

import java.util.Scanner;

public class quest7 {
	

	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);
		
		int numPrimo, valor = 0,numDivisor = 0;
		System.out.print("Digite o número desejado: ");
		numPrimo = numero.nextInt();
		numPrimo= numPrimo-1;
		
		
			while(numPrimo >= 1) {
	
		
		for(int i= 1; i <= numPrimo; i++ ) {
			if(numPrimo % i == 0) 
				numDivisor++;
				}
		if(numDivisor == 2) {
			
				System.out.print(numPrimo);
				break;
				}
		numPrimo--;
			}
	}

}


