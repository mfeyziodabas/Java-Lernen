package übung8;

public class Hund extends Tier implements Haustier {
	
	protected String name;
	protected int marke;
	
	@Override
	public void setMarke(int id) {
		
	}

	public Hund(String name) {
		super();
		this.name = name;
		setMarke(id);
	}
	
	

	

}
