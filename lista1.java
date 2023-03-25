package Lista1;

public class lista1 {

	public static void main(String[] args) {
		int A = 10, B = 9;
		
	// Questão 1
		
		if(A > 10) {
			System.out.println("A > 10");	
		}else {
			if(A + B == 20) {
				System.out.println("A + B == 20");
			}else {
				System.out.println("Numeros nao validos");
			}
		}
		
	// Questão 2
		
		if(A > 10) {
			System.out.println("A < 10");
		}else {
			System.out.println("Numero nao valido");
		}	
			
			
		if(A + B == 20) {
			System.out.println("A + B == 20");
		}else {
			System.out.println("Numero nao valido");
		}
		
	// Questão 3
		
		if(A == 10) {
			System.out.println("A == 10");
		}
		if(A + B == 20) {
			System.out.println("A + B == 20");
		}
		if(B == 10) {
			System.out.println("B == 20");
		}
	
	
	// Questão 4
	
		if((A > 10) || (A + B == 20)) {
			System.out.println("Numero valido");
		}else {
			if(A == B) {
				System.out.println("A == B");
			}else {
				System.out.println("Numeros não validos");
			}
		}
		
	// Questão 5
		
		if((A > 10) || (A + B == 20) ) 
			System.out.println("Número Válido");
		else 
			System.out.println("Numero não Válido");
		 
	// Questão 6
	
		if(A > 10) {
			System.out.println("A > 10");
		}
		if(A + B == 20) {
			System.out.println("A + B == 20");
		}else { 
			System.out.println("A + B != 20");
			
		}
	
	// Questão 7
	
		if((A > 10) || (A + B == 20)) 
			System.out.println("Números Válidos");
		else
			System.out.println("Números não válidos");
	
	// Questão 8
	
		if(A > 10)
			System.out.println("A > 10");
		if(A + B == 20)
			System.out.println("A + B == 20");
		else
			System.out.println("Números não Válidos");
	
	// Questão 9
	
		if((A > 10) && (A + B == 20))
			System.out.println("A + B == 20");
		else
			System.out.println("Números nao Válidos");
		
	// Questão 10
	
		if(!(A > 10)) 
			System.out.println("Nùmero menor que 10");
			
		if(!(A + B == 20))
				System.out.println("Número diferente de 20");
		
	// Questão 11
		
		if((A > 10)) {
		}
		else
			if(A + B == 20)
		System.out.println("A + B == 20");
		
		if(!(A > 10) || !(A + B == 20))
			System.out.println();
		
	// Questão 12
		
		if(A > 10 || (A + B == 20)) {
			if(A > 10)
				System.out.println("A > 10");
			if(A + B == 20)
				System.out.println("A + B == 20");	

		}else {
			System.out.println("Números não válidos");
		}
			System.out.println("Sejam bem-vidos à disciplina de Técnicas de progração");

	// Questão 13
	
		if(A > 10)
			System.out.println("A > 10");
		if(A + B == 20)
			System.out.println("A + B == 20");
		if(!((A > 10) || (A > 10) ))
			System.out.println("Números não válidos");	

	}
}


