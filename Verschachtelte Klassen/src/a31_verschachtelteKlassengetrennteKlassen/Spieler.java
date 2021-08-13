/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a31_verschachtelteKlassengetrennteKlassen;

/**
 *
 * @author rausch
 */
public class Spieler {
    private String name;
    public Spieler(String name) {
        this.name = name;
    }
    public String calculate() {
        Wuerfel wuerfel = new Wuerfel();
        return name + ": " + wuerfel.calculate();
    }
}
