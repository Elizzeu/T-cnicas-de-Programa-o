package Lista2;

import java.util.Scanner;

public class quest3 {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
	
		int bingoou = 20;
		int num = 0;
		
		while(num != bingoou ) {
		System.out.print("Digite um n�mero entre 1 e 100 : ");
		num = valor.nextInt();
		if(num > 20)
			System.out.println("O numero � menor que:"+num);
		if(num < 20)
			System.out.println("O numero � maior que :"+ num);
		if(num == bingoou)
			System.out.println("Parabens!");

	}

}
}