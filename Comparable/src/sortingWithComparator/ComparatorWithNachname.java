package sortingWithComparator;

import java.util.Comparator;

public class ComparatorWithNachname implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getNachName().compareTo(o2.getNachName());
	}

}
