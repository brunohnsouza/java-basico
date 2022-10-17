package CONDICIONAL_FLUXO;
import java.util.Scanner;

public class ControleFluxo {
	public static void main(String[] args) {
		
		Scanner scannerIf = new Scanner(System.in);
		//Scanner scannerSwitch = new Scanner(System.in);
	
		//EXEMPLO 1 (IF)
		
		int numeroDoMes;
		
		System.out.print("Digite um número [1-12]: ");
		numeroDoMes = scannerIf.nextInt();
		scannerIf.close();
		
		if (numeroDoMes == 1) {
			System.out.println("é JANEIRO!");
		} else if (numeroDoMes == 2) {
			System.out.println("é FEVEREIRO!");
		} else if (numeroDoMes == 3) {
			System.out.println("é MARÇO!");
		} else if (numeroDoMes == 4) {
			System.out.println("é ABRIL!");
		} else if (numeroDoMes == 5) {
			System.out.println("é MAIO!");
		} else if (numeroDoMes == 6) {
			System.out.println("é JUNHO!");
		} else if (numeroDoMes == 7) {
			System.out.println("é JULHO!");
		} else if (numeroDoMes == 8) {
			System.out.println("é AGOSTO!");
		} else if (numeroDoMes == 9) {
			System.out.println("é SETEMBRO!");
		} else if (numeroDoMes == 10) {
			System.out.println("é OUTUBRO!");
		} else if (numeroDoMes == 11) {
			System.out.println("é NOVEMBRO!");
		} else if (numeroDoMes == 12) {
			System.out.println("é DEZEMBRO!");
		} else {
			System.out.println("Verifique o número e tente novamente.");
		}
		
		
		
		/** EXEMPLO 2 (SWITCH)
		
		String diaDaSemana;
		
		System.out.print("Digite um dia da semana: ");
		diaDaSemana = scannerSwitch.next().toUpperCase();
		scannerSwitch.close();
		
		switch (diaDaSemana) {
		
			case "DOMINGO": {
				System.out.println("DIA 1");
				break;
			}
			case "SEGUNDA": {
				System.out.println("DIA 2");
				break;
			}
			case "TERÇA": {
				System.out.println("DIA 3");
				break;
			}
			case "QUARTA": {
				System.out.println("DIA 4");
				break;
			}
			case "QUINTA": {
				System.out.println("DIA 5");
				break;
			}
			case "SEXTA": {
				System.out.println("DIA 6");
				break;
			}
			case "SÁBADO": {
				System.out.println("DIA 7");
				break;
			}
			default: {
				System.out.println("Verifique o nome digitado e tente novamente.");
				break;
			}
		} */
		
		
		
	} 

}
