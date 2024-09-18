package Labs.Chapter3.Section7;

public class Pair<TheType extends Comparable<TheType>> {
   private TheType firstVal;
   private TheType secondVal;

   /* Type the code for The constructor here. */
   public Pair(TheType aVal, TheType bVal) {
      firstVal = aVal;
      secondVal = bVal;
   }

   public String toString() {
      return String.format("[%s, %s]", firstVal, secondVal);
   }

   // Implement Comparable's expected compareTo()
   public int compareTo(Pair<TheType> otherPair) {
      int firstComparison = this.firstVal.compareTo(otherPair.firstVal);
      // If the comparison isn't equal
      if (firstComparison != 0)
         return firstComparison;

      return this.secondVal.compareTo(otherPair.secondVal);
   }

   // Return '<', '=', or '>' according to the ordering of this pair and otherPair
   public char comparisonSymbol(Pair<TheType> otherPair) {
      int result = this.compareTo(otherPair);

      if (result < 0)
         return '<';
      else if (result > 0)
         return '>';
      else
         return '=';
   }
}
