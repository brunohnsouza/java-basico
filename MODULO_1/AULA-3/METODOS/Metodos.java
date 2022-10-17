// Ações das aplicações

/**
 * Deve ser nomeado como VERBO;
 * Padrão camelCase.
 */

public class Metodos {
	
	
	// Exemplo 1:
	public void somar(int numero1, int numero2) {
		
		int resultado = numero1 + numero2;
		System.out.println("O resultado é: " + resultado);
		
	}
	
	// Exemplo 2:
	public void socializar(String nome, int idade) {
			
		System.out.println("Olá! Meu nome é " + nome + " e tenho " + idade + " anos.");
			
	}
	
	/**
	 * MANEIRA ERRADA:
	 * 
	 * 			calcularImprimir(){} 		//Vai calcular ou 'Imprimir'???
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		//Resultado do Exemplo 1:
		Metodos calculo = new Metodos();
		calculo.somar(10, 4);
		
		//Resultado do Exemplo 2:
		Metodos pessoa = new Metodos();
		pessoa.socializar("Marcos", 20);
		
	}

}
