package Lista1;

public class lista1 {

	public static void main(String[] args) {
		int A = 10, B = 9;
		
	// Quest�o 1
		
		if(A > 10) {
			System.out.println("A > 10");	
		}else {
			if(A + B == 20) {
				System.out.println("A + B == 20");
			}else {
				System.out.println("Numeros nao validos");
			}
		}
		
	// Quest�o 2
		
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
		
	// Quest�o 3
		
		if(A == 10) {
			System.out.println("A == 10");
		}
		if(A + B == 20) {
			System.out.println("A + B == 20");
		}
		if(B == 10) {
			System.out.println("B == 20");
		}
	
	
	// Quest�o 4
	
		if((A > 10) || (A + B == 20)) {
			System.out.println("Numero valido");
		}else {
			if(A == B) {
				System.out.println("A == B");
			}else {
				System.out.println("Numeros n�o validos");
			}
		}
		
	// Quest�o 5
		
		if((A > 10) || (A + B == 20) ) 
			System.out.println("N�mero V�lido");
		else 
			System.out.println("Numero n�o V�lido");
		 
	// Quest�o 6
	
		if(A > 10) {
			System.out.println("A > 10");
		}
		if(A + B == 20) {
			System.out.println("A + B == 20");
		}else { 
			System.out.println("A + B != 20");
			
		}
	
	// Quest�o 7
	
		if((A > 10) || (A + B == 20)) 
			System.out.println("N�meros V�lidos");
		else
			System.out.println("N�meros n�o v�lidos");
	
	// Quest�o 8
	
		if(A > 10)
			System.out.println("A > 10");
		if(A + B == 20)
			System.out.println("A + B == 20");
		else
			System.out.println("N�meros n�o V�lidos");
	
	// Quest�o 9
	
		if((A > 10) && (A + B == 20))
			System.out.println("A + B == 20");
		else
			System.out.println("N�meros nao V�lidos");
		
	// Quest�o 10
	
		if(!(A > 10)) 
			System.out.println("N�mero menor que 10");
			
		if(!(A + B == 20))
				System.out.println("N�mero diferente de 20");
		
	// Quest�o 11
		
		if((A > 10)) {
		}
		else
			if(A + B == 20)
		System.out.println("A + B == 20");
		
		if(!(A > 10) || !(A + B == 20))
			System.out.println();
		
	// Quest�o 12
		
		if(A > 10 || (A + B == 20)) {
			if(A > 10)
				System.out.println("A > 10");
			if(A + B == 20)
				System.out.println("A + B == 20");	

		}else {
			System.out.println("N�meros n�o v�lidos");
		}
			System.out.println("Sejam bem-vidos � disciplina de T�cnicas de progra��o");

	// Quest�o 13
	
		if(A > 10)
			System.out.println("A > 10");
		if(A + B == 20)
			System.out.println("A + B == 20");
		if(!((A > 10) || (A > 10) ))
			System.out.println("N�meros n�o v�lidos");	

	}
}


