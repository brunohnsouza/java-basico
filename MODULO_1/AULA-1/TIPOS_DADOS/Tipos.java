/**
 *
 * 	1 - |  byte  | ( -127 até 127) e tem (1 byte) );
 * 	2 - |  short | ( -32.768 até 32.767) e tem (2 bytes) );
 * 	3 - |   int  | ( -2.147.483.648 até 2.147.483.647) e tem (4 bytes) );
 *  4 - |  long	 | ( -2^63 até 2^63-1) e tem (8 bytes) );
 *  5 - |  float | ( ±1,40129846432481707e-45 até 3,40282346638528860e+38) e tem (4 bytes) );
 *  6 - | double | ( ±4,94065645841246544e-324 até 1,79769313486231570e+308 e tem (8 bytes) );
 *  
 * Estão presentes na PILHA DE MEMÓRIA!
 *
 */

/**
* 	Constantes -> final
* 	Constantes -> CAIXA ALTA
* 
* 	Não se pode alterar!
*/

public class Tipos {

	public static void main(String[] args) {
		// Exemplos:
		
		byte idade;
		idade = 22;
		
		short anoFabricacao = 2022;
		int cep = 21070333;
		long cpf = 12345678901L; // Lembra do "L" no final!
		float pi = 3.14F; // Lembra do "F" no final!
		double salarioMinino = 2.500; // Em milhar ficaria "2500", sem o "."!
		
		System.out.println(idade);
		System.out.println(anoFabricacao);
		System.out.println(cep);
		System.out.println(cpf);
		System.out.println(pi);
		System.out.println(salarioMinino);
		
		final float piConstante = 3.14F; // Até aqui, tudo certo!
		System.out.println(piConstante);
		
		// pi = 3.1414F; -> Não dá pra alterar!!
	}

}
