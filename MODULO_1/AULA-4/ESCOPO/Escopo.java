/**
 * Refere-se ao ambiente entre chaves {}
 */

public class Escopo {
	
	// Variável da classe Escopo (disponível em toda classe)
	int idade = 20;
	
	
	
	public void devolverIdade() {
		
		System.out.println("UTILIZANDO VARIÁVEL GLOBAL:");
		System.out.println("Minha idade é: " + idade  + "\n");
		
	}
	
	
	
	public void devolverNomeCompleto() {
		
		// Variáveis locais do método devolverNome (disponível apenas aqui dentro)
		String primeiroNome = "João";
		String segundoNome = "Arnaldo";
		String ultimoNome = "Silva";
		
		String nomeCompleto = primeiroNome + " " + segundoNome + " "  + ultimoNome;
		
		System.out.println("UTILIZANDO VARIÁVEIS LOCAIS:");
		System.out.println("Meu nome completo é: " + nomeCompleto  + "\n");
		
	}
	
	
	
	public static void main(String[] args) {
		Escopo pessoa = new Escopo();
		
		pessoa.devolverNomeCompleto();
		pessoa.devolverIdade();
	}

}
