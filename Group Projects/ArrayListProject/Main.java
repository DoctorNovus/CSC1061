package ArrayListProject;

import java.util.ArrayList;

/**
 * @author Daniel Wedding
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> students = new ArrayList<Person>();

        students.add(new Person("Daniel", 3, "Software Engineer", 122644));
        students.add(new Person("Sahtra", 4, "Software Engineer", 15000000));
        students.add(new Person("Dean", 5, "Software Engineer", 100000));

        ArrayList<String> studentNames = new ArrayList<String>();
        ArrayList<Integer> studentClassCounts = new ArrayList<Integer>();

        students.forEach((person) -> {
            studentNames.add(person.getName());
            studentClassCounts.add(person.getClassCount());
        });
    }
}