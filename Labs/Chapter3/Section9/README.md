# 3.9.1: LAB: Students (generic class)

Given `LabProgram.java`, complete the program by writing the generic classes `Course` and `Student`.

The main program reads information of five courses and five students as input and stores the information into an `ArrayList` of `Courses` and an `ArrayList` of `Students`. The program then sorts both `ArrayLists` and outputs the sorted information.

Course has private fields:
- `String` department
- `Integer` number

Course has a constructor and member methods:
- `Course(dept, num)` - set `department` to parameter `dept` and `number` to parameter `num`
- `compareTo(otherCourse)` - to enable sorting of `Course` objects, return `-1`, `0`, or `1` according to the comparisons of the private members between `Course` and `otherCourse`. Precedence of comparisons: `department` (lowest first), then `number` (lowest first)
- `toString()` - return a `string` representation of a course in the format `"department number"`

Student has private fields:
- `String` firstName;
- `String` lastName;
- `double` GPA;

Student has a constructor and member methods:
- `Student(first, last, gradeAverage)` - set `firstName` to parameter `first`, `lastName` to parameter `last`, and `GPA` to parameter `gradeAverage`
- `compareTo(otherStudent)` - to enable sorting of `Student` objects, return `-1`, `0`, or `1` according to the comparisons of the private members between `Student` and `otherStudent`. Precedence of comparisons: `GPA` (highest first), then `lastName` (lowest first), then `firstName` (lowest first)
- `toString()` - return a `string` representation of a student in the format `"GPA lastName, firstName"`

Ex: If the input is:

```
Chemistry 250
Chemistry 300
Chemistry 200
Biology 200
Biology 100
Ravi Coltrane 3.75
Oliver Lake 2.9
Lol Coxhill 3.5
John Zorn 2.4
Joe Lavano 2.4
```

the output is:
```
Biology 100
Biology 200
Chemistry 200
Chemistry 250
Chemistry 300

3.75 Coltrane, Ravi
3.50 Coxhill, Lol
2.90 Lake, Oliver
2.40 Lavano, Joe
2.40 Zorn, John
```
