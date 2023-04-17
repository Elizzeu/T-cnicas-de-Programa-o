package Lista3;

import java.util.Scanner;

public class quest3 {
	public static void media(int nota1, int peso1, int nota2, int peso2, int nota3, int peso3) {
		Scanner valor = new Scanner (System.in);
	
		System.out.print("Digite a nota1: " );
		nota1 = valor.nextInt();
		System.out.print("Peso1: ");
		peso1 = valor.nextInt();
		
		System.out.print("Digite a nota2: ");
		nota2 = valor.nextInt();
		System.out.print("Peso2: ");
		peso2 = valor.nextInt();
		
		System.out.println("Digite a nota3: ");
		nota3 = valor.nextInt();
		System.out.println("Peso3: ");
		peso3 = valor.nextInt();
		
		float media = ((((nota1*peso1)+(nota2*peso2)+(nota3*peso3)))/(peso1+peso2+peso3));
		System.out.println(media);
	}

	
	public static void main(String[] args) {
	int nota1 =0, nota2 =0, nota3=0;
	int peso1=0, peso2=0, peso3 =0;
	
	media(nota1, peso1, nota2, peso2, nota3, peso3);
		
	}
	
	
}
