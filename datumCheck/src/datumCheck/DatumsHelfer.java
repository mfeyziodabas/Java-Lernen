package datumCheck;

public class DatumsHelfer {
	
	// Classen -------------------------------------------
	static class DatumFormatException extends Exception {
		public DatumFormatException () {	
		}
		
		public DatumFormatException (String m) {
			super(m);
		}
		
	}
	
	static class DatumUngueltigException extends Exception {
		public DatumUngueltigException() {	
		}
		
		public DatumUngueltigException(String m) {
			super(m);
		}
		
	}
	
	// Methoden --------------------------------------------
	
	public static Datum parseDatum (String s) throws DatumFormatException, DatumUngueltigException {
		s = s.replaceAll("\\D+", "");
		int sInt = Integer.parseInt(s);
		
		if(sInt > 31129999) {
			throw new DatumFormatException("Dieses Datum hat kein gültiger Format! Bitte geben Sie ein anderes Datum.");
		} else {
			int jahr = sInt%10000;
			int monat =sInt %1000000/10000;
			int tag = sInt/1000000;
			Datum sd = new Datum(tag, monat, jahr);

			if(sd.istGueltig()) {
				return new Datum(tag, monat, jahr);
			} else {
				throw new DatumUngueltigException("Dieses Datum ist ungültig!");
			}
		}
	}
	
	public static Datum testDatum () {
		String[] testList= {"14.05.2021", "1.1.2021", "32.05.2021", "14th May"};
		for(String datum : testList) {
			try {
				System.out.println(parseDatum(datum));
			} catch (DatumFormatException e) {
				e.printStackTrace();
				
			} catch (DatumUngueltigException e) {
				e.printStackTrace();
			}
		}
 		return null;
	}
	
	
	//Main -----------------------------------
	public static void main(String[] args) throws DatumFormatException, DatumUngueltigException {
		
		//Probe -------------------------------
		String s = "02.04.2020";
		System.out.println(parseDatum(s));
		
		//Test-Methode --------------------
		System.out.println();
		testDatum();
		
		//Differenz-Probe
		System.out.println(parseDatum(s).tagesDifferenz(new Datum(17, 9, 2021)));
		
		//WochenTag-Probe
		System.out.println(parseDatum(s).wochentag());
		
		//Nächtser Tag-Probe
		System.out.println(parseDatum(s).naechsterTag());
		

	}

}
