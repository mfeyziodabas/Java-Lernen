package a1_tiere;

public class Hund extends Tier implements Haustier {
	private int marke = 0;

	public Hund(String name) {
		super(name);
	}

	@Override
	public void setMarke(int marke) {
		this.marke = marke;
	}



	@Override
	public String toString() {
		return "Hund [name=" + name + ", marke=" + marke + "]";
	}

}
