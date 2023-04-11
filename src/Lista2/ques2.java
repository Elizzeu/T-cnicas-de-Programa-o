package Lista2;
import java.util.Scanner;

public class ques2 {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);

		int soma=0;
		for(int cont = 1; cont > 0; cont++) {
			System.out.println("Digite um numero: ");
			cont = valor.nextInt();
			if(cont > 0)
			soma = soma + cont;
			
		}

		
		System.out.println("A soma dos números positivos digitados é: "+soma);
}

}