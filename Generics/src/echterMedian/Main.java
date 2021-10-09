package echterMedian;


public class Main {

	public static void main(String[] args) {

		
		// Mit Double 
		Median<Double> test = new Median<Double>(1.0, 2.5, 1.5, 3.7 , 0.368 , 5.3 );
		
		System.out.println(test);
	
		// Mit Integer
		Median<Integer> test2 = new Median<Integer>(6,5,9,2,1,3);
		
		System.out.println(test2);
		
		
		//Median<Number> test3 = new Median<Number>(6, 5.1, 9, 2, 1, 3);
		
		
	}

}
