# 3.8.1: LAB: Min, max, median (generic methods)

Given `main()`, complete `LabProgram.java` by implementing the following methods:

- inputIntegers()
    - Take a scanner as a parameter
    - Read 5 integers from a user
    - Store the integers in an `ArrayList` of type `Integer`
    - Return the `ArrayList`
- inputDoubles()
    - Take a scanner as a parameter
    - Read 5 doubles from a user
    - Store the doubles in an `ArrayList` of type `Double`
    - Return the `ArrayList`
- inputWords()
    - Take a scanner as a parameter
    - Read 5 one-word strings from a user
    - Store the strings in an `ArrayList` of type `String`
    - Return the `ArrayList`
- print()
    - Take an `ArrayList` as a parameter
    - Output the elements of the `ArrayList` parameter
    - For coding simplicity, follow each output element by a space, including the last one
    - Output a newline after the last element
- getStatistics()
    - Take an `ArrayList` as a parameter
    - Store the `minimum`, `median`, and `maximum` values of the `ArrayList` parameter in a new `ArrayList`
    - Return the new `ArrayList` containing the `minimum`, `median`, and `maximum` values
    - Hint: Sort the `ArrayList` by using `Collections.sort()` to find the `minimum`, `median`, and `maximum` values

Ex: If the input is:

```
3 1 5 9 7
2.2 3.3 1.1 4.4 5.5
one two three four five
```

the output is:

```
3 1 5 9 7 
1 5 9 

2.2 3.3 1.1 4.4 5.5 
1.1 3.3 5.5 

one two three four five 
five one two 
```
