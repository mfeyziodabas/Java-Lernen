package fastEchterMedian;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Median<T extends Comparable<T>> {

	private final ArrayList<T> value;

	// T... elements bedeutet: Aufruf mit z.B. Median(1,3,6,-2) wird interpretiert als Integer[] elements = [1,3,6,-2]
	// (die Argumente werden also im Array elements zusammengefasst, der konkrete Typ wird aus den Argumenttypen inferiert
	public Median(T... elements) {
		value = new ArrayList<T>();
		value.addAll(Arrays.asList(elements));
	}

	private ArrayList<T> sort() {
		ArrayList<T> result = new ArrayList<T>();
		result.addAll(value);
		Collections.sort(result);	
		return result;
	}

	public T left_median() {
		if (this.value.size() % 2 != 0) {
			return right_median();
		} else {
			return this.sort().get((value.size() / 2) - 1);
		}
	}

	public T right_median() {
		return this.sort().get((value.size() / 2));
	}

	@Override
	public String toString() {
		String result = "";
		int i = 1;

		for (T t : value) {
			result += i++ + " : " + t.toString() + " \n";
		}

		result += "Left Median:  " + this.left_median() + "\n";
		result += "Right Median: " + this.right_median() + "\n";

		return result;
	}

}
