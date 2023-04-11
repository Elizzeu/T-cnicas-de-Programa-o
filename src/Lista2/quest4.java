package Lista2;

import java.util.Scanner;

public class quest4 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		int num, valor = 0;;
		System.out.print("Digite o número desejado: ");
		num = numero.nextInt();
		
		int multiplo =1;
		while(multiplo < 11) {
			valor = num * multiplo;
			System.out.println(num + " X " + multiplo + " = "+ valor);
			multiplo++;
			
		}
		
		

	}

}
