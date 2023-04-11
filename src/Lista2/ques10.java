package Lista2;
import java.util.Scanner;
public class ques10 {

	
	
	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		
		String matriz [][];
		int linhas;
		int colunas;
		System.out.println("Insira número de linhas e colunas: ");
			colunas=linhas = entrada.nextInt();
		
		
		matriz= new String [linhas][colunas];
		
		
		for (int i =0; i<matriz.length; i++) { 
			for (int j=0; j<matriz.length; j++) {
				if(i != j) 
					matriz[0][j]= "0";
				if(i == 1) 
					matriz[i][1]= "1";
				if(j == 2)
					matriz[i][2]= "2";
				if(j == 3)
					matriz[i][3]= "3";
				if(j == 4)
					matriz[i][4]= "4";
				}
			}
		for(int i = 0; i<matriz.length ; i++){
		 for(int j =0;j<matriz.length ; j++){
		 
		 System.out.print(matriz[i][j] + " ");
		 }
		 System.out.println(" ");
		 
		 }
		System.out.println("\t");
		
		
		for (int i=0; i< matriz.length; i++) { // ITEM B
			for (int j=0; j< matriz.length; j++) {
			if (j== linhas-1-i) {
			matriz[i][j]= "%";
			}
			else {
			matriz[i][j]= "*";
			}
			}
			}
			for(int i =0; i<matriz.length ; i++){
			 for(int j =0;j<matriz.length ; j++){
			 
			 System.out.print(matriz[i][j] + " ");
			 }
			 System.out.println(" ");

	}

}}
