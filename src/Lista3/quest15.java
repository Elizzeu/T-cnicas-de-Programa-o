package Lista3;

import java.util.Scanner;

public class quest15 {
	
	public static boolean palindromo(String  palavra) {
		
		String palavraInvertida = new StringBuilder(palavra).reverse().toString();
		return palavraInvertida.equalsIgnoreCase(palavra);
		}
	
	
	public static void main(String[] args) {

	Scanner nome = new Scanner (System.in);
	
	String palavra;
	System.out.println("Digite um nome: " );
	palavra = nome.next();
	
	if( palindromo(palavra)){
	   System.out.println(palavra + " é um palíndromo");
	}else{
	   System.out.println(palavra + " não é um palíndromo");
	}
	
	
}}




