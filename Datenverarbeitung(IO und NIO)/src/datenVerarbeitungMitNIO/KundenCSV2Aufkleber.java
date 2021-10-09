package datenVerarbeitungMitNIO;

import java.io.File;

/**
 * 
 * @author Philip Ackermann
 *
 */
public interface KundenCSV2Aufkleber {
	public final static int ANZAHL_SPALTEN = 7;
	
	void konvertiereKundendaten(File quelle, File ziel);
}

