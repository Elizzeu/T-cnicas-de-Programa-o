package Lista3;

import java.util.Scanner;

public class quest17 {
	public static String inverterString(String str) {
	    StringBuilder sb = new StringBuilder(str);
	    sb = sb.reverse(); 
	    return sb.toString();
	}
	
	public static void main(String[] args) {
		Scanner nome = new Scanner (System.in);
		String str;
		System.out.println("Digite um nome: ");
		str = nome.next();		
	    
	    String strInvertida = inverterString(str);
	    
	    System.out.println(str + " Invertido e " + strInvertida);
   }
}