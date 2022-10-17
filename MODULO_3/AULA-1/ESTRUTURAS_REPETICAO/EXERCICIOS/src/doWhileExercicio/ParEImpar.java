package doWhileExercicio;
import java.util.Scanner;

public class ParEImpar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		int qtdeNumeroPar = 0;
		int qtdeNumeroImpar = 0;
		
		String continuar = "S";
		
		do {

			System.out.print("Digite um número inteiro: ");
			numero = scanner.nextInt();
			
			if (numero % 2 == 0) {
				qtdeNumeroPar = qtdeNumeroPar + 1;
			} else {
				qtdeNumeroImpar = qtdeNumeroImpar + 1;
			}
			
			System.out.print("Deseja continuar? [S/n] ");
			continuar = scanner.next().toUpperCase();
		
		} while (continuar.equals("S"));

		System.out.println("");
		
		System.out.println("Quantidade de número(s) par(es): " + qtdeNumeroPar);
		System.out.println("Quantidade de número(s) impar(es): " + qtdeNumeroImpar);
	}

}
