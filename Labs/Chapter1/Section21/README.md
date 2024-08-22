# 1.21.1: LAB: Dean's list (EO)

Students make the Dean's list if their GPA is 3.5 or higher. Complete the `Course` class by implementing the `getDeansList()` method, which returns an `ArrayList` of students with a GPA of 3.5 or higher.

Given classes:

Class `Course` represents a course, which contains an `ArrayList` of `Student` objects as a course roster. (Type your code in here.)
Class `Student` represents a classroom student, which has three fields: `first name`, `last name`, and `GPA`. (Hint: `getGPA()` returns a student's GPA.)

Ex: If the following students and their GPA values are added to a course:
```
Henry Nguyen with 3.5 GPA
Brenda Stern with 2.0 GPA
Lynda Robison with 3.2 GPA
Sonya King with 3.9 GPA
```

then the `getDeansList()` method returns an `ArrayList` of 2 students and the program output is:

```
Dean's list:
Henry Nguyen (GPA: 3.5)
Sonya King (GPA: 3.9)
```