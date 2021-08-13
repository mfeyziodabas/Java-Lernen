package student;

public class Student implements Comparable<Student>{
	
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
		return "Student [nachName=" + nachName + ", vorName=" + vorName + ", studiengang=" + studiengang + ", matrikel="
				+ matrikel + "]";
	}


	@Override
	public int compareTo(Student o) {
		return this.nachName.compareTo(o.nachName);
	}
	
	
	

}
