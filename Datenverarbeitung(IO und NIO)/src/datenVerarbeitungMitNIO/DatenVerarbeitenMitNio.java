package datenVerarbeitungMitNIO;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;





//Path: D:\Java Projekten\Datenverarbeitung(IO und NIO)\src\kundendaten.csv

public class DatenVerarbeitenMitNio implements KundenCSV2Aufkleber {

	public static void main(String[] args) throws IOException {
		
		Path ourPath = Paths.get("D:\\Java Projekten\\Java-Lernen\\Datenverarbeitung(IO und NIO)\\src\\datenVerarbeitung\\kundendaten.csv");
		Path outputPath = Paths.get("D:\\Java Projekten\\Java-Lernen\\Datenverarbeitung(IO und NIO)\\src\\datenVerarbeitungMitNIO");
		
		try {
			List <String> ourLines = Files.readAllLines(ourPath, StandardCharsets.ISO_8859_1);
			
			for (String lines : ourLines) {
			Files.write(outputPath.resolve("output.txt"), lines.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		List <String> ourLines = Files.readAllLines(ourPath, StandardCharsets.ISO_8859_1);
		
	for(int i=0; i<ourLines.size(); i++) {
			if(!ourLines.get(i).isEmpty()) {
				String ausgabe = ourLines.get(i).split(";")[1].trim();
			}
			
		}
		
	
		
		
		
	}
		
	@Override
	public void konvertiereKundendaten(File quelle, File ziel) {
		// TODO Auto-generated method stub
		
	}

}
