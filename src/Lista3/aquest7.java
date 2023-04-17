package Lista3;

public class aquest7 {


	
	public static boolean ordenaVetc(int Vetor[]) {
		for( int i = 0; i< Vetor.length-1; i++  ) {
			for (int j = i+1; j < Vetor.length; j++) {
				if(Vetor[i] > Vetor[j]) {
					System.out.println(true);
				return true;
				}
				else {
					System.out.println(false);
				return false;
				}
	
		}
		
	}
	return false;
	
}	

	public static void main(String[] args) {
int Vetor[] = {1,5,8,0,4};
		
ordenaVetc(Vetor);
		

	}

}
