package alessia.whistle.avvio;

import alessia.whistle.classe.Product;
import alessia.whistle.classe.Whistle;

public class Avvio {

	public static void main(String[] args) {
		Whistle duck = new Whistle("Kwaak");
		Whistle rooster = new Whistle("Peef");
		
		duck.sound();
		rooster.sound();
		
		
		System.out.println("--------ESERCIZIO 2---------");
		Product banana = new Product("Banana", 13, 1.1);
		
		banana.printProduct();
	}

}
