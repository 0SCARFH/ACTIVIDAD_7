package ACTIVIDAD_7;

public class metodos {
	
	
	public void numeros_primos(int numero) {
		
		for(int i = 2; i<=numero; i++) {
			
			int divisor = 2;
			boolean esprimo = true;
			
			
			while(esprimo && divisor < i) {
				
				if (i % divisor == 0) {
					
					esprimo = false;
				}else {
					
					divisor++;
				}
				
			}
			if(esprimo) {
				
				System.out.print(i + ",");
				
			}
			
		}	
		
	}

	
	public void Fibonacci(int numero) {
		int a = 0, b = 1, c;
		for (int i = 0; i< numero; i++) {
			System.out.print(a + " ,");
			c = a + b;
			a = b;
			b = c;	
			
		}
		
		
	}
}
