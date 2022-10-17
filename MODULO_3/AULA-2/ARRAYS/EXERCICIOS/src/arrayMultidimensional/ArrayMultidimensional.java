package arrayMultidimensional;

import java.util.Random;

public class ArrayMultidimensional {
	public static void main(String[] args) {
		
		Random randon = new Random();
		
		int[][] matriz = new int[4][4];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = randon.nextInt(9);
			}
			
		}
		
		System.out.println("\n" + "Matrix (4 x 4): ");
		for (int[] linha : matriz) {
			for (int coluna : linha ) {
				System.out.print(coluna + " ");
			}
			System.out.println();
		}
	}

}
