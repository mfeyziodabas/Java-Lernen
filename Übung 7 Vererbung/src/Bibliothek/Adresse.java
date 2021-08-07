package Bibliothek;

public class Adresse {
	
	private String strasse;
	private int hausNummer;
	private int plz;
	private String wohnOrt;
	
	public Adresse(String strasse, int hausNummer, int plz, String wohnOrt) {
		this.strasse = strasse;
		this.hausNummer = hausNummer;
		this.plz = plz;
		this.wohnOrt = wohnOrt;
	}

	public String getStrasse() {
		return strasse;
	}

	public int getHausNummer() {
		return hausNummer;
	}

	public int getPlz() {
		return plz;
	}

	public String getWohnOrt() {
		return wohnOrt;
	}
	
	
	
	

}
