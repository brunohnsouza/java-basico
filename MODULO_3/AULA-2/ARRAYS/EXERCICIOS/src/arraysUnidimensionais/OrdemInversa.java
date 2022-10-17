package arraysUnidimensionais;

import java.util.Random;

public class OrdemInversa {
	public static void main(String[] args) {
		
		Random randon = new Random();
		
		int[] numerosInteiros = new int[5];
		
		for (int i = 0; i < numerosInteiros.length; i++) {
			int numero = randon.nextInt(10);
			numerosInteiros[i] = numero;
		}
		
		System.out.print("\n" + "Array normal: " + "[ ");
		int count = 0;
		while (count < (numerosInteiros.length)) {
			System.out.print(numerosInteiros[count] + " ");
			count++;
		}
		System.out.print("]");
		
		
		System.out.print("\n" + "Array invertido: " + "[ ");
		for (int i = (numerosInteiros.length - 1); i >= 0; i--) {
			System.out.print(numerosInteiros[i] + " ");
		}
		System.out.print("]");
	}

}
