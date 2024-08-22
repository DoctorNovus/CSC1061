package Labs.Chapter1.Section21;

public class Student {
    private String first;
    private String last;
    private double gpa;

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

    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Student(String first, String last, double gpa){
        this.first = first;
        this.last = last;
        this.gpa = gpa;
    }

    public String toString(){
        return String.format("%s %s (GPA: %s)", first, last, gpa);
    }
}
