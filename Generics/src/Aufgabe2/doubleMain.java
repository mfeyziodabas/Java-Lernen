package Aufgabe2;

class doubleSel{
	
	public static <T extends Number> double doubleSell(T t1, T t2) {
		return t1.doubleValue()>t2.doubleValue() ? t1.doubleValue() : t2.doubleValue();
	}
	
}

public class doubleMain {

	public static void main(String[] args) {
		
		Integer int1 = 55;
		Double db1= 34.5;
		Integer int2 = 66;
		
		System.out.println(doubleSel.doubleSell(int1, db1));
		System.out.println(doubleSel.doubleSell(db1, int2));
		System.out.println(doubleSel.doubleSell(int2, int1));

	}

}
