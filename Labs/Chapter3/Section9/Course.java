package Labs.Chapter3.Section9;

public class Course implements Comparable<Course> {
    private String department;
    private Integer number;

    public Course(String dept, Integer num) {
        this.department = dept;
        this.number = num;
    }

    @Override
    public int compareTo(Course otherCourse) {
        int departmentComparison = this.department.compareTo(otherCourse.department);
        if (departmentComparison != 0)
            return departmentComparison;

        return this.number.compareTo(otherCourse.number);
    }

    @Override
    public String toString() {
        return String.format("%s %s", department, number);
    }
}