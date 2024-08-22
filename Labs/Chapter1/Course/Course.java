package Labs.Chapter1.Course;

import java.util.ArrayList;

import Labs.Chapter1.Course.Student;

// Class representing a student
public class Course {
	private ArrayList<Student> roster; // Collection of Student objects

	public Course() {
		roster = new ArrayList<Student>();
	}

   // Output each student in the course roster, and then the total size of the course
	public void printRoster() {
		for (Student student : roster) {
         System.out.println(student);
      }

      System.out.println("Students: " + roster.size());
	}

	public void addStudent(Student s) {
		roster.add(s);
	}
    
   // main
   public static void main(String args[]) {
      Course course = new Course();
      String first;  // first name
      String last;   // last name
      double gpa;    // grade point average
      
      first = "Henry";
      last = "Cabot";
      gpa = 3.5;
      course.addStudent(new Student(first, last, gpa));  // Add 1st student
      
      first = "Brenda";
      last = "Stern";
      gpa = 2.0;
      course.addStudent(new Student(first, last, gpa));  // Add 2nd student
      
      first = "Jane";
      last = "Flynn";
      gpa = 3.9;
      course.addStudent(new Student(first, last, gpa));  // Add 3rd student
      
      first = "Lynda";
      last = "Robison";
      gpa = 3.2;
      course.addStudent(new Student(first, last, gpa));  // Add 4th student

      course.printRoster();
   }    
}
