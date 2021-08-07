package Bibliothek;

import java.util.Arrays;

public class Mitarbeiter extends Nutzer{
	
	
	private int buroZimmerNummer;
	private int telDurchwahl;
	
	public Mitarbeiter(String name, int idNummer, Adresse adresse, 
										int buroZimmerNummer, int telDurchwahl) {
		super(name, idNummer, adresse);
		this.bucherListe = new Buch [20];
		this.buroZimmerNummer = buroZimmerNummer;
		this.telDurchwahl = telDurchwahl;
	}
	
	
	public int getBuroZimmerNummer() {
		return buroZimmerNummer;
	}

	public int getTelDurchwahl() {
		return telDurchwahl;
	}

	@Override
	public String toString() {
		return "Mitarbeiter: " + name + ", ID-Nummer: " + idNummer + ", Adresse: " 
					+ adresse + "/nBücherListe: " + Arrays.toString(bucherListe) 
					+ "\nMitarbeiter [buroZimmerNummer=" + buroZimmerNummer 
					+ "\nTelDurchwahl=" + telDurchwahl + "]";
	}
	
	
	

}
