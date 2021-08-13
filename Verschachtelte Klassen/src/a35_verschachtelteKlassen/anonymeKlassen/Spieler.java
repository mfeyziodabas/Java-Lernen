/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a35_verschachtelteKlassen.anonymeKlassen;

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
        return (name + ": " + (new ZufallsZahl() {
            public int calculate() {
                return (int) (Math.random() * 6) + 1;
            }
        }).calculate());
    }
}
