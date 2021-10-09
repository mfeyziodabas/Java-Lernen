package library;

public class MeinBuch implements Buch {
   
   private String titel;
   
   public MeinBuch (String t) {
	   titel = t;
   }
	
   public String toString() {
	   return titel;
   }
   
}
