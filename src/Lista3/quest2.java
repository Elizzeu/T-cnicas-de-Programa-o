package Lista3;

public class quest2 {
	public static int somar(int vetor[]) {
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
		int vetor1[] = new int[5];
		int vetor2[] = new int[10];
		
		povoarvetor(vetor1);
		System.out.println("Somar: ");
		System.out.println(somar(vetor1));
		
		povoarvetor(vetor2);
		System.out.println("Somar: ");
		System.out.println(somar(vetor2));
		
		System.out.println((somar(vetor1)+somar(vetor2))/2);
	}

}
