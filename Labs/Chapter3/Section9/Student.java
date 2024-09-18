package Labs.Chapter3.Section9;

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private double GPA;

    public Student(String first, String last, double gradeAverage) {
        this.firstName = first;
        this.lastName = last;
        this.GPA = gradeAverage;
    }

    @Override
    public int compareTo(Student otherStudent) {
        if (Double.compare(this.GPA, otherStudent.GPA) != 0)
            return -1 * Double.compare(this.GPA, otherStudent.GPA);

        int lastNameComparison = this.lastName.compareTo(otherStudent.lastName);
        if (lastNameComparison != 0) return lastNameComparison;

        return this.firstName.compareTo(otherStudent.firstName);
    }

    @Override
    public String toString() {
        return String.format("%.2f %s, %s", GPA, lastName, firstName);
    }
}