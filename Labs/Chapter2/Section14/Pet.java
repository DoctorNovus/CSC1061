package Labs.Chapter2.Section14;

public class Pet {
    protected String name;
    protected int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo(){
        System.out.println("Pet Information: ");
        System.out.println(" Name: " + name);
        System.out.println(" Age: " + age);
    }
}
