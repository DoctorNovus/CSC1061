package Labs.Chapter2.Section14;

import java.util.Scanner;

public class PetInformation {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      Pet myPet = new Pet();
      Cat myCat = new Cat();
      
      String petName, catName, catBreed;
      int petAge, catAge;

      petName = scnr.nextLine();
      petAge = scnr.nextInt();
      scnr.nextLine();
      catName = scnr.nextLine();
      catAge = scnr.nextInt();
      scnr.nextLine();
      catBreed = scnr.nextLine();
      
      // TODO: Create generic pet (using petName, petAge) and then call printInfo       
      myPet.setName(petName);
      myPet.setAge(petAge);

      myPet.printInfo();

      // TODO: Create cat pet (using catName, catAge, catBreed) and then call printInfo
      myCat.setName(catName);
      myCat.setAge(catAge);
      myCat.setBreed(catBreed);

      myCat.printInfo();

      // TODO: Use getBreed(), to output the breed of the cat
      System.out.println(" Breed: " + myCat.getBreed());
   }
}