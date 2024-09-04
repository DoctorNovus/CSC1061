package Labs.Chapter2.Section16;

public class OfferedCourse extends Course {
    // TODO: Declare private fields
    private String instructorName;
    private String location;
    private String classTime;

    // TODO: Define mutator methods -
    // setInstructorName(), setLocation(), setClassTime()

    // TODO: Define accessor methods -
    // getInstructorName(), getLocation(), getClassTime()

    public String getInstructorName() {
        return this.instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getClassTime() {
        return this.classTime;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

}