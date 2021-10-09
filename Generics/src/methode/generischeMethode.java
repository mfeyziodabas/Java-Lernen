package methode;

public class generischeMethode {
	
	public static <T extends Number> Double convert(T a, T b){
		return (a.doubleValue() > b.doubleValue()) ? a.doubleValue() : b.doubleValue();
	}

	public static void main(String[] args) {
		
		System.out.println(convert(53, 45.5));

	}

}
