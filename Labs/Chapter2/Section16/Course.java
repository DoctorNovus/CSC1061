package Labs.Chapter2.Section16;

public class Course {
    // TODO: Declare private fields
    private String courseNumber;
    private String courseTitle;

    // TODO: Define mutator methods -
    // setCourseNumber(), setCourseTitle()

    // TODO: Define accessor methods -
    // getCourseNumber(), getCourseTitle()

    public String getCourseNumber() {
        return this.courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseTitle() {
        return this.courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    // TODO: Define printInfo()

    public void printInfo() {
        System.out.println("Course Information:");
        System.out.println("   Course Number: " + courseNumber);
        System.out.println("   Course Title: " + courseTitle);
    }
}
