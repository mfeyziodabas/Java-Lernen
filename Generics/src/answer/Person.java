package answer;

public class Person implements Comparable<Person> {
	private String nachname;
	private String vorname;
	private Integer persnr;

	public Person(String nachname, String vorname, Integer persnr) {
		this.nachname = nachname;
		this.vorname = vorname;
		this.persnr = persnr;
	}

	@Override
	public String toString() {
		return ("Personalnummer: " + persnr + " --- Person: " + vorname + " " + nachname);
	}

	@Override
	public int compareTo(Person o) {
		if (persnr < o.persnr) {
			return -1;
		}
		if (persnr > o.persnr) {
			return +1;
		}
		return 0;
	}
}
