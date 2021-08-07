package Bibliothek;


public class Bibliothek {
	
	private Buch [] alleBucher;
	private Nutzer [] nutzerList;
	
	
	public Bibliothek(Buch[] bucherList, Nutzer[] nutzerList) {
		this.alleBucher = bucherList;
		this.nutzerList = nutzerList;
	}
	
	public Bibliothek(Buch[] bucherList) {
		this(bucherList, new Nutzer[20]);
	}

	public Buch[] getBucherList() {
		return alleBucher;
	}

	public Nutzer[] getNutzerList() {
		return nutzerList;
	}


	public static void main(String[] args) {
		
		Buch [] list = new Buch [5];
		list [0] = new Buch("Victor Hugo", "Sefiller", 123045);
		list [1] = new Buch("Orhan Pamuk", "Masumiyet", 987123);
		list [2] = new Buch("Omer Seyfettin", "Kasagi", 567567);
		list [3] = new Buch("Ataturk", "Nutuk", 111111);
		list [4] = new Buch("Karl Marx", "Das Kapital", 000000);
		
		// Bibliotherk erstellen
		Bibliothek hftStuttgart = new Bibliothek(list);
		
		//Nutzer erstellen
		hftStuttgart.nutzerList[0] = new Nutzer("Feyzi Odabas", 1001220, new Adresse("Mettingerstr", 23, 73061, "Ebersbach"));
		
		//Ein Buch ausleihen
		hftStuttgart.nutzerList[0].buchAusleihen(list[0]);
		
		//Noch ein Buch ausleihen
		System.out.println("\n");
		hftStuttgart.nutzerList[0].buchAusleihen(list[3]);
		
		//Noch ein Buch ausleihen
		System.out.println("\n");
		hftStuttgart.nutzerList[0].buchAusleihen(list[2]);
		
		//Bucherliste vom Nutzer sehen
		System.out.println("\n" +hftStuttgart.nutzerList[0].listNutzerBucher());
		
		//Alle Bucher zuruckgeben
		System.out.println("\n");
		hftStuttgart.nutzerList[0].bucherZuruckGeben();
		
		//Nach der Rückgabe Bücherliste vom Nutzer überprüfen
		System.out.println("\n" +hftStuttgart.nutzerList[0].listNutzerBucher());
		
		//Mitarbeiter erstellen
		hftStuttgart.nutzerList[1] = new Mitarbeiter("Joachim Graber", 1001220, new Adresse("Mettingerstr", 23, 73061, "Ebersbach"), 224, 8933);
		
		//Fur den Mitarbeiter Bucher ausleihen
		hftStuttgart.nutzerList[1].buchAusleihen(list[4]);
		hftStuttgart.nutzerList[1].buchAusleihen(list[1]);
		
		//Bucherliste vom Mitarbeiter sehen
		System.out.println("\n" +hftStuttgart.nutzerList[1].listNutzerBucher());
		
		//Alle Bucher zuruckgeben (Mitarbeiter)
		System.out.println("\n");
		hftStuttgart.nutzerList[1].bucherZuruckGeben();
				
		//Nach der Rückgabe Bücherliste vom Mitarbeiter überprüfen
		System.out.println("\n" +hftStuttgart.nutzerList[1].listNutzerBucher());
		
		//String, der im Aufgabe erstellen
		System.out.println("\n");
		System.out.println("Mitarbeiter: " + hftStuttgart.nutzerList[1].getName() 
										+ "(" + hftStuttgart.nutzerList[1].getIdNummer()  
										+")\n" + "Darf " + hftStuttgart.nutzerList[1].getBucherListe().length 
										+ " Bucher ausleihen");
		System.out.println("\n");
		System.out.println("Nutzer: " + hftStuttgart.nutzerList[0].getName() 
				+ "(" + hftStuttgart.nutzerList[0].getIdNummer()  
				+")\n" + "Darf " + hftStuttgart.nutzerList[0].getBucherListe().length 
				+ " Bucher ausleihen");
		
	}

}
