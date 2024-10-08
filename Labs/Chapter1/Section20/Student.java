package Labs.Chapter1.Section20;

public class Student {
    private String first;
    private String last;
    private double gpa;

    public Student(String first, String last, double gpa){
        this.first = first;
        this.last = last;
        this.gpa = gpa;
    }

    public String toString(){
        return String.format("%s %s (GPA: %s)", first, last, gpa);
    }
}
