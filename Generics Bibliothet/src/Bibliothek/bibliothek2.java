package Bibliothek;

import java.util.ArrayList;

public class bibliothek2 {
	
	private ArrayList liste;
	
	public bibliothek2() {
		this.liste = new ArrayList();
	}

	public void addMedia (Medium m) {
		liste.add(m);
	}
	
	public Medium retrieveLast () {
		int i = liste.size();
		return (Medium) liste.get(i-1);
	}
	
	
	public Medium get (int index) {
		if(index<liste.size()) {
			return (Medium) liste.get(index);
		}
		return null;
	}

	public static void main(String[] args) {
		
		bibliothek2 bib1 = new bibliothek2();
		bib1.addMedia(new Medium() {
		});
		

	}

}
