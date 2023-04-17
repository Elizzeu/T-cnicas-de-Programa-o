package Lista3;

import java.util.Scanner;

public class ques19 {
	public static boolean numPerfeito(int numPerfeito) {
		int  divisores = 0; int soma = 0;
		for(int i = 1; i < numPerfeito; i++) {
			if(numPerfeito % i == 0)
				soma = divisores + i;
			
		}
			
			if(soma == numPerfeito) {
				System.out.println(true);
				
			}else {
				System.out.println(false);
			}
				return true;
		
			
			
		
}
		public static void  main(String[] args) {
		Scanner valor = new Scanner (System.in);
		int numPerfeito = 0;	
		System.out.println("Diguite um numero: ");	
		numPerfeito = valor.nextInt();
		
		numPerfeito(numPerfeito);
		
		
			
		}




}
