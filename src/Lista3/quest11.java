package Lista3;

import java.util.Scanner;

public class quest11 {
	public static int potenciacao(int base, int espoente) {
		
		
		int valor = 1;
		for(int i = espoente; i >= 1; i--) {
			valor = valor * base;
			
		}
		System.out.println(valor);
		return valor;
	}
	
	public static void main(String[] args) {
		Scanner valor = new Scanner (System.in);
		int base = 0;
		int espoente = 0;
		
		System.out.println("Digite a base: ");
		base = valor.nextInt();
		System.out.println("Digite um espoente: ");
		espoente = valor.nextInt();
		
		potenciacao(base, espoente);
		
		
		
		
	}

}
