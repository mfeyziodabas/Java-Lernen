package answer;

import java.util.Set;
import java.util.Iterator;
import java.util.TreeSet;

import answer.Person;

public class AnwendungAlternativ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TreeSet ist nach natuerlicher Ordnung sortiert
		// und erlaubt jeden Eintrag nur ein Mal.
		Set<Person> ts = new TreeSet<Person>();
		ts.add(new Person("Heusch", "Peter", 2));
        ts.add(new Person("Rausch", "Alexander", 5));
        ts.add(new Person("Pado", "Ulrike", 4));
        ts.add(new Person("Knauth", "Stefan", 3));
        ts.add(new Person("Mosler", "Christof", 1));

		/* Lehrkoerper nach Personalnummer sortiert ausgeben */
		System.out.println("Standardsortierung nach Personalnummer: ");
		Iterator<Person> it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
