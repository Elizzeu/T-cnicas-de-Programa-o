package Lista2;

import java.util.Scanner;

public class quest6 {

	public static void main(String[] args) {
		boolean test = false;
		int matriz [][] = new int [4][4]; 
		Scanner input = new Scanner(System.in);

		for (int i=0;i<=3;i++){
			for (int j=0;j<=3;j++){
				System.out.println("Digite o valor ["+(i+1)+","+(j+1)+"]:");
				matriz[i][j]=input.nextInt();
				
			}			
		}
				
		for (int i=0;i<=3;i++){
			for (int j=0;j<=3;j++){
				if ( (matriz[i][j]) == (matriz[j][i])){
					test = true;
				}
				else {
					test = false;
				}				
			}
		}

		System.out.println();
		
		if (test == true){
			System.out.println("Matriz simetrica");
		}
		else {
		

	}

}
}
