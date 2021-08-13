package sortingWithComparator;

public class Student {
	
	private String nachName;
	private String vorName;
	private String studiengang;
	private int matrikel;
	
	public Student(String nachName, String vorName, String studiengang, int matrikel) {
		this.nachName = nachName;
		this.vorName = vorName;
		this.studiengang = studiengang;
		this.matrikel = matrikel;
	}

	@Override
	public String toString() {
		return "Student [nachName=" + nachName + ", vorName=" + getVorName() + ", studiengang=" + studiengang + ", matrikel="
				+ matrikel + "]";
	}

	public String getVorName() {
		return vorName;
	}

	public String getNachName() {
		return nachName;
	}

	
	

}
