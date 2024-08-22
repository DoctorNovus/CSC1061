package Labs.Chapter1.Section21;

import java.util.ArrayList;

public class Course {

	private ArrayList<Student> roster; // Collection of Student objects

	public Course() {
		roster = new ArrayList<Student>();
	}
   
   // Return an ArrayList of all Students with a GPA of at least 3.5
	public ArrayList<Student> getDeansList() {
	   /* Type your code here */
	}

	public void addStudent(Student s) {
		roster.add(s);
	}
	
	// main
   public static void main(String args[]) {
      Course course = new Course();
      ArrayList<Student> deanList = new ArrayList<Student>();
      String first;  // first name
      String last;   // last name
      double gpa;    // grade point average
      
      first = "Henry";
      last = "Nguyen";
      gpa = 3.5;
      course.addStudent(new Student(first, last, gpa));  // Add 1st student
      
      first = "Brenda";
      last = "Stern";
      gpa = 2.0;
      course.addStudent(new Student(first, last, gpa));  // Add 2nd student
      
      first = "Lynda";
      last = "Robison";
      gpa = 3.2;
      course.addStudent(new Student(first, last, gpa));  // Add 3rd student
      
      first = "Sonya";
      last = "King";
      gpa = 3.9;
      course.addStudent(new Student(first, last, gpa));  // Add 4th student

      deanList = course.getDeansList();
		System.out.println("Dean's list:");
		for (Student student: deanList) {
			System.out.println(student);     // Expect: ArrayList with Henry and Sonya
		}
   }    
}