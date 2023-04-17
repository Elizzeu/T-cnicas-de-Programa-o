package Lista3;

import java.util.Scanner;

public class quest12 {
	public static int primoVerific(int numPrimo) {
		int numDivisores=0;
		for(int i = 1; i <= numPrimo; i++) {
			if(numPrimo % i == 0)
			numDivisores++;
		}
		if(numDivisores == 2)
			System.out.println("Numero Primo");
		
		else
			System.out.println("Numero nao e primo");
		return numPrimo;
		
	}
	public static void main(String[] args) {
		Scanner valor = new Scanner (System.in);
		
		int numPrimo = 0;
		System.out.print("Diguite um numero: ");
		numPrimo = valor.nextInt();
		
		primoVerific(numPrimo);
		
	}
	

	
	

}
