package answer;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

import answer.Person;

public class Anwendung {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Person> al = new ArrayList<Person>();
        al.add(new Person("Heusch", "Peter", 2));
        al.add(new Person("Rausch", "Alexander", 5));
        al.add(new Person("Pado", "Ulrike", 4));
        al.add(new Person("Knauth", "Stefan", 3));
        al.add(new Person("Mosler", "Christof", 1));
        
		/* 1. Alternative: In einen Array fester Groesse zurueckkopieren -- das kennen Sie schon */
        Person leerkoerper[] = new Person[al.size()];  
        leerkoerper = al.toArray(leerkoerper);
        Arrays.sort(leerkoerper);
        // Nun ist leerkoerper sortiert...
        // Nachteil: unnoetiges Anlegen eines Objektes, Kopiererei und anschliessenden Sortieren

        /* 2. Alternative: Direkt die Collection ArrayList sortieren */
		Collections.sort(al);
		// Nun ist auch al sortiert.
		
		System.out.println("Standardsortierung nach Personalnummer: ");
		for (Person p : al) {
			System.out.println(p);
		}

  }
}
