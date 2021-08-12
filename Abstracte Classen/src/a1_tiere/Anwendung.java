package a1_tiere;

public class Anwendung {

	public static void main(String[] args) {
		int ldfNr = 1;
		Tier meineTiere[] = new Tier[] { new Hund("Bello"), new Hund("Hasso"), new Pinguin("Schnappi"),
				new Wellensittich("Fifi") };

		for (Tier tier : meineTiere) {
			if (tier instanceof Haustier) {
				((Haustier) tier).setMarke(ldfNr++);
			}
			System.out.println(tier);
		}
	}
}

