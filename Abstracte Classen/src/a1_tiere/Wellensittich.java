package a1_tiere;

public class Wellensittich extends Vogel implements Haustier {
	private int marke = 0;
	
	public Wellensittich(String name) {
		super(name);
	}
	

	@Override
	public String toString() {
		return "Wellensittich [name=" + name + ", marke=" + marke + "] ";
	}


	@Override
	public void setMarke(int marke) {
		this.marke = marke;
	}

}
