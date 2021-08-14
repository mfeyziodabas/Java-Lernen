package sortingWithComparator;

import java.util.Arrays;
import java.util.Comparator;

public class Anwendung {

	public static void main(String[] args) {
		Student studenten [] = new Student[6];
		studenten[0] = new Student("Baur", "Melanie", "INF", 42);
		studenten[1] = new Student("Speiser", "Sebastian", "INF", 43);
		studenten[2] = new Student("Rausch", "Alexander", "WINF", 44);
		studenten[3] = new Student("Pado", "Ulrike", "WINF", 41);
		studenten[4] = new Student("Knauth", "Stefan", "INF", 48);
		studenten[5] = new Student("Mosler", "Christof", "WINF", 47);
		
		for(Student s: studenten) {
			System.out.println(s);
		}
		
		//Comparator with VorName using Anonymous Class
		Arrays.sort(studenten, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				
				return o1.getVorName().compareTo(o2.getVorName());
			}
		});
		
		System.out.println();
		for(Student s: studenten) {
			System.out.println(s);
		}
		
		//Comparator with NachName using another class
		Arrays.sort(studenten, new ComparatorWithNachname());
		System.out.println();
		for(Student s: studenten) {
			System.out.println(s);
		}

	}

}
