package Lista2;

import java.util.Scanner;

public class quest9 {
	private static void swap(char a[], int l, int r) {
		char tem = a[l];
		a[l] = a[r];
		a[r] = tem;
	}
	
	
	private static void permute(char a[], int l, int r) {
		if(l == r)
			System.out.println(a);
		else {
			for(int i = l; i <= r; i++) {
				swap(a, l, i);
				permute(a, l + 1,r);
				swap(a, l, i);                            
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] valor = scan.next().toCharArray();
		permute(valor,0,valor.length-1);
		scan.close();
		
		
	}

}
