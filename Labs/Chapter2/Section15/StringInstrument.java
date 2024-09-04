package Labs.Chapter2.Section15;

// TODO: Define a class: StringInstrument that is derived from the Instrument class
public class StringInstrument extends Instrument {
    // TODO: Declare private fields
    private int numOfStrings;
    private int numOfFrets;
    private boolean isBowed;

    // TODO: Define mutator methods -
    // setNumOfStrings(), setNumOfFrets(), setIsBowed()

    // TODO: Define accessor methods -
    // getNumOfStrings(), getNumOfFrets(), getIsBowed()

    public int getNumOfStrings() {
        return this.numOfStrings;
    }

    public void setNumOfStrings(int numOfStrings) {
        this.numOfStrings = numOfStrings;
    }

    public int getNumOfFrets() {
        return this.numOfFrets;
    }

    public void setNumOfFrets(int numOfFrets) {
        this.numOfFrets = numOfFrets;
    }

    public boolean isIsBowed() {
        return this.isBowed;
    }

    public boolean getIsBowed() {
        return this.isBowed;
    }

    public void setIsBowed(boolean isBowed) {
        this.isBowed = isBowed;
    }
}
