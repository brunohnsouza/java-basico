package doWhileExercicio;
import java.util.Iterator;
import java.util.Scanner;

public class MaiorEMedia {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		int somaDosNumeros = 0;
		int mediaNumeros;
		int maiorNumero = 0;
		
		int contador = 1;
		
		do {

			System.out.print("Digite um número inteiro: ");
			numero = scanner.nextInt();
			
			somaDosNumeros = somaDosNumeros + numero;
			
			contador++;
		
		} while (contador <= 5);
		
		System.out.println("");
		
		mediaNumeros = somaDosNumeros / 5;
		System.out.println("A média dos cinco números foi de: " + mediaNumeros);
		
		if (numero > maiorNumero) {
			maiorNumero = numero;
			System.out.println("O maior número desses cinco foi: " + maiorNumero);
		}
	}

}
