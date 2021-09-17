package datumCheck;
/** 
 * Speichert ein Datum und stellt Methoden zur Verfuegung,
 * um einfache kalendarische Funktionen zu berechnen.
 *
 */
public class Datum
{
    /** Tag im Wertebereich von 1 bis 31 */
    private int tag;
    
    /** Monat im Wertebereich von 1 bis 12 */
    private int monat;
    
    /** Jahr im Wertebereich von 1 bis unendlich */
    private int jahr;

    /** Konstruktor.
     * 
     * @param tag Tag
     * @param monat Monat
     * @param jahr Jahr
     */
    public Datum(int tag, int monat, int jahr) {
        this.tag = tag;
        this.monat = monat;
        this.jahr = jahr;
    }

    /** Liefert den Tag des Datums. 
     * 
     * @return Tag des Datums
     */
    public int getTag() {
        return tag;
    }

    /** Liefert den Monat des Datums. 
     * 
     * @return Monat des Datums
     */
    public int getMonat() {
        return monat;
    }

    /** Liefert das Jahr des Datums. 
     * 
     * @return Jahr des Datums
     */
    public int getJahr() {
        return jahr;
    }

    /** Ist das angegebene Jahr ein Schaltjahr? 
     * 
     * @param jahr Jahr
     * @return <code>true</code> wenn das Jahr ein Schaltjahr ist, 
     *   ansonsten <code>false</code>
     */
    public static boolean istSchaltjahr(int jahr) {
        return ((jahr % 4 == 0) && (jahr % 100 != 0))
            || (jahr % 400 == 0);
    }

    /** Liegt das Datum in einem Schaltjahr? 
     * 
     * @return <code>true</code> wenn das Jahr ein Schaltjahr ist, 
     *   ansonsten <code>false</code>
     */
    public boolean istSchaltjahr() {
        return istSchaltjahr(jahr);
    }

    /** Berechnet die Anzahl Tage, die ein bestimmter Monat eines
        Jahres hat.
     *
     * @param monat Monat
     * @param jahr Jahr
     * @return Anzahl der Tage des Monats
     */
    public static int anzahlTage(int monat, int jahr) {
        if (monat == 2) {
            return istSchaltjahr(jahr) ? 29 : 28;
        } else if (monat == 4 || monat == 6 || monat == 9 || monat == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    /** Erzeugt ein neues Datum, das auf den folgenden Tag zeigt. 
     * 
     * @return Datum fuer den folgenden Tag
     */
    public Datum naechsterTag() {
        int ntag = tag + 1;
        int nmonat = monat;
        int njahr = jahr;
        if (ntag > anzahlTage(monat, jahr)) {
            ntag = 1;
            ++nmonat;
            if (nmonat > 12) {
                nmonat = 1;
                ++njahr;
            }
        }
        return new Datum(ntag, nmonat, njahr);
    }

    /** Berechnet die Anzahl der Tage, die zwischen dem aktuellen und
        dem angegebenen Datum <i>d</i> liegen. Ist <i>d</i> das fruehere
        Datum, wird ein negativer Wert zurueckgegeben. 
     *
     * @param d Datum zu dem die Differenz berechnet wird
     * @return Differenz der Tage
     */
    public int tagesDifferenz(Datum d) {
        // Welches ist das spaetere Datum?
        boolean dspaeter = false;
        if (d.jahr > jahr) {
            dspaeter = true;
        } else if (d.jahr == jahr) {
            if (d.monat > monat) {
                dspaeter = true;
            } else if (d.monat == monat) {
                dspaeter = d.tag > tag;
            }
        }

        // Zaehle Tage zwischen den beiden Daten
        Datum d1 = dspaeter ? this : d;
        Datum d2 = dspaeter ? d : this;
        int differenz = 0;
        while (!(d1.tag == d2.tag && d1.monat == d2.monat && 
                 d1.jahr == d2.jahr)) {
            ++differenz;
            d1 = d1.naechsterTag();
        }
        return dspaeter ? differenz : -differenz;
    }

    /** Ausgangsdatum fuer die Berechnung des Wochentages */
    private static Datum startMontag = new Datum(28, 12, 1970);

    /** Berechnet den Wochentag eines Datums. Liefert nur fuer Daten ab
     *  dem 28.12.1970 gueltige Ergebnisse.
     *  
     * @return Wochentag zwischen 0 (Montag) und 6 (Sonntag)
     */
    public int wochentag() {
        return startMontag.tagesDifferenz(this) % 7;
    }

    /** Hat das aktuelle Datum einen gueltigen Wert?
     * 
     * @return <code>true</code> wenn das Datum gueltig ist, 
     *   ansonsten <code>false</code>
     */
    public boolean istGueltig() {
        return monat >= 1 && monat <= 12
            && tag >= 1 && tag <= anzahlTage(monat, jahr)
            && startMontag.tagesDifferenz(this) >= 0;
    }
    
    /** Wandelt ein Datum in eine Zeichenkette um. */
    public String toString() {
        return "" + tag + "." + monat + "." + jahr;
    }
}