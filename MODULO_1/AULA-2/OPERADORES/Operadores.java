public class Operadores {

	public static void main(String[] args) {
		
		// Atribuição: ------------------------------------------------------------
		
		String nome = "Bruno";
		int numero = 5;
		char sexo = 'M';
		// Date datanascimento = new Date();
		
		
		
		// Aritméticos: ------------------------------------------------------------
		
		double soma = 10.2 + 23.5;
		int subtracao = 20 - 2;
		int multiplicacao = 3 * 5;
		int modulo = 18 % 3; // Resto da divisão
		
		System.out.println("CONCATENAÇÃO:");
		
		String primeiroNome = "Bruno";
		String ultimoNome = "Souza";
		String nomeCompleto = primeiroNome + " " + ultimoNome; // Concatenação ( + )
		System.out.println(nomeCompleto);
		
		
		
		// Unário: ------------------------------------------------------------
		System.out.println("UNÁRIO:");
		
		
			// Positivo e Negativo: ------------------------------------------------------------
			System.out.println("POSITIVO E NEGATIVO:");
			
			int numeroPositivo = 5;
			int outroNumeroPositivo = +4;
			
			System.out.println("Deixando o número negativo só na saída: " + (- numeroPositivo));
			
			numeroPositivo = -5; // Deixando o valor da variável negativa!
			System.out.println("Como alterado antes, valor novo da variável: " + numeroPositivo);
			
			numeroPositivo = - numeroPositivo; // Transformando a variável negativa para positiva novamente! ( MENOS com MENOS é igual a MAIS ) )
			// numeroPositivo = numeroPositivo * - 1 (Poderia ser assim também)
			System.out.println("MENOS com MENOS é MAIS ( - (-5) ): " + numeroPositivo);
			
			
			
			// Incremento: ------------------------------------------------------------
			System.out.println("INCREMENTO:");
			
			int incrementoUm = 10;
			incrementoUm++; // Soma +1 direto da variável
			System.out.println("Incremento na variável ( 10 + 1 ): " + incrementoUm);
			
			int incrementoDois = 4;
			System.out.println("Me imprimo e depois somo +1 ( 4 ): " + incrementoDois++);
			System.out.println("Valor com o +1 de antes ( 4 + 1 ): " + incrementoDois);
			
			
			
			// Decremento: ------------------------------------------------------------
			System.out.println("DECREMENTO:");
			
			int decremento = 10;
			decremento--; // Tiro -1 direto da variável
			System.out.println("Decremento na variável ( 10 - 1 ): " + decremento);
			
			int decrementoDois = 8;
			System.out.println("Me imprimo e depois tiro -1 ( 8 ):  " + decrementoDois--);
			System.out.println("Valor depois do -1 de antes: " + decrementoDois);
	
			
			
			// Ternário: ------------------------------------------------------------
			System.out.println("TERNÁRIO:");
			
			int a = 2;
			int b = 4;
			
			String resultado = a == b ? "São iguais!" : "Não são iguais!"; 
			System.out.println(resultado);
			
			
			
			// Relacionais: ------------------------------------------------------------
			System.out.println("RELACIONAL:");
			
			int dez = 10;
			int vinte = 20;
			
			boolean resultadoIgualdade = dez == vinte;
			System.out.println("'dez' é igual a 'vinte' ? " + resultadoIgualdade);
			
			boolean resultadoMenorQue = dez < vinte;
			System.out.println("'dez' é menor que 'vinte' ? " + resultadoMenorQue);
			
			boolean resultadoMaiorQue = dez > vinte;
			System.out.println("'dez' é maior que 'vinte' ? " + resultadoMaiorQue);

			boolean resultadoMaiorIgual = dez >= vinte;
			System.out.println("'dez' é maior ou igual a 'vinte' ? " + resultadoMaiorIgual);
			
			boolean resultadoMenorIgual = dez <= vinte;
			System.out.println("'dez' é menor ou igual a 'vinte' ? " + resultadoMenorIgual);
			
			
			
			// Lógicos: ------------------------------------------------------------
			System.out.println("LÓGICOS:");
			
			/** 
			 * TRUE && TRUE => TRUE
			 * TRUE && FALSE => FALSE
			 * FALSE && FALSE => FALSE
			 * FALSE && TRUE => FALSE
			 * 
			 * TRUE || TRUE => TRUE
			 * TRUE || FALSE => TRUE
			 * FALSE || FALSE => FALSE
			 * FALSE || TRUE => TRUE
			*/
			
			boolean condicao1 = true;
			boolean condicao2 = false;
			
			String resultadoLogico1 = condicao1 && condicao2 ? "verdade" : "falso"; // TRUE e FALSE => FALSE
			System.out.println(resultadoLogico1);
			
			String resultadoLogico2 = !condicao1 && condicao2 ? "verdade" : "falso"; // FALSE e FALSE => FALSE
			System.out.println(resultadoLogico2);
			
			String resultadoLogico3 = condicao1 && !condicao2 ? "verdade" : "falso"; // TRUE e TRUE => TRUE
			System.out.println(resultadoLogico3);
	
	}
	

}
