package library;

public class BibliothekTest {
	
	public static void main(String[] args) {

	   MeinBuch buch1 = new MeinBuch("buch1");
	
	   BibliothekNG lib1 = new BibliothekNG();
	   lib1.addMedia(buch1);
	   // Rückgabetyp: Media
	   // Fehler: Type mismatch: cannot convert from Media to MeinBuch
	   // MeinBuch buch = lib1.retrieveLast();
	   // Typ MeinBuch ist natürlich erhalten geblieben
	   System.out.println(lib1.retrieveLast() instanceof MeinBuch);
	
	   System.out.println(lib1.retrieveLast());
	   

	   //BibliothekG<Media> lib2 = new BibliothekG<Media>();
	   //BibliothekG<Buch> lib2 = new BibliothekG<Buch>();
	   BibliothekG<MeinBuch> lib2 = new BibliothekG<MeinBuch>();
	   lib2.addMedia(buch1);
	   MeinBuch buch = lib2.retrieveLast();
	   System.out.println(buch);


	   
    }
}
