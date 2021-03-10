package Enumconcept;

import java.util.EnumSet;

public class EnumSetConcepts {

	enum Beer {
		KF(78), BR(99), RC(69), FO,MC;
		int price;
		Beer() {
			this.price = 65;
			System.out.println("Constructor");
		}
		Beer(int price) {
			this.price = price;
			System.out.println("Constructor with args");
		}
		
	}
	public static void main(String[] args) {
		EnumSet<Beer> beers = EnumSet.allOf(Beer.class);
		System.out.println(beers);

		EnumSet<Beer> beersNone = EnumSet.noneOf(Beer.class);
		System.out.println(beersNone);
		
		EnumSet<Beer>  enumRange = EnumSet.range(Beer.KF, Beer.RC);
		System.out.println(enumRange);
		
		EnumSet<Beer> particularBeer = EnumSet.of(Beer.RC);
		System.out.println(particularBeer);
		
		EnumSet<Beer> particularBeers = EnumSet.of(Beer.RC,Beer.MC);
		System.out.println(particularBeers);
		
		//All other Collection methods like add,addAll,remove,removeAll
	}

}
