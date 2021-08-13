/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2x_studentenVergleichMitComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;



/**
 *
 * @author rausch
 */
public class StudentenvergleichMitComparator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	Student studenten[] = new Student[6];
        studenten[0] = new Student("Baur", "Melanie", "INF", 42);
        studenten[1] = new Student("Speiser", "Sebastian", "INF", 43);
        studenten[2] = new Student("Rausch", "Alexander", "WINF", 44);
        studenten[3] = new Student("Pado", "Ulrike", "WINF", 41);
        studenten[4] = new Student("Knauth", "Stefan", "INF", 48);
        studenten[5] = new Student("Mosler", "Christof", "WINF", 47);

        System.out.println("Wählen Sie ...");
        System.out.println("1 - Nachname");
        System.out.println("2 - Vorname");
        System.out.println("3 - Studiengang");
        System.out.println("4 - Matrikelnummer");
        System.out.println("X - Programmende");

        System.out.print("Ihre Eingabe: ");
        Scanner scanner = new Scanner(System.in);
        Character c = scanner.next().charAt(0);
        System.out.println("c = " + c);

        Comparator comparator = null;

        switch (c) {
            case '1':
                comparator = Student.getCompareByNachname();
                break;
            case '2':
                comparator = Student.getCompareByVorname();
                break;
            case '3':
                comparator = Student.getCompareByStudium();
                break;
            case '4':
                comparator = Student.getCompareByMatrikel();
                break;
            case 'X':
                comparator = null;
                break;
        }

        if (comparator != null) {
            Arrays.sort(studenten, comparator);
        }

        for (Student s : studenten) {
            System.out.println(s);
        }

    }

}
