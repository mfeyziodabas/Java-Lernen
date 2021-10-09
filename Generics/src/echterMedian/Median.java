package echterMedian;

import java.util.ArrayList;
import java.util.Arrays;

public class Median<T extends Number & Comparable<T>>  {

	private final ArrayList<T> value;

	// T... sagt aus, dass die Elemente beim Aufruf kommagetrennt vorliegen dürfen und als Array interpretiert werden
	// Beispielaufruf: Median(1,3,-2, 6)
	
	public Median(T... elements) {
		value = new ArrayList<T>();

		value.addAll(Arrays.asList(elements));

	}

	private ArrayList<T> sort() {
		ArrayList<T> result = new ArrayList<T>();
		result.addAll(value);
		result.sort(null);
		
		return result;
	}

	public T left_median() {
		this.sort();
		if (this.value.size() % 2 != 0) {
			return right_median();

		} else {
			return this.sort().get((value.size() / 2) - 1);

		}

	}

	public T right_median() {
		return this.sort().get((value.size() / 2));

	}
	
	

	public double median() {
		
		if(this.value.size() % 2 != 0) {
			return left_median().doubleValue();
			
			
		}else {
			
			
			return (left_median().doubleValue() + right_median().doubleValue() )  / 2;
			
		}

		
	}

	@Override
	public String toString() {
		String result = "";
		
		for (int i=0; i<value.size(); i++) {
			result += i + " : " + value.get(i).toString() + " \n";
		}
		
		result += "Left Median: " + this.left_median() + "\n";
		result += "Right Median: " + this.right_median() + "\n";
		result += "Median: " + this.median() + "\n";
		
		return result;

	}
	
}
