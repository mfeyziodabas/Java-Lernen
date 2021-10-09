package generics;

public class Person implements Comparable<Person>{

	private String vorName;
	private String nachName;
	private Integer personalnummer;
	

	public Person(String vorName, String nachName, Integer personalnummer) {
		this.vorName = vorName;
		this.nachName = nachName;
		this.personalnummer = personalnummer;
	}
	
	
	@Override
	public String toString() {
		return "Person [vorName=" + vorName + ", nachName=" + nachName + ", personalnummer=" + personalnummer + "]";
	}


	public String getVorName() {
		return vorName;
	}
	
	public String getNachName() {
		return nachName;
	}
	
	public int getPersonalnummer() {
		return personalnummer;
	}



	@Override
	public int compareTo(Person o) {
		Person p = (Person) o;
		
		if(this.getPersonalnummer()>p.getPersonalnummer()) {
			return 1;
		}
		if (this.getPersonalnummer()<p.getPersonalnummer()) {
			return -1;
		}
		return 0;
	}


}
