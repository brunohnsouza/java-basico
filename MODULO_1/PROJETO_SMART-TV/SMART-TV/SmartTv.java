// Projetinho

public class SmartTv {
	
	boolean ligada = false;
	float canal = 13.1F;
	int volume = 15;

	public void ligarTv() {
		ligada = true;
		System.out.println("Ligando SmartTV...");
	}
	
	public void desligarTv() {
		ligada = false;
		System.out.println("Desligando SmartTV...");
	}
	
	public void pularCanal() {
		canal++;
	}
	
	public void voltarCanal() {
		canal--;
	}
	
	public void aumentarVolume() {
		volume++;
	}
	
	public void diminuirVolume() {
		volume--;
	}
	
	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		
		System.out.println("Inicialmente, a TV está ligada? " + smartTv.ligada + "\n");
		smartTv.ligarTv();
		System.out.println("Agora ela está ligada? " + smartTv.ligada + "\n");
		smartTv.desligarTv();
		System.out.println("Ela continua ligada? " + smartTv.ligada + "\n");
		
		System.out.println("Inicialmente, qual é o canal da TV? " + smartTv.canal + "\n");
		smartTv.pularCanal();
		smartTv.pularCanal();
		smartTv.pularCanal();
		System.out.println("Depois de pular, qual é o canal da TV agora? " + smartTv.canal + "\n");
		smartTv.voltarCanal();
		smartTv.voltarCanal();
		System.out.println("Depois de voltar, qual é o canal da TV agora? " + smartTv.canal + "\n");
		
		System.out.println("Inicialmente, qual o volume da SmartTV? " + smartTv.volume + "\n");
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		System.out.println("Aumentei... e agora? Qual o volume? " + smartTv.volume + "\n");
		smartTv.diminuirVolume();
		System.out.println("Diminuir... e agora? Qual o volume? " + smartTv.volume + "\n");
		
		

	}

}
