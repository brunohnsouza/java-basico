package CONDICIONAL_FLUXO;

/*
 *  	CONJUNÇÃO:
 *  
 * 		-> && ( and(e) )
 * 
 * 		->  V && V >>> V
 * 		-> 	V && F >>> F
 * 		->  F && F >>> F
 * 		-> 	F && V >>> F
 * 
 * 	DISJUNÇÃO:
 *  
 * 		-> || ( or(ou) )	
 * 		
 * 		->  V || V >>> V
 * 		-> 	V || F >>> V
 * 		->  F || F >>> F
 * 		-> 	F || V >>> V
 * 
 * 	DISJUNÇÃO EXCLUSIVA:
 *  
 * 		-> ^ ( xor )	
 * 		
 * 		->  V ^ V >>> F
 * 		-> 	V ^ F >>> V
 * 		->  F ^ F >>> F
 * 		-> 	F ^ V >>> V
 *	
 *	NEGAÇÃO:
 *  
 * 		-> ! ( Inversão )	
 * 		
 * 		-> 	!F >>> V
 * 		->  !V >>> F
 */

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		boolean verdadeUm = true;
		boolean verdadeDois = true;
		
		boolean falsoUm = false;
		boolean falsoDois = false;
		
		
		System.out.println("CONJUNÇÃO:" + "\n");
		
		System.out.println("'verdade' e 'verdade' é: " + (verdadeUm && verdadeDois));
		System.out.println("'falso' e 'falso' é: " + (falsoUm && falsoDois));
		System.out.println("'verdade' e 'falso' é: " + (verdadeUm && falsoUm) + "\n");
		
		System.out.println("DISJUNÇÃO:" + "\n");
		
		System.out.println("'verdade' ou 'verdade' é: " + (verdadeUm || verdadeDois));
		System.out.println("'falso' ou 'falso' é: " + (falsoUm || falsoDois));
		System.out.println("'verdade' ou 'falso' é: " + (verdadeUm || falsoUm) + "\n");
		
		System.out.println("DISJUNÇÃO EXCLUSIVA:" + "\n");
		
		System.out.println("'verdade' xor 'verdade' é: " + (verdadeUm ^ verdadeDois));
		System.out.println("'falso' xor 'falso' é: " + (falsoUm ^ falsoDois));
		System.out.println("'verdade' xor 'falso' é: " + (verdadeUm ^ falsoUm) + "\n");
		
		System.out.println("NEGAÇÃO:" + "\n");
		
		System.out.println("O inverso de 'verdade' é: " + (!verdadeUm));
		System.out.println("O inverso de 'falso' é: " + (!falsoUm) + "\n");
		
	
	}

}
