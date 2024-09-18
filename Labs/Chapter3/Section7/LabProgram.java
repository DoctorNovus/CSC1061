package Labs.Chapter3.Section7;

import java.util.Scanner;

public class LabProgram {
   public static Pair<Integer> readIntegerPair(Scanner scnr) {
      int firstVal = scnr.nextInt();
      int secondVal = scnr.nextInt();

      return new Pair<>(firstVal, secondVal);
   }

   public static Pair<Double> readDoublePair(Scanner scnr) {
      double firstVal = scnr.nextDouble();
      double secondVal = scnr.nextDouble();

      return new Pair<>(firstVal, secondVal);
   }

   public static Pair<String> readWordPair(Scanner scnr) {
      String firstVal = scnr.next();
      String secondVal = scnr.next();

      return new Pair<>(firstVal, secondVal);
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      Pair<Integer> integerPair1 = readIntegerPair(scnr);
      Pair<Integer> integerPair2 = readIntegerPair(scnr);

      Pair<Double> doublePair1 = readDoublePair(scnr);
      Pair<Double> doublePair2 = readDoublePair(scnr);

      Pair<String> wordPair1 = readWordPair(scnr);
      Pair<String> wordPair2 = readWordPair(scnr);

      System.out.println(String.format("%s %s %s", integerPair1, integerPair1.comparisonSymbol(integerPair2), integerPair2));
      System.out.println(String.format("%s %s %s", doublePair1, doublePair1.comparisonSymbol(doublePair2), doublePair2));
      System.out.println(String.format("%s %s %s", wordPair1, wordPair1.comparisonSymbol(wordPair2), wordPair2));
   }
}
