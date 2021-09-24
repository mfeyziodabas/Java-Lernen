package datenVerarbeitung;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


//Path: D:\Java Projekten\Datenverarbeitung(IO und NIO)\src\kundendaten.csv

public class DatenVerarbeiten implements KundenCSV2Aufkleber {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new FileReader("D:\\Java Projekten\\Datenverarbeitung(IO und NIO)\\src\\datenVerarbeitung\\kundendaten.csv"));
		String line;
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Java Projekten\\Datenverarbeitung(IO und NIO)\\src\\datenVerarbeitung\\output.txt"));
		
		while((line = br.readLine()) != null) {
			String [] separetedLines = line.split(";");
			String anrede = null;
			String vorName = null;
			String name = null;
			String strasse = null;
			String plz = null;
			String ort = null;
			String land = null;
	
			for(int id=0; id<separetedLines.length; id++) {
				if(id == 0 || id%7 ==0)
					anrede = separetedLines[id];
				if(id%7 ==1)
					vorName = separetedLines[id];
				if(id%7 == 2)
					name = separetedLines[id];
				if(id%7 ==3)
					strasse = separetedLines[id];
				if(id%7 ==4)
					plz = separetedLines[id];
				if(id%7 == 5)
					ort = separetedLines[id];
				if(id%7 == 6)
					land = separetedLines[id];
				
			}
			
			System.out.println("---------------------------------" + "\n\n" + anrede + "\n" + vorName + " " + name + "\n" + strasse + 
					"\n\n" + plz + " " + ort + "\n" + land  + "\n");
			
			bw.write("---------------------------------" + "\n\n" + anrede + "\n" + vorName + " " + name + "\n" + strasse + 
					"\n\n" + plz + " " + ort + "\n" + land  + "\n");
			bw.newLine();
			
			
		}
		
		br.close();
		bw.close();

	}

	@Override
	public void konvertiereKundendaten(File quelle, File ziel) {
		// TODO Auto-generated method stub
		
	}

}
