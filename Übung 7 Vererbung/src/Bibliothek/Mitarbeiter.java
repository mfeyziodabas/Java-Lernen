package Bibliothek;

import java.util.Arrays;

public class Mitarbeiter extends Nutzer{
	
	
	private int buroZimmerNummer;
	private int telDurchwahl;
	
	public Mitarbeiter(String name, int idNummer, Adresse adresse, 
										int buroZimmerNummer, int telDurchwahl) {
		super(name, idNummer, adresse);
		this.buroZimmerNummer = buroZimmerNummer;
		this.telDurchwahl = telDurchwahl;
	}

	@Override
	public String toString() {
		return "Nutzer: " + name + ", ID-Nummer: " + idNummer + ", Adresse: " 
					+ adresse + "/nBücherListe: " + Arrays.toString(bucherListe) 
					+ "\nMitarbeiter [buroZimmerNummer=" + buroZimmerNummer 
					+ "\nTelDurchwahl=" + telDurchwahl + "]";
		
		
	}
	
	
	

}
