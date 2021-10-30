package Aufgabe1;

public class Person implements Comparable<Person> {
	
	private String nachName;
	private String vorName;
	private int personalNummer;
	
	
	@Override
	public String toString() {
		return "[nachName=" + nachName + ", vorName=" + vorName + ", personalNummer=" + personalNummer + "]";
	}


	public Person(String nachName, String vorName, int personalNummer) {
		this.nachName = nachName;
		this.vorName = vorName;
		this.personalNummer = personalNummer;
	}


	public String getNachName() {
		return nachName;
	}


	public void setNachName(String nachName) {
		this.nachName = nachName;
	}


	public String getVorName() {
		return vorName;
	}


	public void setVorName(String vorName) {
		this.vorName = vorName;
	}


	public int getPersonalNummer() {
		return personalNummer;
	}


	public void setPersonalNummer(int personalNummer) {
		this.personalNummer = personalNummer;
	}


	@Override
	public int compareTo(Person o) {
		return this.personalNummer < o.personalNummer ? -1 : 1;
	}

}
