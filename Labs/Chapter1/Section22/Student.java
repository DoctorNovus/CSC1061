package Labs.Chapter1.Section22;

public class Student {
    private String first;
    private String last;
    private double GPA;

    public String getFirst() {
        return this.first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return this.last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public double getGPA() {
        return this.GPA;
    }

    public void setGPA(double gpa) {
        this.GPA = gpa;
    }

    public Student(String first, String last, double gpa){
        this.first = first;
        this.last = last;
        this.GPA = gpa;
    }

    public String toString(){
        return String.format("%s %s (GPA: %s)", first, last, GPA);
    }
}
