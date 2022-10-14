package main1;

import main.kahve.Americano;
import main.kahve.Espresso;
import main.kahve.Kahve;
import main.kahve.Latte;

public class MainClass {

	public static void main(String args[]) {
		
		/*Kahve kahve = new Kahve();
		kahve.setBardakBoyutu("buyuk");
		System.err.println("boyut:" + kahve.getBardakBoyutu());
		*/
		
		Americano kahve2 = new Americano();
		//kahve2.benimKahvem();
		kahve2.Fiyat(50);
		
		Espresso kahve3 = new Espresso();
		kahve3.Fiyat(15);
		
		Latte kahve4 = new Latte();
		kahve4.Fiyat(15);
	
		
	}
}
