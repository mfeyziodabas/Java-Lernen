package generics;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Anwendung {

	public static void main(String[] args) {
		
		List<Person> meineList = new ArrayList<Person>();
		
		meineList.add(new Person ("Speiser","Sebastian",5));
		meineList.add(new Person ("Rausch","Alexander",1));
		meineList.add(new Person ("Pado","Ulrike",4));
		meineList.add(new Person ("Knauth","Stefan",3));
		meineList.add(new Person ("Mosler","Christof",2));
		
		System.out.println(meineList);
		
		Collections.sort(meineList);
		
		System.out.println(meineList);
		

	}

}
