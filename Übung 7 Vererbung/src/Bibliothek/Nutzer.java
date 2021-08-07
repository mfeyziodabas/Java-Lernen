package Bibliothek;

import java.util.Arrays;

public class Nutzer {
	
	private String name;
	private int idNummer;
	private Adresse adresse;
	private Buch [] bucherListe;
	
	public Nutzer(String name, int idNummer, Adresse adresse) {
		this.name = name;
		this.idNummer = idNummer;
		this.adresse = adresse;
		this.bucherListe = new Buch[10];
	}

	public String getName() {
		return name;
	}

	public int getIdNummer() {
		return idNummer;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public Buch[] getBucherListe() {
		return bucherListe;
	}

	@Override
	public String toString() {
		return "Nutzer: " + name + ", ID-Nummer: " + idNummer + ", Adresse: " + adresse + "/nBücherListe: "
				+ Arrays.toString(bucherListe);
	}
	
	// public Adresse getAdresse() {
	//	return new Adresse(strasse, hausNummer, plz, wohnOrt);
	//} 
	
	public void buchAusleihen(Buch buch) {
		for (int i = 0; i<bucherListe.length ; i++) {
			if(buch.isAusgeliehen() == false) {
				if(buch == bucherListe[i]) {
					System.out.println("Das Buch\n" + buch + "\nwurde schon mit gleichem Nutzer ausgeliehen.");
					break;
				} else {
					for(int j = 0; j<bucherListe.length ; j++) {
						if(bucherListe[j] == null) {
						bucherListe[j] = buch;
						buch.setAusgeliehen(true);
						System.out.println("Das Buch\n" + buch + "\nwurde erfolgreich ausgeliehen.");
						break;
						}
					}
				break;
				}
			} else {
				System.out.println("Das Buch\n" + buch + "\nwurde schon mit anderem Nutzer ausgeliehen.");
				break;
			}
		}
	}
	
	
	public void bucherZuruckGeben () {
		for(int i = 0; i<bucherListe.length ; i++) {
			if(bucherListe[i] != null) {
				bucherListe[i].setAusgeliehen(false);
				bucherListe[i] = null;
			}
		}
		System.out.println("Alle Bucher wurden zuruckgegeben...");
	}

	public String listNutzerBucher() {
		return Arrays.toString(bucherListe);
	}
	
	

}
