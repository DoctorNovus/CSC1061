# 3.6.1: LAB: Zip code and population (generic types)

Define a class `StatePair` with two generic types (`Type1` and `Type2`), a constructor, mutators, accessors, and a `printInfo()` method. Three ArrayLists have been pre-filled with `StatePair` data in `main()`:

- `ArrayList<StatePair<Integer, String>> zipCodeState`: Contains ZIP code/state abbreviation pairs
- `ArrayList<StatePair<String, String>> abbrevState`: Contains state abbreviation/state name pairs
- `ArrayList<StatePair<String, Integer>> statePopulation`: Contains state name/population pairs

Complete main() to use an input ZIP code to retrieve the correct state abbreviation from the ArrayList zipCodeState. Then use the state abbreviation to retrieve the state name from the ArrayList abbrevState. Lastly, use the state name to retrieve the correct state name/population pair from the ArrayList statePopulation and output the pair.

Ex: If the input is:
```
21044
```

the output is:

```
Maryland: 6079602
```