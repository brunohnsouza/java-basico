/**
 * 
 * @author bruno -> Essa é uma anotação
 * @version 1.0
 * @since 2022
 * 
 */

// Comentário em uma UNICA LINHA;

/*
 * MÚLTIPLAS LINHAS
 */

/**
 * 
 * DOCUMENTAÇÃO
 *
 */
public class Calculadora {
	
	/**
	 * Método 1 -> Somar dois valores inteiros
	 * @param numeroUm -> primerio número
	 * @param numeroDois -> segundo número
	 * @return um inteiro resultante da soma desses dois números
	 */
	
	public int somar(int numeroUm, int numeroDois) {
		return numeroUm + numeroDois;
	}
	
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		System.out.println(calculadora.somar(10, 10));
		
	}

}
