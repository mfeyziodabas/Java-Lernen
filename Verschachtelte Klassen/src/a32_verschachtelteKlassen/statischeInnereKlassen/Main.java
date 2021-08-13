/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a32_verschachtelteKlassen.statischeInnereKlassen;

/**
 *
 * @author rausch
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Spieler spieler = new Spieler("Max");
        System.out.println(spieler.calculate());
    }
}
