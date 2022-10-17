package CONDICIONAL_FLUXO;

/*
 *  	SIMILARIDADE:
 *  
 * 		-> Igualdade ( == )
 * 		
 * 		-> Diferença ( != )
 * 
 *	TAMANHO:
 *		-> Maior ( > ), Menor ( < )
 *		-> Maior Igual ( >=), Menor Igual ( <= )
 */

public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		int primeiroInteiro = 10;
		int segundoInteiro = 20;
		
		float primeiroFloat = 4.5f;
		float segundoFloat = 8.2f;
		
		double primeiroDouble = 59.6d;
		
		char letraX = 'x';
		char letraZ = 'z';
		
		String fulanoUm = "Fulano";
		String fulanoDois = "Fulano";
		String cicrano = "Cicrano";
		
		boolean verdade = true;
		boolean falso = false;
		
		long primeiroLong = 100l;
		long segundoLong = 200l;
		byte unicoByte = 1;
		short unicoShort = 25;
		
		System.out.println("INTEIROS:" + "\n");
		
		System.out.println("'Dez' é IGUAL a 'Vinte'? -> " + (primeiroInteiro == segundoInteiro));
		System.out.println("'Dez' é DIFERENTE de 'Vinte'? -> " + (primeiroInteiro != segundoInteiro));
		System.out.println("'Dez' é MAIOR QUE 'Vinte'? -> " + (primeiroInteiro > segundoInteiro));
		System.out.println("'Dez' é MENOR ou IGUAL a 'Vinte'? -> " + (primeiroInteiro <= segundoInteiro) + "\n");
		
		System.out.println("FLOATS:" + "\n");
		
		System.out.println("'4.5' é IGUAL a '8.2'? -> " + (primeiroFloat == segundoFloat));
		System.out.println("'4.5' é DIFERENTE de '8.2'? -> " + (primeiroFloat != segundoFloat));
		System.out.println("'4.5' é MAIOR QUE '8.2'? -> " + (primeiroFloat > segundoFloat));
		System.out.println("'4.5' é MENOR ou IGUAL a '8.2'? -> " + (primeiroFloat <= segundoFloat) + "\n");
		
		System.out.println("CHAR:" + "\n");
		
		System.out.println("'x' é IGUAL a 'z'? -> " + (letraX == letraZ));
		System.out.println("'x' é DIFERENTE de 'z'? -> " + (letraX != letraZ));
		System.out.println("'x' é MAIOR QUE 'z'? -> " + (letraX > letraZ)); // Aqui funcionou porque, embaixo dos panos, um CHAR se torna um número
		System.out.println("'x' é MENOR ou IGUAL a 'z'? -> " + (letraX <= letraZ) + "\n");
		
		System.out.println("STRING:" + "\n");
		
		System.out.println("'fulano 1' é IGUAL a 'fulano 2'? -> " + (fulanoUm == fulanoDois));
		System.out.println("'fulano 1' é IGUAL a 'cicrano'? -> " + (fulanoUm == cicrano));
		System.out.println("'fulano 1' é DIFERENTE de 'fulano 2'? -> " + (fulanoUm != fulanoDois) + "\n");
		// System.out.println("'fulano 1' é MAIOR QUE 'fulano 2'? -> " + (fulanoUm > fulanoDois)); -> DÁ ERRO!!!
		// System.out.println("'fulano 1' é MENOR ou IGUAL a 'fulano 2'? -> " + (fulanoUm <= fulanoDois)); -> DÁ ERRO!!!
		
		System.out.println("BOOLEANOS:" + "\n");
		
		System.out.println("'verdade' é IGUAL a 'falso'? -> " + (verdade == falso));
		System.out.println("'verdade' é DIFERENTE de 'falso'? -> " + (verdade != falso) + "\n");
		// System.out.println("'verdade' é MAIOR QUE 'falso'? -> " + (verdade > falso)); -> DÁ ERRO!!!
		// System.out.println("'verdade' é MENOR ou IGUAL a 'falso'? -> " + (verdade <= falso)); -> DÁ ERRO!!!
		
		System.out.println("MESCLANDO:" + "\n");
		
		System.out.println("'Dez' é IGUAL a '4.5'? -> " + (primeiroInteiro == primeiroFloat));
		System.out.println("'Dez' é DIFERENTE de '8.2'? -> " + (primeiroInteiro != segundoFloat) + "\n");
		// System.out.println("'fulano 2' é DIFERENTE de 'x'? -> " + (fulanoDois > letraX)); -> DÁ ERRO!!!
		// System.out.println("'cicrano' é DIFERENTE de 'Dez'? -> " + (cicrano <= primeiroInteiro)); -> DÁ ERRO!!!
		
		
	}

}
