/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package a32_verschachtelteKlassen.statischeInnereKlassen;

/**
 *
 * @author rausch
 */
public class Spieler {
    private String name;
    public Spieler(String name) {
        this.name = name;
    }
    public String calculate(){
        return name + ": " + Wuerfel.calculate();
    }

     static public class Wuerfel {
        static public int calculate() {
            return (int) (Math.random() * 6) + 1;
        }
    }
}
