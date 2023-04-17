package Lista3;

import java.util.Scanner;

public class quest16 {
	
	public static boolean primoVerific(int numPrimo) {
		int numDivisores=0;
		for(int i = 1; i <= numPrimo; i++) {
			if(numPrimo % i == 0)
			numDivisores++;
		}
		if(numDivisores == 2)
			System.out.println(true);
		
		else
			System.out.println(false);
		return true;
		
	}
	public static void main(String[] args) {
		Scanner valor = new Scanner (System.in);
		
		int numPrimo = 0;
		System.out.print("Digite um numero: ");
		numPrimo = valor.nextInt();
		
		primoVerific(numPrimo);
		
	}
	

}
