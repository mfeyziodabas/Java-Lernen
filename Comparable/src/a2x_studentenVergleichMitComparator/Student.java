/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2x_studentenVergleichMitComparator;

import java.util.Comparator;

/**
 *
 * @author rausch
 */
public class Student {

    private String name;
    private String vorname;
    private String studium;
    private int matrikel;

    public Student(String name, String vorname, String studium, int matrikel) {
        this.name = name;
        this.vorname = vorname;
        this.studium = studium;
        this.matrikel = matrikel;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", vorname=" + vorname + ", studium=" + studium + ", matrikel=" + matrikel + '}';
    }

    static public Comparator getCompareByNachname() {
        return new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Student) o1).name.compareTo(((Student) o2).name);
            }
        };
    }

    static public Comparator getCompareByVorname() {
        return new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Student) o1).vorname.compareTo(((Student) o2).vorname);
            }
        };
    }
    
    static public Comparator getCompareByStudium() {
        return new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Student) o1).studium.compareTo(((Student) o2).studium);
            }
        };
    }
    
    static public Comparator getCompareByMatrikel() {
        return new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Student) o1).matrikel - ((Student) o2).matrikel;
            }
        };
    }
}
