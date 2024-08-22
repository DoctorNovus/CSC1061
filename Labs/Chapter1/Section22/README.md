# 1.22.1: LAB: Drop student (EO)


Complete the `Course` class by implementing the `dropStudent()` method, which removes a student (by last name) from the course roster. If the student is not found in the course roster, no student should be dropped. Assume all students have distinct last names.

Given classes:

Class `Course` represents a course, which contains an `ArrayList` of `Student` objects as a course roster. (Type your code in here.)
Class `Student` represents a classroom student, which has three private fields: `first name`, `last name`, and `GPA`. (Hint: `getLast()` returns the last name field.)

Ex: If the following students and their GPA values are added to a course:

```
Henry Nguyen with 3.5 GPA
Brenda Stern with 2.0 GPA
Lynda Robison with 3.2 GPA
Sonya King with 3.9 GPA
```


then `dropStudent(last)`, where `last` is `"Stern"`, removes a student and the program output is:

```
Course size: 4 students
Course size after drop: 3 students
```
