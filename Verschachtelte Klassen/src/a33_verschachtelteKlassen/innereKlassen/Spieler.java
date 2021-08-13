/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a33_verschachtelteKlassen.innereKlassen;

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
    public class Wuerfel {
        public int calculate() {
            return (int) (Math.random() * 6) + 1;
        }
    }
}
