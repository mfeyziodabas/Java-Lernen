package student;

import java.util.Arrays;

public class Anwendung {

	public static void main(String[] args) {
		Student studenten [] = new Student[6];
		studenten[0] = new Student("Baur", "Melanie", "INF", 42);
		studenten[1] = new Student("Speiser", "Sebastian", "INF", 43);
		studenten[2] = new Student("Rausch", "Alexander", "WINF", 44);
		studenten[3] = new Student("Pado", "Ulrike", "WINF", 41);
		studenten[4] = new Student("Knauth", "Stefan", "INF", 48);
		studenten[5] = new Student("Mosler", "Christof", "WINF", 47);
		
		//Basic List		
		for (Student s : studenten) {
			System.out.println(s);
		}
		
		System.out.println();
		
		//Nutzung von Array.sort() 
		Arrays.sort(studenten);
		
		//Array wieder auslisten
		for (Student s : studenten) {
			System.out.println(s);
		}
		
		
		
	}

}
