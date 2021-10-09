package datenVerarbeitungMitNIO;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class KundenCSV2AufkleberNIO implements KundenCSV2Aufkleber {

	@Override
	public void konvertiereKundendaten(File quelle, File ziel) {
		
		Charset charset = Charset.forName("ISO-8859-1");
		Path quellPfad = quelle.toPath();
		Path zielPfad = ziel.toPath();
		
		try {
			
			if (Files.exists(zielPfad)) {
				Files.delete(zielPfad);
			}
			
			Path zielDatei = Files.createFile(zielPfad);
			System.out.println(zielDatei);
			List<String> zeilen = Files.readAllLines(quellPfad, charset);
			
			for (int i = 0; i < zeilen.size(); i++) {
				String eingabeZeile = zeilen.get(i);
				
				if (!eingabeZeile.isEmpty()) {
					
					String[] spalten = eingabeZeile.split(";");
					
					if (spalten.length != ANZAHL_SPALTEN) {
						System.err.println("Fehlerhafte Zeile: " + eingabeZeile);
						continue;
					}

					Kunde kunde = new Kunde(spalten[0], spalten[1], spalten[2], spalten[3], spalten[4], spalten[5],
							spalten[6]);

					System.out.println(kunde);
					Files.writeString(zielDatei, "----------------------------------------", charset, StandardOpenOption.APPEND);
					Files.writeString(zielDatei, System.lineSeparator(), charset, StandardOpenOption.APPEND);
					Files.writeString(zielDatei, System.lineSeparator(), charset, StandardOpenOption.APPEND);
					Files.writeString(zielDatei, kunde.getAnrede() + System.lineSeparator(), charset, StandardOpenOption.APPEND);
					Files.writeString(zielDatei, kunde.getVorname() + " " + kunde.getNachname() + System.lineSeparator(), charset, StandardOpenOption.APPEND);
					Files.writeString(zielDatei, kunde.getStrasse() + System.lineSeparator(), charset, StandardOpenOption.APPEND);
					Files.writeString(zielDatei, System.lineSeparator(), charset, StandardOpenOption.APPEND);
					Files.writeString(zielDatei, kunde.getPlz() + " " + kunde.getStadt().toUpperCase() + System.lineSeparator(), charset, StandardOpenOption.APPEND);
					Files.writeString(zielDatei, kunde.getLand().toUpperCase()+ System.lineSeparator(), charset, StandardOpenOption.APPEND);
					Files.writeString(zielDatei, System.lineSeparator(), charset, StandardOpenOption.APPEND);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
