package Labs.Chapter2.Section17;

public class Encyclopedia extends Book {
    // TODO: Declare private fields
    private String edition;
    private int numPages;

    // TODO: Define mutator methods -
    // setEdition(), setNumPages()

    // TODO: Define accessor methods -
    // getEdition(), getNumPages()

    public String getEdition() {
        return this.edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public int getNumPages() {
        return this.numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    // TODO: Define a printInfo() method that overrides
    // the printInfo in Book class
    public void printInfo() {
        System.out.println("Book Information: ");
        System.out.println("   Book Title: " + title);
        System.out.println("   Author: " + author);
        System.out.println("   Publisher: " + publisher);
        System.out.println("   Publication Date: " + publicationDate);
        System.out.println("   Edition: " + edition);
        System.out.println("   Number of Pages: " + numPages);
    }
}