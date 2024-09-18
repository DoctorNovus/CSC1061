package Labs.Chapter3.Section6;

public class StatePair<Type1 extends Comparable<Type1>, Type2 extends Comparable<Type2>> {
    private Type1 value1;
    private Type2 value2;

    // TODO: Define a constructor, mutators, and accessors
    // for StatePair
    public StatePair(Type1 item1, Type2 item2) {
        value1 = item1;
        value2 = item2;
    }

    public Type1 getValue1() {
        return this.value1;
    }

    public void setValue1(Type1 value1) {
        this.value1 = value1;
    }

    public Type2 getValue2() {
        return this.value2;
    }

    public void setValue2(Type2 value2) {
        this.value2 = value2;
    }

    // TODO: Define printInfo() method
    public void printInfo() {
        System.out.println(String.format("%s: %s", value1, value2));
    }
}