package Lista3;

import java.util.Scanner;
import java.lang.Math;

public class quest18 {
	public static float calcJuros(float capital, float taxa, float tempo) {
		float montante = 0;
		
		montante = (int) (capital*(Math.pow(1+(taxa/100), tempo)));
		System.out.println(montante);
		return montante;  
		}
	
	public static void main(String[] args) {
		Scanner valor = new Scanner (System.in); 
		int capital = 0;
		int taxa = 0;
		int tempo = 0;
		System.out.println("Diguite seu capital R$: ");
		capital = valor.nextInt();
		System.out.println("Digite a taxa de juros: ");
		taxa = valor.nextInt();
		System.out.println("Doigite o tempo: ");
		tempo = valor.nextInt();
		
		calcJuros(capital, taxa, tempo);
	
	}


}