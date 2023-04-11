package Lista2;

import java.util.Scanner;

public class ques5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o limite: ");
		int limite = input.nextInt();
		
		for(int i = 0; i <= limite; i++) {
			for(int j =0; j<=limite;j++) {
				System.out.println(i+ " " +j);
				
			}
		}
	}

}
