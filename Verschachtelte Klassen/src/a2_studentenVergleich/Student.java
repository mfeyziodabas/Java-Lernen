package a2_studentenVergleich;

/**
 *
 * @author rausch
 */
public class Student implements Comparable {

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

    @Override
    public int compareTo(Object o) {
        return this.name.compareTo(((Student) o).name);
    }
}
