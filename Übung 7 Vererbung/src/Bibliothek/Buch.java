package Bibliothek;

public class Buch {
	
	private String autor;
	private String titel;
	private int isbn;
	private boolean isAusgeliehen;
	
	public Buch(String autor, String titel, int isbn) {
		this.autor = autor;
		this.titel = titel;
		this.isbn = isbn;
		this.isAusgeliehen = false;
	}

	@Override
	public String toString() {
		return "Buch Informationen: "
					+ "\nAutor:" + autor 
					+ "\nTitel:" + titel 
					+ "\nISBN:" + isbn 
					+ "\nIst das Buch ausgeliehen?" + isAusgeliehen;
	}

	public String getAutor() {
		return autor;
	}

	public String getTitel() {
		return titel;
	}

	public int getIsbn() {
		return isbn;
	}

	public boolean isAusgeliehen() {
		return isAusgeliehen;
	}

	public void setAusgeliehen(boolean isAusgeliehen) {
		this.isAusgeliehen = isAusgeliehen;
	}
	
	
	
	
	

}
