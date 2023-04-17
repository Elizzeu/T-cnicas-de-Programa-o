package Lista3;

public class quest1 {
	
	public static int somatorio(int vetor[]) {
		int soma  = 0;
		for(int i = 0; i <(vetor.length-1); i++)
		soma = soma + vetor[i];
		return soma;
		
	}
	public static int[] povoarvetor(int vetor[]) {
		
		for(int j = 0; j < vetor.length-1; j++) {
			vetor[j]= j;
			System.out.println(vetor[j]);
			
		}
		return vetor;
	}
	
	public static void main(String[] args) {
		int vetor[] = new int[5];
		
		
		povoarvetor(vetor);
		System.out.println("Somar: ");
		System.out.println(somatorio(vetor));
		
	
	}

}
