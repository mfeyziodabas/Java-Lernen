package Aufgabe1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class mainPerson {

	public static void main(String[] args) {
		
		ArrayList<Person> liste = new ArrayList<>();
		
		liste.add(new Person("Speiser", "Sebastian", 5));
		liste.add(new Person("Rausch", "Alexander", 1));
		liste.add(new Person("Pado", "Ulrike", 4));
		liste.add(new Person("Knauth", "Stefan", 2));
		liste.add(new Person("Mosler", "Christof", 3));
		
		for (Person person : liste) {
			System.out.println(person);
		}
		
		Collections.sort(liste);
		System.out.println("-------------------------------------------------------");
		
		for (Person person : liste) {
			System.out.println(person);
		}

	}

}
