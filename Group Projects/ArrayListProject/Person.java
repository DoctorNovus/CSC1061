package ArrayListProject;

public class Person {
    private String name;
    private int classCount;
    private String careerDescription;
    private int desiredSalary;

    public Person(String name, int classCount, String careerDescription, int desiredSalary) {
        this.name = name;
        this.classCount = classCount;
        this.careerDescription = careerDescription;
        this.desiredSalary = desiredSalary;
    }

    public String toString() {
        return String.format("%s is in %s classes, focusing to become a %s with the desired salary of $%s.", name,
                classCount, careerDescription, desiredSalary);
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassCount() {
        return this.classCount;
    }

    public void setClassCount(int classCount) {
        this.classCount = classCount;
    }

    public String getCareerDescription() {
        return this.careerDescription;
    }

    public void setCareerDescription(String careerDescription) {
        this.careerDescription = careerDescription;
    }

    public int getDesiredSalary() {
        return this.desiredSalary;
    }

    public void setDesiredSalary(int desiredSalary) {
        this.desiredSalary = desiredSalary;
    }
}