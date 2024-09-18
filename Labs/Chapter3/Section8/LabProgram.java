package Labs.Chapter3.Section8;

import java.util.ArrayList;
import java.util.Scanner;

public class LabProgram {

    // Input 5 Integers and return the Integers in an ArrayList
    public static ArrayList<Integer> inputIntegers(Scanner scnr) {
        ArrayList<Integer> tempIntegers = new ArrayList<>();

        for (int i = 0; i < 5; i++)
            tempIntegers.add(scnr.nextInt());

        return tempIntegers;
    }

    // Input 5 Doubles and return the Doubles in an ArrayList
    public static ArrayList<Double> inputDoubles(Scanner scnr) {
        ArrayList<Double> tempDoubles = new ArrayList<>();

        for (int i = 0; i < 5; i++)
            tempDoubles.add(scnr.nextDouble());

        return tempDoubles;
    }

    // Input 5 Strings, and return the Strings in an ArrayList
    public static ArrayList<String> inputWords(Scanner scnr) {
        ArrayList<String> tempWords = new ArrayList<>();

        for (int i = 0; i < 5; i++)
            tempWords.add(scnr.next());

        return tempWords;
    }

    // Output the elements of the ArrayList parameter
    public static <TheType extends Comparable<TheType>> void print(ArrayList<TheType> list) {
        list.forEach((item) -> {
            System.out.print(item + " ");
        });

        System.out.print("\n");
    }

    // Return the min, median, and max of the ArrayList parameter in a new ArrayList
    public static <TheType extends Comparable<TheType>> ArrayList<TheType> getStatistics(ArrayList<TheType> list) {
        ArrayList<TheType> tempArr = new ArrayList<>();

        list.sort((a, b) -> {
            return a.compareTo(b);
        });

        tempArr.add(list.get(0));
        tempArr.add(list.get(Math.round(list.size() / 2)));
        tempArr.add(list.get(list.size() - 1));

        return tempArr;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Input a list of 5 Integers and print the ArrayList's statistics
        ArrayList<Integer> integers = inputIntegers(scnr);
        print(integers);
        ArrayList<Integer> integerStatistics = getStatistics(integers);
        print(integerStatistics);
        System.out.println();

        // Input a list of 5 Doubles and print the ArrayList's statistics
        ArrayList<Double> doubles = inputDoubles(scnr);
        print(doubles);
        ArrayList<Double> doubleStatistics = getStatistics(doubles);
        print(doubleStatistics);
        System.out.println();

        // Input a list of 5 words (Strings) and print the ArrayList's statistics
        ArrayList<String> words = inputWords(scnr);
        print(words);
        ArrayList<String> wordStatistics = getStatistics(words);
        print(wordStatistics);
    }
}
